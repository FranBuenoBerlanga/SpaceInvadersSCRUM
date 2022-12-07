package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DisparoAliado {

    private float posX, posY;
    private float velX, velY;
    NaveAliada Aliado;
    Texture img;
    SpriteBatch batch;
    //private boolean meHanDisparado;

    public DisparoAliado(int nposX, int nposY) {
        posX = nposX;
        posY = nposY;
        velX = 0.0f;
        velY = 0.5f;
        img = new Texture("DisparoAliado.png");
        //meHanDisparado=false;
    }


    public void pintarse(SpriteBatch tablero) {

        tablero.draw(img, Aliado.getPosX(), Aliado.getPosY());

    }

    //Disposar
    public void dispose() {

        if (img != null) {
            img.dispose();
        }

    }

    public void moverse() {

        posY += velY;
    }

    public boolean colisiona(NaveEnemiga otraNave) {

        boolean colisiona = false;
        if (posX == otraNave.getPosX() && posY == otraNave.getPosY()) {
            colisiona = true;
           //DisparoAliado.dispose();
        }
        return colisiona;
    }
}
