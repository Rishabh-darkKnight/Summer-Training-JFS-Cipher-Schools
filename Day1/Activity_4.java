import java.util.Scanner;

public class Activity_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String str = sc.next();
        Character gender = str.charAt(0);
        int days = sc.nextInt();
        int total_wages =0;
        if(age >= 18 && age <= 29) {
            if(gender == 'M') {
                total_wages = days * 700;
                System.out.println(total_wages);
            }
            else if(gender == 'F') {
                total_wages = days * 750;
                System.out.println(total_wages);
            }
        } else if (age >= 30 && age <= 40) {
            if(gender == 'M') {
                total_wages = days * 800;
                System.out.println(total_wages);
            }
            else if(gender == 'F') {
                total_wages = days * 850;
                System.out.println(total_wages);
            }
        }
        else{
            System.out.println("Enter valid age!");
        }
    }
}
