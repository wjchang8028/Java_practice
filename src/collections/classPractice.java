package collections;

public class classPractice extends exclass{
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
		
		b += 100;
		System.out.println(b);
		
		//a += 10; 다른 클래스의 int 인스턴스형태이므로 호출불가
		exclass ex = new exclass();
		ex.a += 10;
		System.out.println(ex.a);
		
		

	}

}
