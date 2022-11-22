package amd.caveofprogramming.section30.l379;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("1984.txt")).forEach(System.out::println);

    }

}
