package com.app.model;

public class Vendor {
    String vendorName;
    String vendorBankAccount;
    String vendorAddress;
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

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }
}
