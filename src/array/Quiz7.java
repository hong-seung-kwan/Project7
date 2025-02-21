package array;

import java.util.Arrays;

// 배열 복사
// 원본배열: {'a', 'b', 'c', 'd', 'e' }
// 새배열: {'d', 'e' }
public class Quiz7 {

	public static void main(String[] args) {
		char[] srcArr = {'a', 'b', 'c', 'd', 'e' };
		char[] copyArr = new char[2];
		
		// 원본배열, 시작위치, 새배열, 시작위치, 개수
		System.arraycopy(srcArr, 3, copyArr, 0, 2);
		
		System.out.println("원본배열: " + Arrays.toString(srcArr));
		System.out.println("새로운배열: " + Arrays.toString(copyArr));
	}
	
}