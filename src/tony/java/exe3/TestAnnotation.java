package tony.java.exe3;

import java.util.ArrayList;
import java.util.List;

/*
 * 注解
 * 1. JDK提供的常用的注解
 * @Override:限定重写父类方法，该注释只能用于方法
 * @Deprecated:用于表示某个程序元素(类，方法等)已过时
 * @SuppressWarnings:抑制编译器警告
 * 2.如何自定义一个注解
 * 3.元注解
 * 
 * 
 */
public class TestAnnotation {

	public static void main(String[] args) {
		Person p = new Student();
		p.walk();
		p.eat();
		
		
		@SuppressWarnings({ "rawtypes", "unused" })
		List list = new ArrayList();
		
	}
}
@MyAnnotation(value = "Haha")
class Student extends Person{
	

	@Override
	public void walk(){
		System.out.println("Students walk");
	}
	
	@Override
	public void eat(){
		System.out.println("Students eat");
	}
}


class Person extends Animal{
	
	String name;
	int age;
	
	
	
	public Person() {
		super();
	}

	public Person(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
	@MyTiger
	public void walk(){
		System.out.println("Walking");
	}
	
	
	@Deprecated
	public void eat(){
		System.out.println("Eating");
	}
	
	@Override
	public String toString(){
		
		
		return "Name is "+ this.name+", age is "+ this.age;
	}
	
}




abstract class Animal{
	@Override
	public String toString(){
		return null;
	};
	
	
}