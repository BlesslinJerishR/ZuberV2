public class Cab {
    char pick;
    char drop;
    int price;
    int caid;
    int clid;
    String client;
    String driver;
    int rcount;

    public Cab(char pick, char drop, int price, int caid, int clid, String client, String driver, int rcount){
                this.pick = pick;
                this.drop = drop;
                this.price = price;
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
}
