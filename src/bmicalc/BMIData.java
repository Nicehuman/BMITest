/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
an extra comment

 */
package bmicalc;

import java.util.Observable;

/**
 *
 * @author comqsjb
 */
public class BMIData extends Observable {

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        if (height<=0)return;        
        this.height = height;
        calcBmi();
        
    }
    
    private void calcBmi()
    {
        bmi = this.weight/(this.height*this.height);
        setChanged();
        notifyObservers(bmi);
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        if (weight<=0) return;
        this.weight = weight;
        calcBmi();
    }
    
    private float weight;
    private float  height;
    private float bmi=0.0F;
    
}
