package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 *
 * UC8: Use Map for Character Patterns and Render via Function
 *
 * @author Sumukha
 * @version 8.0
 */
public class OOPsBanner {

    public static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Renders and prints the banner message using character patterns.
     *
     * @param message    the word to render (e.g., "OOPS")
     * @param patternMap map of character patterns
     */
    public static void renderBanner(
            String message,
            Map<Character, String[]> patternMap) {

        final int ROWS = 7;

        for (int row = 0; row < ROWS; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main method – program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        String message = "OOPS";

        Map<Character, String[]> patternMap =
                buildCharacterPatternMap();

        renderBanner(message, patternMap);
    }
}
