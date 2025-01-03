package login;

import java.util.HashSet;
import java.util.Set;

import items.Textbook;

/*
 * FacultyClient extends the clientDecorator class and has functionalites specific to the faculty client within itself. when the decorator recieves this faculty client, 
 * the type of the user is set to faculty
 */

public class FacultyClient extends ClientDecorator {
	public String type; 
	private Set<Course> courses = new HashSet<>();
	
    public FacultyClient(Client decoratedClient) {
        super(decoratedClient);
        
    }

    @Override
    public void register(String email, String password, String role) {
        super.register(email, password,"Faculty");
        System.out.println("Faculty registration needs further validation.");
    }
    
    public void assignCourse(Course course) {
        courses.add(course);
    }

    public Set<Course> getCourses() {
        return courses;
    }

	public void update(Textbook textbook) {
		
	}

	public String getRole() {
		return "Faculty";
	}
    

}