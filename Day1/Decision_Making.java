import java.util.Scanner;

public class Decision_Making {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Selling Price : ");
        int sp = sc.nextInt();

        if(sp>cp) {
            System.out.println("I got profit 😀");
        } else if (sp==cp) {
            System.out.println("Same Same 😐");
        }
        else {
            System.out.println("Oh! No I got Loss 🥹");
        }
    }
}
