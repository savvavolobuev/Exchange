package api.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by savva.volobuev on 13.03.2017.
 */
public class RateList implements Parcelable {

    @SerializedName("AUD")
    private double aud;
    @SerializedName("BGN")
    private double bgn;
    @SerializedName("BRL")
    private double brl;
    @SerializedName("CAD")
    private double cad;
    @SerializedName("CHF")
    private double chf;
    @SerializedName("CNY")
    private double cny;
    @SerializedName("CZK")
    private double czk;
    @SerializedName("DKK")
    private double dkk;
    @SerializedName("GBP")
    private double gbp;
    @SerializedName("HKD")
    private double hkd;
    @SerializedName("HRK")
    private double hrk;
    @SerializedName("HUF")
    private double huf;
    @SerializedName("IDR")
    private double idr;
    @SerializedName("ILS")
    private double ils;
    @SerializedName("INR")
    private double inr;
    @SerializedName("JPY")
    private double jpy;
    @SerializedName("KRW")
    private double krw;
    @SerializedName("MXN")
    private double mxn;
    @SerializedName("MYR")
    private double myr;
    @SerializedName("NOK")
    private double nok;
    @SerializedName("NZD")
    private double nzd;
    @SerializedName("PHP")
    private double php;
    @SerializedName("PLN")
    private double pln;
    @SerializedName("RON")
    private double ron;
    @SerializedName("RUB")
    private double rub;
    @SerializedName("SEK")
    private double sek;
    @SerializedName("SGD")
    private double sgd;
    @SerializedName("THB")
    private double thb;
    @SerializedName("TRY")
    private double tryValue;
    @SerializedName("ZAR")
    private double zar;
    @SerializedName("EUR")
    private double eur;
    @SerializedName("USD")
    private double usd;


    protected RateList(Parcel in) {
        aud = in.readDouble();
        bgn = in.readDouble();
        brl = in.readDouble();
        cad = in.readDouble();
        chf = in.readDouble();
        cny = in.readDouble();
        czk = in.readDouble();
        dkk = in.readDouble();
        gbp = in.readDouble();
        hkd = in.readDouble();
        hrk = in.readDouble();
        huf = in.readDouble();
        idr = in.readDouble();
        ils = in.readDouble();
        inr = in.readDouble();
        jpy = in.readDouble();
        krw = in.readDouble();
        mxn = in.readDouble();
        myr = in.readDouble();
        nok = in.readDouble();
        nzd = in.readDouble();
        php = in.readDouble();
        pln = in.readDouble();
        ron = in.readDouble();
        rub = in.readDouble();
        sek = in.readDouble();
        sgd = in.readDouble();
        thb = in.readDouble();
        tryValue = in.readDouble();
        zar = in.readDouble();
        eur = in.readDouble();
        usd = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(aud);
        dest.writeDouble(bgn);
        dest.writeDouble(brl);
        dest.writeDouble(cad);
        dest.writeDouble(chf);
        dest.writeDouble(cny);
        dest.writeDouble(czk);
        dest.writeDouble(dkk);
        dest.writeDouble(gbp);
        dest.writeDouble(hkd);
        dest.writeDouble(hrk);
        dest.writeDouble(huf);
        dest.writeDouble(idr);
        dest.writeDouble(ils);
        dest.writeDouble(inr);
        dest.writeDouble(jpy);
        dest.writeDouble(krw);
        dest.writeDouble(mxn);
        dest.writeDouble(myr);
        dest.writeDouble(nok);
        dest.writeDouble(nzd);
        dest.writeDouble(php);
        dest.writeDouble(pln);
        dest.writeDouble(ron);
        dest.writeDouble(rub);
        dest.writeDouble(sek);
        dest.writeDouble(sgd);
        dest.writeDouble(thb);
        dest.writeDouble(tryValue);
        dest.writeDouble(zar);
        dest.writeDouble(eur);
        dest.writeDouble(usd);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RateList> CREATOR = new Creator<RateList>() {
        @Override
        public RateList createFromParcel(Parcel in) {
            return new RateList(in);
        }

        @Override
        public RateList[] newArray(int size) {
            return new RateList[size];
        }
    };


    public double getAud() {
        return aud;
    }

    public void setAud(double aud) {
        this.aud = aud;
    }

    public double getBgn() {
        return bgn;
    }

    public void setBgn(double bgn) {
        this.bgn = bgn;
    }

    public double getBrl() {
        return brl;
    }

    public void setBrl(double brl) {
        this.brl = brl;
    }

    public double getCad() {
        return cad;
    }

    public void setCad(double cad) {
        this.cad = cad;
    }

    public double getChf() {
        return chf;
    }

    public void setChf(double chf) {
        this.chf = chf;
    }

    public double getCny() {
        return cny;
    }

    public void setCny(double cny) {
        this.cny = cny;
    }

    public double getCzk() {
        return czk;
    }

    public void setCzk(double czk) {
        this.czk = czk;
    }

    public double getDkk() {
        return dkk;
    }

    public void setDkk(double dkk) {
        this.dkk = dkk;
    }

    public double getGbp() {
        return gbp;
    }

    public void setGbp(double gbp) {
        this.gbp = gbp;
    }

    public double getHkd() {
        return hkd;
    }

    public void setHkd(double hkd) {
        this.hkd = hkd;
    }

    public double getHrk() {
        return hrk;
    }

    public void setHrk(double hrk) {
        this.hrk = hrk;
    }

    public double getHuf() {
        return huf;
    }

    public void setHuf(double huf) {
        this.huf = huf;
    }

    public double getIdr() {
        return idr;
    }

    public void setIdr(double idr) {
        this.idr = idr;
    }

    public double getIls() {
        return ils;
    }

    public void setIls(double ils) {
        this.ils = ils;
    }

    public double getInr() {
        return inr;
    }

    public void setInr(double inr) {
        this.inr = inr;
    }

    public double getJpy() {
        return jpy;
    }

    public void setJpy(double jpy) {
        this.jpy = jpy;
    }

    public double getKrw() {
        return krw;
    }

    public void setKrw(double krw) {
        this.krw = krw;
    }

    public double getMxn() {
        return mxn;
    }

    public void setMxn(double mxn) {
        this.mxn = mxn;
    }

    public double getMyr() {
        return myr;
    }

    public void setMyr(double myr) {
        this.myr = myr;
    }

    public double getNok() {
        return nok;
    }

    public void setNok(double nok) {
        this.nok = nok;
    }

    public double getNzd() {
        return nzd;
    }

    public void setNzd(double nzd) {
        this.nzd = nzd;
    }

    public double getPhp() {
        return php;
    }

    public void setPhp(double php) {
        this.php = php;
    }

    public double getPln() {
        return pln;
    }

    public void setPln(double pln) {
        this.pln = pln;
    }

    public double getRon() {
        return ron;
    }

    public void setRon(double ron) {
        this.ron = ron;
    }

    public double getRub() {
        return rub;
    }

    public void setRub(double rub) {
        this.rub = rub;
    }

    public double getSek() {
        return sek;
    }

    public void setSek(double sek) {
        this.sek = sek;
    }

    public double getSgd() {
        return sgd;
    }

    public void setSgd(double sgd) {
        this.sgd = sgd;
    }

    public double getThb() {
        return thb;
    }

    public void setThb(double thb) {
        this.thb = thb;
    }

    public double getTryValue() {
        return tryValue;
    }

    public void setTryValue(double tryValue) {
        this.tryValue = tryValue;
    }

    public double getZar() {
        return zar;
    }

    public void setZar(double zar) {
        this.zar = zar;
    }

    public double getEur() {
        return eur;
    }

    public void setEur(double eur) {
        this.eur = eur;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }
}
