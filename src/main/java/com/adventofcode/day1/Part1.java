package com.adventofcode.day1;

import com.adventofcode.helper.PuzzleHelper;
import lombok.val;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Part1 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        val lines = PuzzleHelper.readPuzzle(1);
        //val lines = Arrays.asList("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet");
        int sum = 0;
        int counter = 0;
        for (String line : lines) {
            //Suppression des charactères non numeriques
            var str = "";

            for (Character c : line.toCharArray()) {
                if (Character.isDigit(c)) str = str + c;
            }
            int first = Integer.parseInt("" + str.charAt(0));
            int last = Integer.parseInt("" + str.charAt(str.length() - 1));
            System.out.println(counter);
            val num = Integer.parseInt("" + first + last);
            sum = sum + num;
            counter++;
        }
        System.out.println(sum);
    }
}
