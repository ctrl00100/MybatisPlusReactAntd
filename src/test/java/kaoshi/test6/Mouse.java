package kaoshi.test6;

public class Mouse extends USB implements Specs {

	@Override
	public void usbSpecs() {
		// TODO Auto-generated method stub
System.out.println("������USB�淶");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
System.out.println("���������");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
System.out.println("�γ������");
	}
	public void use() {
System.out.println("���������usb�淶��������ʹ��");
	}

}
