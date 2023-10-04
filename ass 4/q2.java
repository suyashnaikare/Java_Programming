public class q2{
	
public static void main(String arg[]){
Student a = new Student("suyash",19);
System.out.print(a.name);
}
}

class Student{
	
	String name ;
	int age ;
	
	Student(String name , int age){
		this.name = name ;
		this.age = age ;
		
	}
	
}