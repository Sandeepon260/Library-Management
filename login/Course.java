package login;

import java.util.ArrayList;
import java.util.List;

import items.Textbook;


public class Course {
    private String courseId;
    private List<Textbook> textbooks = new ArrayList<>();
    private List<FacultyClient> faculties = new ArrayList<>();

    public Course(String courseId) {
        this.courseId = courseId;
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }
    
    public void addFaculty(FacultyClient faculty) {
        faculties.add(faculty);
    }

    public String getCourseId() { return courseId; }
    public List<Textbook> getTextbooks() { return textbooks; }
    public List<FacultyClient> getFaculties() { return faculties; }
}

