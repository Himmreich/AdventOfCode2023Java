package com.adventofcode.day2;

import com.adventofcode.helper.PuzzleHelper;
import lombok.val;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

public class Part1 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        val lines = PuzzleHelper.readPuzzle(2);
        int gameCount = 0;

        val maxValues = new HashMap<String, Integer>();
        maxValues.put("red", 12);
        maxValues.put("green", 13);
        maxValues.put("blue", 14);

        for (String line : lines) {
            boolean isOk = true;
            val gameNumber = Integer.valueOf(line.substring("Game".length(), line.indexOf(":")).trim());
            val games = line.substring(line.indexOf(":") + 1);
            for (String game: games.split(";")) {
                if (!isOk) break;
                for (String values : game.split(",")) {
                    val color = values.trim().split(" ")[1].replace(",", "");
                    val quantity = values.trim().split(" ")[0];
                    if (maxValues.get(color) < Integer.valueOf(quantity)) {
                        isOk = false;
                        break;
                    }
                }
            }
            if (isOk)
                gameCount = gameCount + gameNumber;
        }
        System.out.println(gameCount);
    }
}
