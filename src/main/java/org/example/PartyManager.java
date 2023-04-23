package org.example;

public interface PartyManager {


    public void addUser(String name, String surname, String id, int life);

    public void buyProduct(String idProduct, String idUser);

    public void addProduct(String id, String description, String price, int priceProduct);

    public void initParty();

    public void createParty(String id);

    public void stateParty();

    public void update();

    public void actuaLife();

    public void consultTeamLife();

    public void endParty();

}
