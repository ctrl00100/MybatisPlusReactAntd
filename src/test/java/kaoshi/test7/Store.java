package kaoshi.test7;

public class Store {
	
public Animal getInstance(String type) {
	Animal animal;
	if(type.equals("dog")) {
		Dog d=new Dog();
		return d;
	}else if(type.equals("cat")){
		Cat c=new Cat();
		return c;
	}else{
		Pig p=new Pig();
		return p;
	}
	
}
}
