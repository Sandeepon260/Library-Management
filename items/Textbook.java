package items;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Textbook {
    private String title;
    private int edition;
    private Set<Faculty> observers = new HashSet<>();

    public Textbook(String title, int edition) {
        this.title = title;
        this.edition = edition;
    }

    public void addObserver(Faculty faculty) {
        observers.add(faculty);
    }

    public void removeObserver(Faculty faculty) {
        observers.remove(faculty);
    }

    public void setEdition(int newEdition) {
        if (this.edition < newEdition) {
            this.edition = newEdition;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Faculty observer : observers) {
            observer.update(this);
        }
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public int getEdition() { return edition; }

}

class Faculty {
    private String name;
    private Set<Course> courses = new HashSet<>();

    public Faculty(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        courses.add(course);
    }

    public void update(Textbook textbook) {
        System.out.println("Faculty " + name + " notified about new edition of textbook: " + textbook.getTitle() + ", Edition: " + textbook.getEdition());
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Set<Course> getCourses() { return courses; }
}

class Course {
    private String courseId;
    private List<Textbook> textbooks = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public Course(String courseId) {
        this.courseId = courseId;
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }
    
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getCourseId() { return courseId; }
    public List<Textbook> getTextbooks() { return textbooks; }
    public List<Faculty> getFaculties() { return faculties; }
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