import java.util.Scanner;

public class home_work_java_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Hi! What is your name?");
        String firstName = reader.nextLine();
        System.out.println("Hi, " + firstName);

        System.out.println("Tell me please your second name.");
        String secondName = reader.nextLine();
        System.out.println(secondName + ". Wrote down!");

        String fullName = firstName + " " + secondName;
        System.out.println("Nice to meet you" + " " + fullName);
    }

}
