package com.juancarlosmaya.console.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.console.values.ConsoleId;
import com.juancarlosmaya.console.values.Name;

public class CreatedConsole extends DomainEvent {

    private final ConsoleId consoleId;
    private final Name name;

    public CreatedConsole(ConsoleId consoleId, Name name) {
        super("com.juancarlosmaya.Console");
        this.consoleId = consoleId;
        this.name = name;
    }

    public ConsoleId getConsoleId() {
        return consoleId;
    }

    public Name getName() {
        return name;
    }
}
