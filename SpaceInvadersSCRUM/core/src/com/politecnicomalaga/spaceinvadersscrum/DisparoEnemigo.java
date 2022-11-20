package com.politecnicomalaga.spaceinvadersscrum;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class DisparoEnemigo {
    private float posX, posY;
    private float velX, velY;
    Texture img;
    SpriteBatch batch;
    //private boolean meHanDisparado;

    public DisparoEnemigo(int nposX, int nposY){
        posX = nposX;
        posY = nposY;
        velX= 0.0f;
        velY= -0.5f;
        img = new Texture("laserRed.png");
        //meHanDisparado=false;
    }


    public void pintarse(SpriteBatch tablero){

        tablero.draw(img, NaveEnemiga.getPosX(),NaveEnemiga.getPosY());

    }

    //Disposar
    public void dispose() {

        if (img != null){
            img.dispose();
        }

    }

    public void moverse(){

        posY+=velY;
    }

    public boolean colisiona(NaveAliada otraNave){

        boolean colisiona = false;

        if((posX == otraNave.getPosX() && posY == otraNave.getPosY()) || (posY == batch.height()){
            colisiona = true;
            DisparoEnemigo.dispose();
        }
        return colisiona;
    }

}
