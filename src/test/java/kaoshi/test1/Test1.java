package kaoshi.test1;

import kaoshi.test1.Eagle;
import kaoshi.test1.Maque;
import kaoshi.test1.Plane;

public class Test1 {
public static void main(String[] args) {
	Eagle e=new Eagle("°¢Ó¥");
	System.out.println(e.getName());
	e.Flysky();
	Maque m=new Maque("°¢Âé");
	System.out.println(m.getName());
	m.Flysky();
	Plane p=new Plane();
	p.Flysky();
}
}
