import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class Parking_Lot_Main {
	public static void Read_Write() throws IOException
	{
		if (System.getProperty("ONLINE_JUDGE") == null) {
			// Redirecting the I/O to external files

			// as ONLINE_JUDGE constant is not defined which
			// means

			// the code is not running on an online judge

			PrintStream ps
				= new PrintStream(new File("output.txt"));
			InputStream is
				= new FileInputStream("input.txt");

			System.setIn(is);
			System.setOut(ps);
		}
	}
	public static void main(String[] args) throws IOException
	{
		Read_Write();
		Scanner scanner = new Scanner(System.in);
		int nos = 6;
		HashMap <String, Integer> parkingLotArch = new HashMap <>();
		parkingLotArch.put("TRUCK", 1);
		parkingLotArch.put("BIKE", 2);
		parkingLotArch.put("CAR", nos-3);
		
		ParkingLot parkingLot = new ParkingLot(2, parkingLotArch);
		System.out.println("Parking Lot \n\n");
		while(scanner.hasNextLine())
		{
			String cmd = scanner.nextLine();
			String[] str = cmd.split(" ");
			System.out.println(cmd);
			
			if(str[0].equals("display"))
			{
				if(str[1].equals("free_count"))
					parkingLot.free_count(str[2]);
				else if(str[1].equals("free_slots"))
					parkingLot.free_slots(str[2]);
				else if(str[1].equals("occupied_slots"))
					parkingLot.occupied_slots(str[2]);
			}
			else if(str[0].equals("park_vehicle")) {
				Vehicle vehicle = new Vehicle(str[2], str[1], str[3]);
				System.out.println(parkingLot.park_vehicle(vehicle));
			}
			else if(str[0].equals("unpark_vehicle"))
			{
				String[] ticket = str[1].split("_");
				System.out.println(ticket[1] + " " + ticket[2]);
				int a = Integer.valueOf(ticket[1]);
				int b = Integer.valueOf(ticket[2]);
				System.out.println(parkingLot.unpark_vehicle(a, b));
			}
		}
	}
}
