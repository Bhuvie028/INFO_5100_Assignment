/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author deepa
 */
public abstract class Organization {

    private String name;
    private WorkQueue WQ;
    private EmployeeDirectory ED;
    private UserAccountDirectory UAD;
    private int OrgID;
    private static int counter = 0;

    public enum Type {
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        Pharmacy("Pharmacy Organization"),
        Medicine("Medicine Organization"),
        Vaccine("Vaccine Organization"),
        Sample("Sample Organization"),
        Clinic("Clinic Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        WQ = new WorkQueue();
        ED = new EmployeeDirectory();
        UAD = new UserAccountDirectory();
        OrgID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUAD() {
        return UAD;
    }

    public int getOrgID() {
        return OrgID;
    }

    public EmployeeDirectory getED() {
        return ED;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWQ() {
        return WQ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWQ(WorkQueue WQ) {
        this.WQ = WQ;
    }

    @Override
    public String toString() {
        return name;
    }

}
