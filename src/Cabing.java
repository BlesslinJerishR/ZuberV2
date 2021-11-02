public class Cabing {
    String pickup;
    String drop;
    int fare;
    int caid;
    int clid;
    String client;
    String driver;
    static int rcount;

    public Cabing(String pick, String drop, int price, int caid, int clid, String client, String driver, int rcount){
                this.pickup = pickup;
                this.drop = drop;
                this.fare = fare;
                this.caid = caid;
                this.clid = clid;
                this.client = client;
                this.driver = driver;
                
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
