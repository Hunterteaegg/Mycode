package mypackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class SortedDirList {
	File file;
	
	public SortedDirList(String path) {
		// TODO 自动生成的构造函数存根
		this.file=new File(path);
	}
	public String[] list()
	{
		return file.list();
	}
	public String[] list(final String regex)
	{
		return file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO 自动生成的方法存根
				return Pattern.compile(regex).matcher(name).matches();
			}
		});
	}

}
