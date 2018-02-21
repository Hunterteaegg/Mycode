package mypackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.Countries;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String, String> map=new HashMap<String, String>();
		Set<String> set=new HashSet<String>();
		Pattern pattern=Pattern.compile("^A+");
		
		for(int i=0;i<Countries.DATA.length;i++)
		{
			Matcher matcher=pattern.matcher(Countries.DATA[i][0]);
			
			if(matcher.find())
			{
				map.put(Countries.DATA[i][0], Countries.DATA[i][1]);
				set.add(Countries.DATA[i][0]);
			}
		}
		System.out.println(map);
		System.out.println(set);

	}

}
