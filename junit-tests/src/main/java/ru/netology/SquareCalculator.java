package ru.netology;

public class SquareCalculator {
    public int squareS(int width, int length){
        if (width > 0 && length > 0){
        return width * length;
        } else {
            return 0;
        }
    }
}
