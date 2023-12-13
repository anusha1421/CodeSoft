package org.experiential.two;
//2. Design a Bank class with relevant static and instance members. The Bank
//allows customers to create SB account, RD account and FD account. For a
//customer to open RD or FD accounts, opening an SB account is mandatory.
//Design the appropriate inheritance model with implementing method
//overriding.
public class Bank {
    static int SB=1298765788;
      int RD;
     int FD;
     Bank( int y,int z){

         RD=y;
         FD=z;
     }
}
class Customer extends Bank{

    Customer(int y, int z) {
        super(y, z);
        System.out.println(y);
        System.out.println(z);

    }

}