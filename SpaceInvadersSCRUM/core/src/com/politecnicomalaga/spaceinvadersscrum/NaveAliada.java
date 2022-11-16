package com.politecnicomalaga.spaceinvadersscrum;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveAliada {

    //ATRIBUTOS
    //posx, posy
    private float posX, posY;
    private boolean estaviva;
    Texture img;

    //COMPORTAMIENTOS
    //Constructor
    public NaveAliada(float nposX, float nposY){
        posX = nposX;
        posY = nposY;
        estaviva = true;
        img = new Texture("NaveAliada.png");
    }

    //Pintarse, en un SpriteBatch
    public void pintarse(SpriteBatch tablero) {
        tablero.begin();
        tablero.draw(img, 100, 100);
        tablero.end();
    }

    //Disposar
    public void dispose() {

        if (img != null){
            img.dispose();
        }

    }

    //Moverse
    public void moverse(String letra) {

        if (letra == "A" || letra == "a") {
            posX = posX;
        }
        if (letra == "d" || letra == "D") {
            posX = posX;
        }

    }

    // estaviva?
//GETTERS

}