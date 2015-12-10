package MemoryGame;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by janikaa on 10.12.2015.
 */
public class MemoryGame extends Application {
    //Stage mang;//klassimuutuja, klassis igalpool k�ttesaadav

    @Override //m�rge, mis �tleb, et k�esolev meetod on super klassist (Application) �le kirjutatud.
    public void start(Stage primaryStage) throws Exception {
        new Mang();//k�ivitame m�ngu, siia saab hiljem uusi m�ngijaid luua, uusi Mange lisades
    }
}

/*
*Iga klass v�i objekt: 1) hoiab mingit infot (teab infot, muutuja); 2) teeb midagi (oskab midagi teha, meetod).
* Meie m�ngus "Memoriin" (MemoryGame) on 5 klassi:
*
* MemoryGame ehk Main
*   Oskab m�ngu k�ivitada
* Mang (Stage)
*    Oskab m�ngu seadistada
*    Oskab m�ngu t��s hoida
*    Oskab m�ngu l�petada
* Mangija (kasutajaga suhtlemine)
*    Oskab k�sida m�ngijalt, millist kaarti avada
*    Oskab anda tagasisidet, kui pildipaar arvati �ra
*    Oskab anda tagasisidet, kui pildipaari ei arvatud �ra
*    Oskab anda tagasisidet, kui m�ng on l�bi
* Laud (k�ik tegevused, mis on piltide grupiga seotud)
*    Teab piltide asukohta
*    Oskab paigutada pildid lauale
*    Oskab koordineerida pilte (oskab neid tagurpidi keerata, kui pildipaar on leitud)
*    Oskab kontrollida, kas laual on veel pilte, mis ei ole avatud (ja leidnud paarilist)
*    Oskab m�ngu seisu n�idata (prindib laua v�lja)
* Pilt (kaart ise, mis asub lauas)
*    Teab oma asukohta
*    Teab, kas ta on arvatud (avastatud m�ngija poolt)
*    Oskab laual kohta valida (ts�kliga)
*    Oskab saada �raarvatuks (leiab paarilise ja lahkub m�ngust)
*    Oskab ennast �mberp��rata
*    Oskab j��da avatuks, kui on �ra arvatud
*    Oskab �elda, kas on veel arvamata
*
*
*    VIITED ALLIKALE:
*    Objektorienteerituse loeng, Krister Viirsaar,
*/
