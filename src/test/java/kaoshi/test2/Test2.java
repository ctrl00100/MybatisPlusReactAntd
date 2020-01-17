package kaoshi.test2;

public class Test2 {
public static void main(String[] args) {
	int[] lbr= {520,527,996,996,699,250};
	System.out.println("≈≈–Ú«∞:");
	bianli(lbr);
	System.out.println("≈≈–Ú∫Û:");
	maopao(lbr);
	bianli(lbr);
}
public static void bianli(int lbr[]) {
	System.out.print("[");
	for(int x=0;x<lbr.length;x++) {
		if(x==lbr.length-1) {
			System.out.println(lbr[x]+"]");
		}else {
			System.out.print(lbr[x]+",");
		}
	}
}
public static void maopao(int lbr[]) {
	for(int x=0;x<lbr.length-1;x++) {
		for(int y=0;y<lbr.length-1-x;y++) {
			if(lbr[y]>lbr[y+1]) {
				int temp=lbr[y];
				lbr[y]=lbr[y+1];
				lbr[y+1]=temp;
			}
		}
	}
}
}
