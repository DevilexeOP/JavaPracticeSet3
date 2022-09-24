import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {
        System.out.println("This is a Practice Set #3 || Question 1");

        // Q1 -> Write a Java Program to convert a string to LowerCase

        Scanner sc = new Scanner(System.in);
        try {
            String a = "DEVIL";
            System.out.println(a.toLowerCase());
        } finally {
            sc.close();
        }

    }
}
