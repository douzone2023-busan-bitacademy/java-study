package prob4;

public class SoundTest {

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	private static void printSound( soundable ) {
		System.out.println( soundable.sound() );
	}
}