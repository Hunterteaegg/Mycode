package mypackage;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
	private LinkedList<Product> buffer;
	
	public Producer(LinkedList<Product> buffer) {
		// TODO �Զ����ɵĹ��캯�����
		this.buffer=buffer;
	}

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
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
						// TODO �Զ����ɵ� catch ��
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
