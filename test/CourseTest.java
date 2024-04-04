package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import items.Textbook;
import login.BasicClient;
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
    @Test
    void testAddMultipleTextbooks() {
        Textbook textbook1 = new Textbook("Data Structures", 1);
        Textbook textbook2 = new Textbook("Computer Networks", 2);
        course.addTextbook(textbook1);
        course.addTextbook(textbook2);
        assertEquals(2, course.getTextbooks().size());
    }
    @Test
    void testAddMultipleFaculties() {
        FacultyClient faculty1 = new FacultyClient(faculty);
        FacultyClient faculty2 = new FacultyClient(faculty);
        course.addFaculty(faculty1);
        course.addFaculty(faculty2);
        assertEquals(2, course.getFaculties().size());
    }
    @Test
    void testAddSameTextbookTwice() {
        course.addTextbook(textbook);
        course.addTextbook(textbook);
        assertEquals(1, course.getTextbooks().size(), "Textbook should not be added twice");
    }
    @Test
    void testAddSameFacultyTwice() {
    	BasicClient client = new BasicClient();
        FacultyClient faculty = new FacultyClient(client);
        course.addFaculty(faculty);
        course.addFaculty(faculty); 
        assertEquals(1, course.getFaculties().size(), "Faculty should not be added twice");
    }
    @Test
    void testAddDifferentTextbooksSameName() {
        Textbook textbook1 = new Textbook("Introduction to Algorithms", 1);
        course.addTextbook(textbook);
        course.addTextbook(textbook1);
        assertEquals(2, course.getTextbooks().size(), "Both textbooks, even with the same name, should be added.");
    }




}
