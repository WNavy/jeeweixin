package com.test.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class testAnnotation {

	public static void main(String[] args) {
		Student st = new Student();
		StringBuffer sb = new StringBuffer();
		Class<?> cls = Student.class;
		Constructor<?>[] constructors = cls.getConstructors();
		sb.append("Class注解：").append("\n");
		Persion classInfo = cls.getAnnotation(Persion.class);
		if (classInfo != null) {
			sb.append(Modifier.toString(cls.getModifiers())).append(" ")
					.append(cls.getSimpleName()).append("\n");
			sb.append("注解值: ").append(classInfo.name()).append("\n\n");
			sb.append("注解值: ").append(classInfo.age()).append("\n\n");
			sb.append("注解值: ").append(classInfo.hobby().toString()).append("\n\n");
		}
		System.out.print(sb.toString());
	}

}
