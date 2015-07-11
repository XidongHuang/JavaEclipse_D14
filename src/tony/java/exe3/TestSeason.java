package tony.java.exe3;

import javax.swing.Spring;

public class TestSeason {
	public static void main(String[] args) {
	Season spring = Season.SPRING;
	spring.show();
	System.out.println(spring.getSeasonName());
	System.out.println(Season.SPRING);
	
	}
}

//枚举类
class Season{
	//1.提供类的属性，声明为private final
	private final String seasonName;
	private final String seasonDesc;
	
	//2.声明为final的属性，在构造器中初始化。
	private Season(String seasonName, String seasonDesc) {
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
	public static final Season SPRING = new Season("spring", "warm");
	public static final Season SUMMER = new Season("summer", "hot");
	public static final Season FALL = new Season("fall", "cool");
	public static final Season WINTER = new Season("winter", "cold");

	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc="
				+ seasonDesc + "]";
	}
	
	public void show(){
		System.out.println("This is a season");
	}
	

	
		
}