package model;

public class Archer extends Character{

	private BowVO equippedItem;
	public Archer(int hp, int op, int dp) {
		super(hp, op, dp);
		
	}

	@Override
	public void itemUse(ItemVo item) {
		System.out.println("아처 아이템 사용");
		// A instance of B => A객체가 B 클래스에 속하면 true ,아니면 false.
		if(item instanceof BowVO) {
			this.equippedItem=(BowVO)item;
		}
		
	}

	@Override
	public void itemUnuse() {
	    System.out.println("아처 아이템 해제");
		
	}

	@Override
	public void attact() {
		System.out.println("전사 공격");
		
	}

	@Override
	public void printInfo() {
		System.out.println("전사 정보");
		
	}

}
