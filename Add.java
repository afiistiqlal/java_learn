import java.util.Scanner;

class Add {
    static int x, y, sum;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("input x: ");
            x = input.nextInt();

            System.out.print("input y: ");
            y = input.nextInt();
        }

        System.out.println("x + y = " + addTwoNum(x, y));
    }

    static int addTwoNum(int a, int b) {
        return sum = a + b;
    }
}