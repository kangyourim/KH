package inheritance;

public class VipCustomer extends Customer {
	
	//vip 회원만 제품을 살 때 10% 할인, 5% 적립, 전문상담원 배정
	private int agentID;			//vip 고객 상담원 아이디
	double saleRatio;				//할인율
	
	public VipCustomer() { }
//		customerGrade = "VIP";		//등급
//		bonusRatio = 0.05;			//보너스 적립 5%
//		saleRatio = 0.1;			//할인율 10%
//		System.out.println("VipCustomer() 생성자 호출");

	public VipCustomer(int customerId, String customerName, int agentID) {
		super(customerId, customerName);
		customerGrade = "VIP";		//등급
		bonusRatio = 0.05;			//보너스 적립 5%
		saleRatio = 0.1;			//할인율 10%
		this.agentID = agentID;
	}
	
	
	public void setCustomerId(int customerId) {
		super.setCustomerId(customerId);
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);	//할인율 적용
	}
	
	//vip 고객에만 필요한 메서드
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	
}//
