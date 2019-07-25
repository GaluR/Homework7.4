import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę w zakresie [100, 200] oraz podzielną przez 3: ");
        int number;
        do {
            number = scanner.nextInt();
            if (number < 100) {
                System.out.println("Liczba jest za mała, wprowadź inną: ");
            } else if (number >= 100 && number <= 200) {
                if (number % 3 == 0) {
                    System.out.println("Twoja liczba jest odpowiednia!");
                } else {
                    System.out.println("Twoja liczba nie jest podzielna przez 3. Wprowadź inna.");
                }
            } else {
                System.out.println("Wprowadzona liczba jest za duża. Wprowadz inną.");
            }
        }while(!(number>=100 && number<=200 && number%3==0));
    }
}
