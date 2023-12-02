package com.adventofcode.day2;

import com.adventofcode.helper.PuzzleHelper;
import lombok.val;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class Part2 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        val lines = PuzzleHelper.readPuzzle(2);
        var result = 0;
        for (String line : lines) {
            val maxCubes = new HashMap<String, Integer>();
            maxCubes.put("red", -1);
            maxCubes.put("green", -1);
            maxCubes.put("blue", -1);
            val games = line.substring(line.indexOf(":") + 1);
            for (String game: games.split(";")) {
                for (String values : game.split(",")) {
                    val color = values.trim().split(" ")[1];
                    val quantity = Integer.valueOf(values.trim().split(" ")[0]);
                    if (maxCubes.get(color) < quantity)
                        maxCubes.put(color, quantity);
                }
            }
            var power = 1;
            for (Map.Entry<String, Integer> entry : maxCubes.entrySet()) {
                power = power * entry.getValue();
            }
            result = result + power;
        }
        System.out.println(result);
    }
}
