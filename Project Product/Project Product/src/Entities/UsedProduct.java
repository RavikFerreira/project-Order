package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private Date manuFactureDate;

    public UsedProduct(){
    }
    public UsedProduct(String name, Double price, Date manuFactureDate) {
        super(name, price);
        this.manuFactureDate = manuFactureDate;
    }

    public Date getManuFactureDate() {
        return manuFactureDate;
    }
    public void setManuFactureDate(Date manuFactureDate) {
        this.manuFactureDate = manuFactureDate;
    }

    @Override
    public String priceTag(){
        return getName()
        +"(used) $ "+ getPrice()
        +" (Manufacture date: "+sdf.format(manuFactureDate)+")"; 

    }

}
