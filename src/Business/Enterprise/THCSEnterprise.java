/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.HealthCost.HealthCost;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class THCSEnterprise extends Enterprise {
    
    private ArrayList<HealthCost> healthCostDirectory;
    
    public THCSEnterprise(String name){
        super(name,EnterpriseType.THCS);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public ArrayList<HealthCost> getHcDirectory() {
        if(healthCostDirectory == null){
           healthCostDirectory = new ArrayList<HealthCost>();
        }
        return healthCostDirectory;
    }

    public void setHcDirectory(ArrayList<HealthCost> healthCostDirectory) {
        this.healthCostDirectory = healthCostDirectory;
    }
    
    public void addHealthCosts(HealthCost hc)
    {
        this.getHcDirectory().add(hc);
    } 
    
}
