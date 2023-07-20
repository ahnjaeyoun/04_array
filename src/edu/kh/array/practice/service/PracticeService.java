package edu.kh.array.practice.service;

import java.util.Arrays;

public class PracticeService {
	
	public void practice1() {
		/*
		 * 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 
		 * 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후 짝수
		 * 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		 * 
		 * [실행 화면] 1 2 3 4 5 6 7 8 9 
		 * 짝수 번째 인덱스 합 : 25
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
		
		for(int i = 0; i < 9; i++) {
			
			arr[i] = i + 1;
		
		
		}
		
		System.out.println(Arrays.toString(arr));

	}
	
}
