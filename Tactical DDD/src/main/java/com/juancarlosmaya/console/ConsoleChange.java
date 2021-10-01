package com.juancarlosmaya.console;

import co.com.sofka.domain.generic.EventChange;
import com.juancarlosmaya.console.Console;
import com.juancarlosmaya.console.events.CreatedConsole;

public class ConsoleChange extends EventChange {
    public ConsoleChange(Console console) {
        apply((CreatedConsole event) ->{
            console.;


        });
    }
}
