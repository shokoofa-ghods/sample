import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Avg {
    public void average() {
        Scanner inp = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Input Number 1:");
        num1= inp.nextInt();
        System.out.println("Input Number 2:");
        num2 = inp.nextInt();
        System.out.println("Input Number 3:");
        num3 = inp.nextInt();
        double avg = (num1+num2+num3)/3.0;
        System.out.println(String.format("Avg of %d, %d, %d = %.2f",num1, num2, num3, avg));
    }

}

