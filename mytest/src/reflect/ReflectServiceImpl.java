package reflect;

public class ReflectServiceImpl {
	public void say(String name) {
		System.out.println("hello"+name);
	}
	public ReflectServiceImpl getInstance() {
		ReflectServiceImpl obj = null;
		try {
			obj = (ReflectServiceImpl) Class.forName("reflect.ReflectServiceImpl").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		
	}
	public static void main(String[] args) {
		ReflectServiceImpl imp = new ReflectServiceImpl();
		System.out.println(imp.getInstance().toString());
	}
}
