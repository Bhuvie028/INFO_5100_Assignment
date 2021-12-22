package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author varadha
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getED().createEmployee("RRH");

        UserAccount ua = system.getUAD().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }

}
