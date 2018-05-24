package reflect;

import java.io.Serializable;

public class TestReflect1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("reflect.TestReflect1");
		Class<?> parentClass = clazz.getSuperclass();
		System.out.println(parentClass.getName());
		Class<?> inner[] = clazz.getInterfaces();
		System.out.println("实现的接口有");
		for(int i =0;i<inner.length;i++) {
			System.out.println((i+1)+":"+inner[i].getName());
		}
	}
}
