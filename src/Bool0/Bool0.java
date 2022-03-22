package Bool0;

public class Bool0 {
    public static void main(String[] args) {
        int a = 5, b = 2, c=2;
        boolean b1 = a==b;
        boolean b2 = b==c;
        boolean b3 = a==c;
        boolean b4 = b1||b2||b3;
        System.out.println(b4);
        System.out.println(b3);

        System.out.println(b);
        if (a > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
        System.out.println(b3);

        if (a >= 0 || b < -2)
            System.out.println("да");
        else {
            System.out.println("Нет");
        }

    }
}
