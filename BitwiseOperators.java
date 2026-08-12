public class BitwiseOperators {

    public static void main(String[] args) {

        int a = 6;
        int b = 3;

        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Left Shift: " + (a << 2));
        System.out.println("Right Shift: " + (a >> 1));
    }
}
