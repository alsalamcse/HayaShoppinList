package com.example.user.hayashoppinlist.data;

/**
 * Created by haya on 06/11/2017.
 * This class represent a product a product that will be at the
 */

public class Product
        /**
         * the name of the product
         */
{
    private String  name;
    /**
     * the price
     */
    private  double price;
    private  double amount;
    /**
     * if the prpduct is bought     */
    private  boolean isCompleted;
    /**
     * the path of product's image
     */
    private String imagPath
            /**
             * a special key or id unique to for each product.(primary key)
             */
            ;
    private  String keyId ;

    public Product() {

    }



    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getImagPath() {
        return imagPath;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setImagPath(String imagPath) {
        this.imagPath = imagPath;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }


}


