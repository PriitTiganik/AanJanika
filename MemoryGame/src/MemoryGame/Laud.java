package MemoryGame;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;


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
    Pilt [] pildistik = new Pilt[laualRidasid*laualTulpasid];


    public Laud () {
        mang = new Stage();
        laud = new GridPane();//elemendid saavad k�ik identse suuruse, paigutab elemendid vasakult paremale, katkeb j�rgmisele reale kui sisu enam �ra ei mahu.
        Scene manguStseen = new Scene(laud, piksleidLai, piksleidKorge);
        mang.setScene(manguStseen);
        mang.show();//ava aken
        mang.setOnCloseRequest(event -> System.exit(0));//akna sulgedes l�heb programm kinni
        mang.setTitle("Memoriin");



        genereeriPildid();

        System.out.println("Olen Laua juurde j�udnud!");
    }

    public boolean kasOnPilteAlles() {
         for (Pilt pilt : pildistik) {
            boolean olenAllesPilt = pilt.kasOledAlles();
            if (olenAllesPilt) {
                return true;//tagastab meetodi tulemuse ehk et pilte on veel alles, kui seda k�sku n�eb, siis enam edasi ei l�he
            }
        }
        return false;//if k�ib k�ik pildid l�bi ja kui ei j�udnud tulemuseni, et pilte on alles, siis tuleb siia
    }

    private void genereeriPildid() {//ts�kkel piltide lauale asetamiseks
        for (int i = 0; i < laualRidasid; i++) {
            for (int j = 0; j < laualTulpasid; j++) {
                Pilt pilt = new Pilt(pildiKylg);//pildi loomine etteantud m��tmetega
                //int rand = (int) (Math.random() * 2 * laualTulpasid);//meie peame siia tegema rohkem kui kaks valikut, sest paare on �le kahe, v�iks korrutada (*2*laualTulpasid), aga kuidas, siis if ts�kkel, teha, et ta nii palju erinevaid pilte annaks?
                Random rand = new Random();
                int randomColor = rand.nextInt((8));
                if (randomColor == 0) {//genereerime 8 erinevat v�rvi pilte
                    pilt.setId("pilt1");
                }else if (randomColor == 1){
                    pilt.setId("pilt2");
                    pilt.setFill(Color.WHITESMOKE);
                }else if (randomColor==2){
                    pilt.setFill(Color.FLORALWHITE);
                    pilt.setId("pilt3");
                }else if (randomColor==3){
                    pilt.setFill(Color.GREENYELLOW);
                    pilt.setId("pilt4");
                }else if (randomColor==4){
                    pilt.setFill(Color.MEDIUMVIOLETRED);
                    pilt.setId("pilt5");
                }else if (randomColor==5){
                    pilt.setFill(Color.DEEPSKYBLUE);
                    pilt.setId("pilt6");
                }else if (randomColor==6){
                    pilt.setFill(Color.LIMEGREEN);
                    pilt.setId("pilt7");
                }else if (randomColor==7){
                    pilt.setFill(Color.ORANGE);
                    pilt.setId("pilt8");
                }
                //if (id =="Pilt1"){ //tuleb m�elda, kuidas erinevad ID-d omavahale sobitada ja v�rrelda
                //pilt.setId("pilt2");
                //}
                laud.setHgap(piltideVahe);//tekitab piltide asetuses vahed, et pildid ei oleks �ksteise k�ljes
                laud.setVgap(piltideVahe);
                laud.add(pilt, i, j);
            }
        }
    }

}
