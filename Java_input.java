import java.util.*;
public class Java_input {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num = sc.nextInt();
    System.out.print("You entered: " + num);
    if (num < 10) {
      System.out.println("Are you Sure?");
    }else{
      System.out.println("Thanks for using the program");
    }
  }
}



