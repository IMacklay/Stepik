package org;

import java.util.Arrays;

public class ArrayOrder {

    public static void main(String[] args) {

        int[] a = {0, 2, 2, 10,10,20}, b = {1, 3, 5, 7, 8,10,10};

        System.out.println(Arrays.toString(mergeArrays(a, b)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] a3 = new int[a1.length+a2.length];

        for(int i = 0, j = 0, z = 0; z < a3.length-1; z++){
            System.out.println("a1 -> "+a1[i]+"    a2 -> "+a2[j]);
            a3[z] = a1[i]<a2[j] ? a1[i++] : a2[j++];

            if (i == a1.length) {
                System.arraycopy(a2,j,a3,z+1,a2.length-j);
                break;
            }
            if (j == a2.length) {
                System.arraycopy(a1,i,a3,z+1,a1.length-i);
                break;
            }

        }

        return a3;
    }
}
