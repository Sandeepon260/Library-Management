package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import items.Textbook;
import login.Course;
import login.FacultyClient;

class CourseTest {
    private Course course;
    private Textbook textbook;
    private FacultyClient faculty;

    @BeforeEach
    void setUp() {
        course = new Course("CS101");
        textbook = new Textbook("Introduction to Algorithms", 0);
        
    }

    @Test
    void testAddTextbook() {
        course.addTextbook(textbook);
        List<Textbook> textbooks = course.getTextbooks();
        assertTrue(textbooks.contains(textbook));
    }

    @Test
    void testAddFaculty() {
        course.addFaculty(faculty);
        List<FacultyClient> faculties = course.getFaculties();
        assertTrue(faculties.contains(faculty));
    }

    @Test
    void testGetCourseId() {
        assertEquals("CS101", course.getCourseId());
    }

    @Test
    void testGetTextbooks() {
        course.addTextbook(textbook);
        assertEquals(1, course.getTextbooks().size());
    }

    @Test
    void testGetFaculties() {
        course.addFaculty(faculty);
        assertEquals(1, course.getFaculties().size());
    }
}
