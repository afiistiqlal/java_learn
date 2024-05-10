/**
 * Main
 */
public class Main {
    int auto;
    static int staticVariable = 50;
    int normalVariable = 5;

    public Main(int autoArgument) {
        auto = autoArgument;
    }

    public static void main(String[] args) {
        final String name = "afi"; // constant

        Main myMain = new Main(20);
        System.out.println(myMain.auto);

        System.out.println(myMain.normalVariable);
        System.out.println(Main.staticVariable);
        System.out.println(name);
    }
}