package com.juancarlosmaya.sale;

import co.com.sofka.domain.generic.AggregateEvent;
import com.juancarlosmaya.console.values.ConsoleId;
import com.juancarlosmaya.sale.events.*;
import com.juancarlosmaya.sale.values.*;
import com.juancarlosmaya.videogame.values.VideogameId;

import java.util.Objects;
import java.util.Set;

public class Sale extends AggregateEvent<SaleId> {
    protected Customer customer;
    protected Salesman salesman;
    protected Invoice invoice;
    protected Set<ConsoleId> consoleIds;
    protected Set<VideogameId> videogameIds;

    public Sale(SaleId entityId, Customer customer, Salesman salesman, Invoice invoice) {
        super(entityId);
        appendChange(new CreatedSale(entityId, customer, salesman, invoice)).apply();
    }

    public void addCustomer(CustomerId customerId, Name customerName, Email customerEmail)
    {
        Objects.requireNonNull(customerId);
        Objects.requireNonNull(customerName);
        Objects.requireNonNull(customerEmail);
        appendChange(new CreatedCustomer(customerId, customerName, customerEmail)).apply();
    }
    public void updateCustomer(Customer customer)
    {
        Objects.requireNonNull(customer);
        appendChange(new UpdatedCustomer(customer));
    }

    public void addSalesman(SalesmanId salesmanId, Name salesmanName, Email salesmanEmail)
    {
        Objects.requireNonNull(salesmanId);
        Objects.requireNonNull(salesmanName);
        Objects.requireNonNull(salesmanEmail);
        appendChange(new addSalesman(salesmanId, salesmanName, salesmanEmail)).apply();
    }

    public void updateSalesman(Salesman salesman)
    {
        Objects.requireNonNull(salesman);
        appendChange(new UpdatedSalesman(salesman)).apply();
    }

    public void addVideogameId(VideogameId videogameId)
    {
        Objects.requireNonNull(videogameId);
        appendChange(new AddedVideogameId(videogameId)).apply();
    }

    public void addConsoleId(ConsoleId consoleId)
    {
        Objects.requireNonNull(consoleId);
        appendChange(new AddedConsoleId(consoleId)).apply();
    }








}
