package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GDXSpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img1, img2, img3,fondo;
	NaveAliada Aliado;
	NaveEnemiga Enemigo;
	//int pasos;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img2 = new Texture("NaveEnemiga.png");
		fondo = new Texture("fondo.png");
		Aliado = new NaveAliada(100,50);
		//Este juego esta a 60 fps, si queremos que los disparos vayan a 30 fps: 60%2==0;
		//pasos =0;

		img3 = new Texture("DisparoALiado.png");

	}

	@Override
	public void render () {
		//ScreenUtils.clear(0, 0, 1, 1);
		batch.begin();
		batch.draw(fondo, 0, 0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		batch.draw(img2, 300, 250,64,64);
		Aliado.pintarse(batch);
		Aliado.moverse();
		//pasos++;
		//batch.draw(img3, 200, 200);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img1.dispose();
		img2.dispose();
		//img3.dispose();
	}
}
