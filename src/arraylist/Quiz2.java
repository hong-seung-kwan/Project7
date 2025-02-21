package arraylist;

import java.util.ArrayList;

// 논리형 리스트 생성 (Boolean)
// 값 3개 추가 (true, true, false)
// 반복문 사용하여 리스트 요소 출력
public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}
		
		for(Boolean b : list) {
			System.out.println(b);
		}

	}

}
