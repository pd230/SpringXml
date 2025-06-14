package springDemo;


public class Alien {
	
//	1.constructor injection
//	private int age;
//	
//	public Alien(int age) {
//		this.age = age;
//	}
//	
//	public void code() {
//		System.out.println(age);
//	}
	
	
//	2.Setter Injection 
//	private int age;
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
	
	
//	3.ref type 
//	Laptop laptop;
//	
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
//	
//	public void code() {
//		laptop.Compile();
//	}
	
	
//	4.AutoWire 
	
    Computer com;
    
    public Computer getCom() {
    	return com;
    }
	
    public void setCom(Computer com) {
		this.com = com;
	}
	
	public void code() {
		com.Compile();
	}
}
