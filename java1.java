import java.util.ArrayList;
import java.util.Scanner;
public class SumUsingAutoboxingUnboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter integers separated by space:");
        String inputLine = sc.nextLine();
        String[] inputs = inputLine.split("\\s+"); 
        for (String str : inputs) {
            try {
                int num = Integer.parseInt(str); 
                numbers.add(num); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + str + ". Skipping...");
            }
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; 
        }
        System.out.println("The sum of integers is: " + sum);
    }
}
