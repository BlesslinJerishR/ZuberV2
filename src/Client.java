import java.util.ArrayList;

public class Client {
    private int cuid;
    private String client;
    private String client_pass;
    private int cage;
    private int cgender;
    private ArrayList<Integer> ride_info = new ArrayList<Integer>();

    private Client(int cuid, String client, String client_pass, int cage, int cgender){
        this.cuid = cuid;
        this.client = client;
        this.client_pass = client_pass;
        this.cage = cage;
        this.cgender = cgender;
    }

    public void Customer(int cuid, String client_pass){
        this.cuid = cuid;
        this.client = client_pass;
    }

    public int get_cuid(){
        return cuid;
    }

    public void set_cuid(int cuid){
        this.cuid = cuid;
    }

    public String get_client(){
        return client;
    }

    public void set_client(String client){
        this.client = client;
    }

    public String get_client_pass(){
        return client_pass;
    }

    public void set_client_pass(String client_pass){
        this.client_pass = client_pass;
    }

    public void set_ride_info(Integer rcount){
        ride_info.add(rcount);
    }

    public ArrayList<Integer> get_ride_info(){
        return ride_info;
    }
}
