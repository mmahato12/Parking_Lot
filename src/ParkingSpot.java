
public class ParkingSpot {
	int spot_number;
	String spot_type;
	boolean isAvailable;
	Vehicle vehicle;
	ParkingSpot(int spot_number, String spot_type)
	{
		this.spot_number = spot_number;
		this.spot_type = spot_type;
		this.isAvailable = true;
		this.vehicle = null;
	}
	
	String park_vehicle(int floor, Vehicle vehicle)
	{
		this.isAvailable = false;
		this.vehicle = vehicle;
		return "PR1234_"+floor+"_"+this.spot_number;
	}
	Vehicle unpark_vehicle()
	{
		System.out.println(this.vehicle);
		Vehicle vehicle1 = this.vehicle;
		this.vehicle = null;
		this.isAvailable = true;
		return vehicle1;
	}

	@Override
	public String toString() {
		return "ParkingSpot [spot_number=" + spot_number + ", spot_type=" + spot_type + ", isAvailable=" + isAvailable
				+ ", vehicle=" + vehicle + "]";
	}
}
