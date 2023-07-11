
public class Vehicle {
	String registration_number;
	String vehicle_type;
	String color;
	Vehicle(String registration_number, String vehicle_type, String color) {
		this.registration_number = registration_number;
		this.vehicle_type = vehicle_type;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Vehicle [registration_number=" + registration_number + ", vehicle_type=" + vehicle_type + ", color="
				+ color + "]";
	}
}
