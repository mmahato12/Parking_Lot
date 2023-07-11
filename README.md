# Parking_Lot
A parking lot is an area where cars can be parked for a certain amount of time. A parking lot can have multiple floors with each floor having a different number of slots and each slot being suitable for different types of vehicles.

## Input/Output Format
The code should strictly follow the input/output format and will be tested with provided test cases.

### Input Format
Multiple lines with each line containing a command.

### Possible commands:

- park_vehicle <vehicle_type> <reg_no> <color>
- unpark_vehicle <ticket_id>
- display <display_type> <vehicle_type>
- Possible values of display_type: free_count, free_slots, occupied_slots
- exit
Stop taking the input when you encounter the word exit.

### Output Format
Print output based on the specific commands as mentioned below.

- park_vehicle
Parked vehicle. Ticket ID: <ticket_id>
Print "Parking Lot Full" if slot is not available for that vehicle type.

- unpark_vehicle
Unparked vehicle with Registration Number: <reg_no> and Color : <color>
Print "Invalid Ticket" if ticket is invalid or parking slot is not occupied.

- display free_count <vehicle_type>
No. of free slots for <vehicle_type> on Floor <floor_no> : <no_of_free_slots>
The above will be printed for each floor.

- display free_slots <vehicle_type>
Free slots for <vehicle_type> on Floor <floor_no> : <comma_separated_values_of_slot_nos>
The above will be printed for each floor.

- display occupied_slots <vehicle_type>
Occupied slots for <vehicle_type> on Floor <floor_no> : <comma_separated_values_of_slot_nos>
The above will be printed for each floor.
