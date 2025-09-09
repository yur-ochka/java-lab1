import java.util.Scanner;

public class NadprostiChysla {

    // Перевірка простоти числа
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Перевернути число
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    // Підрахунок кількості надпростих чисел
    public static int countNadprost(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int reversed = reverseNumber(i);
                if (isPrime(reversed)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Тестування
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Введiть число n: ");
        int n = sc.nextInt();
        System.out.println("Кiлькiсть надпростих чисел до " + n + ": " + countNadprost(n));
        sc.close();
    }
}
