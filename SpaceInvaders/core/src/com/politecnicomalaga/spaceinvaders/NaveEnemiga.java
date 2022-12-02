package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveEnemiga {

    //Atributos

    private static float posX;
    private static float posY;
    private float velX, velY;
    private float signoX, signoY;
    private boolean estaviva, moverseIzq, moverseDer;
    Texture img;
    SpriteBatch batch;

    //Comportamiento

    //Constructor
    public NaveEnemiga(float nposX, float nposY){
        posX = nposX;
        posY = nposY;
        estaviva = true;
        moverseIzq = true;
        moverseDer = true;
        img = new Texture("NaveAliada.png");
        velX = 52.6f;
        velY = 0.6f;
    }

    //Pintarse
    public void pintarse(SpriteBatch tablero){

        tablero.draw(img, posX, posY);

    }

    //Disposar
    public void dispose() {

        if (img != null){
            img.dispose();
        }

    }

    //GETTERS
    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }
    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

}
