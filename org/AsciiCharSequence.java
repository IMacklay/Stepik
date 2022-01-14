package org;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{

    byte[] charSequence;

    public AsciiCharSequence(byte[] charSequence){
        this.charSequence = charSequence;
    }

    @Override
    public int length() {
        return charSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char)charSequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(charSequence,start,end));
    }

    @Override
    public String toString() {
        return new StringBuilder(new StringBuilder(this)).toString();
    }

    public static void main(String[] args) {
        byte[] b = {1,2,5,7};
        CharSequence charSequence = new AsciiCharSequence(b);
        System.out.println(charSequence);
    }
}
