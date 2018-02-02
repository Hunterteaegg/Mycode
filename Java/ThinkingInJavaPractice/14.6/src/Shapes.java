//: typeinfo/Shapes.java


import java.util.*;

abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  public String toString()
  {
	  return this.getClass().getSimpleName();
  }
}

class Circle extends Shape {
	;
}

class Square extends Shape {
	;
}

class Triangle extends Shape {
  ;
}	

class Rhomboid extends Shape
{
	;
}

public class Shapes {
  public static void main(String[] args) {
    List<Shape> shapeList = Arrays.asList(
      new Circle(), new Square(), new Triangle()
    );
    for(Shape shape : shapeList)
    {
    	shape.draw();
    	System.out.println(shape);
    }
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
