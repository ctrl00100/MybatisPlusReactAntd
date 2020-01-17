package kaoshi.test4;

public abstract class Staff {
private String name;
private int id;
private String salary;
public Staff(String name, int id, String salary) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
}
public Staff() {
    super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public abstract void smoke();
}
