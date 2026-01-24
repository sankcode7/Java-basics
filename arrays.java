public class arrays {
    public static void main (String[] args) {
        // there are three main ways to create an array in Java
        // 1.Declaration and memory allocation
        // int [] marks = new int [5];
        // 2.Declaration and then memory allocation
//        java is zero indexed as index starts from 0
       int [] marks;
       marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        System.out.println(marks[0]);
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }


        // 3. Declaration, memory allocation and initialization together
//        int[] marks = {98, 45, 79, 99, 80};
//        System.out.println(marks.length);
//        // marks[5]= 96; --- throws an error
//        System.out.println(marks[4]);
//
//        String[] students = {"a", "b"};
//        System.out.println(students);

//       for(int i=0;i<50;i++){
//            if(i==2){
//                System.out.println("Ending the loop");
//            }
//            System.out.println(i);
//            System.out.println("Java is great");
//            }
/*      for (int i = 0; i <= 50; i++) {

                if(i==2){
                    System.out.println("end");

            }
            System.out.println(i);


        }*/
//        System.out.println("printing using for-each loop");
//        for(int element:marks){
//            System.out.println(element);
//        }
    }
}
