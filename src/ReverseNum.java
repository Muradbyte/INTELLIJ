import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
        int reverseNumber = 0;
        while (num != 0) {
            reverseNumber = 10 * reverseNumber + num % 10;
            num /= 10;
        }
        System.out.println(reverseNumber);
    }
}
}