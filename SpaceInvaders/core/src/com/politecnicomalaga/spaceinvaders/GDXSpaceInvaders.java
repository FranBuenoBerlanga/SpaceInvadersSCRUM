package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GDXSpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img1, img2, img3;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img1 = new Texture("NaveAliada.png");
		img2 = new Texture("NaveEnemiga.png");
		img3 = new Texture("laserRed.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img1, 300, 300);
		batch.draw(img2, 0, 0);
		batch.draw(img3, 200, 200);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img1.dispose();
		img2.dispose();
		img3.dispose();
	}
}