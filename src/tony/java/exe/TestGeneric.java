package tony.java.exe;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.ListModel;

import org.junit.Test;

/*
 * 泛型的使用Generic
 * 1.在集合中使用泛型（掌握）
 * 2.自定义泛型类，泛型接口，泛型方法（理解 ——> 使用）
 * 3.泛型与继承的关系
 * 4.通配符
 * 
 * 
 * 
 * 
 */


public class TestGeneric {
	
	/*
	 * 通配符的使用
	 * 
	 * T在实例化时候才创建，确定T的类型。而static发生在实例化之前，所以T和static不能同时使用
	 * 
	 */
	@Test
	public void test7(){
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		List<?> list1 = list;
		//可以读取声明为通配符的集合类的对象
		Iterator<?> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			
			
		}
		//不允许向声明为通配符的集合类中写入对象。唯一例外的是null
//		list1.add("CC");
//		list1.add(123);
		
		list1.add(null);
		
	}
	
	
	
	
	
	/*
	 * 通配符 ？
	 * List<A> List<B> ...... 都是List<?> 的子类
	 * 
	 * ? extends A :可以存放A及其子类
	 * ? super A: 可以存放A及其父类
	 */
	@Test
	public void test6(){
		List<?> list = null;
		List<Object> list1 = new ArrayList<Object>();
		List<String> list2 = new ArrayList<String>();
		list = list1;
		list = list2;
		show(list1);
		show1(list2);
		
		List<? extends Number> list3 = null;
		List<Integer> list4 = null;
		list3 = list4;
		List<Object> list5 = null;
//		list3 = list5;
		
		
	}
	
	public void show(List<Object> list){
		
	}
	
	public void show1(List<?> list){
		
	}
	
	
	/*
	 * 泛型与继承的关系
	 * 若类A是类B的子类，那么List<A>就不是List<B>的子接口
	 *
	 *
	 *
	 */
	@Test
	public void test5(){
		Object obj = null;
		String str = "AA";
		obj = str;
		
		Object[] obj1=null;
		String[] str1 = new String[]{"AA","NBN","f"};
		obj1 = str1;
		
		List<Object> list = null;
		List<String> list1 = new ArrayList<String>();
		
//		list  = list1;
		//假设 list = list1满足，
		//假设list = list1满足
		//list.add(123);
		//list1.get(0); —— list 和list1指向同一个地址值，所以当在list添加一个非String元素，list1 会得出非String类的元素。所以这种引用是不允许的
		
	}
	
	
	
	
	
	//自定义泛型类的使用
	@Test
	public void test4(){
		
		//1. 当实例化泛型类的对象时，指名泛型的类型。指名以后，对应的类中所有使用泛型的位置，都变为实例化中指定的泛型的类型
		//2. 如果我们自定义了泛型类，但是在实例化时没有使用，默认类型是Object类的
		Order<Boolean> o = new Order<Boolean>();
//		o.getT();
		o.setT(true);
		System.out.println(o.getT());
		o.add();
		List<Boolean> list = o.list;
		System.out.println(list);
		
		SubOrder o1 = new SubOrder();
		List<Integer> list2  = o1.list;
		System.out.println(list2);
		//泛型方法的使用：当通过对象调泛型方法时，指明泛型方法的类型
		Integer i= o.getE(34);
		Double d = o.getE(3.4);
		
		
		Integer[] integers = new Integer[]{1,2,3};
		List<Integer> list4 = new ArrayList<Integer>();
		List<Integer> list5 = o.fromArrayToCollection(integers, list4);
	}
	
	
	
	
	
	
	@Test
	public void test3(){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ga", 53);
		map.put("etr", 12);
		map.put("ha", 64);
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> o:set){
			System.out.println(o.getKey()+"-----"+o.getValue());
		}
		
	}
	
	
	
	
	
	
	//在集合中使用泛型 Generic
	@Test
	public void test2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(34);
		list.add(14);
//		list.add("af");
		list.add(new Integer("97"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
	
	

	@Test
	public void test1(){
		List list = new ArrayList();
		list.add(89);
		list.add(23);
		//1.没有使用泛型，任何Object及其子类的对象都可以添加进来
		list.add(new String("HH"));
		
		Iterator iterator = list.iterator();
		
		for(int k = 0; k<list.size();k++){
			System.out.println(iterator.next());
		}
		
		
//		for(int i = 0; i< list.size();i++){
//			//2. 强转为int型时，可能报ClassCastException的异常
//			int score = (Integer)list.get(i);
//			System.out.println(score);
//			
//		}
		
	}
}
