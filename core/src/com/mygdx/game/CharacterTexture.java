package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.HashMap;
import java.util.Vector;

/**
 * Created by gl on 2016/12/1.
 */


public class CharacterTexture {
    public static final int TopLeft = 0;
    public static final int TopTop = 1;
    public static final int TopRight = 2;
    public static final int MiddleLeft = 3;
    public static final int MiddleRight = 4;
    public static final int BottomLeft = 5;
    public static final int BottomBottom = 6;
    public static final int BottomRight = 7;
    public static final int NoneDir = 8;

    //HashMap<Integer,Vector<TextureRegion>> mAllTexture;

    int mImgWidth;
    int mImgHeight;
    TextureRegion[][] mAllTexture;
    int mTextureType;

    public CharacterTexture(int TextureType,String imgFilePath)
    {
        mTextureType = TextureType;
        Texture tempTexture = new Texture(Gdx.files.internal(imgFilePath));
        mImgWidth  = tempTexture.getWidth()/8;
        mImgHeight = tempTexture.getHeight()/8;
        mAllTexture = TextureRegion.split(tempTexture,mImgWidth,mImgHeight);
        Gdx.app.debug("debug","load "+imgFilePath+" get split TextureRegion "+mAllTexture.length);
    }

    public TextureRegion[] GetTextureRegionByDir() {
        return GetTextureRegionByDir(0);
    }

    public TextureRegion[] GetTextureRegionByDir(int dir)
    {
        return mAllTexture[dir%NoneDir];
    }

}
