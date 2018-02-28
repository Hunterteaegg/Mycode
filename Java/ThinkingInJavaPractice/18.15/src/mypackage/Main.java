package mypackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		try {
			DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("test.txt")));
			DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			
			out.writeChar('a');
			out.writeUTF("Take away!");
			out.close();
			
			System.out.println(in.readChar());
			System.out.println(in.readUTF());
			in.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
