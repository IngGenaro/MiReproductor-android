package mobilestudio.mx.myreproductormp3;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by MobileStudio-i-1 on 15/04/15.
 */
public class Cancion {

    private String title;
    private String time;
    private String actor;
    private String album;
    private String song;
    protected Drawable picture;




    public Cancion(String title, String time, String actor, String album,String song, Drawable picture) {
        this.title = title;
        this.time = time;
        this.actor = actor;
        this.album = album;
        this.song = song;
        this.picture = picture;
    }


    public static ArrayList<Cancion> getData(Context context){

        ArrayList<Cancion> arrayCancion = new  ArrayList<Cancion>();

        Cancion depecheEnanos= new Cancion("Lamento Boliviano","3:20","Enanitos Verdes","Lamento","enanosverdes_lamentoboliviano",context.getResources().getDrawable(R.drawable.depeche));
        Cancion depecheMana = new Cancion("Como te deseo","3:40","Mana","Tributo","como_te_deseo",context.getResources().getDrawable(R.drawable.enanitos));
        Cancion depecheAragan = new Cancion("Guitarra Blanca","3:25","Guitarra Blanca","Tributo a ...","guitarras_blancas",context.getResources().getDrawable(R.drawable.depeche));



/*        Contact juanCarlos = new Contact("Juan Carlos Martinez Avalos","jcmtza611@gmail.com","5591988868",context.getResources().getDrawable(R.mipmap.pic_juan), null, null, null);
        Contact christian = new Contact("Christian Jesus Rodriguez Martinez", "jesusrdzmtzm@gmail.com", "5538753188",context.getResources().getDrawable(R.mipmap.pic_christian), "jesusrdzmtzm", "jesusrdzmtzm","1154932578");
        Contact alex = new Contact("Alejandro Xochihua Jorge", "alexochihua23@gmail.com","5560116967", context.getResources().getDrawable(R.mipmap.pic_alex), "lennux23", "axj_lennux@hotmail.com", "100000972018165");
        Contact genaro = new Contact("Genaro Rodriguez", "grodriguezm@redcibercom.com.mx", "5528982474", context.getResources().getDrawable(R.mipmap.pic_genaro), "", null, "genaro_satto@hotmail.com");
        Contact ricardo = new Contact("Ricardo Centeno", "ricardo.celj@gmail.com", "5514382887", context.getResources().getDrawable(R.mipmap.pic_ricardo),"rickstart", "rickstart","100001865514717");
        */

        arrayCancion.add(depecheMana);
        arrayCancion.add(depecheEnanos);
        arrayCancion.add(depecheAragan);

        return arrayCancion;

    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }

}
