/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovtEmployeeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Gaya 3
 */
public class GovtEmployeeOrganization extends Organization{
    
    public GovtEmployeeOrganization(){
        super(Type.GovtEmployee.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovtEmployeeRole());
        return roles;
    }
    
}
