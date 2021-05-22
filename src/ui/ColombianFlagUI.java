package ui;

import model.*;
import thread.MovingFlagThread;

public class ColombianFlagUI {

	public void start() {
		System.out.print("\u001b[2J");
		MovingFlagThread thread1 = new MovingFlagThread(new Yellow(), 15);
		MovingFlagThread thread2 = new MovingFlagThread(new Blue(), 35);
		MovingFlagThread thread3 = new MovingFlagThread(new Red(), 40);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

