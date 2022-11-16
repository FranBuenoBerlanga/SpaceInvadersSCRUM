package com.politecnicomalaga.spaceinvadersscrum;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.politecnicomalaga.spaceinvadersscrum.GDXGameSpaceInvaders;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new GDXGameSpaceInvaders(), config);
	}
}
