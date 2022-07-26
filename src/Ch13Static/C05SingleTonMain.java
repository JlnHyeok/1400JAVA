package Ch13Static;

class Product
{
	String PName;
	int amount;
	public Product(String pName, int amount) {
		super();
		PName = pName;
		this.amount = amount;
	}
	//모든 인자를 받아 저장하는 생성자를 만듭니다.
	@Override
	public String toString() {
		return "Product [제품명=" + PName + ", 꺼낸 양=" + amount + "]";
	}
}
class Refrigerator
{
	//싱글톤 패턴 처리합니다.
	private static Refrigerator Instance;
	public static Refrigerator getInstance() {
		if(Instance == null) {
			Instance = new Refrigerator();
		}
		return Instance;
	}
	private Refrigerator() {}
	
	
	Product [] list = new Product[100];		// -> 동적할당이 가능한 컬렉션으로 처리시 메모리 허용 범위 내에서 배열 크기 확장가능
	
	int ProductNum = 0;
	
	void SetProduct(Product product) {
		if(ProductNum<=99) {
			list[ProductNum] = product;
			ProductNum++;
			//list  ProductNum번째 idx에 외부에서 생성된 Product가 연결
			//ProductNum의 count 1증가
		}
		else {
			System.out.println("더이상 담을 공간이 없습니다.");
		}
	}
	
	Product getProduct(String search,int amount) {
		for(int i=0;i<ProductNum;i++) {
			if(list[i].equals(search)) {
				if(list[i].amount == amount) {
					
				}
				else if(list[i].amount > amount) {
					list[i].amount-=amount;
					
				}
				else {
					return null;
				}
			}
		}
//		for(Product thing : list) {
//			if(search.equals(thing.PName)) { // 일치하는 제품이 있다면
//				
//				if(amount>thing.amount) {
//					return null;
//				}
//				else if(amount==thing.amount) {	// 재고량 == 요청수량, ProductNum--, list에서 제품 삭제-->컬렉션 , return product
//					Product prod = thing;
//					
//					return prod;
//				}
//				else {
//					thing.amount-=amount;
//					Product get = new Product(search,amount);	// 재고량 > 요청수량
//					return get;
//				}
//				
//			}
//			else {
//				System.out.println("null");
//				return null;
//			}
//		}
		//반복문과 문자열 검색 처리를 통해서 list에 저장된 search 
		//객체 꺼내와서 요청 개수만큼 차감
		//찾은 Product의 주소를 리턴
		
		//로직
		//만약 제품이 검색 안된다면 null 리턴
		//만약 제품이 검색 되고 수량이 저장된 수량을 초과한다면 null리턴
		//만약 제품이 검색 되고 수량이 저장된 수량보다 작다면
		//-Product객체를 따로 만들어 수량 분배하여 리턴
		//만약 제품이 검색되고 수량이 저장된 수량과 같다면 list안의 내용물삭제후
		//제품 리턴
		return null;
		
	}
}

public class C05SingleTonMain {

	public static void main(String[] args) {
		
		//냉장고 객체 가져오기(싱글톤 패턴)
		Refrigerator refrigerator= Refrigerator.getInstance();
		
		//상품정보객체 생성 
		Product prod = new Product("콜라",5);
		
		//냉장고에 상품저장
		refrigerator.SetProduct(prod);

		//냉장고로부터 상품반환
		Product prod1 =refrigerator.getProduct("콜라",5); 
				
		System.out.println("get Item : " + prod1.toString());
		
		
	}

}
