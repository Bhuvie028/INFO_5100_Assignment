package Business;

import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author bhuva
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        try{
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount uam = system.getUserAccountDirectory().createUserAccount("sysman", "sysman", employee, new AdminRole());
        UserAccount uac = system.getUserAccountDirectory().createUserAccount("syscus", "syscus", employee, new CustomerRole());
        UserAccount uad = system.getUserAccountDirectory().createUserAccount("sysdel", "sysdel", employee, new DeliverManRole());
        return system;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Please provide appropriate Login details"); 
        }
        return null;
    }
    
}
