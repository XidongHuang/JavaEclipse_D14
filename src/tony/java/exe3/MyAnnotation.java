package tony.java.exe3;

import java.awt.Window.Type;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
//自定义注解
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
//@Target({TYPE,FIELD,Method,Parameter,Constructor})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String value() default "hello";
	
	
	
}
