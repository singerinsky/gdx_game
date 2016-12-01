package com.mygdx.game;
import com.badlogic.gdx.Gdx;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


/**
 * Created by gl on 2016/12/1.
 */

public class TextureManage {

    HashMap<Integer,CharacterTexture> mAllChTexture;

    private TextureManage()
    {
        mAllChTexture = new HashMap<Integer, CharacterTexture>();
        try {
            SAXReader reader = new SAXReader();
            Document doc = reader.read("config/texture_config.xml");
            Element root = doc.getRootElement();
            for (Iterator iter = root.elementIterator(); iter.hasNext(); ) {
                Element textureConfig = (Element) iter.next();
                String texturename = textureConfig.attribute("name").getValue().toString();
                String textureId = textureConfig.attribute("id").getValue().toString();
                String texturePath = textureConfig.attribute("path").getValue().toString();

                Gdx.app.log("texture log" ,texturename + "=" + textureId + "="+texturePath);

                CharacterTexture texture = new CharacterTexture(Integer.valueOf(textureId),texturePath);
                if(texture != null)
                {
                    mAllChTexture.put(Integer.valueOf(textureId),texture);
                }
                //Gdx.app.debug();
            }
        } catch (DocumentException e) {
            e.printStackTrace();
            Gdx.app.debug("debug","load file config/texture_config.xml error!");
        }
    }
    private static TextureManage mTextureM;

    public static TextureManage GetInstance(){
        if(mTextureM == null)
        {
            mTextureM =  new TextureManage();
            return mTextureM;
        }
        return mTextureM;
    }

    public CharacterTexture GetCharacterTextureById(Integer type)
    {
        return mAllChTexture.get(type);
    }
}
