package mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileChannel fc=new FileOutputStream("lecture.txt").getChannel();
		fc.write(ByteBuffer.wrap("My Word".getBytes("UTF-16BE")));
		fc=new FileInputStream("lecture.txt").getChannel();
		ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
		byteBuffer.clear();
		fc.read(byteBuffer);
		byteBuffer.flip();
		PrintOut.print(byteBuffer.asCharBuffer());
		fc.close();

	}

}
