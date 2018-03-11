package mypackage;

public class MyMission implements Runnable {

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try {
			MySleep.sleep();
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
