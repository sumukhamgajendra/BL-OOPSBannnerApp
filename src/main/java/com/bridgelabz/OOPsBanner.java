package com.bridgelabz;

/**
 * OOPSBannerApp UC-3 : Using Strong.join() method to display OOPS banner
 *
 * @Author Sumukha
 * @Version 3.0
 */

public class OOPsBanner {
    public static void main(String[] args) {
        System.out.println(String.join(" ","   ***   ","    ***    ","******   ","  ****** "));
        System.out.println(String.join(" "," **   ** ","  **   **  ","**    ** ","**       "));
        System.out.println(String.join(" ","**     **"," **     ** ","**    ** ","**       "));
        System.out.println(String.join(" ","**     **"," **     ** ","*******  ","******* "));
        System.out.println(String.join(" ","**     **"," **     ** ","**       ","       **"));
        System.out.println(String.join(" "," **   ** ","  **   **  ","**       ","       **"));
        System.out.println(String.join(" ","   ***   ","    ***    ","**       "," ******* "));
    }
}
