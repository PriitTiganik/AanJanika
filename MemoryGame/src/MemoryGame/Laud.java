package MemoryGame;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * Created by janikaa on 10.12.2015.
 */
public class Laud {
    Stage mang; //programmi aken, kuhu peale ehitame m�ngu; klassimuutuja, klassis igalpool k�ttesaadav
    GridPane laud; //asetab elemendid ruudustiku j�rgi tabelisse;
    int pildiKylg = 150; //pildi k�ljepikkus
    int laualTulpasid = 4; //tulpade arv m�ngulaual
    int laualRidasid = 4; //ridade arv m�ngulaual
    int piltideVahe = 5; //piltidel on vahed
    int piksleidLai = pildiKylg*laualTulpasid+(laualTulpasid*piltideVahe);//see on sellep�rast selline, et mahuks aknasse �ra, vaatame mingi parema lahenduse
    int piksleidKorge = pildiKylg*laualRidasid+(laualRidasid*piltideVahe);

    Image laevaPilt = new Image("MemoryGame/pilt1.png");
    ImagePattern laevaMuster = new ImagePattern(laevaPilt);


    public Laud () {
        mang = new Stage();
        laud = new GridPane();//elemendid saavad k�ik identse suuruse, paigutab elemendid vasakult paremale, katkeb j�rgmisele reale kui sisu enam �ra ei mahu.
        Scene manguStseen = new Scene(laud, piksleidLai, piksleidKorge);
        mang.setScene(manguStseen);
        mang.show();//ava aken
        mang.setOnCloseRequest(event -> System.exit(0));//akna sulgedes l�heb programm kinni
        mang.setTitle("Memoriin");



        genereeriPildid();
        //reageeriKlikile();

        System.out.println("Olen Laua juurde j�udnud!");
    }

    /*private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle shape = (Rectangle) event.getTarget();
            Integer rida = GridPane.getRowIndex(shape);
            Integer tulp = GridPane.getColumnIndex(shape);
            String id = shape.getId();

            if (id == "pilt") {
                shape.setId("paar");
                shape.setFill(Color.WHITESMOKE);

            } else if (id == "t�hi") {
                shape.setId("uuesti");
                shape.setFill(Color.BLUE);
            }
            if (MangLabi()) {
                gameover();
            }
        }
    }*/

    private void genereeriPildid() {
        for (int i = 0; i < laualRidasid; i++) {
            for (int j = 0; j < laualTulpasid; j++) {
                Rectangle pilt = new Rectangle(pildiKylg, pildiKylg); //Ristk�liku loomine, antud alguskoordinaadid ja laius/k�rgus
                pilt.setId("Pilt");
                pilt.setFill(Color.BLUE);
                pilt.setStroke(Color.BLACK);
                laud.setHgap(piltideVahe); //lisame vaba ruumi horisontaalselt
                laud.setVgap(piltideVahe);//lisame vaba ruumi vertikaalselt
                laud.add(pilt, i, j);



                System.out.println("Olen piltide genereerimise juurde j�udnud!");
            }
        }
    }


}
