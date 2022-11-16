package com.politecnicomalaga.spaceinvadersscrum;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class GDXGameSpaceInvaders extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img1, img2;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img1 = new Texture("NaveAliada.png");
		img2 = new Texture("NaveEnemiga.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img1, 300, 300);
		batch.draw(img2, 0, 0);
		batch.end();
	}

	@Override
	public void dispose () {
		batch.dispose();
		img1.dispose();
		img2.dispose();
	}
}