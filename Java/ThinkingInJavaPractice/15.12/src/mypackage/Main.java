package mypackage;
import java.util.ArrayList;
import java.util.List;

import net.mindview.util.New;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		@SuppressWarnings("unchecked")
		ArrayList<Animal> animals=(ArrayList)New.<Animal>list();
		animals.add(new Animal("Cat"));
		animals.add(new Animal("Dog"));
		animals.add(new Animal("Fish"));
		System.out.println(animals);

	}

}

class Animal
{
	String name;
	public Animal(String name) {
		// TODO �Զ����ɵĹ��캯�����
		this.name=name;
	}
	public String toString()
	{
		return "Animal "+name;
	}
}