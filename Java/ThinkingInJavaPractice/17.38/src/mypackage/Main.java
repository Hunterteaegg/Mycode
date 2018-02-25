package mypackage;

import java.util.HashMap;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * create map and random
		 */
		HashMap<Integer, Double> map1=new HashMap<Integer,Double>(1000,0.1f);
		HashMap<Integer, Double> map2=new HashMap<Integer,Double>(1000,0.5f);
		HashMap<Integer, Double> map3=new HashMap<Integer,Double>(1000,0.7f);
		Random random=new Random(47);
		
		/*
		 * add test elements
		 */
		for(int i=0;i<800;i++)
		{
			map1.put(i, random.nextDouble());
			map2.put(i, random.nextDouble());
			map3.put(i, random.nextDouble());
		}
		
		/*
		 * test map1
		 */
		long start_map1=System.nanoTime();
		
		for(int i=0;i<100;i++)
		{
			map1.get(random.nextInt(800));
		}
		long duration_map1=System.nanoTime()-start_map1;
		
		/*
		 * test map2
		 */
		long start_map2=System.nanoTime();
		
		for(int i=0;i<100;i++)
		{
			map2.get(random.nextInt(800));
		}
		long duration_map2=System.nanoTime()-start_map2;
		
		/*
		 * test map3
		 */
		long start_map3=System.nanoTime();
		
		for(int i=0;i<100;i++)
		{
			map3.get(random.nextInt(800));
		}
		long duration_map3=System.nanoTime()-start_map3;
		
		/*
		 * print result
		 */
		System.out.println("Map1:"+(float)duration_map1/1000000);
		System.out.println("Map2:"+(float)duration_map2/1000000);
		System.out.println("Map3:"+(float)duration_map3/1000000);

	}

}
