package hanan.fenakhair;

import android.widget.ProgressBar;

/**
 * Created by hanan on 4/7/2018.
 */

public class Case {
    private int mCase_progress_id;
    private String mStatus;
    /*private String mCapacity;
    private String mLocation;
    private String mDetails;
    private String mPrice;
    private String mCurrency;
    private String mBook;*/

    //constructor
    public Case (int case_progress_id, String status)//, String capacity, String location, String details, String price, String currency, String book)
    {
        mCase_progress_id = case_progress_id ;
        mStatus = status;
        /*mCapacity = capacity;
        mLocation = location;
        mDetails = details;
        mPrice = price;
        mCurrency = currency;
        mBook = book;*/
    }
    public int getProgress (){
        return mCase_progress_id;
    }
    public String getStatus (){
        return mStatus;
    }
    /*public String getHallCapacity (){
        return mCapacity;
    }
    public String getHallLocation (){
        return mLocation;
    }
    public String getHallDetails (){
        return mDetails;
    }
    public String getHallPrice (){
        return mPrice;
    }
    public String getCurrency (){
        return mCurrency;
    }
    public String getBook (){
        return mBook;
    }*/

}
