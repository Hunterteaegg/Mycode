package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ExecutorService exe=Executors.newCachedThreadPool();
		Future<?> future=exe.submit(new MyMission());
		future.cancel(true);
		

	}

}
