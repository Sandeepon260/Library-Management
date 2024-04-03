package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import items.Textbook;
import login.BasicClient;
import login.Client;
import login.Course;
import login.FacultyClient;

class FacultyClientTest {
    private FacultyClient faculty;
    private Client decoratedClient;
    private Course course;
    private Textbook textbook;

    @BeforeEach
    void setUp() {
        decoratedClient = new BasicClient(); 
        faculty = new FacultyClient(decoratedClient);
        course = new Course("CS101");
        textbook = new Textbook("Introduction to Algorithms", 2);
    }

    @Test
    void testAssignCourse() {
        faculty.assignCourse(course);
        Set<Course> courses = faculty.getCourses();
        assertTrue(courses.contains(course));
    }

    @Test
    void testGetCourses() {
        faculty.assignCourse(course);
        assertEquals(1, faculty.getCourses().size());
    }

    @Test
    void testRegister() {
        faculty.register("faculty@example.com", "password", "role");
    }

    @Test
    void testUpdate() {
        faculty.update(textbook);
    }
}
