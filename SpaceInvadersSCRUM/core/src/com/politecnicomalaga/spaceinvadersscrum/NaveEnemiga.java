package com.politecnicomalaga.spaceinvadersscrum;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveEnemiga {

    //Atributos

    private float posX, posY;
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
        img = new Texture("NaveEnemiga.png");
        velX = 0f;
        velY = 0f;
    }

    //Pintarse
    public void pintarse(SpriteBatch tablero){

        tablero.draw(img, 100, 100);

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