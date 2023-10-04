public class a5q1 {
	public static void main(String arg[]){
	
	Course c1 = new Course("java") ;
	Course c2 = new Course("web") ;
	System.out.println(c1.getCourseName());

	c1.addStudent("divine");
	c1.addStudent("suyash");
	System.out.println(c1.courseName);
	System.out.println(c1.noOfStudent+" "+c2.noOfStudent) ;
	c1.getstudents() ;
	
	}


}

class Course {

String courseName;
String students[] = new String[10];
int noOfStudent ;

Course(String courseName){

System.out.println("Constructor of class Course evoked ");

this.courseName = courseName ;

}

String getCourseName(){

return this.courseName ;

}

void addStudent(String student) {
int lastindex ;

if (this.students == null){
lastindex  = 0  ;
}else{
lastindex  = (students.length - 1) ;
}

this.noOfStudent += 1 ;

this.students[lastindex] = student ;



}
void getstudents(){

if (this.students == null){
System.out.println("No Student enrolled yet") ;
}else{
for(int i = 0 ; i < this.students.length ; i++){
 System.out.print(this.students[i] + "  , ");
 
}
}



}




}