package mypackage;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import net.mindview.util.BinaryFile;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * initialize a map
		 */
		Map<Byte, Integer> byteCount=new TreeMap<Byte,Integer>();
		for(byte i=0;i<256;i++)
		{
			byteCount.put(i, 0);
		}
		/*
		 * open a file to count
		 */
		try {
			byte[] lecture=BinaryFile.read("lecture.txt");
			
			for(Byte b:lecture)
			{
				int count=byteCount.get(b);
				byteCount.put(b,++count );
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		/*
		 * print result
		 */
		System.out.println(byteCount);

	}

}
