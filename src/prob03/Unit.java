package prob03;

public class Unit {
	private int x;
	private int y;
	
	

	//setter getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//function
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("move [x="+x+",y="+y+"]");
	}
	
	public void stop() {
		System.out.println("Stop");
	}
	
	public void locate() {
		System.out.println("Locate [x="+x+",y="+y+"]");
	}
}