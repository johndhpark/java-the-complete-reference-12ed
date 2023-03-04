// Demonstrate a simple module-based applicaton.
package Ch_15.mymodapp.appsrc.appstart.appstart.mymodappdemo;

import Ch_15.mymodapp.appsrc.appfuncs.appfuncs.simplefuncs.SimpleMathFuncs;

/**
 * MyModAppDemo
 */
public class MyModAppDemo {

	public static void main(String[] args) {

		if (SimpleMathFuncs.isFactor(2, 10)) {
			System.out.println("2 is a factor of 10");
		}

		System.out.println("Smallest factor common to both 35 and 105 is " + SimpleMathFuncs.lcf(35, 105));

		System.out.println("Largest factor common to both 35 and 105 is " + SimpleMathFuncs.gcf(35, 105));
	}
}