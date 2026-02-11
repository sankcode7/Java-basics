class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;

    }
    public String getName(){
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class cellphone1{
    public void ring(){
        System.out.println("ringing ....");
    }

    public void vibrate(){
        System.out.println("vibrating ....");
    }
    public void callfriend(){
        System.out.println("calling mukul....");
    }

}
class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

    class Tommy{
        public void hit(){
            System.out.println("Hitting the enemy");
        }
        public void run(){
            System.out.println("Running from the enemy");
        }
        public void fire(){
            System.out.println("firing on the enemy");
        }
    }


public class practiceset8 {
    public static void main(String[] args) {
        /*
//        problem1
        Employee sank = new Employee();
        sank.setName("Sankalp");
        sank.salary =232;
        System.out.println(sank.getSalary());
        System.out.println(sank.getName());


//        problem 2
        cellphone1 vivo = new cellphone();
        vivo.callfriend();
        vivo.vibrate();
        vivo.ring();

//        problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/


//        problem 5

        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();






    }
}
