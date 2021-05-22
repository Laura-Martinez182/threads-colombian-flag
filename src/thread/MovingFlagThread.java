package thread;

import model.*;

public class MovingFlagThread extends Thread {
	
	public final static String ESC   = "\u001b[";
	Colors colors;
	int sleep;
	
	public MovingFlagThread(Colors colors, int sleep) {
		this.colors = colors;
		this.sleep = sleep;
	}
	
	@Override
	public void run() {
		while(!colors.isFinished()) {
			try {
				synchronized(colors) {
					colors.move();
				}
				
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
