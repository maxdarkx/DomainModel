package com.juancarlosmaya.console.events;

import co.com.sofka.domain.generic.EventChange;
import com.juancarlosmaya.console.Console;
import com.juancarlosmaya.console.events.*;

public class ConsoleChange extends EventChange {
    public ConsoleChange(Console console) {
        apply((CreatedConsole event) ->{
            //console.name = event.getName();
            //console.plattform = event.get;

        });
    }
}
