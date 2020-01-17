package kaoshi.test4;

public class Test4 {
public static void main(String[] args) {
	Manager m=new Manager("¡Ë»À…",1712220107,"45000≈∑","1000000≈∑");
	System.out.println(m.getName()+" "+m.getId()+" "+m.getSalary()+" "+m.getBouns());
    m.playfootball();
    m.smoke();
	Programmer p=new Programmer("¡ı∞ÿ»Í",527,"1000≈∑");
	System.out.println(p.getName()+" "+p.getId()+" "+p.getSalary());
	p.playGame();
	p.smoke();
}
}
