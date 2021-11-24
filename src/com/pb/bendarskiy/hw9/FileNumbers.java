package com.pb.bendarskiy.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileNumbers {

    private final Logger LOGGER = Logger.getLogger(FileNumbers.class.getName());
    public static final Path NUMBERS_PATH = Paths.get("files/numbers.txt");
    public static final Path ODD_NUMBERS_PATH = Paths.get("files/odd-numbers.txt");

    public static void main(String[] args) {
        FileNumbers fileNumbers = new FileNumbers();
        fileNumbers.createNumbersFile();
        fileNumbers.createOddNumbersFile();
    }

    public void createNumbersFile() {

        createDirsAndFileIfNotExist(NUMBERS_PATH);

        try (BufferedWriter writer = Files.newBufferedWriter(NUMBERS_PATH)) {
            Random random = new Random();

            for (int i = 0; i < 10; ++i) {
                for (int j = 0; j < 10; ++j) {
                    String randomNumber = String.valueOf(random.nextInt(100) + 1);
                    writer.write(randomNumber);
                    if (j != 9) {
                        writer.write(" ");
                    }
                }
                writer.newLine();
            }

        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Error occurred: ", ex);
        }
        LOGGER.log(Level.INFO, "Write to file \"" + NUMBERS_PATH.toAbsolutePath() + "\" done!");
    }

    public void createOddNumbersFile() {

        createDirsAndFileIfNotExist(ODD_NUMBERS_PATH);

        try (BufferedWriter writer = Files.newBufferedWriter(ODD_NUMBERS_PATH);
             BufferedReader reader = Files.newBufferedReader(NUMBERS_PATH)) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (int i = 0; i < numbers.length; ++i) {
                    if ((Integer.parseInt(numbers[i]) % 2) == 0) {
                        numbers[i] = "0";
                    }
                }
                writer.write(String.join(" ", numbers));
                writer.newLine();
            }

        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Error occurred: ", ex);
        }

        LOGGER.log(Level.INFO, "Write to file \"" + ODD_NUMBERS_PATH.toAbsolutePath() + "\" done!");
    }

    private void createDirsAndFileIfNotExist(Path filePath) {
        try {
            Files.createDirectories(filePath.getParent());
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error occurred: ", e);
        }
    }
}
