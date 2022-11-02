package org.berol.model;

import java.util.ArrayList;
import java.util.Calendar;

public class MangaSeries {

    private String title;
    private String publisher;
    private int numVolumesTotal;
    private int numVolumesOwned;
    private float priceTotal;
    private float priceAvg;
    private float priceNewPerVolume;
    private float priceToComplete;
    private int vote;
    private Calendar firstUpdate;
    private Calendar lastUpdate;
    private boolean isComplete;
    private String envelopeType;
    private ArrayList<String> websitesUsed;

    public MangaSeries() { }

    public MangaSeries(String title, String publisher, float priceNewPerVolume, Calendar firstUpdate, boolean isComplete) {
        this.title = title;
        this.publisher = publisher;
        this.priceNewPerVolume = priceNewPerVolume;
        this.firstUpdate = firstUpdate;
        this.isComplete = isComplete();
    }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getPublisher() { return publisher; }

    public void setPublisher(String publisher) { this.publisher = publisher; }

    public int getNumVolumesTotal() { return numVolumesTotal; }

    public void setNumVolumesTotal(int numVolumesTotal) { this.numVolumesTotal = numVolumesTotal; }

    public int getNumVolumesOwned() { return numVolumesOwned; }

    public void setNumVolumesOwned(int numVolumesOwned) { this.numVolumesOwned = numVolumesOwned; }

    public float getPriceTotal() { return priceTotal; }

    public void setPriceTotal(float priceTotal) { this.priceTotal = priceTotal; }

    public float getPriceAvg() { return priceAvg; }

    public void setPriceAvg(float priceAvg) { this.priceAvg = priceAvg; }

    public float getPriceNewPerVolume() { return priceNewPerVolume; }

    public void setPriceNewPerVolume(float priceNewPerVolume) { this.priceNewPerVolume = priceNewPerVolume; }

    public float getPriceToComplete() { return priceToComplete; }

    public void setPriceToComplete(float priceToComplete) { this.priceToComplete = priceToComplete; }

    public int getVote() { return vote; }

    public void setVote(int vote) { this.vote = vote; }

    public Calendar getFirstUpdate() { return firstUpdate; }

    public void setFirstUpdate(Calendar firstUpdate) { this.firstUpdate = firstUpdate; }

    public Calendar getLastUpdate() { return lastUpdate; }

    public void setLastUpdate(Calendar lastUpdate) { this.lastUpdate = lastUpdate; }

    public boolean isComplete() { return isComplete; }

    public void setComplete(boolean complete) { isComplete = complete; }

    public String getEnvelopeType() { return envelopeType; }

    public void setEnvelopeType(String envelopeType) { this.envelopeType = envelopeType; }

    public ArrayList<String> getWebsitesUsed() { return websitesUsed; }

    public void setWebsitesUsed(ArrayList<String> websitesUsed) { this.websitesUsed = websitesUsed; }

    public void addNewWebsiteUsed(String newWebsite) { this.websitesUsed.add(newWebsite); }

    @Override
    public String toString() {
        return "MangaSeries{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numVolumesTotal=" + numVolumesTotal +
                ", numVolumesOwned=" + numVolumesOwned +
                ", priceTotal=" + priceTotal +
                ", priceAvg=" + priceAvg +
                ", priceNewPerVolume=" + priceNewPerVolume +
                ", priceToComplete=" + priceToComplete +
                ", vote=" + vote +
                ", isComplete=" + isComplete +
                ", envelopeType='" + envelopeType + '\'' +
                ", websitesUsed=" + websitesUsed +
                '}';
    }
}
