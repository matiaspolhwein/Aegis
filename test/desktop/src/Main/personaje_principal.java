package Main;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.files.FileHandle;
import java.io.File;

public class personaje_principal {
    File SpriteJugador_F = new File("C:\\Users\\HP\\Documents\\Aegis\\test\\desktop\\src\\materiales\\PJ_prueba.png");;
    FileHandle SpriteJugador_FH = new FileHandle(SpriteJugador_F);
    Texture textura_Jugador = new Texture(SpriteJugador_FH);


    Sprite Jugador;
    int posx = 0;
    int posy = 0;
    int ancho = 10;
    int alto = 10;
    public personaje_principal() {

       Jugador = new Sprite(textura_Jugador, posx, posy,alto ,ancho);

             }
        }






