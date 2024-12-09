//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Generate and print a 6-digit OTP
        System.out.printf("Your OTP: %06d%n", new Random().nextInt(1000000));
    }
}