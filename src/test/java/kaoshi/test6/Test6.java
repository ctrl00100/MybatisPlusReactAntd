package kaoshi.test6;

public class Test6 {
public static void main(String[] args) {
	USB u= new Mouse();
	u.off();
	u.on();
	Mouse m = (Mouse)u;
	m.usbSpecs();
	m.use();
	USB us = new Keyboard();
	us.off();
	us.on();
	Keyboard kb=(Keyboard)us;
	kb.usbSpecs();
	kb.love();
}
}
