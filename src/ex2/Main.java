package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("How many random number do you need?");
            int inputNum = sc.nextInt();

            List<Integer> randomNumbers = getRandomNumbers(inputNum);
            System.out.println("Random numbers: " + randomNumbers);

            List<Integer> invertedNumbers = invertList(randomNumbers);
            System.out.println("Inverted numbers: " + invertedNumbers);

            sc.nextLine();
            System.out.println("Do you want to display numbers in even position? (Y/N)");
            String choiceInput = sc.nextLine();
            boolean choice = false;
            if (choiceInput.equalsIgnoreCase("Y")) {
                choice = true;
            } else if (choiceInput.equalsIgnoreCase("N")) {
                choice = false;
            } else if (choiceInput.equalsIgnoreCase("E")) {
                exit = true;
            } else {
                System.out.println("Invalid input. Please enter Y or N (press E to exit)");
            }
            if (!exit) {
                List<Integer> evenOddNumbers = printEvenOddList(randomNumbers, choice);
                System.out.println("Number in " + (choice ? "even" : "odd") + " positions: " + evenOddNumbers);
            }
        }
        sc.close();
    }

    public static List<Integer> getRandomNumbers(int inputNum) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < inputNum; i++) {
            numbers.add(random.nextInt(0, 100));
        }
        return numbers;
    }

    public static List<Integer> invertList(List<Integer> randomNumbers) {
        List<Integer> numbers2 = new ArrayList<>();
        for (int i = randomNumbers.size() - 1; i >= 0; i--) {
            numbers2.add(randomNumbers.get(i));
        }
        return numbers2;
    }

    public static List<Integer> printEvenOddList(List<Integer> randomNumbers, boolean getEven) {
        List<Integer> numbers3 = new ArrayList<>();
        for (int i = 0; i < randomNumbers.size(); i++) {
            if (getEven) {
                if ((i + 1) % 2 == 0) {
                    numbers3.add(randomNumbers.get(i));
                }
            } else {
                if ((i + 1) % 2 != 0) {
                    numbers3.add(randomNumbers.get(i));
                }
            }
        }
        return numbers3;
    }
}
