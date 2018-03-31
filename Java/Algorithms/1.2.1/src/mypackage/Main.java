package mypackage;

import java.util.Random;

import edu.princeton.cs.algs4.Point2D;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random rand=new Random(47);
		Point2D[] points=new Point2D[5];
		
		//add points to the arrays
		for(int i=0;i<5;i++)
		{
			points[i]=new Point2D(rand.nextInt(10), rand.nextInt(10));
		}
		
		//iterate the arrays
		for(Point2D point:points)
		{
			double distance=Math.sqrt(point.x()*point.x()+point.y()*point.y());
			System.out.println("Point:"+point+",the distance is "+distance);
		}

	}

}
