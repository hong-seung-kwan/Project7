package arraylist;

import java.util.ArrayList;

// 학생 클래스
// 학번, 이름
// Student 리스트 생성, 학생 3명 추가
// 반복문 사용하여 리스트 요소 출력
public class Quiz4 {

	public static void main(String[] args) {
		ArrayList<Student> student = new ArrayList<Student>();
		
		// 데이터 추가
		// 인스턴스 생성 후 참조변수를 입력 or 바로 인스턴스 생성
		student.add(new Student(1001, "둘리"));
		student.add(new Student(1002, "또치"));
		student.add(new Student(1003, "도우너"));
		
		for(int i = 0; i < student.size(); i++) {
			Student get = student.get(i);
			get.showInfo();
		}
		for(Student s : student) {
			s.showInfo();
		}

	}

}
class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(id +", " + name);
	}
	
	
}