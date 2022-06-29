// Data Hiding
class Square {
	private int side;
	
	int getSide() {
		return side;
	}
	void setSide(int s) {
		side = s;
	} 
	public int area() {
		return getSide()*4;
	}
}

class Rectangle {
	private int length;
	private int breadth;
	
	int getLength() {
		return length;
	}
	void setLength(int l) {
		if(l>0) {
			length = l;
		} else {
			length = 0;
		}
	}
	int getBreadth() {
		return breadth;
	}
	void setBreadth(int b) {
		if(b > 0) {
			breadth = b;
		} else {
			breadth = 0;
		}
	}
	public int area() {
		return getLength()*getBreadth();
	}
}
class Cylinder {
	private int radius;
	private int height;
	
	int getRadius() {
		return radius;
	}
	void setRadius(int r) {
		if(r>0) {
			radius = r;
		} else {
			radius=0;
		}
	}
	int getHeight() {
		return height;
	}
	void setHeight(int h) {
		height=h;
	}
	public int area() {
		return (int)(2*Math.PI*getRadius()*getHeight());
	}
}

class Student {
	
	private int m1;
	
	int getM1() {
		return m1;
	}
	void setM1(int m) {
		m1 = m;
	}
}

public class DataHide {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setBreadth(200);
		
		System.out.println(r.area());
	
	
	Student s = new Student();
	s.setM1(25);
	System.out.println(s.getM1());
	
	Square sq = new Square();
	sq.setSide(4);
	
	System.out.println(sq.area());
	
		
	
	}
}