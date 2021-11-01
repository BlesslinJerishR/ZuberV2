import java.util.ArrayList;
public class Driver {
    private int caid;
    private String driver;
    private int did;
    private String driver_pass;
    private int dage;
    private String dgender;
    private String clocation;
    private boolean status;

    private ArrayList<Integer> ride_info = new ArrayList<Integer>();

    public Driver(int caid, String driver, int did, String driver_pass, int dage, String dgender, String clocation){
        this.caid = caid;
        this.driver = driver;
        this.did = did;
        this.driver_pass = driver_pass;
        this.dage = dage;
        this.dgender = dgender;
        this.clocation = clocation;
    }

    public int get_did(){
        return did;
    }

    public void set_did(int did){
        this.did = did;
    }

    public String  get_driver(){
        return driver;
    }

    public void set_driver(String driver){
        this.driver = driver;
    }
    
    public String get_driver_pass(){
        return driver_pass;
    }

    public void set_driver_pass(String driver_pass){
        this.driver_pass = driver_pass;
    }

    public String get_clocation(){
        return clocation;
    }

    public void set_clocation(String clocation){
        this.clocation = clocation;
    }

    public boolean is_cab(){
        return status;
    }
    
    public void set_status(boolean status){
        this.status = status;
    }

    public void set_ride_info(Integer rcount){
        ride_info.add(rcount);
    }

    public ArrayList<Integer> get_ride_info(){
        return ride_info;
    }

    @Override
    public String toString(){
        return "Cab Driver [ id = "+ did +"| Cab Id = "+ caid +"| Driver "+ driver +"| Gender "+ dgender +"]";
    }

    public int get_ride_count(){
        return ride_info.size();
    }
}
