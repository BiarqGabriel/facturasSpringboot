package com.gabriel.curso.springboot.di.factura.spingbootdifactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description}")
    private String description;

    @Autowired
    private List<Item> items;

   @PostConstruct 
    public void init () {
        System.out.println("Invoice created: " + description);
    }
    
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }


    public int getTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getImporte();
        }
        return total;
    }
    

}
