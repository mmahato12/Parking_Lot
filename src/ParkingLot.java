import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ParkingLot {
	List <Floor> floors;
	ParkingLot(int no_of_floors, HashMap <String, Integer> spots_per_type)
	{
		floors = new ArrayList<>();
		for(int i=0; i<no_of_floors; i++) {
			Floor floor = new Floor(i, spots_per_type);
			this.floors.add(floor);
		}
	}
	
	int free_count(String vehicleType)
	{
		int cnt = 0;
		for(int i=0; i<floors.size(); i++)
		{
			cnt = floors.get(i).free_count(vehicleType);
			System.out.println("No. of free counts for CAR on Floor " + i + ": " + cnt);
		}
		return cnt;
	}
	void free_slots(String vehicleType)
	{
		System.out.println(vehicleType);
		for(int i=0; i<this.floors.size(); i++)
		{
			System.out.print("No. of free slots for CAR on Floor " + i + ": ");
			floors.get(i).free_slots(vehicleType);
		}
	}
	
	void occupied_slots(String vehicleType)
	{
		System.out.println(vehicleType);
		for(int i=0; i<this.floors.size(); i++)
		{
			System.out.print("No. of occupied slots for"+ vehicleType +"on Floor " + i + ": ");
			floors.get(i).occupied_slots(vehicleType);
		}
	}
	
	String park_vehicle(Vehicle vehicle) {
		for(int i=0; i<this.floors.size(); i++)
		{
//			System.out.print("No. of free slots for CAR on Floor " + i + ": ");
			String ticket = floors.get(i).park_vehicle(i, vehicle);
			if(!ticket.equals(""))
				return ticket;
		}
		return "--";
	}
	
	Vehicle unpark_vehicle(int floor, int spot_number)
	{
		System.out.println(floor + " " + spot_number);
		return this.floors.get(floor).unpark_vehicle(spot_number);
	}
}
