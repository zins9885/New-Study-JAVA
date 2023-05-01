package model;

public class BowVo extends ItemVo {

	private int durability; //변수생성
	
	public BowVo(int itemNum, String name, int attackPower , int durability) {
		super(itemNum, name, attackPower);
		
		this.durability=durability; // 매개변수를 그대로 필드에 올려주려면  this를씀
	}

	 // durability getter , setter 만들어주기
	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}
	
	

}
