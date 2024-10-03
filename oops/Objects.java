package oops;

public class Objects {
    public static void main(String[] args) {
        college student = new college(); // student is a object of college class
        student.students(23, "manish",  12345, "Computer Science"); // calling stduents method of college class
        student.fullName = "sachin raghuwanshi";
        System.out.println(student.fullName);
        
    }
}

class college {

    String fullName = "Manish Raghuwanshi"; // fullName is an attribute of college class, which is called variable inside the class

    public void students(int age, String name, int rollno, String stream)  {
        String[] result = {String.valueOf(age), name, String.valueOf(rollno), stream} ;
        for(int i = 0; i < result.length; i++) {
            switch (i) {
             case 0:
                 System.out.println("Student age is : " + result[i]);
                 break;
             case 1:
                 System.out.println("Student name is : " + result[i]);
                 break;
             case 2:
                 System.out.println("Student roll number is : " + result[i]);
                 break; 
             case 3:
                 System.out.println("Student stream is : " + result[i]);
                 break;          
            
             default:
                 System.out.println("not data found");
                 break;
            } 
         }
    }
}
