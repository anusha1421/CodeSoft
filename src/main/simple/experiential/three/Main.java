package org.experiential.three;

public class Main {
     public  static void main(String[] args){
         Logger l = new ConsoleLogger();

         l.debug();
         l.error();
         l.info();
         l.warn();

     }
}
