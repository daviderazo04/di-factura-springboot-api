package com.david.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.david.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.david.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {
    // método para devolver la lista de items

    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("Camara Sony", 200);
        Product p2 = new Product("Bicicleta", 400);
        List<Item> items = Arrays.asList(new Item(p1, 2), new Item(p2, 4));
        return items;
    }

    @Bean("default") // Si se desea visualizar la otra factura(itemsInvoice) simplemente se cambia el
    // nombre del respectivo bean a default
    // @Primary
    List<Item> itemsInvoiceOffice() {
        Product p1 = new Product("Monitor Gigabyte 27", 350);
        Product p2 = new Product("Notebook razer", 2400);
        Product p3 = new Product("Impresora Hp", 200);
        Product p4 = new Product("Escritorio", 1000);
        List<Item> items = Arrays.asList(new Item(p1, 2), new Item(p2, 6), new Item(p3, 1), new Item(p4, 2));
        return items;
    }
}
