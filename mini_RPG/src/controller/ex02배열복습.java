package controller;

public class ex02배열복습 {

	public static void main(String[] args) {

		// 배열생성, 레퍼런스 변수 선언
		int[][] arr = new int[4][6];
        
		// 변수 초기화 
		int num = 21;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { 
				arr[i][j] = num;
				num++;
			}
		}

		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}

	}

}
