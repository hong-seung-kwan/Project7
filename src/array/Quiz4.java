package array;

// 외부 패키지에 있는 클래스를 가져올때는 import 선언
import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {

//		int [] arr = new int[5];
//		// Arrays 클래스의 함수를 사용하여 배열의 값 출력
//		System.out.println(Arrays.toString(arr));
//		
//		// 배열에 짝수만 저장
//		// 규칙,패턴 찾기!
//		// 배열[index] = 짝수
//		// index: 0~4
//		// 짝수: 2 4 6 8 10
//		arr[0] = 2;
//		arr[1] = 4;
//		arr[2] = 6;
//		arr[3] = 8;
//		arr[4] = 10;
//		
//		// i의 용도? 반복문의 조건, 짝수
//		for (int i = 1; i <= 10; i++) { // 1~10
//			if (i % 2 == 0) { // 2 4 6 8 10
//				arr[??] = i;
//			}
//		// i 하나로 풀수없다
//		// 변수 하나 더 생성
//		System.out.println(Arrays.toString(arr));
		
		
		int[] arr = new int[5];
		int index = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
            System.out.println("index: "+index + " i: " + i);
				arr[index] = i;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
