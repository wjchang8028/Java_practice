package classPractice;

public class exclass4 {
	String color;

	String gearType;

	int wheel;

	exclass4(String color, String gearType, int wheel) { // 생성자

		this.color = color;

		this.gearType = gearType;

		this.wheel = wheel;

	}

	exclass4() { // 디폴트값설정

//        this("white", "auto", 4);

	}

	exclass4(String color) {

		this(color, "auto", 4);

	}

	public static void main(String[] args) {

		exclass4 c = new exclass4();

		exclass4 c1 = new exclass4();

		c1.color = "yellow";

		c1.gearType = "menual";

		c1.wheel = 2;

		exclass4 c2 = new exclass4("red");

		System.out.println("color = " + c.color + ", geartype = " + c.gearType + ", wheelCount = " + c.wheel);

		System.out.println("color = " + c1.color + ", geartype = " + c1.gearType + ", wheelCount = " + c1.wheel);

		System.out.println("color = " + c2.color + ", geartype = " + c2.gearType + ", wheelCount = " + c2.wheel);

	}
}
