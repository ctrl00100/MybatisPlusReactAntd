package kaoshi.test5;

public abstract class Vehicle {
private String name;

public Vehicle(String name) {
	super();
	this.name = name;
}

public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public abstract String NoOfWheels();

}
