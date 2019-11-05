package com.anoop.kt.StringIsImmuttable;
/**
 * 
 * @author anoop
 *Class to demonstrate String is immutable
 */
public class StringDemo {
	
	public void demo()
	{
	String str1="Hello";//here str is not an object ,it is a reference to the object
	String str2=str1;	// str1 and str2 now point at the same string - "Hello"
	str1="help";//now the reference changed
	System.out.println(str2);//output is Hello
	}
	
	public static void main(String[] args) {
		
		StringDemo demo=new StringDemo();
		demo.demo();
	}

}
