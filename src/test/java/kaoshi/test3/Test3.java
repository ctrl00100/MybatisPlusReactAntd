package kaoshi.test3;

public class Test3 {
	public static void main(String[] args) {
		int[] lbr = {11,22,33,44,55};
		StringBuffer sb = new StringBuffer();//Stringbuffer�Ƕ�̬�ַ�������
		for (int i = 0; i < lbr.length; i++) {//for�½�һ������ĽǱ� ��ֹ����lbr[4];
			sb.append(lbr[i]);//������һ���µ����飬�����˳���
		}
		String st =sb.toString();//toString()�����������������ַ���
		System.out.println(st);
	}
}
