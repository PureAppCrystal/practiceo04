package prob03;

public class UnitTest {

	public static void main(String[] args) {

		Unit m1 = new Marine();
		m1.move(10, 20);
		m1.locate();
		
		System.out.println("-----------------------");
		Marine m2 = new Marine();
		m2.stimPack();
		m2.move(1, 2);
		
		
		System.out.println("-----------------------");
		Unit d1 = new DropShip();
		d1.move(10, 20);
		
				
		System.out.println("-----------------------");
		move( new Marine(), 10, 20 );
		
		
		System.out.println("-----------------------");

	}
	
	public static void move(Unit u, int x, int y) {
		u.move(x, y);
	}

}
