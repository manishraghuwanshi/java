package oops;
// * constructor of the class

public class Const {
    int myAge;
    public Const(int myAge){
        this.myAge = myAge;

    }
    public static void main(String[] args) {
        System.out.println("this is an example of constructor");
        // we have to set the initial value of an object, if we implement the constructor, otherwise it will throw an exception.
        // and if we don't implement the constructor then we don't have to set the initial value but this couse the default value of that data type which is not a good practice.
        // for a good practice we should implement the constructor to set the initial value of an object
        Const myConst = new Const(23); 
        System.out.println("this is object value of \"Const\" class : " + myConst.myAge);
    }

    /*
        * modifiers : a keyword that alters the properties or behavior of classes, methods, and variables
            * access modifiers : public, protected, private, default
            * non-access modifiers: 
                * class modifiers: final and abstract
                * attribute/method modifiers: final, abstract, static, transient, synchronized, volatile
    */
}
