package mypackage;

import net.mindview.util.CountingGenerator;
import net.mindview.util.CountingGenerator.Character;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Character character=new CountingGenerator.Character();
		StringBuilder stringBuilder=new StringBuilder();
		
		for(int i=0;i<10;i++)
		{
			stringBuilder.append(character.next());
		}
		System.out.println(stringBuilder);

	}

}
