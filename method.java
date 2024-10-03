
// * A method is a block of code that run when its called


public class method {
    public int cuttoff(int pre, int mains){
        int result = (pre + mains)/2;
        return result;
    }
    public double cuttoff(double pre, double mains){ // *method overloading : when two methods having same name but different in parameters/parameters type
        double result = (pre + mains)/2;
        return result;
    }
    public static void main(String[] args) {
        method objmethod = new method();
        int merit = objmethod.cuttoff(50,60);
        double newMerit = objmethod.cuttoff(50, 70);
        System.out.println("final merit marks: " + merit);
        System.out.println("final merit: " +newMerit);

        // * Scope : variables only accessible in the region they are defined, follow the block scope too
        // *Recursion: when a fucntion call itself 
        System.out.println(sum(5));
    }

    public static int sum(int k) {
        if(k>0){ // *halting condition : a condition where the function stops calling itself
            return k+sum(k-1);
        }else{
            return 0;
        }
    }
}
