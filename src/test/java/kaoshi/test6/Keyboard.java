package kaoshi.test6;

public class Keyboard extends USB implements Specs {

	@Override
	public void usbSpecs() {
		// TODO Auto-generated method stub
System.out.println("遵守了USB规范");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
System.out.println("插入了键盘");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
System.out.println("拔出了键盘");
	}
	public void love() {
System.out.println("最讨厌青轴的键盘了....");		
	}

}
