package com.example;

import com.github.jwright159.gdx.Log;
import com.github.jwright159.gdx.screen.GameScreen;
import com.badlogic.gdx.*;
import com.badlogic.gdx.input.*;

public class ExampleScreen extends GameScreen{
	public ExampleScreen(){
		Log.setLogFile(Gdx.files.external("libJDubX.log"));
		Log.setVerbosity((byte)0b000_1111);
		
		Gdx.input.setCatchBackKey(true);
		getMultiplexer().addProcessor(0, new InputAdapter(){
			@Override
			public boolean keyDown(int keycode){
				switch(keycode){
					case Input.Keys.BACK:
						Gdx.app.exit();
						return true;
					
					default:
						return false;
				}
			}
		});
		getMultiplexer().addProcessor(2, new GestureDetector(new GestureDetector.GestureAdapter(){
			@Override
			public boolean pan(float x, float y, float dx, float dy){
				y *= -1; dy *= -1;
				return false;
			}
		}));
	}
}
