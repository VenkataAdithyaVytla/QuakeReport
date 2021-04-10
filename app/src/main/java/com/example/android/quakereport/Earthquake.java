package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private long mtimeInMilliseconds;
    private String mLocation;
    private String mUrl;
    public Earthquake(double magnitude,String location,long date,String url) {
        mMagnitude=magnitude;
        mLocation=location;
        mtimeInMilliseconds=date;
        mUrl=url;
    }
    public double getMagnitude() {
        return mMagnitude;
    }
    public String getLocation() {
        return mLocation;
    }
    public long getTimeInMilliseconds() {
        return mtimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }
}
