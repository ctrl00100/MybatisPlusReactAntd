/*����һ������Ϊ Vehicle�ಢ��������Ϊ������,��Vehicle��������һ��NoOfWheels����,ʹ������һ���ַ���ֵ.
����������,Car���Motorbike�� �̳��� Vehicle��,��������������ʵ�� NoOfWheels����.��Car����,Ӧ����ʾ
"���ֳ�"��Ϣ;����Motorbike����,Ӧ����ʾ"˫�ֳ�"��Ϣ.����һ����main��������,�ڸ����д��� Car��Motorbike��ʵ��,
���ڿ���̨��ʾ��Ϣ!*/

package kaoshi.test5;

public class Test5 {
public static void main(String[] args) {
	Car c=new Car("�µ�R8");
	
	String s=c.NoOfWheels();
	System.out.println(c.getName()+" "+s);
	Motorbike m=new Motorbike("����Ħ��");
	String s1=m.NoOfWheels();
	System.out.println(m.getName()+" "+s1);
}
}
