public class Ride {
    char pick;
    char drop;
    int price;
    int caid;
    int clid;
    String client;
    String driver;
    int count;

    public Ride(char pick, char drop, int price, int caid, int clid, String client, String driver, int count){
                this.pick = pick;
                this.drop = drop;
                this.price = price;
                this.caid = caid;
                this.clid = clid;
                this.client = client;
                this.driver = driver;
                
            }
            {
                ++count;
            }

    public int clid(){
        return clid;
    }

    public int caid(){
        return caid;
    }

    public String driver(){
        return driver;
    }

    public String client(){
        return client;
    }
    
    public static void main(String[] args) {
        System.out.println("Hola ZuberV2");
    }
}
