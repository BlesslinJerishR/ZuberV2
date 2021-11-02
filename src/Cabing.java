public class Cabing {
    String pickup;
    String drop;
    int fare;
    int caid;
    int clid;
    String client;
    String driver;
    static int rcount;

    public Cabing(String client, String driver, int caid, int clid, String pickup, String drop, int fare){                this.pickup = pickup;
        this.drop = drop;
        this.caid = caid;
        this.clid = clid;
        this.client = client;
        this.driver = driver;
        this.fare = fare;
    }
    {
        ++rcount;
    }

    public int get_clid(){
        return clid;
    }

    public int get_caid(){
        return caid;
    }

    public String get_driver(){
        return driver;
    }

    public String get_client(){
        return client;
    }
    
    public static void main(String[] args) {
        System.out.println("echo Hola, ZuberV2");
    }
    public void set_status(boolean flag, Driver cabing) {
        cabing.set_status(flag);
    }
}
