package com.example.cairowalkingtour;

/**
 * Created by Sherif Ehab on 12/9/2016.
 */

public class List {

    /** Place Name for the List */
    private String mPlaceName;

    /** Location for the List */
    private String mLocationAddress;

    /** Image Resource ID for the List */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * @param placeName
     * @param locationAddress
     * @param imageResourceId
     */
    public List(String placeName, String locationAddress, int imageResourceId) {
        mPlaceName = placeName;
        mLocationAddress = locationAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the the place name from the list
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the the location address from the list.
     */
    public String getLocationAddress() {
        return mLocationAddress;
    }

    /**
     *  Get the Image resource id from the list.
     */
    public int getImageResourceId(){ return mImageResourceId; }

    public boolean hasImage(){ return mImageResourceId != NO_IMAGE_PROVIDED;}

    @Override
    public String toString() {
        return "List{" +
                "mPlaceName='" + mPlaceName + '\'' +
                ", mLocationAddress='" + mLocationAddress + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
