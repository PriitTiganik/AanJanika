package MemoryGame;

import javafx.stage.Stage;

/**
 * Created by janikaa on 10.12.2015.
 */
public class Mang {
    Stage mang;//klassimuutuja, klassis igalpool k�ttesaadav

    public Mang () {
        //loome objektid
        mang = new Stage();
        Laud laud = new Laud();
        Mangija mangija = new Mangija();

        //M�ngu sisu
        while (laud.kasOnPilteAlles()) {
            boolean paar = laud.kasTekkisPaar;//kasTekkisPaar meetod on kirjutamata
            if (paar) {
                mangija.paar();
            } else {
                mangija.arvamata();
            }
        }
        mangija.gameover();
    }
}