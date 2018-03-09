package mypackage;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				System.out.println("5000ms");
				
			}
		}, 5000);
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				System.out.println("10000ms");
				System.exit(0);
				
			}
		}, 10000);
		

	}

}
