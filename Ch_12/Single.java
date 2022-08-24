import java.lang.annotation.*;
import java.lang.reflect.*;

// A single-member annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	int value(); // this variable name must be value
}

class Single {
	// Annotate a method using a single-member annotation
	@MySingle(100)
	public static void myMeth() {
		try {
			Single ob = new Single();

			Method m = ob.getClass().getMethod("myMeth");
			MySingle a = m.getAnnotation(MySingle.class);

			System.out.println(a.value());

		} catch (NoSuchMethodException exc) {
			System.out.println("No Method Found");
		}
	}

	public static void main(String[] args) {
		myMeth();
	}
}