package reflect;

public class TestReflect {
	public static void main(String[] args) {
		Class<?> clas = null;
		Class<?> class1 = null;
		Class<?> class2 = null;
		try {
			class1 = new TestReflect().getClass();
			class2 = Class.forName("reflect.TestReflect");
			clas = TestReflect.class;
			System.out.println(class1);
			System.out.println(class2);
			System.out.println(clas);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
