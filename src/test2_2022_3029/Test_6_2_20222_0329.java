package test2_2022_3029;

public class Test_6_2_20222_0329 {

	public static void main(String[] args) {
		
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		
		System.out.println("�� a : "+ a);
		System.out.println("�� b : "+ b);
		
		if(a.equals(b)) {
			System.out.println("���� ��");
		}
		else {
			System.out.println("���� �ٸ� ��");
		}

	}

}
