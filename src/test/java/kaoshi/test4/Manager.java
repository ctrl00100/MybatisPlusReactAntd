package kaoshi.test4;

public class Manager extends Staff {
private String Bouns;

public Manager(String name, int id, String salary, String bouns) {
	super(name, id, salary);
	Bouns = bouns;
}

public String getBouns() {
	return Bouns;
}

public void setBouns(String bouns) {
	Bouns = bouns;
}
public void smoke() {
	System.out.println("������Ͼ�");
}
public void playfootball() {
	System.out.println("��ʵ������");
}
}
