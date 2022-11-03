package org.berol.model;

import java.util.ArrayList;

public class Manga {

    private String title;
    private String publisher;
    private int numVolumesTotal;
    private int numVolumesOwned;
    private float priceTotal;
    private float priceAvg;
    private float priceNewPerVolume;
    private float priceToComplete;
    private float vote;
    private String firstUpdate;
    private String lastUpdate;
    private boolean isComplete;
    private String envelopeType;
    private ArrayList<String> websitesUsed;

    public Manga() { }

    public Manga(String title, String publisher, float priceNewPerVolume, String firstUpdate, boolean isComplete) {
        this.title = title;
        this.publisher = publisher;
        this.priceNewPerVolume = priceNewPerVolume;
        this.firstUpdate = firstUpdate;
        this.lastUpdate = DateString.getDateString();
        this.isComplete = isComplete;
        this.numVolumesOwned = 0;
        this.priceTotal = 0f;
        this.priceAvg = 0f;
        this.priceToComplete = 0f;
        this.vote = 0f;
        this.websitesUsed = new ArrayList<>();
        this.envelopeType = "";
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

    public float getVote() { return vote; }

    public void setVote(float vote) { this.vote = vote; }

    public String getFirstUpdate() { return firstUpdate; }

    public void setFirstUpdate(String firstUpdate) { this.firstUpdate = firstUpdate; }

    public String getLastUpdate() { return lastUpdate; }

    public void setLastUpdate(String lastUpdate) { this.lastUpdate = lastUpdate; }

    public boolean isComplete() { return isComplete; }

    public void setComplete(boolean complete) { isComplete = complete; }

    public String getEnvelopeType() { return envelopeType; }

    public void setEnvelopeType(String envelopeType) { this.envelopeType = envelopeType; }

    public ArrayList<String> getWebsitesUsed() { return websitesUsed; }

    public void setWebsitesUsed(ArrayList<String> websitesUsed) { this.websitesUsed = websitesUsed; }

    public void addNewWebsiteUsed(String newWebsite) { this.websitesUsed.add(newWebsite); }

    @Override
    public String toString() {
        return "{" +
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
                "}\n";
    }
}
