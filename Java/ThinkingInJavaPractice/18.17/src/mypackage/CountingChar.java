package mypackage;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import net.mindview.util.TextFile;

public class CountingChar {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<Character, Integer> map=new TreeMap<Character,Integer>();
		
		/*
		 * initialize the map
		 */
		for(char i='A';i<='z';i++)
		{
			map.put(i, 0);
		}
		/*
		 * open a file to count letters
		 */
		Set<Character> letters=map.keySet();
		for(Character letter:TextFile.read("lecture.txt").toCharArray())
		{
			if(!letters.contains(letter))
			{
				continue;
			}
			int count=map.get(letter);
			map.put(letter, ++count);
		}
		/*
		 * print result
		 */
		System.out.println(map);

	}

}
