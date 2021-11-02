import java.util.*;
public class Controller {
    private static Map<Integer, Client> clients = new HashMap<Integer, Client>();
    private static Map<Integer, Driver> drivers = new HashMap<Integer, Driver>();
    private static AdminDetails adminDetails = new AdminDetails();
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
        drivers.put(driver.get_driver_id(), driver);
    }

    public AdminDetails is_admin_exist(String username, String password){
        if(adminDetails.get_admin_name().equal(username) && adminDetails.get_admin_pass().equals(password))
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
        Integer min = Integer.MAX_VALUE;
        Driver cab = null;
        String l1 = " ";
        for(Integer key:drivers.keySet()){
            String check_location = drivers.get(key).get_clocation();
            if(!(drivers.get(key).is_cab()) && !(last_ride_info.containsValue(drivers.get(key).get_caid()))){
                Integer distance_diff = Math.abs(locations.get(check_location) - distance );
                if( min >= distance_diff){
                    min = distance_diff;
                    if(l1.equals(check_location)){
                        if(count > drivers.get(key).get_rcount()){
                            cab = drivers.get(key);
                        }
                    }
                    else{
                        cab = drivers.get(key);
                        l1 = cab.get_clocation();
                        count = cab.get_rcount;
                    }
                }            
            }
        }
        for(String key:locations.keySet()){
            if(key.equals(end_location)){
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
        client.set_ride_info(ride.rcount);
        driver.set_ride_info(ride.rcount);
    }
}

