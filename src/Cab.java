public class Cab {
    String pickup;
    String drop;
    int fare;
    int caid;
    int clid;
    String client;
    String driver;
    static int rcount;

    public Cab(String pick, String drop, int price, int caid, int clid, String client, String driver, int rcount){
                this.pickup = pickup;
                this.drop = drop;
                this.fare = fare;
                this.caid = caid;
                this.clid = clid;
                this.client = client;
                this.driver = driver;
                
            }
            public Cab(String get_client, String get_driver, int get_caid, int get_clid, String pickup2, String drop2,
            int fare2) {
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
    public void set_status(boolean flag) {
    }
}
