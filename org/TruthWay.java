package stepik.org;

public class TruthWay {

    public static void main(String[] args) {

        boolean a = true, b = true, c = true, d = true;

        for (int i = 0; i < 16; i++) {
            if (i % 8 == 0) a = !a;
            if (i % 4 == 0) b = !b;
            if (i % 2 == 0) c = !c;
            d = !d;
            String s = a + " " + b + " " + c + " " + d;


            System.out.println(s + (s.length() - 8 == s.replaceAll("true", "").length() ? " + " : " - ") + "   ->  " + booleanExpression(a, b, c, d));

        }
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return ((a ^ b) & (c ^ d)) | ((a ^ c) & (b ^ d));
    }
}
