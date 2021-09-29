package com.juancarlosmaya.sale.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.console.values.ConsoleId;

public class AddedConsoleId extends DomainEvent {
    private final ConsoleId consoleId;

    public AddedConsoleId(ConsoleId consoleId) {
        super("com.juancarlosmaya.console.values.consoleid");
        this.consoleId = consoleId;
    }

    public ConsoleId getConsoleId() {
        return consoleId;
    }
}
