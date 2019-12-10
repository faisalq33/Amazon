public class Calculater {
    int a = 10;
    static int b = 20;

    public void  m1(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void addition(){
        int c = 100;
        System.out.println("Addition of "+c+" and "+b+" = ");
        System.out.println(c + b);
    }
    public static void subtraction(int a, int b){
        System.out.println("Subtraction of "+a+" and "+b+" = ");
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        String company = "TFL";
        System.out.println(company);
        subtraction( 20,  10);
        addition();
        System.out.println(b);
    }
}
