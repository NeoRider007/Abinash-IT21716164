
package Model;

public class Ship {

    private String SHID;
    private String CoustomerName;
    private String CustomerID;
    private String CustomerMail;
    

    public Ship(String SHID, String CoustomerName, String CustomerID, String CustomerMail) {
        this.SHID = SHID;
        this.CoustomerName = CoustomerName;
        this.CustomerID = CustomerID;
        this.CustomerMail = CustomerMail;
       
    }

    

    public String getSHID() {
        return SHID;
    }

    public void setSHID(String SHID) {
        this.SHID = SHID;
    }

    public String getCoustomerName() {
        return CoustomerName;
    }

    public void setCoustomerName(String CoustomerName) {
        this.CoustomerName = CoustomerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }

    public void setCustomerMail(String CustomerMail) {
        this.CustomerMail = CustomerMail;
    }



    @Override
    public String toString() {
        return "Ship{" + "SHID=" + SHID + ", CoustomerName=" + CoustomerName + ", CustomerID=" + CustomerID + '}';
    }

    
}
