/**
 *
 * @author Daniel F Diaz Santiago
 */
public class Stock {
    private String company_name;
    private double num_shares;
    private double purchase_price;
    double current_price;
    
    // constructors
    public Stock(){
        company_name = "N/A";
        num_shares = 0.0;
        purchase_price = 0.0;
        current_price = 0.0;
    }
    
    public Stock(String company_name, double num_shares, double purchase_price, double current_price){
        this.setCompany_name(company_name);
        this.setNum_shares(num_shares);
        this.setPurchase_price(purchase_price);
        this.setCurrent_price(current_price);
    }
    
    // behaviors
    public double get_profit_loss(){
        return num_shares * (current_price - purchase_price);
    }
    
    @Override
    public String toString(){
        return company_name;
        
    }
    
    // getters & setters
    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public double getNum_shares() {
        return num_shares;
    }

    public void setNum_shares(double num_shares) {
        if(num_shares > 0.0)
            this.num_shares = num_shares;
        else
            this.num_shares = 0.0;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(double purchase_price) {
        if(purchase_price > 0.0)
            this.purchase_price = purchase_price;
        else
            this.purchase_price = 0.0;
    }

    public double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(double current_price) {
        if(current_price > 0.0)
            this.current_price = current_price;
        else
            this.current_price = 0.0;
    }
    
}
