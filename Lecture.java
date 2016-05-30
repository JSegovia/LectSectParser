public class Lecture{
	
	String name;
	String days;
	String time;
	String occupancy;	
	String location;
	

	Lecture(String name, String lectureDays, String lectTime, String location, String occupancy){
		
		this.name = name;
		this.days = lectureDays;
		this.time = lectTime;
		this.location = location;
		this.occupancy = occupancy;
		
	}
	
	String getName(){
		return this.name;
	}
	String getDays(){
		return this.days;
	}
	String getTime(){
		return this.time;
	}
	String getLocation(){
		return this.location;
	}
	String getOcc(){
		return this.occupancy;
	}

}
