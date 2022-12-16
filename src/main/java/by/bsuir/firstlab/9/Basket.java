
package by.bsuir.firstlab.ninthtask;

import java.util.LinkedList;


public class Basket {

    private LinkedList<Ball> allBalls;
    
    public void addBall(Ball newBall){        
            allBalls.add(newBall);
    }
    
    public int weigh(){
        
        int weight=0;
        for(int i = 0; i<allBalls.size(); i++) {
            Ball value = allBalls.get(i);
            weight+=value.weight;
        }
        
        return weight;
    }
    
    public int countBlue(){
        
        int count=0;
        
        for(int i = 0; i<allBalls.size(); i++) {
            Ball value = allBalls.get(i);
            if(value.color=="blue"){
                count++;
            }
        }
        
        return count;
    }
    public Basket(){
        allBalls = new LinkedList<>();
    }
}
