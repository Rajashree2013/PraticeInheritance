package se.lexicon.rajashree;

import java.util.Arrays;

public class SalesPerson extends  Employee{
    private String[] clients;
    private int aquiredClients;


    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getAquiredClients() {
        return aquiredClients;
    }

    public void setAquiredClients(int aquiredClients) {
        this.aquiredClients = aquiredClients;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "clients=" + Arrays.toString(clients) +
                ", aquiredClients=" + aquiredClients +
                '}';
    }

    public void calculateSalary(){

    }
}
