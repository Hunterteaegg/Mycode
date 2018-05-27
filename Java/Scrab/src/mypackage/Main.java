package mypackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;


public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String url="http://www.guancha.cn/politics/2018_05_23_457715.shtml";
		String result="";
		BufferedReader in=null;
		BufferedWriter out = null;
		
		try
		{
			URL realURL=new URL(url);
			URLConnection connection=realURL.openConnection();
			connection.connect();
			in=new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
			String line=null;
			out=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("my.txt"))));
			
			
			while((line=in.readLine())!=null)
			{
				result+=line+'\n';
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace(System.err);
		}
		finally
		{
			try {
				in.close();
				out.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace(System.err);
			}
		}
		System.out.println(result);

	}

}
