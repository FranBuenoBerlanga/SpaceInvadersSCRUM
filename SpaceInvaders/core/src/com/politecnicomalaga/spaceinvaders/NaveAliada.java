package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
        velX = 17.0f;
        velY = 0.5f;


    }

    //Pintarse, en un SpriteBatch
    public void pintarse( SpriteBatch batch){
        batch.draw(img, posX, posY);
    }

    //Moverse
    public void moverse() {
        //Donde nos pulsan en la pantalla
        float pulsacionPosX = Gdx.input.getX();
        //Me parece inecesario implementar esta variable
        float pulsacioPosY = Gdx.input.getY();


        boolean recienTocado;

        recienTocado = Gdx.input.justTouched();

        //Cuando tocan la pantalla...
        if (recienTocado) {


            //Cuando pulsan la parte izquierda de la pantalla...
            if (pulsacionPosX <= Gdx.graphics.getWidth() / 2 && posX-velX>0)  {
                posX -= velX;


            //si pulsan la parte derecha...
                //posX-velX<Gdx.graphics.getWidth()-57 : ni idea del ancho del Texture (57)
            } else if (pulsacionPosX >= Gdx.graphics.getWidth() / 2 && posX-velX<Gdx.graphics.getWidth()-57) {
                posX += velX;

            }

        }





    }


    //Control del movimiento de la NaveAmiga mediante el código necesario en
    //el método render de la clase principal (usando Gdx.input.justTouched(), y
    //Gdx.input.getX y getY, pensar posibles soluciones)
    //Control del estado de la pantalla inicial
    private void controlMovimiento() {
        //Actualizo el teclado
        boolean hatocado;

        hatocado = Gdx.input.justTouched();

        if (hatocado) {


            }
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
