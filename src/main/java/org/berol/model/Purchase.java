package org.berol.model;

import java.util.Date;

public class Purchase {

    private String title;
    private int numVolumes;
    private int totPrice;

    private Date purchaseDate;
    private String sellerName;
    private Sizes sizes;

    public Purchase() { }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getNumVolumes() { return numVolumes; }

    public void setNumVolumes(int numVolumes) { this.numVolumes = numVolumes; }

    public int getTotPrice() { return totPrice; }

    public void setTotPrice(int totPrice) { this.totPrice = totPrice; }

    public Date getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }

    public String getSellerName() { return sellerName; }

    public void setSellerName(String sellerName) { this.sellerName = sellerName; }

    public Sizes getSizes() { return sizes; }

    public void setSizes(Sizes sizes) { this.sizes = sizes; }
}
