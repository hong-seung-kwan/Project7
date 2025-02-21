package array;

// 5개의 크기 정수형 배열 { 5, 20, 100, 30 ,77 }
// 20이 저장되어있는 요소의 인덱스를 찾아서 출력
public class Quiz6 {

	public static void main(String[] args) {
		int[] arr = { 5, 20, 100, 30, 77 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 20) {
				System.out.println(i);
			}
		}
	}

}
