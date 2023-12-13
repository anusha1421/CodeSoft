package org.anu;

public class Main {
    public  static  void main(String[] args){
       // Person person = new Pooja();
        //person.speak();
        //person.eat();
        Person p2 = new Person() {
            @Override
            public void eat() {
                System.out.println("eat food");
            }
        };
        p2.eat();
        p2.speak();
        int a =5;
        System.out.println(a++);
        System.out.println(a++);
        System.out.println(a);


    }
}
