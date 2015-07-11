package tony.java.exe3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;





@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface MyTiger{
	String vaule() default "For person";
}