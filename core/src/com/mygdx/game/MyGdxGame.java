package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Button button;
	Stage stage;
    GameInputProcessor inputProcessor;
    public static Character gChar;
	
	@Override
	public void create () {
        inputProcessor = new GameInputProcessor();
        Gdx.input.setInputProcessor(inputProcessor);
        TextureManage instance = TextureManage.GetInstance();

		stage = new Stage(new StretchViewport(400,400));
        gChar = new Character("shit",1);
        MoveByAction action = Actions.moveBy(200,300,10.0f);
        Actions.addAction(action);
        gChar.addAction(action);
        stage.addActor(gChar);
        Gdx.graphics.getFramesPerSecond();
        //Gdx.graphics.f()
	}

	@Override
	public void render () {
		//Gdx.gl.glClearColor(1, 0, 0, 1);
        long start = System.nanoTime();//纳秒
        System.out.println(start);//纳秒);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
		//batch.begin();
	//	batch.draw(img, 0, 0);
		//button.draw(batch,1);
		//batch.end();
	}

}
