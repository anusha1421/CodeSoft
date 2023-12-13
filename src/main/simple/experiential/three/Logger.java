package org.experiential.three;
//3. Design an interface named Logger with abstract methods for logging
//different types of messages, such as debug, info, warn, and error. Create a
//class named ConsoleLogger that implements the Logger interface and logs
//messages to the console.
import java.sql.SQLOutput;
import java.util.Scanner;
 interface Logger {
   abstract void debug();//default abstract
     void info();
     void warn();
     void error();

}

class ConsoleLogger implements Logger {
    @Override
    public void debug() {
        String s= "debug the message";
        System.out.println(s);
    }

    @Override
    public void error() {
        String m= "error return the message";
        System.out.println(m);
    }

    @Override
    public void info() {
        String s ="syntax error";
        System.out.println(s);
    }

    @Override
    public void warn() {
        String l= "statment semistructure incorrect way";
        System.out.println(l);
    }
}



