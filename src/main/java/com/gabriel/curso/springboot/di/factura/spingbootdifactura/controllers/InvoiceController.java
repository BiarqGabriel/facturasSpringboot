package com.gabriel.curso.springboot.di.factura.spingbootdifactura.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.gabriel.curso.springboot.di.factura.spingbootdifactura.models.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/invoices")


public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show() {
        return invoice;
    }
}
