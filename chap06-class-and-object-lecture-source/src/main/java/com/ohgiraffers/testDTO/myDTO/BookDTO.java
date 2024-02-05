package com.ohgiraffers.testDTO.myDTO;

public class BookDTO {
    private String title;
    private String publisher;
    private int price;
    private double discountRate;


    BookDTO(){

    }

   public String getTitle(){
        return this.title;
   }
   public void setTitle(String title){
        this.title = title;
   }

    public String getPublisher(){
        return this.publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public double getDiscountRate(){
        return this.discountRate;
    }

    public void setDiscountRate(double discountRate){
        this.discountRate = discountRate;
    }

    public String printInformation(){
        return "[title: " +  this.title + ", publisher: "+this.publisher+ ", price: " +this.price +", discountRate: " + this.discountRate +"]";
    }

}
