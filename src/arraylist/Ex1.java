package arraylist;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		// 정수형 리스트 생성
		// <E> ? 리스트안에 저장할 데이터 타입
		// 리스트는 기초타입을 사용할 수 없음
		// 기초타입의 클래스형인 Wrapper 클래스를 사용
		// 숫자면 int -> Integer
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 리스트에 데이터 추가
		// 리스트는 데이터를 동적으로 추가할 수 있다
		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println(list);
		
		// 특정 위치에 데이터를 추가
		// 리스트의 2번쨰 위치에 40을 추가
		list.add(1, 40);
		System.out.println(list);
		
		// 리스트 3번쨰 요소 삭제
		list.remove(2);
		System.out.println(list);
		
		// 리스트 안에 저장된 요소를 하나씩 꺼내가
		int  value1 = list.get(0);
		int  value2 = list.get(1);
		int  value3 = list.get(2);
		
	}

}
