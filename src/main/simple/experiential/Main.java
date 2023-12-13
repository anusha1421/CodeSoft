package org.experiential;

public class Main {
    public  static  void main(String[] args){
         Employee.Date_of_Birth e1= new Employee.Date_of_Birth();
         Employee.Date_of_join e2 = new Employee.Date_of_join();
        System.out.println(e1.get_birth(24));
        System.out.println(e2.get_join("2018-02-11"));

    }
}
