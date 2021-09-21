package android.example.guideapp;

public class Place {

    private String mPlaceName;

    private String mPlaceDescription;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Place(String PlaceName, String PlaceDescription) {
        mPlaceName = PlaceName;
        mPlaceDescription = PlaceDescription;
    }

    public Place(String PlaceName, String PlaceDescription, int imageResourceId) {
        mPlaceName = PlaceName;
        mPlaceDescription = PlaceDescription;
        mImageResourceId = imageResourceId;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public int getImageRecourseID() {
        return mImageResourceId;
    }

    public boolean hasimage() {

        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }
}