package mypackage;

import java.math.BigDecimal;
import java.util.Arrays;

import net.mindview.util.Generated;
import net.mindview.util.Generator;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(Arrays.toString(Generated.array(BigDecimal.class, new BigDecimalGenerator(), 10)));
		

	}

}

class BigDecimalGenerator implements Generator<BigDecimal>
{
	private static int num=0;

	@Override
	public BigDecimal next() {
		// TODO �Զ����ɵķ������
		num++;
		
		return new BigDecimal(num);
	}
	
}
