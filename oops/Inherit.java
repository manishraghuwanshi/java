package oops;
/*
 * inherit attributes and methods from one class to another is called inheritance
 * type : subclass(child) and superclass(parent)
 */

public class Inherit {
    public static void main(String[] args) {
        College obj = new College();
        obj.name = "MIT";
        obj.establishedYear = 1998;
        obj.collegeName = "MMIT";
        obj.collegeEstablishedYear = 1999; 
        obj.printChildData();
        obj.printData();
    }
    
}

class University{
    String name;
    int establishedYear;
    public void printData(){
        System.out.println(name + " established in " + establishedYear);
    }
}
class College extends University{
    String collegeName;
    int collegeEstablishedYear;
    public void printChildData(){
        System.out.println(collegeName + " established in " + collegeEstablishedYear);
    }
}