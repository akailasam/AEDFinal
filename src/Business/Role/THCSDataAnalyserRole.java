/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.THCSDataAnalyserRole.DataAnalyserWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.THCSDataCollectorRole.DataCollectorWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class THCSDataAnalyserRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DataAnalyserWorkAreaJPanel(userProcessContainer, account, organization, business, enterprise);
    }
    
}
