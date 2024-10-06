import java.util.Random;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        int numb = rnd.nextInt(0, 100000);
        System.out.println(numb);
        while (true){
            Scanner sc = new Scanner(System.in);
            int guessNumber = sc.nextInt();
            if (guessNumber / 1000 > numb)
                System.out.println("Təxmininiz çox böyükdür");
            else if (guessNumber / 100 > numb)
                System.out.println("Təxmininiz böyükdür");
            else if (guessNumber / 10 > numb)
                System.out.println("Təxmininiz bir az böyükdür");
            else if (guessNumber * 1000 < numb)
                System.out.println("Təxmininiz çox kiçikdir");
            else if (guessNumber * 100 < numb)
                System.out.println("Təxmininiz kiçikdir");
            else if (guessNumber * 10 < numb)
                System.out.println("Təxmininiz bir az kiçikdir");
            else if(guessNumber==numb){
                System.out.println("Doğru təxmin! Təbriklər");

            break;}
            else System.out.println("Yaxınlaşırsınız...");

    }
    }

}
