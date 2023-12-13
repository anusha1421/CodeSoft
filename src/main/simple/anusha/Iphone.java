package org.anusha;

public class Iphone implements Phone,Ios{
    public String processor(){
        return "A15";
    }

    @Override
    public String spaceInfo() {
        return "256gb";
    }

    @Override
    public String airdrop() {
        return "copy and paste anywhere";
    }
}
