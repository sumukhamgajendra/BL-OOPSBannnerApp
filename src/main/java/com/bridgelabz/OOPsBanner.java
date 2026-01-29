package com.bridgelabz;
/**
 *
 *
 * @author Sumukha
 * @version 5.0
 */

public class OOPsBanner {
    public static void main(String[] args) {
        String[] lines = {
            String.join(" ", "   ***   ", "    ***    ", "******   ", "  ****** ");
            String.join(" ", " **   ** ", "  **   **  ", "**    ** ", "**       ");
            String.join(" ", "**     **", " **     ** ", "**    ** ", "**       ");
            String.join(" ", "**     **", " **     ** ", "*******  ", "******* ");
            String.join(" ", "**     **", " **     ** ", "**       ", "       **");
            String.join(" ", " **   ** ", "  **   **  ", "**       ", "       **");
            String.join(" ", "   ***   ", "    ***    ", "**       ", " ******* ");
        };

        for(String line : lines){
            System.out.println(line);
        }
    }
}

