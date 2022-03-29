package test2_2022_3029;

public class EqualsEx {

	public static void main(String[] args) {
		
		Rect a = new Rect(2, 3);
		Rect b = new Rect(2, 3);
		Rect c = new Rect(2, 3);
		
		if(a.equals(b)) {
			
			System.out.print("같음");
			
		}
		else {
			System.out.print("다름");
		}
		
	}

}
