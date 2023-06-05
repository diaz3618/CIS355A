
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel F Diaz Santiago
 */
public class StockIO {
    private String filename;
    
    public StockIO(){
        filename = "stocks.txt";
    }
    
    public StockIO(String filename){
        set_filename(filename);
    }

    // Behaviors
    public ArrayList<Stock> get_data(){
        ArrayList<Stock> data = new ArrayList<Stock>();
        
        try{
            BufferedReader in_file = new BufferedReader(new FileReader(filename));
            String input_line = "";
            StringTokenizer tokens;
            
            input_line = in_file.readLine();
            
            while(input_line != null){
                tokens = new StringTokenizer(input_line, ",");
                String company = tokens.nextToken();
                double shares = Double.parseDouble(tokens.nextToken());
                double p_price = Double.parseDouble(tokens.nextToken());
                double c_price = Double.parseDouble(tokens.nextToken());
                
                Stock stk = new Stock(company, shares, p_price, c_price);
                data.add(stk);
                
                input_line = in_file.readLine();
            }
            
            in_file.close();
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Error. Unable to read file: " + ex.getMessage(),
                    filename, JOptionPane.ERROR_MESSAGE);
        }
        
        return data;
    }
    
    public void save_data(ArrayList<Stock> data){
        try{
            BufferedWriter out_file = new BufferedWriter(new FileWriter(filename));
            
            for(int i = 0; i < data.size(); i++){
                Stock stk = data.get(i);
                out_file.write(stk.getCompany_name() + ',');
                out_file.write("" + stk.getNum_shares() + ',');
                out_file.write("" + stk.getPurchase_price() + ',');
                out_file.write("" + stk.getCurrent_price() + ',');
                out_file.newLine();
            }
            
            out_file.close();
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Error. Unable to write to file: " + ex.getMessage(),
                    filename, JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Getters & Setters
    public void set_filename(String filename) {
        if(filename.length() < 0)
            this.filename = filename;
        else
            this.filename = "stocks.txt";
    }
    
    public String get_filename(){
        return filename;
    }
}
