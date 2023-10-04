public class q5{
	
public static void main(String arg[]){
Student a = new Student(),b = new Student(),c = new Student() ;
a.set("suyash",19) ;
b.set("meet",18) ;
System.out.print(a.name + b.name);
}
}


class Student{
	
	String name ;
	int age ;
	
	public void set(String name, int age){
		this.name = name;
		this.age = age ;
	}
}
