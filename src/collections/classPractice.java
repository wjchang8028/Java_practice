package collections;

public class classPractice extends exclass{
	void instancemethod() {
		System.out.println("�ν��Ͻ� �޼ҵ� ����");
	}
	
	static void classmethod() {
		System.out.println("Ŭ���� �޼ҵ� ����");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classmethod();
		//instancemethod(); Ŭ���� �޼ҵ尡 �ƴϹǷ� ����
		
		b += 100;
		System.out.println(b);
		
		//a += 10; �ٸ� Ŭ������ int �ν��Ͻ������̹Ƿ� ȣ��Ұ�
		exclass ex = new exclass();
		ex.a += 10;
		System.out.println(ex.a);
		
		

	}

}
