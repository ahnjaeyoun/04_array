package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 짝수
		 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 * 
		 * [실행 화면] 1 2 3 4 5 6 7 8 9 짝수 번째 인덱스 합 : 25
		 */

		int[] arr = new int[9];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;

			if (arr[i] % 2 == 1) {
				sum += arr[i];

			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번째 인덱스 합 : " + sum);

	}

	public void practice2() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 
		 * 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 홀수
		 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 * 
		 * [실행 화면] 9 8 7 6 5 4 3 2 1 홀수 번째 인덱스 합 : 20
		 *
		 */

		int[] arr = new int[9];
		
		int j = 0;
		int sum = 0;
		for(int i = 9; i > 0; i--) {
			arr[j] = i;
			if(j % 2 == 1) {
				sum += i;
			}
			j++;
			}
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스 합 : " + sum);
		
		}
	
		public void practice3() {
			/*
			 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
			 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
			 * 
			 */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 :");
			int input = sc.nextInt();
			
			int[] arr = new int[input];
			
			int count = 1;
			for(int i = 0; i < arr.length; i++) {
				arr[i] = count;
				count++;
				
			}
			System.out.print(Arrays.toString(arr));

		}

		public void practice4() {
			Scanner sc = new Scanner(System.in);
			
			int[] arr = new int[5];
			
			
			
			for(int i = 0; i < 5; i++) {
				System.out.printf("입력 %d :", i);
				int input1 = sc.nextInt();
				arr[i] = input1;
				}
			
			boolean flag = false;
			
			System.out.print("검색할 값 :");
			int input2 =sc.nextInt();
			
			for(int i = 0; i < 5; i++) {
				if(arr[i] == input2) {
					flag = true;
					System.out.print("인덱스 : " + i + " ");
				}
			}
			
			if(!flag) {
				System.out.println("일치하는 값이 존재하지 않습니다.");
			}
	
		
			}
			
		public void practice5() {
			
		/*
		 * 정수 5개를 입력 받아 배열을 초기화 하고
			검색할 정수를 하나 입력 받아 배열에서 같은
			수가 있는 인덱스를 찾아 출력.
			배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력

		[실행 화면 1]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 8
		인덱스 : 1

		[실행 화면 2]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 1
		일치하는 값이 존재하지 않습니다.
		 * 
		 * 
		 */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String input1 = sc.next();
			
			char[] arr = new char[input1.length()];
			
			for(int i = 0; i < input1.length(); i++) {
				arr[i] = input1.charAt(i);
			}
			
			boolean flag = false;
			
			System.out.print("문자 : ");
			String input2 = sc.next();
			
			for(int i = 0; i < input1.length(); i++) {
				if(arr[i] == input1.charAt(i)) {
					
					flag = true;
					
				}
				
			}
			
			
			if(!flag) {
				System.out.println("일치하는 값이 존재하지 않습니다");
			}
			
		}

		public void practice6() {

		}

		public void practice7() {

		}

		public void practice8() {

		}

		public void practice9() {

		}

		public void practice10() {

		}

		public void practice11() {

		}

		public void practice12() {

		}

		public void practice13() {

		}

		public void practice14() {

		}

	}
