/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolioData;

/**
 *
 * @author csstudent
 */
public class Info {
    private FinalInfo dim;
    private int Value;
    
    public int getValue(){
        return Value;
    }
    public FinalInfo getDim(){
        return dim;
    }
    
    @Override
    public String toString() {
        return dim.getCountry() + ": " + this.getValue() + "% immunized";
    }
}
