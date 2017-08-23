package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
		
		
		printer.println2( new String[] {"aaa", "bbb", "ccc"} );
		
		printer.println3( "aaa");
		printer.println3( "aaa", "bbb");
		printer.println3( "aaa", "bbb", "ccc");
		printer.println3( "aaa", "bbb", "ccc", "ddd");
		printer.println3( "aaa", "bbb", 10, "ddd", "eee");
		
		
	}

}
