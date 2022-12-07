package com.dev;

import java.util.Scanner;

public class ConvierteRomano {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("### Convertidor de Numeros Arabigos a Numeros Romanos ###");
        System.out.println("Digite su número: ");
        int num = numero.nextInt();
        System.out.println(num +  " convertido a romano es: " + convertirAromanos(num));
    }

    private static String convertirAromanos(int num) {
        String unidad[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String decena[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String centena[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM" };
        String miles = "";

        int m;
        int resto = num;
        String convertidor  = "";

        m = resto / 10000;
        resto = resto % 1000;

        int c = resto / 100;
        resto = resto % 100;

        int d = resto / 10;
        resto = resto % 10;

        int u = resto;

        for(int i = 1; i <= m; i++) {
            miles += "M";
        }

        if(num >= 1000 ) {
            convertidor = miles + centena[c] + decena[d] + unidad[u];
        } else if(num >= 100) {
            convertidor = centena[c] + decena[d] + unidad[u];
        } else {
            if(num >= 10 ) {
                convertidor = decena[d] + unidad[u];
            } else {
                convertidor = unidad[num];
            }
        }
        return convertidor;
    }

}
