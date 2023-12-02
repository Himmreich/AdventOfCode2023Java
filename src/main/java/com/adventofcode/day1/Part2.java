package com.adventofcode.day1;

import com.adventofcode.helper.PuzzleHelper;
import lombok.val;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Part2 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        val lines = PuzzleHelper.readPuzzle(1);
        //val lines = Arrays.asList("two1nine", "eightwothree", "abcone2threexyz", "xtwone3four", "4nineeightseven2", "zoneight234", "7pqrstsixteen");
        int counter = 0;
        int sum = 0;
        for (String line : lines) {
            System.out.println(line);
            val filteredLine = splitLines(line);
            System.out.println(filteredLine);
            //Find the first number
            //Suppression des charactères non numeriques
            var str = "";
            for (Character c : filteredLine.toCharArray()) {
                if (Character.isDigit(c)) str = str + c;
            }
            System.out.println(str);
            int first = Integer.parseInt("" + str.charAt(0));
            int last = Integer.parseInt("" + str.charAt(str.length() - 1));
            //System.out.println(counter);
            val num = Integer.parseInt("" + first + last);
            sum = sum + num;
            counter++;
        }
        System.out.println(sum);
    }


    public static String splitLines(String line) {
        /*
        * J'ai une ligne
        * Je supprime tous les chiffres
        * Je prends les 5 premiers ->
        * Si c'est un nombre je convertis
        * Sinon je deplace l'index de 1 et je prends les caracteres suivants
        * */
       int index = 0;
       while (index < line.length()) {
           var str = line.substring(index);
           if (str.startsWith("one"))
               line = line.replace("one", "1");
           else if (str.startsWith("two")) {
               line = line.replace("two", "2");
           } else if (str.startsWith("three")) {
               line = line.replace("three", "3");
           } else if (str.startsWith("four")) {
               line = line.replace("four", "4");
           } else if (str.startsWith("five")) {
               line = line.replace("five", "5");
           } else if (str.startsWith("six")) {
               line = line.replace("six", "6");
           } else if (str.startsWith("seven")) {
               line = line.replace("seven", "7");
           } else if (str.startsWith("eight")) {
               line = line.replace("eight", "8");
           } else if (str.startsWith("nine")) {
               line = line.replace("nine", "9");
           }
           index++;
       }
        return line;
    }
}
