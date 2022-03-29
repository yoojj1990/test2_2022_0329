package test2_2022_3029;

public class Circle {
	
	int x, y, redius;

	public Circle(int x, int y, int redius) {
		
		this.x = x;
		this.y = y;
		this.redius = redius;
		
	}
	
	public String toString() {
		return "Circle(" + x + "," + y +")" + "¹ÝÁö¸§" + redius; 
	}
	
	public boolean equals(Object obj) {
		
		Circle cir = (Circle)obj;
		
		if((x==cir.x) && (y==cir.y)) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	

}
