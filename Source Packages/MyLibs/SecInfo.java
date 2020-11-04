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
    
    private String mStatus;
    private int houseSize;
    

    public String getmStatus() {
        return mStatus;
    }

    public int getHouseSize() {
        return houseSize;
    }
    public SecInfo (String mStatus, int houseSize) {
        this.mStatus = mStatus;
        this.houseSize = houseSize;
    }
    
}

