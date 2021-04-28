package tasks.task1;

import java.util.Scanner;
//ДЗ 1
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();

        long currentNumber = 1;
        long amountOfNumbersForCurrentAmountOfDigits = 9;
        int amountOfDigits = 1;
        long amountOfSymbols = k + 1;
        long currentAmountOfDigit = 0;
        while (amountOfSymbols - amountOfNumbersForCurrentAmountOfDigits > 0) {
            amountOfSymbols -= amountOfNumbersForCurrentAmountOfDigits;
            if (currentAmountOfDigit + amountOfNumbersForCurrentAmountOfDigits * amountOfDigits > k + 1) {
                break;
            }
            currentAmountOfDigit += amountOfNumbersForCurrentAmountOfDigits * amountOfDigits;
            amountOfNumbersForCurrentAmountOfDigits *= 10;
            amountOfDigits++;

        }
        for (int i = 1; i < amountOfDigits; i++) {
            currentNumber *= 10;
        }

        currentNumber += (((k) - currentAmountOfDigit) / amountOfDigits);
        currentAmountOfDigit += ((((k) - currentAmountOfDigit) / amountOfDigits) + 1) * amountOfDigits;
        if (currentAmountOfDigit == k + 1) {
            System.out.println(currentNumber % 10);
        } else {
            while (!(currentAmountOfDigit == (k + 1))) {
                currentAmountOfDigit--;
                currentNumber /= 10;
            }
            System.out.println(currentNumber % 10);
        }
    }
}
