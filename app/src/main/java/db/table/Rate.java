package db.table;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by savva.volobuev on 13.03.2017.
 */
@DatabaseTable(tableName = "Rate")
public class Rate {

    public static final String[] allRater = {"usd","aud","bgn","brl","cad","chf","cny","czk","dkk","gbp","hkd","hrk","huf","idr","ils",
    "inr","jpy","krw","mxn","myr","nok","nzd","php","pln","ron","rub","sek","sgd","thb","try","zar","eur"};

    @DatabaseField(id = true)
    private String base;
    @DatabaseField
    private String date;
    @DatabaseField
    private double usd;
    @DatabaseField
    private double aud;
    @DatabaseField
    private double bgn;
    @DatabaseField
    private double brl;
    @DatabaseField
    private double cad;
    @DatabaseField
    private double chf;
    @DatabaseField
    private double cny;
    @DatabaseField
    private double czk;
    @DatabaseField
    private double dkk;
    @DatabaseField
    private double gbp;
    @DatabaseField
    private double hkd;
    @DatabaseField
    private double hrk;
    @DatabaseField
    private double huf;
    @DatabaseField
    private double idr;
    @DatabaseField
    private double ils;
    @DatabaseField
    private double inr;
    @DatabaseField
    private double jpy;
    @DatabaseField
    private double krw;
    @DatabaseField
    private double mxn;
    @DatabaseField
    private double myr;
    @DatabaseField
    private double nok;
    @DatabaseField
    private double nzd;
    @DatabaseField
    private double php;
    @DatabaseField
    private double pln;
    @DatabaseField
    private double ron;
    @DatabaseField
    private double rub;
    @DatabaseField
    private double sek;
    @DatabaseField
    private double sgd;
    @DatabaseField
    private double thb;
    @DatabaseField
    private double tryValue;
    @DatabaseField
    private double zar;
    @DatabaseField
    private double eur;

    public Rate() {
    }

    public Rate(api.data.Rate rateApi) {
        base = rateApi.getBase();
        date = rateApi.getDate();
        usd = rateApi.getRates().getUsd();
        aud = rateApi.getRates().getAud();
        bgn = rateApi.getRates().getBgn();
        brl = rateApi.getRates().getBrl();
        cad = rateApi.getRates().getCad();
        chf = rateApi.getRates().getChf();
        cny = rateApi.getRates().getCny();
        czk = rateApi.getRates().getCzk();
        dkk = rateApi.getRates().getDkk();
        gbp = rateApi.getRates().getGbp();
        hkd = rateApi.getRates().getHkd();
        hrk = rateApi.getRates().getHrk();
        huf = rateApi.getRates().getHuf();
        idr = rateApi.getRates().getIdr();
        ils = rateApi.getRates().getIls();
        inr = rateApi.getRates().getInr();
        jpy = rateApi.getRates().getJpy();
        krw = rateApi.getRates().getKrw();
        mxn = rateApi.getRates().getMxn();
        myr = rateApi.getRates().getMyr();
        nok = rateApi.getRates().getNok();
        nzd = rateApi.getRates().getNzd();
        php = rateApi.getRates().getPhp();
        pln = rateApi.getRates().getPln();
        ron = rateApi.getRates().getRon();
        rub = rateApi.getRates().getRub();
        sek = rateApi.getRates().getSek();
        sgd = rateApi.getRates().getSgd();
        thb = rateApi.getRates().getThb();
        tryValue = rateApi.getRates().getTryValue();
        zar = rateApi.getRates().getZar();
        eur = rateApi.getRates().getEur();
    }


    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

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

    public double matchValue(String title) {
        switch (title) {
            case "usd":
                return usd;
            case "bgn":
                return bgn;
            case "aud":
                return aud;
            case "brl":
                return brl;
            case "cad":
                return cad;
            case "chf":
                return chf;
            case "cny":
                return cny;
            case "czk":
                return czk;
            case "dkk":
                return dkk;
            case "gbp":
                return gbp;
            case "hkd":
                return hkd;
            case "hrk":
                return hrk;
            case "huf":
                return huf;
            case "idr":
                return idr;
            case "ils":
                return ils;
            case "inr":
                return inr;
            case "jpy":
                return jpy;
            case "krw":
                return krw;
            case "mxn":
                return mxn;
            case "myr":
                return myr;
            case "nok":
                return nok;
            case "nzd":
                return nzd;
            case "php":
                return php;
            case "pln":
                return pln;
            case "ron":
                return ron;
            case "rub":
                return rub;
            case "sek":
                return sek;
            case "sgd":
                return sgd;
            case "thb":
                return thb;
            case "try":
                return tryValue;
            case "zar":
                return zar;
            case "eur":
                return eur;
            default:
                return -1;
        }
    }
}
