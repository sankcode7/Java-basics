public class methods {
     static int logic(int x,int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }
//   A method is a function written inside a class . Since java is an object oriented language,
//    we need to write the method inside some class

    public static void main(String [] args){
// using methods
        int a = 7;
        int b = 9;
        int c ;
        // method invocation using Object creation
      //  methods obj= new methods();
      //  c = obj.logic(a,b);
       c = logic(a,b);
        System.out.println(a+" "+b);

        int a1=2;
        int b1=1;
        int c1;
        c1 = logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);

      // without using methods
     /*   int a = 7;
        int b = 9;
        int c ;
        if(a>b){
            c = a+b;
        }
        else{
            c = (a+b)*5;
        }
        System.out.println(c);*/

      /*  int a1=2;
        int b1=1;
        int c1;
        if(a1>b1){
            c1= a1+b1;
        }
        else{
            c1= (a1+b1)*5;
        }
        System.out.println(c1);*/


    }
}
