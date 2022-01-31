package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication; //impresindible para crear pantalla y arrancar programa
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration; //impresindible para crear pantalla y arrancar programa
import com.badlogic.gdx.files.FileHandle; //momentaneamente inecesaria
import com.badlogic.gdx.graphics.Texture; //momentaneamente inesesaria
import com.badlogic.gdx.graphics.g2d.Sprite; //momentaneamente inesesaria
import com.mygdx.game.MyGdxGame; //impresindible para crear pantalla y arrancar programa
import Main.espacio_matiense; //temporalmente inesesario
import Main.personaje_principal;
import java.io.File;

public class DesktopLauncher {


	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MyGdxGame(), config);
		personaje_principal pj = new personaje_principal();
		//espacio_matiense ES = new espacio_matiense();







	}
}
