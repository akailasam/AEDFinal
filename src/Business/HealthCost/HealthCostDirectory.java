/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthCost;

import java.util.ArrayList;

/**
 *
 * @author mahitha
 */
public class HealthCostDirectory {
    
    
    private ArrayList<HealthCost> hcDirectory;
    
    public HealthCostDirectory()
    {
        hcDirectory = new ArrayList<HealthCost>();
    }

    public ArrayList<HealthCost> getHcDirectory() {
        return hcDirectory;
    }

    public void setHcDirectory(ArrayList<HealthCost> hcDirectory) {
        this.hcDirectory = hcDirectory;
    }
    
    public HealthCost addHealthCosts()
    {
        HealthCost hc = new HealthCost();
        hcDirectory.add(hc);
        return hc;
    }
    
}
