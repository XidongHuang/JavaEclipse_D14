package tony.java.exe3;
/*
 * 一.枚举类
 * 1.如何自定义枚举类
 * 2.如何使用enum关键字定义枚举类
 * 			>常用的方法：values() valuesOf(String name)
 * 			>如何让枚举类实现接口: 可以让不同的枚举类的对象调用被重写的抽象方法，执行的效果不同。——相当于让每个对象重写抽象方法。
 * 
 * 
 * 
 */

public class CopyOfTestSeason1 {
	public static void main(String[] args) {
	Season1 spring = Season1.SPRING;
	spring.show();
	System.out.println(spring.getSeasonName());
	//1.values()
	Season1[] seasons = Season1.values();
	for(int i=0; i<seasons.length;i++){
		System.out.println(seasons[i]);
	}
	//2.valuesOf(String Name): 要求传入的形参name是枚举类对象的名字。
	//否则，报java.lang.IllegalArgumentException异常
	String str  = "WINTER";
	Season1 sea = Season1.valueOf(str);
	System.out.println(sea);
	sea.show();
	Thread.State[] states = Thread.State.values();
	for(Object s:states){
		System.out.println(s);
	}
	}
}

interface info{
	void show();
}

//枚举类
enum Season1 implements info{
	
	 SPRING("spring", "warm"){public void show(){
		 System.out.println("Where is Spring?");
		 }
	 },
	 
	 SUMMER("summer", "hot"){
		 public void show(){
			 System.out.println("Summer is so hot.");
		 }
	 },
	 FALL("fall", "cool"){
		 public void show(){
			 System.out.println("Fall is the season for breaking up.");
		 }
	 },
	 WINTER("winter", "cold"){
		 public void show(){
			 System.out.println("Winter is so cold.");
		 }
	 };
	
	private final String seasonName;
	private final String seasonDesc;
	
	//2.声明为final的属性，在构造器中初始化。
	private Season1(String seasonName, String seasonDesc) {
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}
	
	//3.通过公共的方法来调用属性
	public String getSeasonName() {
		return seasonName;
	}

	public String getSeasonDesc() {
		return seasonDesc;
	}
	
	//4.创建枚举类的对象: 将类声明为public static final
	

	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc="
				+ seasonDesc + "]";
	}
	
	

	
		
}