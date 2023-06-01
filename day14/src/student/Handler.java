package student;

public class Handler {
	// 여러 Student 객체를 저장할 공간
	// { null,null,null,null,null,null,null,null,null,null}
	/// 학생이 들어갈 수 있는 칸이 10개지 학생이 10명이 아니다.

	private Student[] arr = new Student[10];

	// Student 타입의 객체를 추가
	public int add(Student st) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) { 		// 배열을 순회하면서
			if (arr[i] == null) { 					// i번째가 빈칸이면
				arr[i] = st; 						// 빈칸에 전달 받은 학생 객체를 저장
				row = 1; 							// 1개를 추가했음
				break; 								// 반복중단
			}
		}
		return row; // 빈칸이 없으면 row가 0이다.
	}

	// 전체목록을 반환
	public Student[] getArray() {
		return arr;
	}

	// 이름이 일치하는 학생 객체를 삭제
	public int delete(String name) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getName().equals(name)) {
				arr[i] = null;
				row = 1;
				break;
			}
		}
		return row;
	}

	// 검색어를 포함하는 이름을 가진 학생의 배열을 반환
	// 1) 검색어를 포함하는 인원수를 체크한다.
	// 2) 인원수 만큼의 크기를 가지는 배열을 생성한다.
	// 3) 검색어를 포함하는 객체를 배열에 복사하여 저장한다.
	// 4) 배열을 반복한다.

	public Student[] search(String keyword) {
		Student[] result = null;
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getName().contains(keyword)) {
				/// &연산자 순서를 바꾸면 문제가 생긴다. 네임을 불러오기 때문이다.
				count++;
			}
		}

		result = new Student[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getName().contains(keyword)) {
				result[index++] = arr[i];
			}
		}
		return result;
	}

}
