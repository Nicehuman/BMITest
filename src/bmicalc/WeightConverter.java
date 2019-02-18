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
public class WeightConverter extends Converter<Integer, String> {

    public String convertForward(Integer arg) {
        //coming in as cm
        
        int totalPounds = Math.round(arg*2.2F);
        int stones = (int) Math.floor(totalPounds/14);
        int pounds = totalPounds%14;
        return "" + stones + "st " + pounds + "lbs";
    }

    public Integer convertReverse(String arg) {
        
        return 0;
    }

}
