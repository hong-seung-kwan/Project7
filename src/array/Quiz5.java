package array;

import java.util.Arrays;

// 5개 크기 정수형 배열
// {5, 20, 100, 30, 77}
// 가장 큰값 찾기
public class Quiz5 {

	public static void main(String[] args) {
		
		int[] arr = { 5, 20, 100, 30, 77 };
		
		System.out.println(Arrays.toString(arr));
		
		// 5 20
		// 20 100
		// 100 30
		// 100 77
		
		// max arr[1]
		// max arr[2]
		// max arr[3]
		// max arr[4]
		// max와 arr배열의 요소를 비교!
		
		// 최대값
		int max = arr[0];
		
		// 1~4 총 4번 반복
		// i의 용도: index
		for(int i = 1; i <= 4; i++) {
			// 배열의 요소가 현재 max보다 크면 max를 교체
			if(max < arr[i]) { // max와 배열의 요소를 비교하여
				max = arr[i]; // 최대값 교체
			}
		}
		
		System.out.println(max);
		
		
		
		
//		int[] arr = { 5, 20, 100, 30, 77 };
//		int max = arr[0]; // 큰값을 저장하는 변수
//		
//		for(int i = 1; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
	}

}
