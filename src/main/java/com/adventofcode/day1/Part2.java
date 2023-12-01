package com.adventofcode.day1;

import com.adventofcode.helper.PuzzleHelper;
import lombok.val;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;

public class Part2 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        val lines = PuzzleHelper.readPuzzle(1);
        val numbers = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        val map = new HashMap<String, Integer>();
        //val lines = Arrays.asList("two1nine", "eightwothree", "abcone2threexyz", "xtwone3four", "4nineeightseven2", "zoneight234", "7pqrstsixteen");
        int counter = 0;
        for (String line : lines) {
            System.out.println(counter);
            map.put("one", line.indexOf("one"));
            map.put("two", line.indexOf("two"));
            map.put("three", line.indexOf("three"));
            map.put("four", line.indexOf("four"));
            map.put("five", line.indexOf("five"));
            map.put("six", line.indexOf("six"));
            map.put("seven", line.indexOf("seven"));
            map.put("eight", line.indexOf("eight"));
            map.put("nine", line.indexOf("nine"));



            counter++;
        }
    }
}
