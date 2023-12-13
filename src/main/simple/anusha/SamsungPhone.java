package org.anusha;

public class SamsungPhone implements Phone,Andriod{
    public String processor() {
        return "sd1000";
    }

    @Override
    public String spaceInfo() {
        return "s56gb";
    }

    @Override
    public String whatsapp() {
        return "send message for free";
    }
}
