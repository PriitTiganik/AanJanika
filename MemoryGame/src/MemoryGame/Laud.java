package MemoryGame;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;


/**
 * Created by janikaa on 10.12.2015.
 */
public class Laud {
    Stage mang;//klassimuutuja, klassis igalpool k�ttesaadav
    GridPane laud;//klassimuutuja, klassis igalpool k�ttesaadav
    int pildiKylg = 150;
    int laualTulpasid = 4;
    int laualRidasid = 4;
    int paarideArv = (laualRidasid*laualTulpasid)/2;
    int piltideVahe = 5;
    int piksleidLai = pildiKylg*laualTulpasid+(laualTulpasid*piltideVahe);//see on sellep�rast selline, et mahuks aknasse �ra, vaatame mingi parema lahenduse
    int piksleidKorge = pildiKylg*laualRidasid+(laualRidasid*piltideVahe);
    Pilt [] pildistik = new Pilt[laualRidasid*laualTulpasid];



    public Laud () {
        mang = new Stage();
        laud = new GridPane();
        Scene manguStseen = new Scene(laud, piksleidLai, piksleidKorge);
        mang.setScene(manguStseen);
        mang.show();//ava aken
        mang.setOnCloseRequest(event -> System.exit(0));//akna sulgedes l�heb programm kinni
        mang.setTitle("Memoriin");

        genereeriPildid();
    }


    private void genereeriPildid() {//ts�kkel piltide lauale asetamiseks
        int nr = 1; //alustab numbrist 1
        ArrayList<Pilt> pildid = new ArrayList<>(paarideArv);
        for (int i = 0; i < paarideArv; i++) {
            pildid.add(new Pilt(String.valueOf(nr)));//Pildi loomine, prindib numbri tektiv��rtusteks
            pildid.add(new Pilt(String.valueOf(nr)));//Tuleb teha kaks korda, kuna meil kaartide arv lauas = 2 x paarideArv
            nr++;//suurendab numbreid �he v�rra
        }

        Collections.shuffle(pildid);//segame pildid lauas
        System.out.println(pildid);//prindime pildid v�lja

        for (int i=0; i < pildid.size(); i++) {
            Pilt pilt = pildid.get(i);
            pilt.setTranslateX((pildiKylg+piltideVahe) * (i % laualRidasid));
            pilt.setTranslateY((pildiKylg+piltideVahe) * (i / laualTulpasid));
            laud.getChildren().add(pilt);
        }

    }


}
