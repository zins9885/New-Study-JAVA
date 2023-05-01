package model;

public abstract class ItemVo { //추상클래스로 만들기

	 private int itemNum;
	 private String name;
	 private int attackPower;
	
	 //생성자 만들기
	 public ItemVo(int itemNum, String name, int attackPower) {
		this.itemNum = itemNum;
		this.name = name;
		this.attackPower = attackPower;
	}

	 //getter setter 만들어주기
	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	 
}
