import java.util.Scanner;

public class App {

	private static Scanner scan=new Scanner(System.in);
	private static int choice;
	private static Controller controller=new Controller();
	public static void main(String[] args) {

		controller.add_new_driver(new Driver(123,"zu0","password",18,"M",1,"B"));
		controller.add_new_driver(new Driver(223,"zu1","password",17,"M",3,"G"));
		controller.add_new_driver(new Driver(334,"zu2","password",22,"M",2,"A"));
		controller.add_new_driver(new Driver(456,"zu3","password",23,"M",4,"A"));
		controller.add_new_driver(new Driver(578,"zu4","password",45,"M",5,"B"));
		controller.add_locations("A",0);
		controller.add_locations("B",4);
		controller.add_locations("D",7);
		controller.add_locations("G",9);
		controller.add_locations("H",12);
		
		boolean flag=true;
		do
		{   
            System.out.println(" ");
			System.out.println("Welcome to Zuber V2");
            System.out.println("[ Developer : Blesslin Jerish R ]");
            System.out.println(" ");
			System.out.println("1-Client");
			System.out.println("2-Driver");
			System.out.println("3-admin");
            System.out.println(" ");
            System.out.println(">> ");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				Client();
				break;
			case 2:
				Driver();
				break;
			case 3:
				Admin();
				break;
			default :
                System.out.println(" ");
				System.out.println("Enter only correct options");
                System.out.println(" ");
				break;
				
			}
			
		}while(flag);
	}
	private static void Client()
	{
		boolean flag=true;
		do
		{   
            System.out.println(" ");
			System.out.println("1-login");
			System.out.println("2-Client++\n3.Exit");
            System.out.println(" ");			
            System.out.println(">> ");			
			choice=scan.nextInt();
			switch(choice)
			{
			case 2:
				ClientSignUp();
				break;
			case 1:
				ClientSignIn();
				break;
			case 3:
				flag=false;
				break;
			default :
				System.out.println("Select only the correct options");
                System.out.println(" ");
				break;
			}
			
		}while(flag);
	}
	private static void Driver()
	{
		boolean flag=true;
		do
		{
            System.out.println(" ");
            System.out.println("1-login");
			System.out.println("0-exit");
            System.out.println(" ");
            System.out.println(">> ");
			choice=scan.nextInt();
			switch(choice)
			{
				case 1:
				DriverSignIn();
				break;
				case 0:
					flag=false;
					break;
				default :
				flag=false;
				break;
				
			}
			
		}while(flag);
	}
	private static void Admin()
	{
		boolean flag=true;
		do
		{   
            System.out.println(" ");
			System.out.println("1-login");
			System.out.println("0-exit");
            System.out.println(" ");
            System.out.println(">> ");
			choice=scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
			case 1:
				adminSignIn();
				break;
			case 0:
				flag=false;
				break;
				default:
					System.out.println("Select only the correct options");
                    System.out.println(" ");
			}
			
		}while(flag);
	}
	private static void ClientSignUp()
	{   
        System.out.println(" ");			
		System.out.println("please fill the following details");
		System.out.println("phone number/id:  ");
        System.out.println(" ");			
        int id=scan.nextInt();
		System.out.println("name :  ");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("password :  ");
		String password=scan.next();
		System.out.println("age :  ");
		int age=scan.nextInt();
		System.out.println("gender:M/F  ");
		scan.nextLine();
		String gender = scan.next();
		Client client = new Client(id,name,password,age,gender);
		controller.add_new_client(client);
		System.out.println("succesfully registered");
        System.out.println(" ");			
	}
	private static void addCab()
	{   
        System.out.println(" ");			
		System.out.println("please fill the following details of Driver");
		System.out.println("phone number/driver Id  :  ");
		int id=scan.nextInt();
		System.out.println("name :  ");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("password :  ");
		scan.nextLine();
		String password=scan.next();
		System.out.println("age :  ");
		int age=scan.nextInt();
		System.out.println("gender:M/F  ");
		scan.nextLine();
		String gender=scan.next();
		System.out.println("cab Id");
		int cabId=scan.nextInt();
		System.out.println("Initial Cab Location");
		String cabLocation=scan.next();
		Driver cab=new Driver(id,name,password,age,gender,cabId,cabLocation);
		controller.add_new_driver(cab);
		System.out.println("succesfully registred");
        System.out.println(" ");			
	}
	private static void ClientSignIn()
	{   
        System.out.println(" ");			
		System.out.println("id (phone number) :  ");
		int id=scan.nextInt();
		System.out.println("password :  ");
		scan.nextLine();
		String password=scan.nextLine();
		Client Client=controller.is_client_exist(id,password);
		 if(Client!=null)
		 {
			 ClientFunctions(Client);
		 }
		 else
			System.out.println("Enter only the correct details");
	}
	private static void DriverSignIn()
	{   
        System.out.println(" ");			
		System.out.println("id :  ");
		int id=scan.nextInt();
		System.out.println("password :  ");
		scan.nextLine();
		String password=scan.nextLine();
		Driver Driver=controller.is_driver_exist(id,password);
		if(Driver!=null)
	    {
			 DriverFunctions(Driver);
	    }
		 else
			System.out.println("Enter only the correct details");
	}
	private static void adminSignIn()
	{   
        System.out.println(" ");			
		System.out.println("admin name :  ");
		String userName=scan.nextLine();
		System.out.println("password :  ");
		String password=scan.nextLine();
		Admin adminDetails=controller.is_admin_exist(userName,password);
		 if(adminDetails!=null)
		 {
			 adminFunctions(adminDetails);
		 }
		 else
			System.out.println("Enter only the correct details");
	}
	private static void ClientFunctions(Client Client)
	{
		
		boolean flag=true;
		do
		{   
            System.out.println(" ");			
			System.out.println("1-want to go ride");
			System.out.println("2-ride details");
			System.out.println("3-logout");
            System.out.println(" ");			
            System.out.println(">> ");
			choice=scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
			case 1:
                System.out.println(" ");			
				System.out.println("Enter Pickup location");
				String pickup=scan.nextLine();
				System.out.println("Enter Drop location");
				String drop=scan.nextLine();
				Driver cab = controller.find_cabs(pickup, drop);
                if(cab!=null)
				{
					int fare=controller.fare_ex(pickup,drop);
                    System.out.println(" ");
					System.out.println("Estimation fare: "+fare);
					System.out.println("please confirmation by enter 1-Yes---0-No");
                    System.out.println(" ");
                    System.out.println(">> ");
					int choice1=scan.nextInt();
					if(choice1==1)
					{
						System.out.println(cab);
						Cabing cabing = new Cabing(Client.get_client(),cab.get_driver(), cab.get_caid(), Client.get_clid(),pickup,drop,fare);
						controller.set_status(true, cab);
						controller.add_cab_details(cabing, Client, cab);
						System.out.println("cab is reaching near to u");
						System.out.println("journey starting");
                        System.out.println(" ");

					}
				}
				else
					System.out.println("No Zuber cabs available. Please, Try again.");
				
				break;
			case 2:
                System.out.println(controller.get_client_summary(Client));
				break;
			case 3:
				flag=false;
				break;
				
			}
		
		}while(flag);
	}
	
	private static void DriverFunctions(Driver Driver)
	{
		boolean flag=true;
		do {
            System.out.println(" ");
			System.out.println("1-change status");
			System.out.println("2-set cab location");
			System.out.println("3-Driving History");
			System.out.println("4-log out");
            System.out.println(" ");
            System.out.println(">> ");
			choice=scan.nextInt();
			switch (choice)
			{
				case 1:
                    System.out.println(" ");
					System.out.println("1-available\n2-not available");
                    System.out.println(">> ");
					choice=scan.nextInt();
					if(choice==1) {
						controller.set_status(false, Driver);
							System.out.println("Enter cab location");
							String location=scan.next();
							Driver.set_clocation(location);
						controller.set_last_ride_info(location, Driver.get_did());
					}
					else
						controller.set_status(true,Driver);
					break;
				case 2:
					System.out.println("Enter cab location");
					String location=scan.next();
					Driver.set_clocation(location);
					break;
				case 3:
					System.out.println(controller.get_ride_info(Driver));
					break;
				case 4:
					flag=false;
					break;

			}
		}while(flag);



	}
	private static void adminFunctions(Admin adminDetails)
	{
		boolean flag=true;
		do
		{   
            System.out.println(" ");
			System.out.println("1-add cab");
			System.out.println("2-add location");
			System.out.println("3-summary of Clients");
			System.out.println("4-summary of cabs");
			System.out.println("5-logout");
            System.out.println(">> ");
			choice=scan.nextInt();
			scan.nextLine();
			switch(choice)
			{
			case 1:
					addCab();
					break;
			case 2:
                System.out.println(" ");
				System.out.println("Enter  location");
				String newLocation=scan.nextLine();
				System.out.println("Enter distance");
                System.out.println(" ");
                System.out.println(">> ");
				int distance=scan.nextInt();
				controller.add_locations(newLocation,distance);
				break;
			case 3:
				System.out.println(controller.full_clients());
				break;
			case 4:
				System.out.println(controller.full_summary());
				break;
			case 5:
				flag=false;
				break;
				
			}
		
		}while(flag);
		
	}
	
}