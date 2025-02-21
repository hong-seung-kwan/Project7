package arraylist;

import java.util.ArrayList;

// 문자열형 리스트 생성
// 문자열 5개 추가("AA","BB","CC","DD","EE")
// 리스트에 저장된 모든 문자열 삭제
public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		System.out.println(list);
		
		// 리스트의 구조는 유동적으로
		// 데이터를 추가하거나 삭제하면 크기가 변경된다
		// 리스트의 크기와 index 범위는 함께 변경된다
		
//      1. 리스트 뒤부터 삭제
//		list.remove(4);
//		list.remove(3);
//		list.remove(2);
//		list.remove(1);
//		list.remove(0);
//		
//		System.out.println(list);
		
		
// 	    2. 리스트 앞부터 삭제
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		// 리스트는 연속된 구조이므로 0번 인덱스는 항상 존재한다
//		// 크기가 0기 되기 전까지
//		System.out.println(list);
		
//		for(int i = 0; i < list.size();) {
//			list.remove(i);
//		}
//		System.out.println(list);
	}

}