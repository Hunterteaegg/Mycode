package mypackage;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				System.out.println("5000ms");
				
			}
		}, 5000);
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				System.out.println("10000ms");
				System.exit(0);
				
			}
		}, 10000);
		

	}

}
