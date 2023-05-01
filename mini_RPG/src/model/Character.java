package model;

public abstract class Character extends Creature {

	//생성자 불러와주기(마우스 오른쪽 sourse->using field)
	public Character(int hp, int op, int dp) {
		super(hp, op, dp);
		
	}
	
    public abstract void itemUse(ItemVo );    //추상메서드로 만들어주기
    public abstract void itemUnuse();

	public void itemUse(ItemVo item) {
		// TODO Auto-generated method stub
		
	}

}
