import java.util.Scanner;

public class Program1_Function {
    // Functions

    // functions are used for modular programming
    // breaking the big problem into small code segments
    // helps in code re-usability
    void greet() {
        System.out.println("Good Afternoon Engineers!! 🧠");
    }

    // Parameterised Function
    double getSquaredRoot(int inputNum) {
        return Math.sqrt(inputNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // to call functions we need object of class
        // Syntax: <className> <obj> = new <className>();
        Program1_Function fun1 = new Program1_Function();
        fun1.greet();

        double res = fun1.getSquaredRoot(num);
        System.out.println("Squared root of " + num + " is " + res);
    }
}
