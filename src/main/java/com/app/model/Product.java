package com.app.model;

import java.math.BigDecimal;

public class Product {
    String productName;
    String vendorId;
    BigDecimal purchasePrice;
    BigDecimal sellingPrice;
    double productHeight;
    double productLength;
    double productWidth;
    double productWeight;

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    int productCountOnStock;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(double productHeight) {
        this.productHeight = productHeight;
    }

    public double getProductLength() {
        return productLength;
    }

    public void setProductLength(double productLength) {
        this.productLength = productLength;
    }

    public double getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(double productWidth) {
        this.productWidth = productWidth;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public int getProductCountOnStock() {
        return productCountOnStock;
    }

    public void setProductCountOnStock(int productCountOnStock) {
        this.productCountOnStock = productCountOnStock;
    }
}
