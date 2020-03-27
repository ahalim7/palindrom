/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.palindrom;

/**
 *
 * @author AbdElHalim
 */
public class checker {

    public static void main(String[] args) {
        isPalindrome("abba");
    }

    static void isPalindrome(String str) {
        // Start from leftmost and rightmost corners of str 
        int l = 0;
        int h = str.length() - 1;

        // Keep comparing characters while they are same 
        while (h > l) {
            if (str.charAt(l++) != str.charAt(h--)) {
                System.out.println("is Not Palindrome");
                return;
            }
        }
        System.out.println("is palindrome");
    }
}
