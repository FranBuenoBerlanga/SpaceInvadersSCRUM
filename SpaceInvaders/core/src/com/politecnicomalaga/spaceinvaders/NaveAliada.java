package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveAliada {

    //ATRIBUTOS
    //posx, posy
    private static float posX;
    private static float posY;
    private float velX, velY;
    private float signoX, signoY;
    private boolean estaviva, moverseIzq, moverseDer;
    Texture img;
    SpriteBatch batch;

    //COMPORTAMIENTOS
    //Constructor
    public NaveAliada(float nposX, float nposY){
        posX = nposX;
        posY = nposY;
        estaviva = true;
        moverseIzq = false;
        moverseDer = false;
        img = new Texture("NaveAliada.png");
        velX = 0.5f;
        velY = 0.5f;

    }

    //Pintarse, en un SpriteBatch
    public void pintarse(SpriteBatch tablero) {

        tablero.draw(img, 100, 100);

    }

    //Disposar
    public void dispose() {

        if (img != null){
            img.dispose();
        }

    }

    //Moverse
    public void moverse(String letra) {
    }

    // estaviva?
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