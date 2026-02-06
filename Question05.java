
class Calculator {

    
    int add(int a, int b) {
        return a + b;
    }

   
    int multiply(int a, int b) {
        return a * b;
    }

    
    int square(int a) {
        return a * a;
    }
}


public class Question05{
    public static void main(String [] args) {

        Calculator c = new Calculator();

        // (3 * 4 + 5 * 7)^2
        int x1 = c.multiply(3, 4);
        int x2 = c.multiply(5, 7);
        int x3 = c.add(x1, x2);
        int result1 = c.square(x3);

        System.out.println("(3*4 + 5*7)^2 = " + result1);

        // (4 + 7)^2 + (8 + 3)^2
        int y1 = c.add(4, 7);
        int y2 = c.square(y1);

        int y3 = c.add(8, 3);
        int y4 = c.square(y3);

        int result2 = c.add(y2, y4);

        System.out.println("(4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}
