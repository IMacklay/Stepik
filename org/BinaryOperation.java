package stepik.org;

public class BinaryOperation {
    public static void main(String[] args) {
        System.out.println(flipBit(13, 2));
    }


    public static int flipBit(int value, int bitIndex) {


        return (value & (int) Math.pow(2, bitIndex));
    }
}
