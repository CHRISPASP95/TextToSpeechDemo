package com.unipi.talepis.text2speech1;

import android.content.Context;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

/**
 * Created by timmy on 12/11/2015.
 */
public class MyTts {
    private TextToSpeech tts;
    private TextToSpeech.OnInitListener initListener=new TextToSpeech.OnInitListener() {
        @Override
        public void onInit(int status) {
            if (status==TextToSpeech.SUCCESS)
                tts.setLanguage(Locale.US);
        }
    };
    public MyTts(Context context){
        tts=new TextToSpeech(context,initListener);
    }
    public void speak(String string){
        tts.speak(string,TextToSpeech.QUEUE_ADD,null);
    }
}
