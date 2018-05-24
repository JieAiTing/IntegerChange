package myThread;

import java.lang.reflect.Field;

public class ChangeTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Integer a = 10;
		Integer b = 20;
		exchange(a,b);
		System.out.println("a= "+a +"------"+ "b="+b);
	}

	private static void exchange(Integer a, Integer b) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		 
		Field value = Integer.class.getDeclaredField("value");
		value.setAccessible(true);
		Field Modifile = Field.class.getDeclaredField("modifiers");
		Modifile.setAccessible(true);
		Modifile.setInt(value, value.getModifiers());
		int temp =b;
		value.set(b, a);
		value.set(a, new Integer(temp));
	}
}
