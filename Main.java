class Main{
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle("Toyota", "Petrol", 2018, "auto");
		Vehicle vehicle2 = new Vehicle("Kia", "Petrol", 2019, "manual"); 
		Vehicle vehicle3 = new Vehicle("Mercedes", "Diesel", 2022, "auto");

		System.out.println("/////////////////////Vehicle 1///////////////////");
		System.out.println(vehicle1.toString());

		System.out.println("/////////////////////Vehicle 2///////////////////");
		System.out.println(vehicle2.toString());

		System.out.println("/////////////////////Vehicle 3///////////////////");
		System.out.println(vehicle3.toString());

		//Have to chnage vehicle state to Driving

		vehicle1.changeState("Driving");

		for (int i = 0;i<2 ;i++ ) {
			
			vehicle1.drive();

		}//for

		vehicle1.brake();
		vehicle1.brake();
		vehicle1.brake();

		System.out.println("/////////////////////Vehicle 1///////////////////");
		System.out.println(vehicle1.toString());


		//Have to chnage vehicle state to Driving

		vehicle2.changeState("Driving");

		for (int i = 0;i<3 ;i++ ) {
			
			vehicle2.drive();

		}//for

		vehicle2.brake();
		vehicle2.brake();

		System.out.println("/////////////////////Vehicle 2///////////////////");
		System.out.println(vehicle2.toString());

		//Have to chnage vehicle state to Driving

		vehicle3.changeState("Driving");

		for (int i = 0;i<4 ;i++ ) {
			
			vehicle3.drive();

		}//for

		vehicle3.brake();
		

		System.out.println("/////////////////////Vehicle 3///////////////////");
		System.out.println(vehicle3.toString());


		boolean res = vehicle1.transmissionType(vehicle3);

		if (res == true) {
			
			System.out.println("Transmission is same for both vehicle.");

		}//if
		else{

			System.out.println("Transmission is not same for both vehicle.");

		}

		System.out.println("/////////////////////Display using Getters///////////////////");

		System.out.println("/////////////////////Vehicle 1///////////////////");

		System.out.println("Name : "+vehicle1.getName());
		System.out.println("FuelType : "+vehicle1.getFuelType());
		System.out.println("Model : "+vehicle1.getModel());
		System.out.println("Type : "+vehicle1.getType());
		System.out.println("VehicleState : "+vehicle1.getVehicleState());
		System.out.println("Speed : "+vehicle1.getSpeed()+"km/h");


		System.out.println("/////////////////////Vehicle 2///////////////////");

		System.out.println("Name : "+vehicle2.getName());
		System.out.println("FuelType : "+vehicle2.getFuelType());
		System.out.println("Model : "+vehicle2.getModel());
		System.out.println("Type : "+vehicle2.getType());
		System.out.println("VehicleState : "+vehicle2.getVehicleState());
		System.out.println("Speed : "+vehicle2.getSpeed()+"km/h");


		System.out.println("/////////////////////Vehicle 3///////////////////");

		System.out.println("Name : "+vehicle3.getName());
		System.out.println("FuelType : "+vehicle3.getFuelType());
		System.out.println("Model : "+vehicle3.getModel());
		System.out.println("Type : "+vehicle3.getType());
		System.out.println("VehicleState : "+vehicle3.getVehicleState());
		System.out.println("Speed : "+vehicle3.getSpeed()+"km/h");


		
		System.out.println("/////////////////////Changing vehicle3 state to Reverse///////////////////");

		//Changing vehicle3 state to Reverse

		vehicle3.changeState("Reverse");
		vehicle3.drive();
		
		//vehicle4

		System.out.println("/////////////////////Vehicle 4///////////////////");


		Vehicle vehicle4 = vehicle3.create();			
		vehicle4.brake();

		boolean res2 = vehicle4.fasterVehicle(vehicle1);

		if (res2 == true) {
			
			System.out.println("Vehicle 1 is Faster having speed "+vehicle1.getSpeed()+"km/h");


		}//if

		else{

			System.out.println("Vehicle 4 is Faster having speed "+vehicle4.getSpeed()+"km/h");

		}

	}//main


}//main