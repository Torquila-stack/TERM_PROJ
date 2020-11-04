/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author TorQuiLa
 */
public class SecInfo {
    
    private String mMarital;
    private int houseSize;
    

    public String getmMarital() {
        return mMarital;
    }

    public void setmMarital(String mMarital) {
        this.mMarital = mMarital;
    }

    public int getHouseSize() {
        return houseSize;
    }
    public SecInfo (int houseSize) {
        this.houseSize = houseSize;
    }
    
}

