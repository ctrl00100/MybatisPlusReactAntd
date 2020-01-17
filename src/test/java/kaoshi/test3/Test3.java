package kaoshi.test3;

public class Test3 {
	public static void main(String[] args) {
		int[] lbr = {11,22,33,44,55};
		StringBuffer sb = new StringBuffer();//Stringbuffer是动态字符串数组
		for (int i = 0; i < lbr.length; i++) {//for新建一个数组的角标 防止超过lbr[4];
			sb.append(lbr[i]);//创建了一个新的数组，扩大了长度
		}
		String st =sb.toString();//toString()方法返回这个对象的字符串
		System.out.println(st);
	}
}
