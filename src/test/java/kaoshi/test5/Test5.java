/*创建一个名称为 Vehicle类并将它声明为抽象类,在Vehicle类中声明一个NoOfWheels方法,使它返回一个字符串值.
创建两个类,Car类和Motorbike类 继承自 Vehicle类,并在这两个类中实现 NoOfWheels方法.在Car类中,应该显示
"四轮车"信息;而在Motorbike类中,应当显示"双轮车"信息.创建一个带main方法的类,在该类中创建 Car和Motorbike的实例,
并在控制台显示信息!*/

package kaoshi.test5;

public class Test5 {
public static void main(String[] args) {
	Car c=new Car("奥迪R8");
	
	String s=c.NoOfWheels();
	System.out.println(c.getName()+" "+s);
	Motorbike m=new Motorbike("哈雷摩托");
	String s1=m.NoOfWheels();
	System.out.println(m.getName()+" "+s1);
}
}
