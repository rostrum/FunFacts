package com.teamtreehouse.funfacts;

import java.util.Random;

/**
 * Created by Gorka on 12/05/2015.
 */
public class FactBook {
    //Member variable {properties about the object}
    public String[] mFacts = {
            "Stop wasting valuable time, become creative, hold on and endure, face defeat again and again.",
            "Practice, work, develop what has been given to you, never give up on your dream!",
            "Change your mind!, step into your fears, push on..., .",
            "Invest in you, every day, Boom, make it happen.",
            "No one can guarantee you can not have your dream!.",
            "Keep on keep it on, never give up, you got talents you have not reached yet!.",
            "Live your life with passion, live your dream, go for what is yours in the Universe!.",
            "Stay focus, challenge yourself, make your dream happen!.",
            "Look into the future, focus on where you want to go!.",
            "Work in your dream, develop yourself, take full responsibility for your life!.",
            "Rise your Standards, be fully determined to go for it, I deserve this",
            "Everyday, here I come again, nothing is going to stop me...",
            "Know exactly what you want, do not stop until you find it.",
            "Sell yourself everyday, believe in you, encourage yourself",
            "There is greatness in you, overcoming negative habits.",
            "Discover what you are capable to do, develop the courage, you have to be relentless!",
            "Fear is not real, the only place it can exist is in our thoughts of the future",
            "What matters most is what happens in the end, they can make you better or bitter"};



    //Method (abilities: things the object can do)
    public String getFact(){

        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random(); //Construct the new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }


}
