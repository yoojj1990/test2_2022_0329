package test2_2022_3029;

public class WrapperTest {

	public static void main(String[] args) {
		
		System.out.println(Character.toLowerCase('A'));
		
		char ch1 = '4';
		char ch2 = 'F';
		
		if(Character.isDigit(ch1)) { //�������� ��������? ���ڸ� true
			System.out.println("�����Դϴ�.");
		}
		
		if (Character.isAlphabetic(ch2)) { //�˹ٺ����� Ȯ��. ���ĺ��̸� true
			System.out.println("���ĺ��Դϴ�.");
		}
		
		
		System.out.println(Integer.parseInt("-1234"));
		
		Double d = Double.valueOf(3.14); // 3.14�� �������ִ� ��ü ����
		String a = d.toString(); //���ڷ� ��ȯ
		double b = Double.parseDouble(a); // ���ڷ� ��ȯ
		
		boolean bool = true;
		
		String b1 = Boolean.toString(bool); // true�� ��ȯ
		boolean b2 = Boolean.parseBoolean(b1); // ���ڿ� "true"�� true(bool)�� ��ȯ
		
		
		Integer ten = 10; // Integer.valueOf(10); -> �ڽ�
		int ten2 = ten; //int ten2 = ten.intValue(); ->��ڽ�
		
		
		
		
		
	}

}
