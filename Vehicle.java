public class Vehicle {
    
    // Attributes
    private String name;
    private String fuelType;
    private int model;
    private String type; // Transmission type: "Auto" or "Manual"
    private String vehicleState; // Current state: "Driving", "Reverse", "Parking"
    private int speed; // Current speed in km/h

    // Constructors

    public Vehicle() {
        this.name = null;
        this.fuelType = null;
        this.model = 0;
        this.type = null;
        this.vehicleState = "Parking";
        this.speed = 0;
    }

    public Vehicle(String name, String fuelType, int model, String type) {
        this.name = name;
        this.fuelType = fuelType;
        this.model = model;
        this.type = type;
        this.vehicleState = "Parking";
        this.speed = 0;
    }

    // Deep copy constructor
    public Vehicle(Vehicle v) {
        this.name = v.name;
        this.fuelType = v.fuelType;
        this.model = v.model;
        this.type = v.type;
        this.vehicleState = v.vehicleState;
        this.speed = v.speed;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVehicleState(String vehicleState) {
        this.vehicleState = vehicleState;
    }

    public String getVehicleState() {
        return vehicleState;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    // Methods

    // Start driving the vehicle
    public void drive() {
        if (vehicleState.equals("Driving")) {
            speed += 10;
            System.out.println("Accelerating. Current speed: " + speed + " km/h");
        }//if

        else {
            System.out.println("Cannot drive while in " + vehicleState + " state. Switch to Driving state (D) first.");
        }//else
    }//if

    // Apply brakes to slow down the vehicle
    public void brake() {
        if (vehicleState.equals("Driving")) {
            if (speed > 100) {
                speed -= 100;
            }//if 
            else {
                speed = 0;
            }//else
            System.out.println("Applying brakes. Current speed: " + speed + " km/h");
        }//if 
        else {
            System.out.println("Cannot brake while in " + vehicleState + " state. Only applicable in Driving state (D).");
        }//else
    }

    // Change to reverse gear
    public void reverse() {
        vehicleState = "Reverse";
        speed = 0;
        System.out.println("Vehicle changed to Reverse. Current speed: " + speed + " km/h");
    }

    // Change vehicle state (D, R, P)
    public void changeState(String s) {

        if (s.equals("Driving") || s.equals("Reverse") || s.equals("Parking")) {
            this.setVehicleState(s);
            System.out.println("Vehicle state changed to " + vehicleState);
        }//if 
        else {
            System.out.println("Invalid state change request. Allowed states: D (Driving), R (Reverse), P (Parking)");
        }//else
    }

    // Compare speed with another vehicle

    public boolean fasterVehicle(Vehicle v) {
    
        return v.speed > this.speed;
    
    }//fasterVehicle

    // Check if transmission type matches with another vehicle
    
    public boolean transmissionType(Vehicle v) {

    	if (this.type.equals(v.type)) {
    	
    		return true;	
    	}//if

        return false;

    }//transmissionType

    // Create a deep copy of the current vehicle
    public Vehicle create() {
    
    	Vehicle res = new Vehicle();
    	res.setName(this.name);
    	res.setFuelType(this.fuelType);
    	res.setModel(this.model);
    	res.setType(this.type);
    	res.setVehicleState(this.vehicleState);
        res.setSpeed(this.getSpeed());

        return res;
    
    }

    // Display all attributes of the vehicle
    
    @Override
    public String toString() {
        return "Vehicle Details: \n" +
               "Name: " + name + "\n" +
               "Fuel Type: " + fuelType + "\n" +
               "Model Year: " + model + "\n" +
               "Transmission Type: " + type + "\n" +
               "Current State: " + vehicleState + "\n" +
               "Current Speed: " + speed + " km/h";
    }
}
