package array;

// 5개 크기 정수형 배열 생성
// { 10, 15, 20, 25, 30 }
// 배열요소의 합을 구하고 출력
public class Quiz3 {

	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 25, 30 };
//		int[] arr2;
//		arr2 = new int[] { 10, 15, 20, 25, 30 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}