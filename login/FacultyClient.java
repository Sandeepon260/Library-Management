package login;

import java.util.HashSet;
import java.util.Set;

import items.Textbook;

//@author: Mehregan Mesgari

public class FacultyClient extends ClientDecorator {
	protected String type; 
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
		// TODO Auto-generated method stub
		
		
	}
}