package day;
public class Point2D {
	double x,y;
	Point2D(double x , double y){
			this.x=x;
			this.y=y;
	}

	public String getDetails() {
		return "Point ("+x+","+y+")";
	}
	public boolean isEqual(Point2D p2) {
		if((this.x==p2.x) && (this.y==p2.y)) {
			return true;
			}
		return false;
	}
	
	public Point2D createNewObject(double p1,double p2) {
		double x1 = this.x+ p1;
		double y1 = this.y+p2;
		Point2D createdObj =  new Point2D(x1,y1);
		return createdObj;
		
		
	}
	class Home{
		
		public static void main(String args[]) {
			Point2D p1= new Point2D(1.2,3.2);
//			Point2d p2= new Point2d(1,3.2);
//		String result =  p1.getDetails();
//		System.out.println(result);
//		System.out.println(p1.isEqual(p2));
		Point2D p3 = p1.createNewObject(5,-1);
		System.out.println(p3.getDetails());
		
	}
	}
	
	
}

