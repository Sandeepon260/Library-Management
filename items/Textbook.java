package items;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import login.Course;
import login.FacultyClient;

public class Textbook {
    private String title;
    private int edition;
    private Set<FacultyClient> observers = new HashSet<>();

    public Textbook(String title, int edition) {
        this.title = title;
        this.edition = edition;
    }
    
    @Override
    public String toString() {
        return this.title;
    }

    public void addObserver(FacultyClient faculty) {
        observers.add(faculty);
    }

    public void removeObserver(FacultyClient faculty) {
        observers.remove(faculty);
    }

    public void setEdition(int newEdition) {
        if (this.edition < newEdition) {
            this.edition = newEdition;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (FacultyClient observer : observers) {
            observer.update(this);
        }
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getEdition() { return edition; }

}



class CourseManagementSystem {
    private Map<String, Course> courses = new HashMap<>();

    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    public Course getCourse(String courseId) {
        return courses.get(courseId);
    }

    public void updateTextbookEdition(String title, int newEdition) {
        for (Course course : courses.values()) {
            for (Textbook textbook : course.getTextbooks()) {
                if (textbook.getTitle().equals(title)) {
                    textbook.setEdition(newEdition);
                }
            }
        }
    }
}