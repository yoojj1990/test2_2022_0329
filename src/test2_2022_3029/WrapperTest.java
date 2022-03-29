package test2_2022_3029;

public class WrapperTest {

	public static void main(String[] args) {
		
		System.out.println(Character.toLowerCase('A'));
		
		char ch1 = '4';
		char ch2 = 'F';
		
		if(Character.isDigit(ch1)) { //문자인지 숫자인지? 숫자면 true
			System.out.println("숫자입니다.");
		}
		
		if (Character.isAlphabetic(ch2)) { //알바벳인지 확인. 알파벳이면 true
			System.out.println("알파벳입니다.");
		}
		
		
		System.out.println(Integer.parseInt("-1234"));
		
		Double d = Double.valueOf(3.14); // 3.14를 가지고있는 개체 선언
		String a = d.toString(); //문자로 반환
		double b = Double.parseDouble(a); // 숫자로 반환
		
		boolean bool = true;
		
		String b1 = Boolean.toString(bool); // true가 반환
		boolean b2 = Boolean.parseBoolean(b1); // 문자열 "true"를 true(bool)로 반환
		
		
		Integer ten = 10; // Integer.valueOf(10); -> 박싱
		int ten2 = ten; //int ten2 = ten.intValue(); ->언박싱
		
		
		
		
		
	}

}
