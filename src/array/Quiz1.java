package array;

// 5개 크기의 문자형 배열
// 모든 요소 출력
public class Quiz1 {
	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]); // 배열이름[인덱스]
		}
		// ArrayIndexOutOfBoundsException 에러: 런타임 오류
		// 배열의 범위를 벗어나면 발생
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // 배열이름[인덱스]
		}
	}
}