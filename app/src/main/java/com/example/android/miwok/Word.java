package com.example.android.miwok;

import android.media.MediaPlayer;

public class Word {
   private String mDefaultTranslation;
   private String mMiwokTranslation;
   private int mediaPlayerId;
   private int mImageResourceNum = HAS_NO_IMAGE;
   private static final int HAS_NO_IMAGE = - 1;

   public Word(String defaultTranslation, String miwokTranslation, int mediaPlayerId){
       mDefaultTranslation = defaultTranslation;
       mMiwokTranslation = miwokTranslation;
       this.mediaPlayerId = mediaPlayerId;
   }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceNum,int mediaPlayerId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceNum = mImageResourceNum;
        this.mediaPlayerId = mediaPlayerId;
    }



    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceNum() {
        return mImageResourceNum;
    }

    public void setmImageResourceNum(int mImageResourceNum) {
        this.mImageResourceNum = mImageResourceNum;
    }

    public boolean hasImage(){
       return mImageResourceNum != HAS_NO_IMAGE;
    }

    public int getMediaPlayerId() {
        return mediaPlayerId;
    }
}
