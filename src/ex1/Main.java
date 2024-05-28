package ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many words do you want to input?");
        int wordsNum = sc.nextInt();
        sc.nextLine();

        Set<String> wordsSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();
        System.out.println("Write the words here: ");

        for (int i = 0; i < wordsNum; i++) {
            String words = sc.nextLine();
            if (wordsSet.contains(words)) {
                duplicateSet.add(words);
            } else {
                wordsSet.add(words);
            }
        }
        System.out.println("Number of words: " + wordsNum);
        System.out.println("Words: " + wordsSet);
        if (!duplicateSet.isEmpty()) {
            System.out.println("Duplicates: " + duplicateSet);
        }

        sc.close();
    }
}