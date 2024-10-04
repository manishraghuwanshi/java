package oops;

// Encapsulation : meaning is to hide sensitive information from the user
// decalre class variables as private
// access them by get and set methods 
public class Incap {
    public static void main(String[] args) {
        Person nameObject = new Person();
        nameObject.setName("Manish");
        System.out.println(nameObject.getName());
    }
}

class Person{
    private String  name;
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
}

/*
 * why encapsulation: 
    *Better control of class attributes and methods
    *Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    *Flexible: the programmer can change one part of the code without affecting other parts
    *Increased security of data
 */