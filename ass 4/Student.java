import java.util.* ;

public class Student{
String name ;
int age ;

Student(String name,int age){
this.name = name ;
this.age = age ;
}

public static void main(String arg[]){

String name = "suyash" ;
int age = 20 ;

Student person1 = new Student(name,age) ;
System.out.print(person1.age);
}
}