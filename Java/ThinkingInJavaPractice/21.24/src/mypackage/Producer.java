package mypackage;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
	private LinkedList<Product> buffer;
	
	public Producer(LinkedList<Product> buffer) {
		// TODO 自动生成的构造函数存根
		this.buffer=buffer;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		synchronized (this) {
			while(!Thread.interrupted())
			{
				while(buffer.size()<10)
				{
					Product product=new Product();
					buffer.add(product);
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println("Produce "+product);
				}
				while(buffer.size()==10)
				{
					
				}
			}
		}
		

	}

}
