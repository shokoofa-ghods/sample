import java.util.Scanner;

public class Example {
    void initialName() {
        Scanner inp = new Scanner(System.in);
        String firstName, lastName;
        System.out.println("First Name:");
        firstName = inp.nextLine();
        System.out.println("Last Number 2:");
        lastName = inp.nextLine();
        char initialName = firstName.charAt(0);
        char initialLastName = lastName.charAt(0);
        System.out.println("Initial: "+ initialName +initialLastName);
    }
}
