public class Program2_Looping {
    public static void main(String[] args) {

        // Looping
        //for loop
        for (int i = 1; i <=10;i++) {
            System.out.println("Count from 1 to 10 Now at " + i);
            if(i==6) {
                break; // break is used for terminating the loop
                // continue; // it is used for skipping the iteration
            }
        }
        int meter = 1;
        // while loop
        while (meter <= 7) {
            System.out.println("Count fromm 1 to 7 Now at " + meter);
            meter++;
        }

        int job = 1;
        // do while loop
        do{
            System.out.println("Count from 1 to 6 Now at " + job);
            job++;
        }
        while(job<=6);
    }
}
