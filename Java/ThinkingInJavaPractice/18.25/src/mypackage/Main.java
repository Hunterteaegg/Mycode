package mypackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		@SuppressWarnings("resource")
		FileChannel file=new FileInputStream("lecture.txt").getChannel();
		
		/*
		 * test allocate
		 */
		ByteBuffer allocatebuffer=ByteBuffer.allocate(1024);
		long start_al=System.nanoTime();
		try {
			file.read(allocatebuffer);
			file.close();
			allocatebuffer.flip();
			while(allocatebuffer.hasRemaining())
			{
				System.out.print(Charset.forName(System.getProperty("file.encoding")).decode(allocatebuffer));
			}
			System.out.println();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("The duration time is "+(float)(System.nanoTime()-start_al)/10e9);

	}

}
