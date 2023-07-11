import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Floor {
	List<ParkingSpot> parking_spots;
	Floor(int floor_no, HashMap <String, Integer> spots_per_type)
	{
		parking_spots = new ArrayList<>();
		for(String spot_type: spots_per_type.keySet())
		{
			int spots = spots_per_type.getOrDefault(spot_type, 0);
			for(int i=0; i<spots; i++) {
				ParkingSpot spot = new ParkingSpot(i, spot_type);
				this.parking_spots.add(spot);
			}
		}
		
	}
	
	int free_count(String vehicleType)
	{
		int cnt = 0;
		for(int i=0; i<this.parking_spots.size(); i++)
		{
//			System.out.println(this.parking_spots.get(i).spot_type);
			cnt += (this.parking_spots.get(i).isAvailable && (this.parking_spots.get(i).spot_type.equals(vehicleType))) ? 1 : 0;
		}
		return cnt;
	}
	
	void free_slots(String vehicleType)
	{
		for(int i=0; i<this.parking_spots.size(); i++)
		{
			if(this.parking_spots.get(i).isAvailable && (this.parking_spots.get(i).spot_type.equals(vehicleType)))
				System.out.print(i+", ");
		}
		System.out.println("");
	}
	
	void occupied_slots(String vehicleType)
	{
		for(int i=0; i<this.parking_spots.size(); i++)
		{
			if(this.parking_spots.get(i).isAvailable==false && (this.parking_spots.get(i).spot_type.equals(vehicleType)))
				System.out.print(i+", ");
		}
		System.out.println("");
	}
	
	String park_vehicle(int floor, Vehicle vehicle) {
		for(int i=0; i<this.parking_spots.size(); i++)
		{
			if(this.parking_spots.get(i).isAvailable && (this.parking_spots.get(i).spot_type.equals(vehicle.vehicle_type)))
			{
				String spot = this.parking_spots.get(i).park_vehicle(floor, vehicle);
				if(!spot.equals(""))
					return spot;
			}
		}
		return "";
	}
	
	Vehicle unpark_vehicle(int spot_number) {
		System.out.println(spot_number);
		System.out.println(this.parking_spots.get(spot_number));
		return this.parking_spots.get(spot_number).unpark_vehicle();
	}
}
