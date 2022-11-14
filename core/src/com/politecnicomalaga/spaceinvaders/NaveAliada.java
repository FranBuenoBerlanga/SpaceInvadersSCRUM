package com.politecnicomalaga.spaceinvaders;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveAliada {

    //pos x, pos y, lado,
    private int posX;
    private int posY;
    private int lado;
    private boolean estaviva;
    SpriteBatch batch;
    Texture img;

    //Metodos
    //CoNSTRUCTOR
    public NaveAliada(int nposX, int nlado) {
        posX = nposX;
        posY = 100;
        lado = nlado;
        estaviva = true;
        img = new Texture("badlogic.jpg");
    }

    //Pintarse, en un SpriteBatch
    public void pintarse(SpriteBatch tablero) {
        batch.begin();
        batch.draw(img, 100, 100);
        batch.end();
    }

    //moverse
    public void moverse(String letra) {

        if (letra == "A" || letra == "a") {
            posX = posX - lado;
        }
        if (letra == "d" || letra == "D") {
            posX = posX + lado;
        }

    }

    // estaviva?
//GETTERS
}



