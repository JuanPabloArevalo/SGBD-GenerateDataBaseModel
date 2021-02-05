package com.mycompany.app;
public class Area{
    public String total;
    public String land;
    public String water;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getRealLand(){
        return land.replaceAll(",", "")
                .replaceAll("sq", "")
                .replaceAll("km", "")
                .replaceAll(" ","");
    }

    public String getRealWater(){
        return water.replaceAll(",", "")
                .replaceAll("sq", "")
                .replaceAll("km", "")
                .replaceAll(" ","");
    }
}
