package com.mian.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.mian.bean.BaseJson;

import java.lang.reflect.Type;
import java.util.ArrayList;

import static javafx.scene.input.KeyCode.T;

/**
 * com.mian.utils
 * Created by Reinhard Tristan Eugen Heydrich
 * 2017/1/16
 */
public class GsonUtils {
    private static Gson mGson;

    public static String getmGson(BaseJson baseJson){
        mGson = new Gson();
        return mGson.toJson(baseJson);
    }

}
