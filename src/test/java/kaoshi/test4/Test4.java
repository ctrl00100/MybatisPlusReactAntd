package kaoshi.test4;

public class Test4 {
public static void main(String[] args) {
	Manager m=new Manager("������",1712220107,"45000ŷ","1000000ŷ");
	System.out.println(m.getName()+" "+m.getId()+" "+m.getSalary()+" "+m.getBouns());
    m.playfootball();
    m.smoke();
	Programmer p=new Programmer("������",527,"1000ŷ");
	System.out.println(p.getName()+" "+p.getId()+" "+p.getSalary());
	p.playGame();
	p.smoke();
}
}
