import java.util.ArrayList;


public class Admin {
    private String admin_name= "Blesslin";
    private String admin_password= "zoho";
    private ArrayList<Cab> cab_info= new ArrayList<Cab>();

    public String get_admin_name(){
        return admin_name;
    }

    public String get_admin_pass(){
        return admin_password;
    }
}
