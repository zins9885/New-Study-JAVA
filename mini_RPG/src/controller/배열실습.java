package controller;

import java.util.Scanner;

public class 배열실습 {

	public static void main(String[] args) {
		// 스캐너
				Scanner sc = new Scanner(System.in);

				// 정답 배열
				int[] arr = { 1, 4, 3, 2, 1 };
				// 답변 배열
				int[] arr2 = new int[5];

				// 내가 입력한 답 배열
				System.out.println("===채점하기===\n답을 입력하세요");

				for (int i = 0; i < arr2.length; i++) {
					System.out.print((i + 1) + "번 답 >> ");
					arr2[i] = sc.nextInt();
				}

//				System.out.print("입력한 답은 : ");
//				for(int i =0 ; i<arr.length; i++) {
//					System.out.print( arr2[i] + " ");
//				}

				int sum = 0; // 총점

				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == arr2[i]) {
						System.out.print("O ");
						sum += 20;
					} else if (arr[i] != arr2[i]) {
						System.out.print("X ");
					}

					System.out.println("정답확인");

					System.out.println("총점: " + sum);
				}

			}

	

}
