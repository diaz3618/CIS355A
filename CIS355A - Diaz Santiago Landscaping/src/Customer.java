/**
 *
 * @author Daniel F Diaz Santiago
 */
import java.text.DecimalFormat;

public class Customer {
    int customerID;
    String name;
    String address;
    String yardType;
    double length, width, totalCost;
    
    // Constructor
    public Customer(int id, String _name, String _address, String _yardType, double _length, double _width, double _totalCost){
        this.customerID = id;
        this.name = _name;
        this.address = _address;
        this.yardType = _yardType;
        this.length = _length;
        this.width = _width;
        this.totalCost = _totalCost;
    }
    
    @Override
    public String toString(){
        return name;
    }

    // Getters & Setters
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYardType() {
        return yardType;
    }

    public void setYardType(String yardType) {
        this.yardType = yardType;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
       
    public String getDetails(){
        DecimalFormat fmt = new DecimalFormat("$#,##0.00");
        String output = name + "\n";
        output += address + "\n";
        output += "Type: " + yardType + "\n";
        output += "Width: " + width + "\n";
        output += "Length: " + length + "\n";
        output += "Total Cost: " + fmt.format(totalCost); //currency
        
        return output;
    }
}
