package com.juancarlosmaya.Console;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;
import com.juancarlosmaya.Console.Values.ConsoleId;

public class Console extends AggregateEvent<ConsoleId>{

    public Console(ConsoleId entityId) {
        super(entityId);
    }
}
