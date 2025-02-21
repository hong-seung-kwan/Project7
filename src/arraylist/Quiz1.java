package arraylist;

import java.util.ArrayList;

// 문자형 리스트 생성 (Character)
// 문자 3개를 추가하세요
// ['A','B','C']
// 리스트의 모든 요소 출력
public class Quiz1 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		System.out.println(list);
//		char c1 = list.get(0);
//		System.out.println(c1);
//		char c2 =list.get(1);
//		System.out.println(c2);
//		char c3 =list.get(2);
//		System.out.println(c3);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}
	}

}
