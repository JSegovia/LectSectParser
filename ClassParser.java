import java.util.ArrayList;



public class ClassParser {
	
	static ArrayList<Lecture> lectures = new ArrayList<Lecture>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	public static void main(String[] args) {
		UCSBCurriculumSearch curriculum = new UCSBCurriculumSearch();
		ArrayList<String> courses = curriculum.loadCourses();
		
		parse(courses);
	}
	
	
	static void parse(ArrayList<String> courses){
		
		
		Lecture newCourse;
		
		int index = 1; //Start at Anth 2
		String currentLect = courses.get(index); //set to Anth 2
		String lectDays;
		String lectTimes;
		String lectLocation;
		String lectOcc;
		String sectDays;
		String sectTimes;
		String sectLocation;
		String sectOcc;
		Boolean isSect = false;
		
		
		for(int i = 0; i < courses.size(); i++){
			if(isSect == false){
				lectDays = courses.get(index+5);
				lectTimes = courses.get(index+6);
				lectLocation = courses.get(index+7);
				lectOcc = courses.get(index+8);
				
				newCourse = new Lecture(currentLect,lectDays, lectTimes, lectLocation, lectOcc);
				lectures.add(newCourse);
				
				
				if(index+11 < courses.size()){
					if(courses.get(index+11).equals(currentLect)){
						isSect = true;
					}
					else{						
						currentLect = courses.get(index+11);
					}
					index = index+11;
				}
				
			}
			else{
				sectDays = courses.get(index+5);
				sectTimes = courses.get(index+6);
				sectLocation = courses.get(index+7);
				sectOcc = courses.get(index+8);
				
				Section newSection = new Section(currentLect, sectDays, sectTimes, sectLocation, sectOcc);
				sections.add(newSection); 
				
				if(index+11 < courses.size()){
					if(!(courses.get(index+11).equals(currentLect))){
						isSect = false;
						currentLect = courses.get(index+11);
					}
				
					index = index+11;
				}
			}
		}
	}
	

}
