package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;
		
		// ==  : 두 객체의 동일성
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals : 두 객체의 동질성
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
	}

}
