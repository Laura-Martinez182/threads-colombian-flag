package model;

public class Red implements Colors{
	
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";

	private int x = 0;
	private int y = 8;

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
		System.out.print(ESC+"41m ");
		y++;
		
		if(y == 16) {
			y = 12;
			x++;
		}
	}
}
