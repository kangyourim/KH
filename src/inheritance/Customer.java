package inheritance;

public class Customer {

	
	//멤버변수
	protected int CustomerId; 		//고객아이디
	protected String customerName; 	//고객이름
	protected String customerGrade; 	//고객등급
	int bonusPoint;  				//보너스 포인트
	double bonusRatio; 				//적립비율

	//기본생성자
	public Customer() {
//		customerGrade = "SLIVER"; 	//기본등급
//		bonusRatio = 0.01; 			//포인트 기본 적립비율
//		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int customerId, String customerName) {
		this.CustomerId = customerId;
		this.customerName = customerName;
		customerGrade = "SLIVER"; 
		bonusRatio = 0.01; 
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	//보너스 포인트적립, 지불 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;  //보너스 포인트 계산
		return price;
	}
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + " 입니다. ";
	}

	//외부에서 사용할 수 있도록 get / set 메서드 추가
	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}//
