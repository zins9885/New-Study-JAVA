package model;

public class Tiger extends Monster {

	public Tiger(int hp, int op, int dp) {
		super(hp, op, dp);
		
	}

	@Override //재정의
	public void attact() {
		System.out.println("호랑이 공격");
		
	}

	@Override
	public void printInfo() {
		System.out.println("호랑이 정보");
		
	}

}
