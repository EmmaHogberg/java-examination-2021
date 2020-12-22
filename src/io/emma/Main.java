package io.emma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Uppgift 1: Textlängder
        ArrayList<String> poemString = new ArrayList<String>();
        poemString.add("Livet går vidare");
        poemString.add("Ja tiden går");
        poemString.add("Dagarna kommer");
        poemString.add("passerar och blir till år");

        System.out.println("Uppgift 1: Textlängder");
        System.out.println(poemString);
        System.out.println(getLengthOfText(poemString));



        // Uppgift 2: Summor (Kommer att återanvända denna lista med numbers för senare uppgifter också)
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(22);
        numbers.add(78);
        numbers.add(15);
        numbers.add(777);
        numbers.add(4);

        System.out.println("Uppgift 2: Summor");
        System.out.println(numbers);
        System.out.println(sumNumbers(numbers));


        // Uppgift 3: Medelvärde
        System.out.println("Uppgift 3: Medelvärde");
        System.out.println(getAverage(numbers));


        // Uppgift 4: Sortera
        System.out.println("Uppgift 4: Sortera");
        System.out.println("Osorterad");
        for(Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println("Sorterad");
        for(Integer num : sortNumbersMinToMax(numbers)) {
            System.out.println(num);
        }

        // Uppgift 5: Object
        ArrayList<String> myName = new ArrayList<>();
        Main myNameObject = new Main();
        myName.add(myNameObject.name);
        System.out.println("Uppgift 5: Object");
        System.out.println(myName);

        // Uppgift 6: Palindrom
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Character> reverseCharacters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uppgift 6: Palindrom");
        System.out.println("Är ordet ett palindrom? Skriv det ord du vill testa:");

        String input = scanner.nextLine();
        for(int i = 0; i < input.length(); i++) {
            characters.add(input.charAt(i));
        }

        for(int i = 0; i < input.length(); i++) {
            reverseCharacters.add(input.charAt(i));
        }
        Collections.reverse(reverseCharacters);

        System.out.println(characters);
        System.out.println(reverseCharacters);

        scanner.close();

        if(characters.equals(reverseCharacters)) {
            System.out.println("Texten är ett palindrom");
        }
        else {
            System.out.println("Texten är inte ett palindrom");
        }

        // Matteus lösning
        boolean palindrom = true;
        for (int i = 0, j = input.length() -1; i <= j ;i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                palindrom = false;
                break;
            }
        }
        if (palindrom) {
            // skriv ut
        }








    }


    // METODER

    // Uppgift 1: Textlängder
    public static ArrayList<Integer> getLengthOfText(ArrayList<String> poemString) {
        ArrayList<Integer> lengthOfText = new ArrayList<Integer>();
        for (String text : poemString) {
            lengthOfText.add(text.length());
        }
        return lengthOfText;
    }


    // Uppgift 2: Summor
    private static int sumNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for(Integer num : numbers) {
            sum += num;
        }
        return sum;
    }


    // Uppgift 3: Medelvärde
    private static int getAverage(ArrayList<Integer> numbers) {
        int sum = 0;
        int counts = numbers.size();
        for(Integer num : numbers) {
            sum += num;
        }
        return sum / counts;
    }


    // Uppgift 4: Sortera
    private static ArrayList<Integer> sortNumbersMinToMax(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }

    // Uppgift 5: Object
    String name = "Emma";


}
