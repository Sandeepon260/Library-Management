package login;

import java.util.ArrayList;
import java.util.List;

import items.Textbook;

/*
 * course is a class that has the basic information of a class and the management can add textbooks and faculties to it so it can be retrived 
 * by the faculty and students
 */
public class Course {
    private String courseId;
    private List<Textbook> textbooks = new ArrayList<>();
    private List<FacultyClient> faculties = new ArrayList<>();

    public Course(String courseId) {
        this.courseId = courseId;
    }

    public void addTextbook(Textbook textbook) {
        if (!textbooks.contains(textbook)) {
            textbooks.add(textbook);
        }
    }

    
    public void addFaculty(FacultyClient faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }


    public String getCourseId() { return courseId; }
    public List<Textbook> getTextbooks() { return textbooks; }
    public List<FacultyClient> getFaculties() { return faculties; }
}

