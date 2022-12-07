package com.dev;

import java.util.Scanner;

public class ConvertirNumArabigosAnumRomanos {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite su número: ");
        int num = numero.nextInt();
        System.out.println(num +  " convertido a romano es: " + convertidorRomanos(num));
    }

    private static String convertidorRomanos(int numero) {
        return convierteAUnidad(numero);
    }

    private static String convierteAUnidad(int numero) {
        String valor = "";
        switch (numero) {
            case 1:
                valor = "I";
            break;
            case 2:
                valor = "II";
            break;
            case 3:
                valor = "III";
            break;
            case 4:
                valor = "IV";
                break;
            case 5:
                valor = "V";
                break;
            case 6:
                valor = "VI";
                break;
            case 7:
                valor = "VII";
                break;
            case 8:
                valor = "VIII";
                break;
            case 9:
                valor = "IX";
                break;
            case 10:
                valor = "X";
                break;
            default:
                //valor = "No existe este valor";
               valor = convierteDecimalARomano(numero);
        }

        return valor;
    }

    private static String convierteDecimalARomano(Integer numero) {
        String valor = "";
        System.out.println("input= "+numero);

        Integer decena  = String.valueOf(numero).length() ;
        System.out.println(decena);

        if(2 == decena) {
            switch(numero) {
                case 11:
                    valor = "XI";
                    break;
                case 12:
                    valor = "XII";
                    break;
                case 13:
                    valor = "XIII";
                    break;
                case 14:
                    valor = "XIV";
                    break;
                case 15:
                    valor = "XV";
                    break;
                case 16:
                    valor = "XVI";
                    break;
                case 17:
                    valor = "XVII";
                    break;
                case 18:
                    valor = "XVIII";
                    break;
                case 19:
                    valor = "XIX";
                    break;
                case 20:
                    valor = "XX";
                    break;
                default:
                    valor = "No se puede convertir este numero.";

            }
        }

        return valor;
    }



}
