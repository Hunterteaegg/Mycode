package mypackage;

public class MyMission implements Runnable {

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try {
			MySleep.sleep();
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
