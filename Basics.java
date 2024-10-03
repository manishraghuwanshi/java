public class Basics {

    public static void main(String[] args) {
        // print vs println
        System.out.println("this is " + 23);
        System.out.print("this is" + 23 );
        System.out.println("end of this is" + 23);

        // math calculation
        System.out.println(23+1);
        /*
         * This is multiline 
         * comments
         */

        // java variables
        String name = "manish raghuwanshi";
        name = "manish";
        int value = 45;
        float floatValue = 1.34f;
        char charValue = '2';
        boolean booleanValue; // declared
        booleanValue = false; // initialized
        System.out.println(name + floatValue + charValue + booleanValue);
        //or we can use printf instead (use %n for newline as it does not ad new line)
        System.out.printf("%s %d %.4f %c %b%n", name, value, floatValue, charValue, booleanValue);
    
        final String line = "final line"; // prenvent overwriting
        System.out.println(line);
        
        //one value to multiple 
        int x, y, z;
        x=y=z=23;
        System.out.println(x+" "+y+" "+z);
        System.out.println(x+y+z);

        /*
         *Identifiers 
         *  name given to a variable, method, class, or other programming elements
         *  these should be unique and descriptive
         *  can contains letters, numbers, underscores and dollar signs 
         *  must begin with letter, should start with lower case letter, must not have whitespace 
         *  identifiers are case sensitive 
         *  reserved words can't be used as identifiers
         */

         // *Data Types
         /*
          * primitive :     byte, short, int, long, float, double, boolean, char, boolean, char
          * Non Primitive : String, Array and classes 
          */

         // *type casting
        /*
        *Widening (Automatic): 
            *byte->short->char->int->long->float->double
        *Narrowing (Manual):
            *double->float->long->int->char->short->byte 
        */

        // *widening 
        char myGrade = 'A';
        int myAge = myGrade;
        byte myNewAge = (byte) myAge;
        System.out.println("myGrade  is : " + myGrade);
        System.out.println("myAge is : " + myAge);
        System.out.println("myNewAge is : l" + myNewAge);

        // *Java math class : has many methods like math.random(), math.max(), math.min(), math.sqrt(), and etc...
        System.out.println(Math.random());

        // *if-else
        int time = 12;
        if(time > 12){
            System.out.println("its " + (time-12) + " pm");
        }else if(time==12){
            System.out.println("the day is just started");
        }else{
            System.out.println("its " + time + " am");
        }
        // *short hand if else
        // variable = (condition) ? ExpressionTrue : ExpressionFalse
        int time2 = 9;
        String hello = (time2 > 12) ? "Good Afternoon" : "Good Morning";
        System.out.println("Hello, " + hello);

        // *Java Switch
        int day = 4;
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }
        // *loops
        // * while 
        int i = 0;
        while (i < 5) {
          System.out.println(i);
          i++;
        }
        // *do-while
        int j = 0;
        do {
          System.out.println(j);
          j++;
        }
        while (j < 5);
        // *for
        // Outer loop
        for (int k = 1; k <= 2; k++) {
            System.out.println("Outer: " + k); // Executes 2 times

            // Inner loop
            for (int l = 1; l <= 3; l++) {
              System.out.println(" Inner: " + l); // Executes 6 times (2 * 3)
            }
          } 
      // *for-each
      String[] car = {"porche", "bmw", "alto", "thar", "lamborghini"};
      for(String m : car){
        System.out.println("car name is : " + m);
      }
      for(int n=0; n<car.length; n++) {
        System.out.println(car[n]);
      }

      // *break
      for (int o = 0; o < 10; o++) {
        if (o == 4) {
          break;
        }
        System.out.println(o);
      }
      // *continue
      for (int p = 0; p < 10; p++) {
        if (p == 4) {
          continue;
        }
        System.out.println(p);
      }

      // *Array 
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      System.out.println(cars[0]);
      cars[1] = "Ferrari";
      System.out.println(cars[1]);
      for(int a=0; a < cars.length; a++) {
        System.out.println(cars[a]);
      }
        // *multi-d array
      int matrix[][] = {{1,2,3,4}, {5,6,7,8}};
      System.out.println(matrix[0][0]);
      for(int[] row : matrix){
        for(int element : row){
            System.out.print(element + " ");
        }
        System.out.println(" ");
      }
      }   
}
