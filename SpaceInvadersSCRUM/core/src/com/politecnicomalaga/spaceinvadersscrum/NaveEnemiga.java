package com.politecnicomalaga.spaceinvadersscrum;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveEnemiga {

    //Atributos

    private float posX, posY;
    private boolean estasviva;
    Texture img;
    SpriteBatch batch;

    //Comportamiento

    public NaveEnemiga(float nposX, float nposY){
        posX = nposX;
        posY = nposY;
        estasviva = true;
        img = new Texture("NaveEnemiga.png");
    }

    public void pintarse(SpriteBatch tablero){
        tablero.begin();
        tablero.draw(img, 150, 150);
        tablero.end();
    }
}