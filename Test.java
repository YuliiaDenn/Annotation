package annotations;

public class Test {

	@Info(amount = 3)
	public void testA() {
		
		System.out.println("Test A");

	}

	@Info(amount = 2, text = "Other info")
	public void testB() {

		System.out.println("Test B");
	}

	public void testC() {
		System.out.println("Test C");

	}

}
