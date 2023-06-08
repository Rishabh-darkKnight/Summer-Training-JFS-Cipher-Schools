import java.util.*;
public class Activity2 {
    public static void main(String[] args) {
        // mine code
        Random rnum = new Random();
        int comp_choice = rnum.nextInt(20) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 1;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter the User choice between 1 to 20 : ");
            int user_choice = sc.nextInt();
            if(user_choice > comp_choice) {
                System.out.println("Your Guess is too High");
                count++;
            }
            else if (user_choice < comp_choice) {
                System.out.println("Your Guess is too Low");
                count++;
            }
            else if(user_choice == comp_choice) {
                System.out.println("Hurray You guessed it Right 🎉");
                break;
            }
            if (count > 6) {
                System.out.println("You have ran out of chances");
            }
        }

//        // sir code
//        // First Let us Create Scanner object
//        System.out.println("Guess the Number GAME!! ");
//        System.out.println("=========================");
//        Scanner sc = new Scanner(System.in);
//
//        // Generate a Random Number between 1 and 20.
//
//        Random rnd = new Random();
//        int computerChoice = rnd.nextInt(20)+1;
//
//        int attempt=1;
//
//        do {
//
//            System.out.println("Guess a Number between 1 and 20 ");
//            int userChoice = sc.nextInt();
//
//            // do the comparision here.
//
//            if (userChoice > computerChoice){
//                System.out.println("Your guess is too High ");
//            }
//            else if (userChoice < computerChoice){
//                System.out.println("Your Guess is too LOW");
//            }
//            else {
//                System.out.println("Gotcha! you guessed it Right!! ");
//            // when the guess is Correct , Terminate the Loop
//                break;
//            }
//
//            attempt+=1;
//
//            if (attempt==7) {
//                System.out.println("You have Ran out of Attempts");
//            }
//
//        }while(attempt<=6);
    }
}
