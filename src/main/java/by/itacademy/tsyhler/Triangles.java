package by.itacademy.tsyhler;

public class Triangles {
    public static String defineTriangle(int a, int b, int c) {
        String result = "Треугольник a=" + a + ", b=" + b + ", c=" + c;
        if (a + b <= c || a + c <= b || c + b <= a || a <= 0 || b <= 0 || c <= 0)
            result += " - не является треугольником";
        else if (b == c && a == c)
            result += " - равносторонний треугольник";
        else if (a == b || b == c || a == c) {
            result += " - равнобедренный треугольник";
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b)
            result += " - прямоугольный треугольник";
        else
            result += " - обычный треугольник";

        return result;
    }
}
