package model;

public class Yellow implements Colors{
	
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";

	private int x = 0;
	private int y = 0;

	@Override
	public boolean isFinished() {
		if(x == 90) {
			return true;
		}
		return false;
	}

	@Override
	public void move() {
		System.out.print(ESC+ x +"G"+ESC+ y +"d");
		System.out.print(ESC+"43m ");
		y++;
		
		if(y == 8) {
			y = 0;
			x++;
		}
	}
}
