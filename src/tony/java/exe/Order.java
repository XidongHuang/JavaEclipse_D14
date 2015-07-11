package tony.java.exe;

import java.util.ArrayList;
import java.util.List;

//自定义泛型类
public class Order<T> {
	private String orderName;
	private int ordered;
	private T t;
	List<T> list = new ArrayList<T>();
	
	public void add(){
		list.add(t);
	
	}
	

	
	
	
	
	
	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", ordered=" + ordered
				+ ", t=" + t + "]";
	}







	public T getT(){
		return t;
	}
	
	public void setT(T t){
		this.t = t;
	}
	
	//声明泛型方法
	public <E> E getE(E e){
		return e;
	}
	//实现数组到集合的复制
	public <E> List<E> fromArrayToCollection(E[] e,List<E> list){
		for(E e1:e){
			list.add(e1);
		}
		return list;
	}
	
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public int getOrdered() {
		return ordered;
	}
	public void setOrdered(int ordered) {
		this.ordered = ordered;
	}
	
	
	
	
}

//继承泛型类或泛型接口时，可以指明泛型的类型
class SubOrder extends Order<Integer>{
	
}


