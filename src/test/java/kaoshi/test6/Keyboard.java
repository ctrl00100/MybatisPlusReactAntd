package kaoshi.test6;

public class Keyboard extends USB implements Specs {

	@Override
	public void usbSpecs() {
		// TODO Auto-generated method stub
System.out.println("������USB�淶");
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
System.out.println("�����˼���");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
System.out.println("�γ��˼���");
	}
	public void love() {
System.out.println("����������ļ�����....");		
	}

}
