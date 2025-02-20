package array;

// 10개 크기 정수형 배열 생성
// { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
// 첫번째요소와 마지막 요소 출력
public class Quiz2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(arr[0]);
				
		int lastIndex = arr.length - 1; // 마지막요소 = 배열의 크기 - 1
		System.out.println(arr[lastIndex]);

	}

}