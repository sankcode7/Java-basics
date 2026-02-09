public class method_overloading {
//static void foo(){
//    System.out.println("Good Morning bro!");
//}
//static void foo(int a){
//    System.out.println("Good Morning " +  a  + " bro!");
//}
//static void foo(int a , int b){
//    System.out.println("Good Morning " +  a  + " bro!");
//    System.out.println("Good Morning " +  b  + " bro!");
//
//}

    static void foo(int a){
        System.out.println("Good Morning" + a + " bro!");
    }
    static void foo(int a , int b){
        System.out.println("Good Morning" + a + "bro!");
        System.out.println("Good Morning"+ b + "bro!");
    }
    static void foo(int a , int b , int c){
        System.out.println("Good Morning" + a + "bro!");
        System.out.println("Good Morning" + b + "bro!");
        System.out.println("Good Morning" + c + "bro!");


    }

    public static void main(String[] args) {

        foo(3000);
        foo(3000,4000);
        foo(3000,4000,5000);
//        Arguments are actual!


    }

//    static void tellJoke(){
//        System.out.println("I invented a new word!\n" + "Plagiarism");
//    }
//    public static void main(String[] args) {
//        tellJoke();

    }

