package annotations;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		Class<Test> test = Test.class;

		System.out.println("All methods in class Test: ");
		for (Method method : test.getDeclaredMethods()) {
			System.out.println(method);
		}

		System.out.println();

		Test testClass = new Test();
		TestDoIt testDoItClass = new TestDoIt();
		testDoItClass.doIt(testClass);

	}
}
/*
 * написати клас який буде приймати обєкт і викликати його методи, анотовані
 * твоєю анотацією стільки разів яке значення в числовомо параметрі. і перед
 * кожним викликом виводити на екран значення текстового параметра.
 */