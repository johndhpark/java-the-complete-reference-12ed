import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME);
@interface MyAnno {
	String str();
	int val();
}