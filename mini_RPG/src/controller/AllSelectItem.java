package controller;

import java.util.ArrayList;

import model.DAO;
import model.ItemVo;

public class AllSelectItem {

	public void rangeAll(int select) {
		if(select==1) {
			Allweapon();
		}else if(select==2) {
			allSword();
		}else if (select==3) {
			
		}else {
			System.out.println("잘못된 선택입니다.");
		}
	}
	
	public void AllWeapon() {
		DAO dao = new DAO();
		ArrayList<ItemVO> bowList = dao.BowchekAll();
		ArrayList<ItemVO> SwordList = dao.SwordcheckAll();
		ArrayList<ItemVo> itemList = new ArrayList<>();
		
		itemLIst.addAll(SwordList);
		itemList.addAll(bowList);
		
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("----------------------");
		for(ItemVo:itemList) {
			System.out.print(item.getItemNum()+"\t");
			System.out.print(item.getName()+"\t");
			System.out.print(item.getAttackPower()+"\t");
			//sword 는 durability가 없음
			try {
			System.out.println(((BowVO)item).getDurability());
			}catch(Exception classCasException) {
				}
			System.out.println();
			}
		}
		
	
	
	public void allSword() {
		DAO dao = new DAO();
		ArrayList<ItemVo> Sword_db = dao.SwordcheckAll();
		System.out.println("num\tname\tpower");
		System.out.println("----------------------");
		for(ItemVo SwordObject:Sword_db) {
			System.out.print(SwordObject.getItemNum()+"\t");
			System.out.print(SwordObject.getName()+"\t");
			System.out.println(SwordObject.getAttackPower()+"\t");
		}
	}
	public void allBow() {
		DAO dao = new DAO();
		ArrayList<ItemVo> Bow_db = dao.BowcheckAll();
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("----------------------");
		for(ItemVo BowObject:Bow_db) {
			System.out.print(BowObject.getItemNum()+"\t");
			System.out.print(BowObject.getName()+"\t");
			System.out.print(BowObject.getAttackPower()+"\t");
			System.out.println(((BowVO)bowObject).getDurability(); //다운캐스팅 해줌
		}
}
