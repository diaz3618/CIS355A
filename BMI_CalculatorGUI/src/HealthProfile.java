

/**
 *
 * @author Daniel Diaz Santiago
 */
public class HealthProfile {
    
    private String name;
    private int age; 
    private int weight;
    private int height;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param set age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param set weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param set height
     */
    public void setHeight(int feet, int inches) {
        
        this.height = inches + (feet * 12) ;
    }
    
    public double getBMI(){
        double bmi;
        double wt = getWeight();
        double ht = getHeight();
        bmi = ((wt / (ht * ht)) * 703.0);
        return bmi;
    }
    
    
    public String getCategory(){
      double bmi = getBMI();
      String status;
      
      if(bmi < 18.5){
          status = "Underweight";
      }
      else if(bmi >= 18.5 && bmi <= 24.9){
          status = "Normal";
        
    }
      else if(bmi >= 25 && bmi <= 29.9){
          status = "Overweight";
        
    }
      else{
         status = "Obese"; 
      }
      
     return status;   
    }
    
    
    public int getMaxHR(){
        int ag = getAge();
        
        return (200 - ag);
    }
    
}
