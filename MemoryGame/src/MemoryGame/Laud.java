package MemoryGame;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by janikaa on 4.12.2015.
 */
public class Laud {
    private Pilt[][] pildid;
    //private String[] s�nad ={"esimene", "teine", "kolmas", "neljas", "viies", "kuues", "seitsmes", "kaheksas"};
    private Random r;
    private Scanner lugeja;

    Laud(){
        r=new Random();
        lugeja=new Scanner(System.in);
        pildid = new Pilt[4][4];
        System.out.println(pildid);
    }
  //  private int lauaServaPikkus;//salvestab klassi k�lge ja siis saab seda ts�klites kasutada edaspidi �le terve klassi;
   // private Pilt[]pildid = new Pilt[2]; //"[]" - t�histab massiivi, tuleb 16 pilti (4x4);
    //Klass ei oska vastu v�tta parameetrit, sellep�rast ongi vaja konstruktorit;

  /*  public Laud (int pikkus) {//Loome konstruktori "Laud";
        System.out.println("START LAUD");//Kui k�ivitan programmi, saan kontrollida, kas ta on siia j�udnud
        lauaServaPikkus = pikkus;//Salvestame pikkuse
        looPildid();
    }

    private void looPildid() {//Laua k�es on pildid, salvestame pildid laua k�lge:
        for (int i = 0; i < pildid.length; i++) {
            pildid[i] = new Pilt(lauaServaPikkus);
        }
    }
    public boolean kasPilteOnAlles(){
        for (Pilt pilt : pildid){
            boolean arvamata = pilt.kasOledArvamata();//k�sib iga pildi k�est
            if (arvamata){
                return true;
            }
        }
        return false;
    }*/
}
