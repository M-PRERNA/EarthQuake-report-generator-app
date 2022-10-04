package com.example.android.quakereport;

public class Word {
    private double mMagnitude;
    private String mCity;
    private String mDate;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Word(double Magnitude, String City, long TimeInMilliseconds, String url){
        mMagnitude = Magnitude;
        mCity = City;
        mTimeInMilliseconds = TimeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude(){ return mMagnitude;}
    public String getCity(){ return mCity;}
    public long getTimeInMilliseconds(){ return mTimeInMilliseconds;}
    public String getUrl(){ return mUrl;}

}
