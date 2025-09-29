package ArrayPrograms;

import java.util.Scanner;

import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a linear equation (e.g., 2x+3=7 or -4x-8=0): ");
        String input = sc.nextLine().replaceAll(" ", ""); // Remove spaces

        // Split around '='
        String[] parts = input.split("=");
        if (parts.length != 2) {
            System.out.println("Invalid format. Use ax+b=c or ax-b=c");
            return;
        }

        String lhs = parts[0]; // ax+b or ax-b
        int c = Integer.parseInt(parts[1]); // RHS value

        // Find position of 'x'
        int xIndex = lhs.indexOf('x');
        if (xIndex == -1) {
            System.out.println("Invalid equation. Missing 'x'.");
            return;
        }

        // Extract 'a' (coefficient of x)
        String aStr = lhs.substring(0, xIndex);
        int a = aStr.isEmpty() ? 1 : (aStr.equals("-") ? -1 : Integer.parseInt(aStr));

        // Extract 'b' (constant term)
        String bStr = lhs.substring(xIndex + 1); // Could be +b or -b
        int b = bStr.isEmpty() ? 0 : Integer.parseInt(bStr);

        // Solve ax + b = c → x = (c - b) / a
        if (a == 0) {
            System.out.println("Invalid equation: coefficient of x cannot be zero.");
            return;
        }

        int x = (c - b) / a;
        System.out.println("Solution: x = " + x);
    }
}

