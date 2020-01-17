package kaoshi.test6;

public class Mouse extends USB implements Specs {

	@Override
	public void usbSpecs() {
		// TODO Auto-generated method stub
System.out.println("遵守了USB规范");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
System.out.println("插入了鼠标");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
System.out.println("拔出了鼠标");
	}
	public void use() {
System.out.println("鼠标遵守了usb规范就能正常使用");
	}

}
