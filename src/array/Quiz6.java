package array;

// 5개의 크기 정수형 배열 { 5, 20, 100, 30 ,77 }
// 20이 저장되어있는 요소의 인덱스를 찾아서 출력
public class Quiz6 {

	public static void main(String[] args) {
		int[] arr = { 5, 100, 30, 77, 20 };
		
		// 5 == 20
		// 20 == 20
		// 100 == 20
		// 30 == 20
		// 77 == 20
		
		// 배열의 요소 == 찾아야하는 값
		// index: 0~4
		// arr[0] = 20
		// arr[1] = 20
		// arr[2] = 20
		// arr[3] = 20
		// arr[4] = 20
		
		// i의 용도: index
		for(int i = 0; i < 5; i++) {
			// 배열의 요소를 하나씩 비교하면서
			// 20의 위치(index) 찾기
			if(arr[i] == 20) {
				System.out.println("20의 위치: " + i);
				break;
			}
		}
		
		
		
		
		
		
		

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 20) {
//				System.out.println(i);
//			}
//		}
	}

}
