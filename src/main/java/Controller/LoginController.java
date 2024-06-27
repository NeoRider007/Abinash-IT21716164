package Controller;



import Model.TTLoginUser;
import java.util.ArrayList;

public class LoginController {

    TTLoginUser LoginObj;
    ArrayList<TTLoginUser> LoginDB;
    
    public LoginController()
    {
        LoginDB = new ArrayList<>();
        LoginDB.add(new TTLoginUser("admin","admin"));
    }
    
    public TTLoginUser AddLoginUser(String EID, String Password)
    {
        LoginObj = new TTLoginUser(EID, Password);
        return LoginObj;
    }
    
    public TTLoginUser CheckUser(TTLoginUser LoginObj)
    {
        for(TTLoginUser Log:LoginDB)
        {
            if(LoginObj.getEID().equals(Log.getEID()) && LoginObj.getPassword().equals(Log.getPassword()))
            {
                return Log;
            }
        }
        return null;
    }
    
}
