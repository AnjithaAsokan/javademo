package oops;

class Shape{
	public void getArea() {
		
		System.out.print("Area of ");
	}
	public void getPerimeter() {
		System.out.print("perimeter of ");
		
	}
}
class Triangle extends Shape{

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		super.getArea();
		int a=5,b=2,c=3;
		int area=a+b+c;
		System.out.println("triangle is "+area);
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		super.getPerimeter();
		int b=2,h=4;
		int perimeter=(b*h)/2;
		System.out.println("triangle is "+perimeter);
	}
	
}
class Circle extends Shape{

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		super.getArea();
		int r=2;
		double area=((r*r)*3.14);
		System.out.println("circle is "+area);
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		super.getPerimeter();
		int r=2;
		double perimeter=2*3.14*r;
		System.out.println("circle is "+perimeter);
		
	}
	
}
class Rectangle extends Shape{

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		super.getArea();
		int l=5,b=6;
		int area=l*b;
		System.out.println("rectangle is "+area);
		
	}

	@Override
	public void getPerimeter() {
		// TODO Auto-generated method stub
		super.getPerimeter();
		int l=5,b=6;
		int perimeter=2*(l+b);
		System.out.println("rectangle is "+perimeter);
	}
	
}

public class Overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t=new Triangle();{
			t.getArea();
			t.getPerimeter();
		}
		Rectangle r=new Rectangle();{
			r.getArea();
			r.getPerimeter();
		}
		Circle c=new Circle();{
			c.getArea();
			c.getPerimeter();
		}

	}


}
