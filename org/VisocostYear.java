package stepik.org;

public class VisocostYear {
    public static void main(String[] args) {
        System.out.println(leapYearCount(100));


    }


    public static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}