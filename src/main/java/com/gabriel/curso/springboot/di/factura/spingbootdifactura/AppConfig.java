package com.gabriel.curso.springboot.di.factura.spingbootdifactura;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.gabriel.curso.springboot.di.factura.spingbootdifactura.models.Item;
import com.gabriel.curso.springboot.di.factura.spingbootdifactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("Camara Sony", 100);
        Product p2 = new Product("Bicicleta Bianchi aro 26", 200);
        return List.of(new Item(p1, 2), new Item(p2, 4));
    }

    @Bean
    @Primary
    List<Item> itemsInvoiceOffice() {
        Product p1 = new Product("Monitor Asus 24", 1500);
        Product p2 = new Product("Notebook Razer", 2200);
        Product p3 = new Product("Impresora HP Multifuncional", 800);
        Product p4 = new Product("Escritorio Oficina", 300);
        return List.of(new Item(p1, 2), new Item(p2, 4), new Item(p3, 4), new Item(p4, 3));
    }


}
