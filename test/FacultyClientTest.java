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
    @Test
    void testAssignMultipleCourses() {
        Course course1 = new Course("CS102");
        faculty.assignCourse(course);
        faculty.assignCourse(course1);
        assertEquals(2, faculty.getCourses().size(), "Faculty should have 2 courses assigned.");
    }
    @Test
    void testAssignSameCourseTwice() {
        faculty.assignCourse(course);
        faculty.assignCourse(course);
        assertEquals(1, faculty.getCourses().size(), "Assigning the same course twice should not increase the set size.");
    }
    @Test
    void testRegisterOverridesRole() {
        faculty.register("faculty2@example.com", "password", "Admin");
        assertEquals("Faculty", faculty.getRole(), "Faculty registration should override role to 'Faculty'.");
    }
    @Test
    void testAssignDifferentCourse() {
        Course anotherCourse = new Course("EECS3311");
        faculty.assignCourse(course);
        faculty.assignCourse(anotherCourse);
        assertTrue(faculty.getCourses().contains(anotherCourse), "Faculty should have the newly assigned course.");
    }
    @Test
    void testCourseAssignmentIncreasesSize() {
        int initialSize = faculty.getCourses().size();
        faculty.assignCourse(course);
        assertEquals(initialSize + 1, faculty.getCourses().size(), "Assigning a new course should increase the courses size by 1.");
    }
    @Test
    void testInitialCoursesEmpty() {
        assertTrue(faculty.getCourses().isEmpty(), "Newly created FacultyClient should have no courses assigned.");
    }
    @Test
    void testAssignCourseDoesNotAcceptDuplicates() {
        faculty.assignCourse(course);
        faculty.assignCourse(course);
        assertEquals(1, faculty.getCourses().size(), "Duplicate courses should not be added.");
    }





    


}
