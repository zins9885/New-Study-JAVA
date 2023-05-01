package model;

public abstract class Creature {

	private int hp;
	private int op;
	private int dp;
	
	//생성자 만들기
	public Creature(int hp, int op, int dp) {
		this.hp = hp;
		this.op = op;
		this.dp = dp;
	}

	//getter ,setter 만들기
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public int getDp() {
		return dp;
	}

	public void setDp(int dp) {
		this.dp = dp;
	}
	
	// 추상메서드 기능 2개 만들기 -> 다른 클래스에서 오버라이드 해주기
	public abstract void attact ();
	public abstract void printInfo();
}
