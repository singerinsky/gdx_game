package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by gl on 2016/12/2.
 */

public class GameInputProcessor implements InputProcessor {
    @Override
    public boolean keyDown(int keycode) {
        return  true;/*
        if(keycode == Input.Keys.W)//w
        {
            MyGdxGame.gChar.moveBy(0,8.0f);
        }
        else if(keycode == Input.Keys.S)//// STOPSHIP: 2016/12/2
        {
            MyGdxGame.gChar.moveBy(0,-8.0f);
        }
        else if(keycode == Input.Keys.A)//a
        {
            MyGdxGame.gChar.moveBy(-8.0f,0);
        }
        else if(keycode ==Input.Keys.D)//d
        {
            MyGdxGame.gChar.moveBy(8.0f,0);
        }
        else
        {
            Gdx.app.log("debug key ",String.valueOf(keycode));
        };
        return true;*/
    }

    @Override
    public boolean keyUp(int keycode) {
       // Gdx.app.log("debug key ",String.valueOf(keycode));
        //MyGdxGame.gChar.moveBy(0,8.0f);


        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        //MyGdxGame.gChar.moveBy(0,8.0f);
        if(character == 'w')//w
        {
            MyGdxGame.gChar.moveBy(0,8.0f);
        }
        else if(character == 's')//// STOPSHIP: 2016/12/2
        {
            MyGdxGame.gChar.moveBy(0,-8.0f);
        }
        else if(character == 'a')//a
        {
            MyGdxGame.gChar.moveBy(-8.0f,0);
        }
        else if(character == 'd')//d
        {
            MyGdxGame.gChar.moveBy(8.0f,0);
        }
        else
        {
            Gdx.app.log("debug key ",String.valueOf(character));
        }
        return true;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return true;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        //MyGdxGame.gChar.setPosition(screenX,screenY);
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
