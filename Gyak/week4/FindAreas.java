abstract class Figure{
	double dim1, dim2;

	Figure(double d1, double d2){
		dim1 = d1;
		dim2 = d2;
	}

	abstract double area();
}

class Rectangle extends Figure{
	Rectangle (double d1, double d2){
		super(d1, d2);
	}

	double area(){
		System.out.println("Inside Rectangle's area()");
		return dim1 * dim2;
	}
}

class Triangle extends Figure{
	Triangle(double d1, double d2){
		super(d1, d2);
	}

	double area(){
		System.out.println("Inside Triangle's area()");
		return dim1 * dim2 / 2;
	}

}

class FindAreas{
	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle (5.5, 10.2);
		Triangle triangle = new Triangle(2.5, 8.5);

		Figure figref;

		figref = rect;
		System.out.println("Rect area: " + figref.area());

		figref = triangle;
		System.out.println("Triangle area: " + figref.area());

		System.out.println("Rect area: " + rect.area());
	}
}