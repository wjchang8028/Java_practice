package collections;

public class classPractice {
	void instancemethod() {
		System.out.println("인스턴스 메소드 실행");
	}
	
	static void classmethod() {
		System.out.println("클래스 메소드 실행");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classmethod();
		//instancemethod(); 클래스 메소드가 아니므로 오류
		

	}

}
