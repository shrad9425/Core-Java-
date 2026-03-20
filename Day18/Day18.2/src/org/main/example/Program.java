package org.main.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Program {
	public static void main(String[] args) {
		Class<?> c = Thread.class;
		//Program.printTypeInfo(c);
		//Program.printFieldInfo(c);
		Program.printMethodInfo(c);
		
	}
	private static void printMethodInfo(Class<?> c) {
		Method[] methods = c.getMethods();
		for(Method m: methods) {
			String modf = Modifier.toString(c.getModifiers());
			
			String returnType = m.getReturnType().getSimpleName();
			
			String name = m.getName();
			
			Parameter[] para = m.getParameters();
			StringBuffer sb = new StringBuffer("( ");
			for(Parameter parameters : para) {
				String type = parameters.getType().getSimpleName();
				sb.append(type);
				sb.append(" ");
				String paraName = parameters.getName();
				sb.append(paraName);
				sb.append(", ");
			}
			if(para.length > 0)
				sb.deleteCharAt(sb.length()-2);
			sb.append(" )");
			System.out.println(modf+" "+returnType+" "+name+" "+sb);
		}
	}
	private static void printFieldInfo(Class<?> c) {
		//Field[] field = c.getFields();
		Field[] field = c.getDeclaredFields();
		for(Field f: field) {
			String name = f.getName();
			//System.out.println(name);
			
			String typeName = f.getType().getName();
			//System.out.println(typeName);
			
			int mod = f.getModifiers();
			String modf = Modifier.toString(mod);
			//System.out.println(modf);
			System.out.println(modf+" "+typeName+" "+name);
		}
	}
	private static void printTypeInfo(Class<?> c) {
		String name = c.getName();
		System.out.println(name);
		
		String str = c.getSimpleName();
		System.out.println(str);
		
		int mod = c.getModifiers();
		String modf = Modifier.toString(mod);
		System.out.println(modf);
		
		Class<?>[] ifa = c.getInterfaces();
		for(Class<?> i: ifa) {
			System.out.println(i.getSimpleName());
		}
		
		Class<?> superclass = c.getSuperclass();
		//String scname = superclass.getName();	//java.lang.Object
		String scname = superclass.getSimpleName();	//Object
		System.out.println(scname);
		
		Method[] methods = c.getMethods();
		for(Method nameMethods : methods) {
			System.out.println(nameMethods);
		}
	}
}
