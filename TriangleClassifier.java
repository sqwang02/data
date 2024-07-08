package com.sqwang.test;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {
        // Dummy values that trigger unreachable paths
        double dummy1 = 0;
        double dummy2 = 0;

        // Valid input for reachable paths
        double valid1 = 3;
        double valid2 = 4;
        double valid3 = 5;

        classifyTriangle(dummy1, dummy2, dummy1); 
        classifyTriangle(valid1, valid2, valid3); 

        // Add more unreachable paths here
        classifyTriangle(1, 2, 3); 
        classifyTriangle(2, 2, 4); 
        classifyTriangle(3, 3, 6); 
        classifyTriangle(5, 10, 5); 
        classifyTriangle(0, 1, 1); 
        classifyTriangle(1, 0, 1); 
        classifyTriangle(1, 1, 0); 

        classifyTriangle(2, 2, 5); 
        classifyTriangle(3, 4, 5); 
        classifyTriangle(1, 2, 3); 
        classifyTriangle(3, 3, 7); 
        classifyTriangle(4, 4, 9); 

        classifyTriangle(-1, 2, 3); 
        classifyTriangle(2, -1, 3); 
        classifyTriangle(2, 3, -1); 
        classifyTriangle(0, 1, 1); 
        classifyTriangle(1, 0, 1); 
        classifyTriangle(1, 1, 0); 

        classifyTriangle(2, Double.NaN, 3); 
        classifyTriangle(Double.POSITIVE_INFINITY, 2, 3); 
        classifyTriangle(Double.NaN, Double.NaN, Double.NaN); 
        classifyTriangle(1, Double.POSITIVE_INFINITY, 1); 
        classifyTriangle(0, Double.NaN, 0); 
    }

    // Method to classify the type of triangle
    public static String classifyTriangle(double side1, double side2, double side3) {
        // Check if sides form a valid triangle
        if (!isValidTriangle(side1, side2, side3)) {
            return "These side lengths do not form a valid triangle.";
        }

        // Classify the triangle
        if (side1 == side2 && side2 == side3) {
            return "Equilateral Triangle";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
    }

    // Method to check if sides form a valid triangle
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        // Check triangle inequality theorem and positive sides
        return (side1 > 0 && side2 > 0 && side3 > 0 &&
                side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
    }
}
