package controller;

import java.util.Scanner;

import model.Turtle;
import view.Main_display;

public class Main {

	public static void main(String[] args) {

//		Turtle gobuk = new Turtle(10,1,200);
//	 
//		 gobuk.attact();
//		

		Main_display mdp = new Main_display(); // 객체만들기
		Scanner sc = new Scanner(System.in);
		AllSelectItem allSelect = new AllselectItem();
	
		while (true) {
			mdp.render();
			int select = sc.nextInt();
			if(select ==1) {
				System.out.println("1.전체 아이템 조회 2. 검 아이템 조회 3. 활 아이템 조회>>");
				 select = sc.nextInt();
				 allSelect.rangeAll(select);
			}else if(select==2) {
				
			}else if(select==3) {
				
			}else {
				System.out.println("종료");
				break;
			}
		}
	}

}
