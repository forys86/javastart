package pl.sda.javastart.day3;

import com.sun.istack.internal.Nullable;
import org.junit.platform.commons.util.StringUtils;

import java.time.LocalDateTime;

public class Car {

    private String model;
    private String manufacturer;
    private String colour;
    private double basePrice;
    private double engineCpacity;
    private int hp;
    private LocalDateTime manufacturedDate;
    private String option;
    private int doorsNumbers;

    //public String getManufacturerAndModel(){
       // return manufacturer==null ?
    //return StringUtils.isNotBlank(manufacturer, Nullable)
   // }
   // public String toString() {
    //    return StringUtils;
   // }

    public void setModel(String model){
        this.model=model;//this.model odniesienie sie do obiektu z public class

    }

    public String getModel(){
        return model;
    }
}
