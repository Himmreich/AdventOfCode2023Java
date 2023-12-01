package com.adventofcode.helper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PuzzleHelper {

    public static List<String> readPuzzle(int number) throws URISyntaxException, IOException {
        Path path = Paths.get(PuzzleHelper.class.getClassLoader()
                .getResource("puzzles/input" + number).toURI());
        return Files.readAllLines(path);
    }
}
