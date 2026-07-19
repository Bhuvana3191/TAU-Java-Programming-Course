package Chapter_11_Abstraction_Interfaces;
/* Chapter-11b : Interfaces
* Create a Product interface.
* Create a Book class that implements Product.
*/

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode(){
        return "No Barcodes";
    }
}
