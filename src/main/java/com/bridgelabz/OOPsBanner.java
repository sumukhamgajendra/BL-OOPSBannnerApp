package com.bridgelabz;
/**
 * OOPSBannerApp
 *
 * UC7: Store Character Pattern in a Class
 *
 * @author Sumukha
 * @version 7.0

 */
public class OOPsBanner {

    /**
     * Inner Static Class that stores a character
     * and its corresponding 7-line banner pattern.
     */
    public static class CharacterPatternMap {

        char character;
        String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character the banner character (O, P, S, etc.)
         * @param pattern   7-line pattern representation
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character.
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the banner pattern.
         *
         * @return string array representing the pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to fetch a pattern for a given character.
     *
     * @param ch       character whose pattern is required
     * @param patterns array of CharacterPatternMap objects
     * @return pattern corresponding to the character
     */
    public static String[] getCharacterPattern(
            char ch,
            CharacterPatternMap[] patterns) {

        for (CharacterPatternMap map : patterns) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[0];
    }

    /**
     * Main method – program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Initialize character-pattern mappings
        CharacterPatternMap[] patternMaps = {

                new CharacterPatternMap('O', new String[]{
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                }),

                new CharacterPatternMap('P', new String[]{
                        "****** ",
                        "*     *",
                        "*     *",
                        "****** ",
                        "*      ",
                        "*      ",
                        "*      "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                })
        };

        String word = "OOPS";

        // Build and print the banner line by line
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patternMaps);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}
