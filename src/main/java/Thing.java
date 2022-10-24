
public class Thing {
  
  private String name;
  
  //Constructs a new Thing named myName
  public Thing(String myName) {
    this.name = myName;
  }
  
  //Returns this Thing's name
  public String getName() {
    return this.name;
  }
  
  //Sets this Thing
  public void setName(String newName) {
    this.name = newName;
  }
  
  //Returns a message as described in part (b)
  public void printMessage() {
    System.out.println(this.name + "_is_great");
  }
   
  public static void main(String[] args) {
 
    //(a) Write the statement below:
    
    
    //(b)
    Thing favFood = new Thing("pizza");
    //(b) Write the statement below:
    
    
    
    //(c)
    Thing something = new Thing("ABCD");
    //(c) Write the statement below:
    
    
     
  }

}
