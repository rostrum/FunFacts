package com.teamtreehouse.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Gorka on 13/05/2015.
 */
public class ToastShow {

    public String[] mToast = {
            "",
            "",
            "",
            "Kindness is the language which the deaf can hear and the blind can see.",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    };

    public String getToast() {
        String toast = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mToast.length);
        toast = mToast[randomNumber];
        return toast;
    }
}
