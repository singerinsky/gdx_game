package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by gl on 2016/12/1.
 */

public class Character extends Actor {
    Animation mAn;
    int     mType;
    CharacterTexture mTexture;
    int     mDir;
    float stateTime;
    @Override
    public void draw(Batch batch, float parentAlpha)
    {
        stateTime += Gdx.graphics.getDeltaTime();
        TextureRegion currentFrame = mAn.getKeyFrame(stateTime, true);
        batch.draw(currentFrame,getX(),getY());
    }

    public Character(String name,int type)
    {
        mDir = 0;
        mType = type;
        super.setName(name);
        mTexture = TextureManage.GetInstance().GetCharacterTextureById(type);
        if(mTexture == null)
        {
            Gdx.app.log("create character","no texture type suite this character");
        }
        mAn = new Animation(0.05f,mTexture.GetTextureRegionByDir(0));
    }


}
