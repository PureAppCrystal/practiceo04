package prob01;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	
	/*
	public void println( Object o ) {
		System.out.println( o );
	}
	//좋은 방법이긴 하지만 위험할 수 있다고 함.
	//casting을 잘못할 가능성이 생기기 때문에 위험. -> 제너릭을 사용하라 
	*/
	

	public <T> void println(T t) {
		System.out.println( t );
	}
	
	
	public <T, P, Q> List<P> println(T t, Q q) {
		System.out.println( t + " : " + q );
		
		List<P> list = new ArrayList<P>();
		
		return list;
	}
	
	
	public void println2( String[] params ) {
		for( String s : params ) {
			System.out.print( s + " : ");
		}
		System.out.println("");
		
		
	}
	
	public <T> void println3( T... params ) {
		for( T s : params ) {
			System.out.print( s + " : ");
		}
		System.out.println("");
	}
}
