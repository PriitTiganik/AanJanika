package MemoryGame;

/**
 * Created by janikaa on 4.12.2015.
 * Pildi ja Laua genereerimine
 * Kui pilt eon veel laual,
 *  k�si kasutajalt sisendkoordinaadid
 *  vali kaarte
 *  anna tagasisidet
 * M�ng on l�bi
 */

public class Mang {
    public Mang() {//Konstruktor k�ivitab objekti "Mang" (objekt on klassiga alati sama nimega, siis ta oskab k�ivitada seda)
        System.out.println("START M�NG"); //Prindime v�lja teksti "START M�NG"

        // Loome objektid Laud ja Pilt:
        Laud laud = new Laud (4); //Genereerime laua ruudustiku 4x4
        //Mangija mangija = new Mangija();

        //m�ngu t��s hoidmine
        //while (laud.kasPilteOnAlles()){
         //   System.out.println("NEXT ROUND");

    }
}


