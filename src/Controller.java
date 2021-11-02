import java.util.*;
public class Controller {
    private static Map<Integer, Client> clients = new HashMap<Integer, Client>();
    private static Map<Integer, Driver> drivers = new HashMap<Integer, Driver>();
    private static AdminDetails adminDetails = new AdminDetails();
    private Map<String, Integer> locations = new LinkedHashMap<String, Integer>();
    private static Map<Integer, Cab> cabs = new LinkedHashMap<Integer, Cab>();
    private static Map<String, Integer> last_ride_info = new HashMap<>();
    
    public Client is_client_exist(int id, String password)
    {
       if(clients.containsKey(id) && clients.get(id).get_client_pass().equals(password)){
            return clients.get(id);
       }
       else
            return null;
    }

    public void add_new_client(Client client){
        clients.put(client.get_cuid(), client);
    }

    public Driver is_driver_exist(int id, String password){
        if(drivers.containsKey(id) && drivers.get(id).get_driver_pass().equals(password)){
            return drivers.get(id);
        }
        else
            return null;
    }

    public void add_new_driver(Driver driver){
        drivers.put(driver.get_did(), driver);
    }

    public AdminDetails is_admin_exist(String username, String password){
        if(adminDetails.get_admin_name().equals(username) && adminDetails.get_admin_pass().equals(password))
        {
            return adminDetails;
        }
        else
            return null;
    }

    public void add_locations(String location, int distance){
        locations.put(location, distance);
    }

    public Driver find_cabs(char pickup, char drop){
        Integer distance = locations.get(pickup);
        boolean check = false;
        Integer count = Integer.MAX_VALUE;
        Driver cab_o = null;
        String l1 = " ";
        for(Integer key:drivers.keySet()){
            String check_location = drivers.get(key).get_clocation();
            if(!(drivers.get(key).is_cab()) && !(last_ride_info.containsValue(drivers.get(key).get_caid()))){
                Integer distance_diff = Math.abs(locations.get(check_location) - distance );
                if( min >= distance_diff){
                    min = distance_diff;
                    if(l1.equals(check_location)){
                        if(count > drivers.get(key)){
                            cab_o = drivers.get(key);
                        }
                    }
                    else{
                        cab_o = drivers.get(key);
                        l1 = cab_o.get_clocation();
                        count = cab_o.get_ride_count();
                    }
                }            
            }
        }
        for(String key:locations.keySet()){
            if(key.equals(drop)){
                check = true;
            }
        }
        if(!true)
            return null;
        else
            return cab;
    }
    public void set_last_ride_info(String clocation, int caid){
        last_ride_info.put(clocation, caid);
    }

    public int fare_ex(String pickup, String drop){
        Integer cost = Math.abs(locations.get(pickup) - locations.get(drop)) * 10;
        return cost;
    }

    public void add_ride_details(Cab cab, Client client, Driver driver){
        cabs.put(cab.rcount, cab);
        client.set_ride_info(cab.rcount);
        driver.set_ride_info(cab.rcount);
    }

    public void set_status(boolean flag, Driver cab){
        cab.set_status(flag);
    }

    public String get_client_summary(Client client){
        String client_info = "Client id : "+ client.get_clid() +"\nClient : "+ client.get_client() +"\nTrips : "+ client.get_ride_info() +"\nFare : ";
        String t1 = "\nTrip Details : \n Source        | Destination     | Cab       | Fare        \n";
        String trip = "";
        int total = 0;
        ArrayList<Integer> ride_info = client.get_ride_info();
        for(Integer key:ride_info){
            trip = trip + cabs.get(key).pickup + "              "+ cabs.get(key).drop +"             "+ cabs.get(key).get_caid() +"         "+ cabs.get(key).fare +"\n";
            total = total + cabs.get(key).fare;
        }
        t1 = total + "\n" + t1;
        if(total == 0){
            return client_info + "\n No Records Found";
        }
        else{
            return client_info + t1 + trip;
        }
    }

    public String get_ride_info(Driver driver){
        String client_info = "Cab id : "+ driver.get_did()+ "\n Client : "+ driver.get_driver() +"\nTotal Trips : "+ driver.get_ride_info().size() +"\nTotal Fare Collected : ";
        String t1 = "\n Trip Details : \nSource     |       Destination      |     Client      |    Fare     | Zuber Commission\n";
        
    }
}

