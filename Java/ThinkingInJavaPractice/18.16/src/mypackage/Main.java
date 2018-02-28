package mypackage;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		RandomAccessFile randomAccessFile=new RandomAccessFile("Data.txt", "rw");
		
		for(int i=0;i<100;i++)
		{
			randomAccessFile.writeInt(8*i);
		}
		randomAccessFile.seek(89*4);
		System.out.println(randomAccessFile.readInt());
		randomAccessFile.close();

	}

}
