package kaoshi.test1;

public abstract class Bird {
private String name;

public Bird(String name) {
	super();
	this.name = name;
}

public Bird() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public abstract void Flysky();
}
