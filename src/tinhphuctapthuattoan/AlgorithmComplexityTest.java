package tinhphuctapthuattoan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi: ");
        String input = sc.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < input.length(); i++) {
            int ascii = (int) input.charAt(i);
            frequentChar[ascii]+=1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char)j;
            }
        }
        System.out.println("Ki tu xuat hien nhieu nhat trong chuoi la: " + character + " voi so lan la: " + max);
    }
}
