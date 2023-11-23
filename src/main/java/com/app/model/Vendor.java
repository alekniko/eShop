package com.app.model;

public class Vendor {
    private long id;
    private String name;
    private String product;
    private String vendorBankAccount;
    private long addressId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getVendorBankAccount() {
        return vendorBankAccount;
    }

    public void setVendorBankAccount(String vendorBankAccount) {
        this.vendorBankAccount = vendorBankAccount;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }
}
