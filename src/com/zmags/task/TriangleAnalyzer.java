package com.zmags.task;

public class TriangleAnalyzer {

    private final int SCALENE = 1;
    private final int ISOSCELES = 2;
    private final int EQUILATERAL = 3;
    private final int INVALID = 4;

    public TriangleAnalyzer(){
    
    }
     /**
     * Take 3 side of triangle and return type 
     * 1 if triangle is SCALENE
     * 2 if triangle is ISOSCELES
     * 3 if triangle is EQUILATERAL
     * 4 if triangle is INVALID any side is negtive or zero or sum of any two side is less or equal to third side
     */
    public int getTriangleType(int sideA, int sideB, int sideC) {

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return INVALID;
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideC + sideB <= sideA) {
            return INVALID;
        }
        if (sideA == sideB && sideB == sideC) {
            return EQUILATERAL;
        }
        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return ISOSCELES;
        }

        return SCALENE;
    }
}
