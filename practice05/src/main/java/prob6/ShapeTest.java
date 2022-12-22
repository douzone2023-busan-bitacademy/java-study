package prob6;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] list = new Shape[2];
		
		list[0] = new Rectangle(5, 6);
		list[1] = new RectTriangle(6, 2);
		
		for(Shape shape : list) {
			System.out.println( "area:" + shape.getArea() );
			System.out.println( "perimeter:" + shape.getPerimeter() );
			
			if( shape instanceof Resizable ) {
				Resizable resizable = (Resizable) shape;
				resizable.resize( 0.5 );
				System.out.println( "new area:" + shape.getArea() );
				System.out.println( "new perimeter:" + shape.getPerimeter() );
			}
		}
	}
}