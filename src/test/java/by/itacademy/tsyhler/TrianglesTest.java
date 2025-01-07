package by.itacademy.tsyhler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrianglesTest {
    private String expectedTriangleMessage(int a, int b, int c, String type) {
        return "Треугольник a=" + a + ", b=" + b + ", c=" + c + " - " + type;
    }

    @Test
    public void testDefineTriangle1() {

        Assertions.assertEquals(expectedTriangleMessage(2, 2, 2, "равносторонний треугольник"),
                Triangles.defineTriangle(2, 2, 2));
    }


    @Test
    public void testDefineTriangle2() {
        Assertions.assertEquals(expectedTriangleMessage(3, 2, 2, "равнобедренный треугольник"),
                Triangles.defineTriangle(3, 2, 2));
    }

    @Test
    public void testDefineTriangle3() {
        Assertions.assertEquals(expectedTriangleMessage(10, 7, 9, "обычный треугольник"),
                Triangles.defineTriangle(10, 7, 9));
    }

    @Test
    public void testDefineTriangle4() {
        Assertions.assertEquals(expectedTriangleMessage(-1, 2, 2, "не является треугольником"),
                Triangles.defineTriangle(-1, 2, 2));
    }

    @Test
    public void testDefineTriangle5() {
        Assertions.assertEquals(expectedTriangleMessage(3, 4, 5, "прямоугольный треугольник"),
                Triangles.defineTriangle(3, 4, 5));
    }

    @Test
    public void testDefineTriangle6() {
        Assertions.assertEquals(expectedTriangleMessage(5, 5, 5, "равносторонний треугольник"),
                Triangles.defineTriangle(5, 5, 5));
    }

    @Test
    public void testDefineTriangle7() {
        Assertions.assertEquals(expectedTriangleMessage(10, 10, 15, "равнобедренный треугольник"),
                Triangles.defineTriangle(10, 10, 15));
    }

    @Test
    public void testDefineTriangle8() {
        Assertions.assertEquals(expectedTriangleMessage(1, 1, 1, "равносторонний треугольник"),
                Triangles.defineTriangle(1, 1, 1));
    }

    @Test
    public void testDefineTriangle9() {
        Assertions.assertEquals(expectedTriangleMessage(7, 24, 25, "прямоугольный треугольник"),
                Triangles.defineTriangle(7, 24, 25));
    }

    @Test
    public void testDefineTriangle10() {
        Assertions.assertEquals(expectedTriangleMessage(2, 3, 4, "обычный треугольник"),
                Triangles.defineTriangle(2, 3, 4));
    }

    @Test
    public void testDefineTriangle11() {
        Assertions.assertEquals(expectedTriangleMessage(10, 1, 1, "не является треугольником"),
                Triangles.defineTriangle(10, 1, 1));
    }

    @Test
    public void testDefineTriangle12() {
        Assertions.assertEquals(expectedTriangleMessage(0, 3, 5, "не является треугольником"),
                Triangles.defineTriangle(0, 3, 5));
    }

    @Test
    public void testDefineTriangle13() {
        Assertions.assertEquals(expectedTriangleMessage(9, 9, 9, "равносторонний треугольник"),
                Triangles.defineTriangle(9, 9, 9));
    }

    @Test
    public void testDefineTriangle14() {
        Assertions.assertEquals(expectedTriangleMessage(8, 6, 10, "прямоугольный треугольник"),
                Triangles.defineTriangle(8, 6, 10));
    }

    @Test
    public void testDefineTriangle15() {
        Assertions.assertEquals(expectedTriangleMessage(-5, -5, -5, "не является треугольником"),
                Triangles.defineTriangle(-5, -5, -5));
    }
}