package com.tek;

import java.lang.reflect.Method;

public class GetClassMethod {
	public static void main(String[] args)
	{
		int count = 0;
		Object o = new String("book");
		Class <?> c = o.getClass();
		System.out.println("class name:" +c.getName());
		Method[] m = c.getDeclaredMethods();
		System.out.println("method Info");
		for(Method m1: m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("number of methods:"+count);
		
	}

}
