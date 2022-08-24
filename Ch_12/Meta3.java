
// Show all annotations for a class a method
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();

	int val();
}

@What(description = "An annotation test class")
@MyAnno(str = "Testing", val = 100)
class Meta3 {

	@What(description = "An annotation test method")
	@MyAnno(str = "Testing", val = 100)
	public static void myMeth() {
		Meta3 ob = new Meta3();

		try {
			Annotation[] annos = ob.getClass().getAnnotations();

			// Display all annotations for Meta2.
			System.out.println("All annotations for Meta2:");
			for (Annotation a : annos) {
				System.out.println(a);
			}

			System.out.println();

			// Display all annotation for myMeth.
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();

			System.out.println("All annotations for myMeth:");
			for (Annotation a : annos) {
				System.out.println(a);
			}

		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String[] args) {
		myMeth();
	}
}