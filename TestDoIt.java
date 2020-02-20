package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestDoIt {

	public void doIt(Object object) {

		Class<? extends Object> classObject = object.getClass();

		Method[] methods = classObject.getDeclaredMethods();

		System.out.println("Method annotations:");
		System.out.println();

		for (Method method : methods) {

			if (method.isAnnotationPresent(Info.class)) {

				Annotation annotation = method.getAnnotation(Info.class);
				Info info = (Info) annotation;

				for (int i = 0; i < info.amount(); i++) {
					System.out.println(info.text());
				}
				System.out.println("  " + method.getName() + "():");
			}
			System.out.println();
		}

	}

}
