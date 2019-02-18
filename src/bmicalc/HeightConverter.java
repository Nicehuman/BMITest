/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalc;

import java.util.ArrayList;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author comqsjb
 */
public class HeightConverter extends Converter<Integer, String> {

    public String convertForward(Integer arg) {
        //coming in as cm
        
        int totalInches = Math.round(arg/2.54F);
        int feet = (int) Math.floor(totalInches/12);
        int inches = totalInches%12;
        return "" + feet + "' " + inches + "\"";
    }

    public Integer convertReverse(String arg) {
        
        String[] feetInches = arg.split("'");
        int feet,inches,totalInches,retval;
        String f,i;
        try {
            f = feetInches[0].replaceAll("/[^0-9]/g", "");
            i = feetInches[1].replaceAll("/[^0-9]/g", "");
            feet = Integer.parseInt(f);
            inches = Integer.parseInt(i);
            totalInches = (feet*12)+inches;
            retval = (int) Math.round(totalInches*2.54);
        } catch (Exception ex) {
            retval = 0;
        }
        return retval;
    }

}
