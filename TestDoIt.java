package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
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

				System.out.println("  " + method.getName() + "():");
				for (int i = 0; i < info.amount(); i++) {
					System.out.println(info.text());

					try {
						if (method.invoke(object) != null)
							System.out.println(method.invoke(object));
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
					System.out.println();
				}
			}
			System.out.println();
		}

	}

}
