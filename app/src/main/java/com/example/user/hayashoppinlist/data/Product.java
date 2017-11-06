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

    public Product(String name, double price, double amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.isCompleted = false;
        this.imagPath=null;
        this.keyId=null;
    }
}
