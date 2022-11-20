package com.politecnicomalaga.spaceinvadersscrum;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveAliada {

    //ATRIBUTOS
    //posx, posy
    private float posX, posY;
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
        velX = 0f;
        velY = 0f;

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

        if (letra == "A" || letra == "a") {
            moverseIzq = true;
            posX = posX + velX * (- signoX);
        }
        //WHILE EL BOTON SIGA PULSADO

        if (letra == "d" || letra == "D") {
            moverseDer = true;
            posX = posX + velX * signoX;
        }
        //WHILE EL BOTON SIGA PULSADO

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