package test2_2022_3029;

public class Rect {

	private int width;
	private int height;
	
	public Rect(int width, int height) {
	
		this.width = width;
		this.height = height;
	}
	
//	public boolean equals(Rect rec) {
//		
//		int area = rec.height * rec.width;
//		
//		int area_self = this.height * this.width;
//		
//		if(area == area_self) {
//			
//			return true;
//		}
//		else {
//			
//			return false;
//		}
		
	public boolean equals(Object obj) {
		
		Rect p = (Rect)obj;
		
		if(width * height == p.height * p.width) {
		
			return true;
		}
		else {
			return false;
		}
	}

}
	
	

