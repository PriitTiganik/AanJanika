package MemoryGame;

import javafx.stage.Stage;

/**
 * Created by janikaa on 10.12.2015.
 *
 * Laua genereerimine.
 * Kontrollib, kas tekkis paar ja kui paarid leitud, siis l�petab m�ngu.
 *
 */
public class Mang {
    Stage mang;//klassimuutuja, klassi piires igalpool k�ttesaadav

  public Mang () {
        mang = new Stage();

        //loome objektid
        Laud laud = new Laud();
        Mangija mangija = new Mangija();

      mangija.gameover();
    }
}