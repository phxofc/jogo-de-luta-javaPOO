package jogo.de.luta;

import java.util.Random;
import java.util.Scanner;

public class JogoDeLuta {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Lutador l[] = new Lutador[2];
        

        l[0] = new Lutador(1, "pedro", "frança", 31, 1.66f, 100.9f, 11, 2, 1);
        l[1] = new Lutador(2, "script", "brasil", 25, 1.25f, 100.9f, 10, 5, 0);

       Luta luta = new Luta();
       
       luta.marcarLuta(l[0], l[1]);
       luta.lutar();
       
       l[0].status();
       l[1].status();
     
   
       

    }

}
