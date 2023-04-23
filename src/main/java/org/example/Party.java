package org.example;

public class Party {

    private boolean Inicio;

    public Party (){}

    public Party(boolean inicio, String state) {
        Inicio = inicio;
        State = state;
    }

    public Boolean getInicio() {
        return Inicio;
    }

    public void setInicio(boolean inicio) {
        Inicio = inicio;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    private String State;
}
