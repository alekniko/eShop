package com.app.model;

public class Vendor {
    String vendorName;
    String vendorBankAccount;
    String product;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    long vendorId;

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorBankAccount() {
        return vendorBankAccount;
    }

    public void setVendorBankAccount(String vendorBankAccount) {
        this.vendorBankAccount = vendorBankAccount;
    }

    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }
}
