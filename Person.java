
public class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
		}
	
	
	public static void main(String[]args) {
		Person P1=new Person("Tanfeez",23);
		Person P2=new Person("Ahmad",24);
		System.out.println("Name is: "+P1.name);
		System.out.println("Age is: "+P1.age);
		System.out.println("=========");
		System.out.println("Name is: "+P2.name);
		System.out.println("Age is: "+P2.age);
	}

}
