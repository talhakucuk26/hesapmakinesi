package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n1, n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch ( select){
            case 1:
                System.out.print("Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.print("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("Bir Sayı Sıfıra Bölünemez");
                }else {
                    System.out.println("Bölme : " + (n1 / n2));
                }
                break;

            default:
                System.out.println("Hatalı Değer");

        }





/*
        if (select == 1) {
          System.out.println("Toplam : "  + (n1 + n2));
        }else if (select == 2) {
            System.out.println("Çıkarma : " + (n1 - n2));
        }else if (select == 3) {
            System.out.println("Çarpma : " + (n1 * n2));
         }else if (select == 4) {
            System.out.println("Bölme : " + (n1 / n2));
        }else {
            System.out.println("Hatalı Değer Girdiniz");
        }
*/




        }
    }
