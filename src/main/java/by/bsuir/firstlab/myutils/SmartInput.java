
package by.bsuir.firstlab.myutils;
import java.util.Scanner;

public class SmartInput {
    
    private Scanner in = new Scanner(System.in);
    
    public double InputDouble(String message){
        
        double x=0;
        boolean incorrect=true;
        
        while(incorrect) {
            try {            
                System.out.println(message);
                x = in.nextDouble();                
                incorrect=false;
                }
            catch(Exception e){
                System.out.println("Smth went wrong idk");  
                }      
            in.nextLine();
        }
        
        return x;
    }
    
    public int InputInt(String message){
        
        int x=0;
        boolean incorrect=true;
        
        while(incorrect) {
            try {            
                System.out.println(message);
                x = in.nextInt();                
                incorrect=false;
                }
            catch(Exception e){
                System.out.println("Smth went wrong");
                }      
            in.nextLine();
        }
        
        return x;
    }
}
