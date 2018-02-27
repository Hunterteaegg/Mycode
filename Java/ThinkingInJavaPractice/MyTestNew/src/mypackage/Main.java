package mypackage;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args) throws URISyntaxException {
		// TODO 自动生成的方法存根
		File file=new File(new URI("https://www.baidu.com"));
		
		for(String s:file.list())
		{
			System.out.println(s);
		}

	}

}
