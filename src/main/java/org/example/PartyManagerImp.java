package org.example;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class PartyManagerImp implements PartyManager {

    private int numusers;
    List<User> users;
    List<Product>products;
    User user = new User();
    Party party=new Party();

    Product product=new Product();



    final static Logger logger = Logger.getLogger(PartyManagerImp.class);

    public PartyManagerImp() {
        this.products = new ArrayList<>();
        this.products.add(new Product("dinero","añade 5 puntos de vida","5dsaCoins", 5));
        this.products.add(new Product("sarcofago","añade 10 puntos de vida","55dsaCoins",55));
        this.products.add(new Product("varita","añade 15 puntos de vida","65dsaCoins",65));





    }


    @Override
    public void addUser(String name, String surname, String id, int life) {

        user.setName(name);
        user.setSurname(surname);
        user.setId(id);
        user.setLife(life);
        products.get(numusers).setPrice("25dsaCoins");
        products.get(numusers).setPriceProduct(25);

        this.users.add(user);
        logger.info ("this user is added");
        this.numusers=numusers+1;

    }

    @Override
    public void buyProduct(String idProduct, String idUser) {




        if(users.contains(idUser) && products.contains(idProduct)){
            product.setId(idProduct);
            user.setId(idUser);
            if (products.get(numusers).getPriceProduct() < product.getPriceProduct() ) {
                logger.info("Not enough dsaCoins.");
            }
            else {
                products.add(product);
                products.get(numusers).setPriceProduct(products.get(numusers).getPriceProduct()- product.getPriceProduct());
                products.get(numusers).setPrice(product.getPrice());
                logger.info("Object " + idProduct + " buyed.");
                logger.info(idUser + " haves: " + product + " dsaCoins");
            }
        }
        else{
            logger.info("It doesn't exist.");
        }


    }

    @Override
    public void addProduct(String id, String description, String price, int priceProduct) {


        product.setId(id);
        product.setDescription(description);
        product.setPrice(price);
        product.setPriceProduct(priceProduct);

    }

    @Override
    public void initParty() {

    }

    @Override
    public void createParty(String id) {



        int equipo=0;
        for (int a=0; a<numusers; a++){

            if(id==user.getId()){
                equipo++;

            }
            else{
                logger.info("error");
            }
            if(equipo==4){
                party.setState("INICIADO_EN_FUNCIONAMIENTO");
                party.setInicio(true);

            }
        }

    }

    @Override
    public void stateParty() {

    }

    @Override
    public void update() {

    }

    @Override
    public void actuaLife() {

    }

    @Override
    public void consultTeamLife() {

    }

    @Override
    public void endParty() {

    }
}
