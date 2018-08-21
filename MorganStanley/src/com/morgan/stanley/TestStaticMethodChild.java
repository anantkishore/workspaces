/**
 * 
 */
package com.morgan.stanley;

/**
 * @author i351596
 *
 */
public class TestStaticMethodChild extends TestStaticMethod{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestStaticMethod child = new TestStaticMethodChild();
		child.abc();

	}
	
	static void def()
	{
		System.out.println("abc child");
	}

}
