package mypackage;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class DoubleBufferDemo {
	private static final int BSIZE=1024;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ByteBuffer bb=ByteBuffer.allocate(BSIZE);
		DoubleBuffer db=bb.asDoubleBuffer();
		//store an array of double
		db.put(new double[] {1.0,2.0,3.0,5.0,5.789,49674.3});
		System.out.println(db.get(3));
		db.put(3, 66.23);
		//setting a new limit before rewinding the buffer
		db.flip();
		while(db.hasRemaining())
		{
			System.out.println(db.get());
		}

	}

}
