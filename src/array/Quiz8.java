package array;

// 학생 클래스
// 속성: 학번, 이름
// 3개 크기 Student 배열 생성
// 3명의 학생 정보 저장
// 모든 학생 정보 출력
public class Quiz8 {

	public static void main(String[] args) {

		// 3개 크기의 객체 배열 생성
		Student[] students = new Student[3];

		// 배열의 첫번째 요소 = 인스턴스 생성
		students[0] = new Student(1001, "둘리");
		// 배열의 두번째 요소 = 인스턴스 생성
		students[1] = new Student(1002, "또치");
		// 배열의 세번째 요소 = 인스턴스 생성
		students[2] = new Student(1003, "도우너");

//		students[0].showInfo();
//		students[1].showInfo();
//		students[2].showInfo();

		for (int i = 0; i < 3; i++) {
			students[i].showInfo();
		}
		
		// 람다식 for문
		// 값을 저장할 변수 : 배열
		// 배열의 요소를 순회하는 구조
		// 배열의 첫번째요소부터 마지막 요소까지 접근할 수 있다
		for(Student student : students) {
			student.showInfo();
		}
	}

}

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void showInfo() {
		System.out.println("학번:" + id + " 학생이름:" + name);
	}

}