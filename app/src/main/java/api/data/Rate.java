package api.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by savva.volobuev on 13.03.2017.
 */

public class Rate implements Parcelable{

    private String date;
    private String base;
    private RateList rates;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public RateList getRates() {
        return rates;
    }

    public void setRates(RateList rates) {
        this.rates = rates;
    }

    protected Rate(Parcel in) {
        date = in.readString();
        base = in.readString();
        rates = in.readParcelable(RateList.class.getClassLoader());
    }

    public static final Creator<Rate> CREATOR = new Creator<Rate>() {
        @Override
        public Rate createFromParcel(Parcel in) {
            return new Rate(in);
        }

        @Override
        public Rate[] newArray(int size) {
            return new Rate[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(date);
        dest.writeString(base);
        dest.writeParcelable(rates, flags);
    }
}
