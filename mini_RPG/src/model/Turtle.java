package model;

public class Turtle extends Monster implements Defensible{

	public Turtle(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	//add unimplement method -> 오버라이드 : 재정의
	@Override
	public void defence() {
		System.out.println("거북이 방어");
		
	}

	@Override
	public void attact() {
		System.out.println("거북이 공격");
		
	}

	@Override
	public void printInfo() {
		System.out.println("거북이 정보");
		
	}

}
