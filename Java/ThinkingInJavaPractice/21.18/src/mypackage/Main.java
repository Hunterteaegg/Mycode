package mypackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ExecutorService exe=Executors.newCachedThreadPool();
		Future<?> future=exe.submit(new MyMission());
		future.cancel(true);
		

	}

}
