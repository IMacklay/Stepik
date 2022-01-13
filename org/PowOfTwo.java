package org;
/*
    Является ли абсолютное значение числа степенью двойки
 */
public class PowOfTwo {

    public static void main(String[] args) {
        System.out.println( isPowerOfTwo(-2) );
    }

    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
    //Битовое представление всех степеней двойки всегда срдержит лишь одну единицу
    //их мы и считаем функцией bitCounter
}
