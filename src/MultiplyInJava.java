import java.util.Scanner;

public class MultiplyInJava {
    public static void main(String[]args){
      /*This reads the input provided by user
      using keyboards
       */
      Scanner TalkMe = new Scanner(System.in);
      System.out.print("First day users on TalkMe:");
      //This method reads the number

        int num1 = TalkMe.nextInt();

        System.out.print("Enter how many days you want to calculate the users on TalkMe:");
        int num2 = TalkMe.nextInt();

        //Closing Scanner after the use
        TalkMe.close();

        // Calculating product of two numbers
        int total = num1*num2;

        // The result after multiplication

        System.out.println("TalkMe users in first week on play store were:" + total);
    }

}
