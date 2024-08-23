import java.util.*;

class Solution {
    public String fractionAddition(String expression) {
        // Step 1: Parse the expression and extract individual fractions
        List<String> fractions = extractFractions(expression);
        
        // Step 2: Initialize the result as 0/1
        int numerator = 0;
        int denominator = 1;
        
        // Step 3: Process each fraction
        for (String fraction : fractions) {
            // Split the fraction into numerator and denominator
            String[] parts = fraction.split("/");
            int num = Integer.parseInt(parts[0]);
            int denom = Integer.parseInt(parts[1]);
            
            // Update the result by adding/subtracting the current fraction
            numerator = numerator * denom + num * denominator;
            denominator *= denom;
            
            // Step 4: Reduce the fraction
            int gcd = gcd(Math.abs(numerator), denominator);
            numerator /= gcd;
            denominator /= gcd;
        }
        
        // Step 5: Format the result
        return numerator + "/" + denominator;
    }
    
    // Helper method to extract fractions from the expression
    private List<String> extractFractions(String expression) {
        List<String> fractions = new ArrayList<>();
        int i = 0;
        int n = expression.length();
        
        while (i < n) {
            // Capture the sign if present
            int sign = 1;
            if (expression.charAt(i) == '-' || expression.charAt(i) == '+') {
                sign = expression.charAt(i) == '-' ? -1 : 1;
                i++;
            }
            
            // Capture the fraction part
            int start = i;
            while (i < n && expression.charAt(i) != '-' && expression.charAt(i) != '+') {
                i++;
            }
            String fraction = expression.substring(start, i);
            if (sign == -1) {
                fraction = "-" + fraction;
            }
            fractions.add(fraction);
        }
        
        return fractions;
    }
    
    // Helper method to calculate GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
