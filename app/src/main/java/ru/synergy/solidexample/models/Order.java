package ru.synergy.solidexample.models;

public class Order {

    String custumerName = "Artem";
    String custumerEmail = "artem@gmail.com";
    private String id;

    public boolean isValid() {return false;}
    public String getCustumerName() {return custumerName;}
    public void setCustumerName(String custumerName) {this.custumerName = custumerName;}

    public String getCustumerEmail() {return custumerEmail;}
    public void setCustumerEmail(String custumerEmail) {this.custumerEmail = custumerEmail;}

    public Item[] getItems() {return new Item[0];}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

}
