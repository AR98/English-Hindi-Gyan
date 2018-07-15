package com.example.anjurawat.multiscreen;

public class Word
{
    private int mAudioResourceId;
    private  String  mDefaultTranslation;
    private String  mHindiTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
  // private int mImageResourceId;

   public Word(String DefautTranslation,String HindiTranslation,int imageResourceId, int audioResourceId) {
        mDefaultTranslation = DefautTranslation;
        mHindiTranslation = HindiTranslation;
        mImageResourceId=imageResourceId ;
        mAudioResourceId=audioResourceId;
    }


    public Word(String DefautTranslation,String HindiTranslation, int audioResourceId) {
        mDefaultTranslation = DefautTranslation;
        mHindiTranslation = HindiTranslation;
        mAudioResourceId=audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

      public  String getHinditarnslation(){
        return mHindiTranslation;
      }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() { return mAudioResourceId; }
}

