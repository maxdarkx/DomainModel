package com.juancarlosmaya.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.sale.Customer;
import com.juancarlosmaya.sale.Invoice;
import com.juancarlosmaya.sale.Salesman;
import com.juancarlosmaya.sale.values.SaleId;

public class CreatedSale extends DomainEvent {
    private final SaleId saleId;
    private final Customer customer;
    private final Salesman salesman;
    private final Invoice invoice;

    public CreatedSale(SaleId saleId, Customer customer, Salesman salesman, Invoice invoice) {
        super("com.juancarlosmaya.sale");
        this.saleId = saleId;
        this.customer = customer;
        this.salesman = salesman;
        this.invoice = invoice;
    }

    public SaleId getSaleId() {
        return saleId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
