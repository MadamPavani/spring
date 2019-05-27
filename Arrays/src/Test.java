
public class Test {
	public static Test getInt(){
		return new Test();
	}
	public int hello(){
		System.out.println("Hello");
		return 0;
	}

	public static void main(String[] args) {
		Test.getInt().hello();
	}

}
