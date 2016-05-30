public class Section{
	
	String lectName;
	String day;
	String time;
	String occupancy;
	String location;
	
	Section(String lectName, String day, String time, String location, String occupancy){
		this.lectName = lectName;
		this.day = day;
		this.time = time;
		this.location = location;
		this.occupancy = occupancy;
		
	}
	String getLectName(){
		return this.lectName;
	}
	String getDays(){
		return this.day;
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
