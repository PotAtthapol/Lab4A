public class BooleanExplorer {
    public static void main(String[] args) {
        int a = 15, b = 8;
        double x = 3.7;

        System.out.println("a > b  : " + (a > b));    // ?
        System.out.println("a == b : " + (a == b));   // ?
        System.out.println("a != b : " + (a != b));   // ?
        System.out.println("x >= 3.7 : " + (x >= 3.7));
        System.out.println("a % 2 == 0 : " + (a % 2 == 0));  // is a even?
        boolean isPositive = (a > 0);
        System.out.println("isPositive: " + isPositive);

        System.out.println(" ------------------------- ");

        boolean equals = (b == a);
        b %= 4;
        System.out.println("b == a so we will let b % 4, b:" + b);

        if (3 < x && x < 4){
            System.out.println("-> x is between 3 and 4");
        }

        // ใส่ (a + b == 23) ไว้ในวงเล็บ ระบบจะคำนวณแล้วพ่น true/false ออกมาเอง
System.out.println("Is a + b equal to 23? : " + (a + b == 23));



 
    }
}
