import java.util.ArrayList;

public class Client {
    private int clid;
    private String client;
    private String client_pass;
    private int cage;
    private String cgender;
    private ArrayList<Integer> ride_info = new ArrayList<Integer>();

    Client(int clid, String client, String client_pass, int cage, String gender){
        this.clid = clid;
        this.client = client;
        this.client_pass = client_pass;
        this.cage = cage;
        this.cgender = cgender;
    }

    public void Client(int clid, String client_pass){
        this.clid = clid;
        this.client = client_pass;
    }

    public int get_clid(){
        return clid;
    }

    public void set_clid(int clid){
        this.clid = clid;
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
