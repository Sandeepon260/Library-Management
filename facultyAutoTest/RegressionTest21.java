package facultyAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str12 = facultyClient4.type;
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str14 = facultyClient13.getRole();
        items.Textbook textbook15 = null;
        facultyClient13.update(textbook15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.getType();
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        facultyClient1.type = "Faculty";
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.type;
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.getRole();
        java.lang.String str10 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.type;
        java.lang.String str14 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient14.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        facultyClient8.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient8);
        java.lang.String str12 = facultyClient8.getType();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient8);
        java.lang.String str14 = facultyClient8.getRole();
        login.Course course15 = null;
        facultyClient8.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient14.type;
        java.lang.String str16 = facultyClient14.type;
        java.lang.String str17 = facultyClient14.getType();
        java.lang.String str18 = facultyClient14.getRole();
        java.util.Set<login.Course> courseSet19 = facultyClient14.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        java.lang.String str24 = facultyClient1.getType();
        login.Course course25 = null;
        facultyClient1.assignCourse(course25);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        java.lang.String str13 = facultyClient1.type;
        java.lang.String str14 = facultyClient1.getType();
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getRole();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook19 = null;
        facultyClient18.update(textbook19);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient18);
        login.Course course22 = null;
        facultyClient18.assignCourse(course22);
        login.FacultyClient facultyClient24 = new login.FacultyClient((login.Client) facultyClient18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        facultyClient1.type = "hi!";
        java.lang.String str11 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient10.type = "";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        java.util.Set<login.Course> courseSet14 = facultyClient13.getCourses();
        java.util.Set<login.Course> courseSet15 = facultyClient13.getCourses();
        java.lang.String str16 = facultyClient13.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.getType();
        java.lang.String str12 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        java.lang.String str10 = facultyClient5.getRole();
        java.lang.String str11 = facultyClient5.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str13 = facultyClient5.type;
        java.lang.String str14 = facultyClient5.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str8 = facultyClient1.getType();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient13.type = "hi!";
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient3.getRole();
        java.lang.String str9 = facultyClient3.getType();
        items.Textbook textbook10 = null;
        facultyClient3.update(textbook10);
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        java.lang.String str14 = facultyClient3.type;
        java.lang.String str15 = facultyClient3.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.String str13 = facultyClient4.getType();
        java.lang.String str14 = facultyClient4.getType();
        java.lang.String str15 = facultyClient4.getType();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook17 = null;
        facultyClient16.update(textbook17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient16);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient16);
        items.Textbook textbook21 = null;
        facultyClient16.update(textbook21);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getRole();
        java.lang.String str10 = facultyClient4.getType();
        java.lang.String str11 = facultyClient4.getType();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient10.type = "Faculty";
        java.lang.String str13 = facultyClient10.getType();
        items.Textbook textbook14 = null;
        facultyClient10.update(textbook14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.lang.String str8 = facultyClient4.getRole();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.Class<?> wildcardClass13 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient3.getRole();
        items.Textbook textbook9 = null;
        facultyClient3.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient11.type = "Faculty";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        facultyClient14.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.type;
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str21 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook8 = null;
        facultyClient3.update(textbook8);
        login.Course course10 = null;
        facultyClient3.assignCourse(course10);
        java.util.Set<login.Course> courseSet12 = facultyClient3.getCourses();
        facultyClient3.type = "Faculty";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient15.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getType();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        java.lang.String str19 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str22 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        java.lang.String str15 = facultyClient14.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient16);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient17.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        facultyClient3.type = "";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        facultyClient1.type = "";
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        java.lang.String str21 = facultyClient1.type;
        java.lang.String str22 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        java.lang.String str6 = facultyClient1.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient1.update(textbook5);
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getRole();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        java.lang.String str22 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient5.update(textbook6);
        facultyClient5.type = "hi!";
        facultyClient5.type = "hi!";
        java.lang.String str12 = facultyClient5.getType();
        facultyClient5.type = "Faculty";
        java.lang.String str15 = facultyClient5.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient16);
        java.lang.String str18 = facultyClient17.getRole();
        java.util.Set<login.Course> courseSet19 = facultyClient17.getCourses();
        login.Course course20 = null;
        facultyClient17.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient7.type;
        java.lang.String str9 = facultyClient7.getType();
        facultyClient7.type = "hi!";
        facultyClient7.type = "";
        java.lang.String str14 = facultyClient7.getRole();
        java.lang.String str15 = facultyClient7.getRole();
        java.lang.String str16 = facultyClient7.type;
        java.lang.String str17 = facultyClient7.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.type;
        java.lang.String str11 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "";
        java.lang.String str15 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getRole();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook13 = null;
        facultyClient12.update(textbook13);
        java.lang.String str15 = facultyClient12.getType();
        facultyClient12.type = "Faculty";
        login.Course course18 = null;
        facultyClient12.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.type;
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.lang.String str11 = facultyClient1.getType();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.type;
        java.lang.String str11 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient12.type;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        java.lang.String str21 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient4.type = "Faculty";
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient4.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.getType();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        facultyClient1.type = "";
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient15.type = "Faculty";
        facultyClient15.type = "";
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str21 = facultyClient15.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        facultyClient3.type = "hi!";
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        facultyClient3.type = "";
        java.lang.String str15 = facultyClient3.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        java.util.Set<login.Course> courseSet19 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        java.lang.String str13 = facultyClient4.getRole();
        java.lang.Class<?> wildcardClass14 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "";
        facultyClient1.type = "hi!";
        java.lang.String str17 = facultyClient1.getType();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient17.type;
        java.lang.String str19 = facultyClient17.getType();
        login.Course course20 = null;
        facultyClient17.assignCourse(course20);
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str17 = facultyClient16.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.type;
        java.lang.String str8 = facultyClient6.type;
        java.lang.String str9 = facultyClient6.type;
        java.util.Set<login.Course> courseSet10 = facultyClient6.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.type;
        java.lang.String str10 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient12.getType();
        login.Course course14 = null;
        facultyClient12.assignCourse(course14);
        java.lang.String str16 = facultyClient12.getRole();
        java.lang.Class<?> wildcardClass17 = facultyClient12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet10 = facultyClient9.getCourses();
        facultyClient9.type = "";
        items.Textbook textbook13 = null;
        facultyClient9.update(textbook13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getType();
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient15.getType();
        facultyClient15.type = "";
        facultyClient15.type = "Faculty";
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient15);
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient15);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient15.register("Faculty", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str11 = facultyClient10.getType();
        login.Course course12 = null;
        facultyClient10.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient10.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient9.type = "";
        java.lang.Class<?> wildcardClass12 = facultyClient9.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        items.Textbook textbook11 = null;
        facultyClient5.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient5.update(textbook13);
        items.Textbook textbook15 = null;
        facultyClient5.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str8 = facultyClient4.getRole();
        java.lang.String str9 = facultyClient4.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient10.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient15.getRole();
        items.Textbook textbook17 = null;
        facultyClient15.update(textbook17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str20 = facultyClient19.getRole();
        login.Course course21 = null;
        facultyClient19.assignCourse(course21);
        java.lang.String str23 = facultyClient19.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet21 = facultyClient20.getCourses();
        items.Textbook textbook22 = null;
        facultyClient20.update(textbook22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.type;
        facultyClient1.type = "hi!";
        java.lang.String str13 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient3.getRole();
        java.lang.String str9 = facultyClient3.getType();
        java.lang.String str10 = facultyClient3.type;
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str14 = facultyClient3.getType();
        java.util.Set<login.Course> courseSet15 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        java.lang.String str14 = facultyClient3.getType();
        items.Textbook textbook15 = null;
        facultyClient3.update(textbook15);
        login.Course course17 = null;
        facultyClient3.assignCourse(course17);
        java.util.Set<login.Course> courseSet19 = facultyClient3.getCourses();
        java.lang.String str20 = facultyClient3.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient1.update(textbook5);
        facultyClient1.type = "hi!";
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getRole();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        java.lang.String str13 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        facultyClient1.type = "";
        java.lang.String str18 = facultyClient1.getType();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient19.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        facultyClient5.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient5);
        items.Textbook textbook12 = null;
        facultyClient5.update(textbook12);
        java.util.Set<login.Course> courseSet14 = facultyClient5.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "";
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass19 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient16);
        java.util.Set<login.Course> courseSet18 = facultyClient16.getCourses();
        java.util.Set<login.Course> courseSet19 = facultyClient16.getCourses();
        java.util.Set<login.Course> courseSet20 = facultyClient16.getCourses();
        login.Course course21 = null;
        facultyClient16.assignCourse(course21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        java.lang.String str17 = facultyClient1.getRole();
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient4.type = "Faculty";
        java.lang.String str12 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getType();
        facultyClient4.type = "Faculty";
        java.lang.String str10 = facultyClient4.getRole();
        facultyClient4.type = "";
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str16 = facultyClient15.getRole();
        java.lang.String str17 = facultyClient15.getType();
        items.Textbook textbook18 = null;
        facultyClient15.update(textbook18);
        login.Course course20 = null;
        facultyClient15.assignCourse(course20);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course12 = null;
        facultyClient11.assignCourse(course12);
        login.Course course14 = null;
        facultyClient11.assignCourse(course14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient11);
        facultyClient11.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient9);
        java.util.Set<login.Course> courseSet12 = facultyClient9.getCourses();
        java.lang.String str13 = facultyClient9.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        login.Course course15 = null;
        facultyClient9.assignCourse(course15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.String str18 = facultyClient9.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient1.getRole();
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        java.lang.String str19 = facultyClient1.type;
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        java.lang.String str22 = facultyClient1.getRole();
        login.Course course23 = null;
        facultyClient1.assignCourse(course23);
        java.lang.String str25 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str28 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient5.assignCourse(course6);
        items.Textbook textbook8 = null;
        facultyClient5.update(textbook8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.String str14 = facultyClient1.type;
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet10 = facultyClient9.getCourses();
        login.Course course11 = null;
        facultyClient9.assignCourse(course11);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.type;
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        java.lang.Class<?> wildcardClass11 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getType();
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        facultyClient1.type = "";
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        java.util.Set<login.Course> courseSet22 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet23 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet24 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertNotNull(courseSet23);
        org.junit.Assert.assertNotNull(courseSet24);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.lang.String str11 = facultyClient4.getType();
        java.lang.String str12 = facultyClient4.type;
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        java.util.Set<login.Course> courseSet17 = facultyClient4.getCourses();
        login.Course course18 = null;
        facultyClient4.assignCourse(course18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        java.util.Set<login.Course> courseSet14 = facultyClient10.getCourses();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient7.type;
        java.lang.String str9 = facultyClient7.getType();
        java.lang.String str10 = facultyClient7.type;
        java.lang.String str11 = facultyClient7.type;
        login.Course course12 = null;
        facultyClient7.assignCourse(course12);
        items.Textbook textbook14 = null;
        facultyClient7.update(textbook14);
        java.lang.String str16 = facultyClient7.type;
        java.util.Set<login.Course> courseSet17 = facultyClient7.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("hi!", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient5.getType();
        java.util.Set<login.Course> courseSet7 = facultyClient5.getCourses();
        items.Textbook textbook8 = null;
        facultyClient5.update(textbook8);
        facultyClient5.type = "";
        java.lang.String str12 = facultyClient5.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str19 = facultyClient18.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        facultyClient4.type = "Faculty";
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        java.lang.String str14 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass13 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getRole();
        java.lang.String str17 = facultyClient1.getType();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.lang.String str20 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str16 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        java.lang.String str13 = facultyClient1.getRole();
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getRole();
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet6 = facultyClient5.getCourses();
        items.Textbook textbook7 = null;
        facultyClient5.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient5.getCourses();
        java.lang.String str10 = facultyClient5.getRole();
        java.lang.String str11 = facultyClient5.getType();
        java.lang.String str12 = facultyClient5.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet13 = facultyClient12.getCourses();
        java.lang.String str14 = facultyClient12.type;
        java.util.Set<login.Course> courseSet15 = facultyClient12.getCourses();
        login.Course course16 = null;
        facultyClient12.assignCourse(course16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str19 = facultyClient12.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str8 = facultyClient7.getType();
        login.Course course9 = null;
        facultyClient7.assignCourse(course9);
        java.util.Set<login.Course> courseSet11 = facultyClient7.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str13 = facultyClient10.getType();
        java.lang.String str14 = facultyClient10.type;
        facultyClient10.type = "hi!";
        login.Course course17 = null;
        facultyClient10.assignCourse(course17);
        facultyClient10.type = "";
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet13 = facultyClient12.getCourses();
        login.Course course14 = null;
        facultyClient12.assignCourse(course14);
        facultyClient12.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        login.Course course9 = null;
        facultyClient3.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str13 = facultyClient12.getType();
        java.lang.String str14 = facultyClient12.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        java.lang.String str15 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        facultyClient1.type = "Faculty";
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str19 = facultyClient18.getRole();
        java.lang.String str20 = facultyClient18.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        facultyClient1.type = "";
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course6 = null;
        facultyClient5.assignCourse(course6);
        java.lang.String str8 = facultyClient5.getType();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str10 = facultyClient5.getRole();
        java.lang.String str11 = facultyClient5.getRole();
        java.lang.String str12 = facultyClient5.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getType();
        java.lang.String str10 = facultyClient4.getRole();
        java.lang.String str11 = facultyClient4.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.getType();
        java.lang.String str13 = facultyClient11.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        facultyClient11.type = "hi!";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient11);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient15);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient17);
        java.lang.String str19 = facultyClient17.type;
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient17);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient20);
        java.lang.Class<?> wildcardClass22 = facultyClient21.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.type;
        java.lang.String str11 = facultyClient1.getType();
        java.lang.String str12 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.type;
        java.lang.String str16 = facultyClient1.getType();
        java.lang.String str17 = facultyClient1.getRole();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.lang.String str20 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str9 = facultyClient8.getType();
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        login.Course course12 = null;
        facultyClient8.assignCourse(course12);
        java.lang.String str14 = facultyClient8.getRole();
        java.lang.String str15 = facultyClient8.type;
        java.lang.String str16 = facultyClient8.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str13 = facultyClient10.getType();
        java.lang.String str14 = facultyClient10.type;
        facultyClient10.type = "hi!";
        items.Textbook textbook17 = null;
        facultyClient10.update(textbook17);
        login.Course course19 = null;
        facultyClient10.assignCourse(course19);
        java.util.Set<login.Course> courseSet21 = facultyClient10.getCourses();
        login.Course course22 = null;
        facultyClient10.assignCourse(course22);
        items.Textbook textbook24 = null;
        facultyClient10.update(textbook24);
        items.Textbook textbook26 = null;
        facultyClient10.update(textbook26);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getRole();
        java.lang.String str10 = facultyClient4.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        items.Textbook textbook13 = null;
        facultyClient11.update(textbook13);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.lang.String str8 = facultyClient4.type;
        java.util.Set<login.Course> courseSet9 = facultyClient4.getCourses();
        java.lang.String str10 = facultyClient4.getRole();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        facultyClient4.type = "Faculty";
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        java.lang.String str7 = facultyClient1.getRole();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        java.lang.String str3 = facultyClient1.type;
        java.lang.String str4 = facultyClient1.type;
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.type;
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        facultyClient1.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient13.type;
        java.util.Set<login.Course> courseSet15 = facultyClient13.getCourses();
        java.lang.String str16 = facultyClient13.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("hi!", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient3.getRole();
        java.lang.String str9 = facultyClient3.getType();
        items.Textbook textbook10 = null;
        facultyClient3.update(textbook10);
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        facultyClient3.type = "hi!";
        java.lang.String str16 = facultyClient3.getType();
        items.Textbook textbook17 = null;
        facultyClient3.update(textbook17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        facultyClient3.type = "hi!";
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet8 = facultyClient3.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.type;
        facultyClient1.type = "hi!";
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.getType();
        java.lang.String str13 = facultyClient11.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.Class<?> wildcardClass17 = facultyClient14.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.lang.String str8 = facultyClient4.getRole();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        facultyClient4.type = "";
        java.lang.String str13 = facultyClient4.getType();
        java.lang.String str14 = facultyClient4.getRole();
        java.lang.String str15 = facultyClient4.type;
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        items.Textbook textbook18 = null;
        facultyClient4.update(textbook18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        facultyClient1.type = "";
        java.lang.String str10 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.Class<?> wildcardClass11 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient4.type = "Faculty";
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        java.lang.String str9 = facultyClient4.type;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course20 = null;
        facultyClient19.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getRole();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook19 = null;
        facultyClient18.update(textbook19);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient18);
        login.Course course22 = null;
        facultyClient18.assignCourse(course22);
        java.lang.String str24 = facultyClient18.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        java.lang.String str15 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str7 = facultyClient4.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str9 = facultyClient8.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.type;
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        items.Textbook textbook11 = null;
        facultyClient5.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient5.update(textbook13);
        java.lang.Class<?> wildcardClass15 = facultyClient5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.lang.String str17 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str20 = facultyClient1.getType();
        items.Textbook textbook21 = null;
        facultyClient1.update(textbook21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str15 = facultyClient1.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.lang.String str11 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet17 = facultyClient16.getCourses();
        java.lang.String str18 = facultyClient16.getType();
        java.lang.String str19 = facultyClient16.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient16.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient7.type = "";
        facultyClient7.type = "";
        java.util.Set<login.Course> courseSet12 = facultyClient7.getCourses();
        items.Textbook textbook13 = null;
        facultyClient7.update(textbook13);
        login.Course course15 = null;
        facultyClient7.assignCourse(course15);
        java.lang.Class<?> wildcardClass17 = facultyClient7.getClass();
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.type;
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        java.lang.String str12 = facultyClient4.getType();
        facultyClient4.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet6 = facultyClient5.getCourses();
        items.Textbook textbook7 = null;
        facultyClient5.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient5.getCourses();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet9 = facultyClient8.getCourses();
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        java.lang.String str12 = facultyClient8.type;
        login.Course course13 = null;
        facultyClient8.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient8.update(textbook15);
        facultyClient8.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook8 = null;
        facultyClient7.update(textbook8);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.getType();
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        java.util.Set<login.Course> courseSet21 = facultyClient1.getCourses();
        java.lang.String str22 = facultyClient1.getRole();
        java.lang.String str23 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.lang.String str13 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        facultyClient4.type = "hi!";
        facultyClient4.type = "hi!";
        items.Textbook textbook18 = null;
        facultyClient4.update(textbook18);
        items.Textbook textbook20 = null;
        facultyClient4.update(textbook20);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        java.lang.String str9 = facultyClient3.type;
        items.Textbook textbook10 = null;
        facultyClient3.update(textbook10);
        java.lang.String str12 = facultyClient3.getType();
        items.Textbook textbook13 = null;
        facultyClient3.update(textbook13);
        login.Course course15 = null;
        facultyClient3.assignCourse(course15);
        login.Course course17 = null;
        facultyClient3.assignCourse(course17);
        java.lang.String str19 = facultyClient3.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        facultyClient3.type = "hi!";
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet8 = facultyClient3.getCourses();
        items.Textbook textbook9 = null;
        facultyClient3.update(textbook9);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient13.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.type;
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        java.util.Set<login.Course> courseSet6 = facultyClient1.getCourses();
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        items.Textbook textbook14 = null;
        facultyClient10.update(textbook14);
        java.lang.String str16 = facultyClient10.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient1.type;
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient5.update(textbook6);
        facultyClient5.type = "hi!";
        facultyClient5.type = "";
        items.Textbook textbook12 = null;
        facultyClient5.update(textbook12);
        facultyClient5.type = "hi!";
        java.lang.String str16 = facultyClient5.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        java.lang.String str8 = facultyClient4.getType();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        facultyClient4.type = "";
        facultyClient4.type = "Faculty";
        java.lang.String str15 = facultyClient4.getRole();
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        java.util.Set<login.Course> courseSet18 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.type;
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.type;
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        facultyClient1.type = "Faculty";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.type;
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.type;
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.getRole();
        java.lang.String str8 = facultyClient6.type;
        java.util.Set<login.Course> courseSet9 = facultyClient6.getCourses();
        items.Textbook textbook10 = null;
        facultyClient6.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient6);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str16 = facultyClient12.getType();
        java.lang.String str17 = facultyClient12.getRole();
        java.util.Set<login.Course> courseSet18 = facultyClient12.getCourses();
        java.util.Set<login.Course> courseSet19 = facultyClient12.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient9);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient12.update(textbook15);
        java.lang.String str17 = facultyClient12.getRole();
        login.Course course18 = null;
        facultyClient12.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getType();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        facultyClient1.type = "";
        items.Textbook textbook22 = null;
        facultyClient1.update(textbook22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.getType();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.getType();
        java.lang.String str14 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str11 = facultyClient10.type;
        java.lang.String str12 = facultyClient10.type;
        java.lang.String str13 = facultyClient10.getRole();
        java.lang.String str14 = facultyClient10.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        items.Textbook textbook16 = null;
        facultyClient15.update(textbook16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        java.util.Set<login.Course> courseSet12 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet13 = facultyClient3.getCourses();
        items.Textbook textbook14 = null;
        facultyClient3.update(textbook14);
        java.util.Set<login.Course> courseSet16 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet17 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getType();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient20.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getRole();
        java.lang.String str12 = facultyClient1.getType();
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.getType();
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.lang.String str19 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient14.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.Class<?> wildcardClass11 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient7.getType();
        java.lang.String str9 = facultyClient7.getRole();
        java.lang.String str10 = facultyClient7.type;
        java.util.Set<login.Course> courseSet11 = facultyClient7.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str13 = facultyClient12.type;
        java.lang.Class<?> wildcardClass14 = facultyClient12.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient5.update(textbook6);
        login.Course course8 = null;
        facultyClient5.assignCourse(course8);
        java.lang.String str10 = facultyClient5.getRole();
        java.util.Set<login.Course> courseSet11 = facultyClient5.getCourses();
        login.Course course12 = null;
        facultyClient5.assignCourse(course12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        facultyClient1.type = "Faculty";
        facultyClient1.type = "";
        java.lang.String str17 = facultyClient1.type;
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.lang.String str20 = facultyClient1.getType();
        login.Course course21 = null;
        facultyClient1.assignCourse(course21);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        java.lang.String str12 = facultyClient9.type;
        java.lang.String str13 = facultyClient9.type;
        items.Textbook textbook14 = null;
        facultyClient9.update(textbook14);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getType();
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str18 = facultyClient1.type;
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient1.update(textbook5);
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str11 = facultyClient10.getRole();
        facultyClient10.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient10.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        java.lang.String str19 = facultyClient1.type;
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook21 = null;
        facultyClient1.update(textbook21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        java.util.Set<login.Course> courseSet14 = facultyClient3.getCourses();
        java.lang.String str15 = facultyClient3.getType();
        facultyClient3.type = "";
        items.Textbook textbook18 = null;
        facultyClient3.update(textbook18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.lang.String str6 = facultyClient4.type;
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str10 = facultyClient4.getRole();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str11 = facultyClient10.type;
        java.lang.String str12 = facultyClient10.getType();
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        java.lang.String str15 = facultyClient10.getType();
        items.Textbook textbook16 = null;
        facultyClient10.update(textbook16);
        login.Course course18 = null;
        facultyClient10.assignCourse(course18);
        java.lang.String str20 = facultyClient10.getType();
        java.lang.Class<?> wildcardClass21 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        java.lang.String str14 = facultyClient3.type;
        java.util.Set<login.Course> courseSet15 = facultyClient3.getCourses();
        facultyClient3.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str13 = facultyClient11.type;
        java.lang.String str14 = facultyClient11.type;
        login.Course course15 = null;
        facultyClient11.assignCourse(course15);
        java.lang.String str17 = facultyClient11.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str11 = facultyClient10.type;
        java.lang.String str12 = facultyClient10.getType();
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        java.lang.String str15 = facultyClient10.getType();
        java.lang.String str16 = facultyClient10.getType();
        java.lang.Class<?> wildcardClass17 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.lang.String str9 = facultyClient3.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str12 = facultyClient10.type;
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        java.lang.String str15 = facultyClient10.getRole();
        java.lang.String str16 = facultyClient10.type;
        java.lang.String str17 = facultyClient10.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str20 = facultyClient19.getRole();
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient19);
        java.lang.String str22 = facultyClient21.getRole();
        login.FacultyClient facultyClient23 = new login.FacultyClient((login.Client) facultyClient21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        java.util.Set<login.Course> courseSet14 = facultyClient13.getCourses();
        java.lang.String str15 = facultyClient13.type;
        facultyClient13.type = "Faculty";
        login.Course course18 = null;
        facultyClient13.assignCourse(course18);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet13 = facultyClient12.getCourses();
        java.lang.String str14 = facultyClient12.type;
        java.util.Set<login.Course> courseSet15 = facultyClient12.getCourses();
        login.Course course16 = null;
        facultyClient12.assignCourse(course16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient12);
        login.Course course19 = null;
        facultyClient12.assignCourse(course19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.String str14 = facultyClient1.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient15.getType();
        java.lang.String str17 = facultyClient15.getRole();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str19 = facultyClient15.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        facultyClient5.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str9 = facultyClient8.getType();
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        login.Course course12 = null;
        facultyClient8.assignCourse(course12);
        java.lang.String str14 = facultyClient8.getRole();
        login.Course course15 = null;
        facultyClient8.assignCourse(course15);
        java.lang.String str17 = facultyClient8.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        java.lang.String str10 = facultyClient4.type;
        java.lang.String str11 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.lang.Class<?> wildcardClass14 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet6 = facultyClient5.getCourses();
        items.Textbook textbook7 = null;
        facultyClient5.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient5.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient5.getCourses();
        login.Course course11 = null;
        facultyClient5.assignCourse(course11);
        java.util.Set<login.Course> courseSet13 = facultyClient5.getCourses();
        java.lang.String str14 = facultyClient5.getType();
        facultyClient5.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        facultyClient1.type = "";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient15.getRole();
        items.Textbook textbook17 = null;
        facultyClient15.update(textbook17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient15);
        login.Course course20 = null;
        facultyClient19.assignCourse(course20);
        items.Textbook textbook22 = null;
        facultyClient19.update(textbook22);
        login.Course course24 = null;
        facultyClient19.assignCourse(course24);
        login.FacultyClient facultyClient26 = new login.FacultyClient((login.Client) facultyClient19);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient26.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        facultyClient8.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient8);
        java.lang.String str12 = facultyClient8.getType();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient8);
        facultyClient13.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient13.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.getType();
        java.lang.String str17 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        java.lang.String str12 = facultyClient4.type;
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str14 = facultyClient4.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient7.getType();
        java.lang.String str9 = facultyClient7.getRole();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient7);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        facultyClient11.type = "";
        java.util.Set<login.Course> courseSet15 = facultyClient11.getCourses();
        java.util.Set<login.Course> courseSet16 = facultyClient11.getCourses();
        login.Course course17 = null;
        facultyClient11.assignCourse(course17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getRole();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook13 = null;
        facultyClient12.update(textbook13);
        java.lang.String str15 = facultyClient12.getRole();
        java.lang.String str16 = facultyClient12.getType();
        java.lang.String str17 = facultyClient12.type;
        login.Course course18 = null;
        facultyClient12.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str11 = facultyClient10.type;
        java.util.Set<login.Course> courseSet12 = facultyClient10.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        java.lang.String str9 = facultyClient4.type;
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        java.lang.String str12 = facultyClient4.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str14 = facultyClient13.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        java.lang.String str10 = facultyClient5.getRole();
        java.lang.String str11 = facultyClient5.getRole();
        items.Textbook textbook12 = null;
        facultyClient5.update(textbook12);
        java.lang.String str14 = facultyClient5.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        facultyClient4.type = "";
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str12 = facultyClient11.getType();
        facultyClient11.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        java.lang.String str12 = facultyClient4.getType();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course14 = null;
        facultyClient13.assignCourse(course14);
        facultyClient13.type = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass21 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getType();
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        facultyClient1.type = "";
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        java.lang.String str12 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.lang.String str13 = facultyClient1.getType();
        java.lang.String str14 = facultyClient1.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        facultyClient1.type = "Faculty";
        java.lang.String str20 = facultyClient1.type;
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient11.type = "";
        java.lang.String str14 = facultyClient11.getType();
        java.lang.String str15 = facultyClient11.getRole();
        java.lang.String str16 = facultyClient11.type;
        items.Textbook textbook17 = null;
        facultyClient11.update(textbook17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        java.lang.String str15 = facultyClient13.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient5.update(textbook6);
        login.Course course8 = null;
        facultyClient5.assignCourse(course8);
        java.lang.String str10 = facultyClient5.getRole();
        java.util.Set<login.Course> courseSet11 = facultyClient5.getCourses();
        java.lang.String str12 = facultyClient5.getType();
        java.lang.String str13 = facultyClient5.getType();
        java.lang.String str14 = facultyClient5.getType();
        items.Textbook textbook15 = null;
        facultyClient5.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        facultyClient3.type = "hi!";
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        facultyClient3.type = "";
        java.lang.String str15 = facultyClient3.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str17 = facultyClient3.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        facultyClient4.type = "";
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient13.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course8 = null;
        facultyClient7.assignCourse(course8);
        login.Course course10 = null;
        facultyClient7.assignCourse(course10);
        java.lang.String str12 = facultyClient7.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.type;
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getRole();
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient13.type;
        java.util.Set<login.Course> courseSet15 = facultyClient13.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient16.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        facultyClient7.type = "Faculty";
        java.lang.String str11 = facultyClient7.getRole();
        facultyClient7.type = "Faculty";
        facultyClient7.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient7.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str10 = facultyClient7.getRole();
        login.Course course11 = null;
        facultyClient7.assignCourse(course11);
        java.lang.String str13 = facultyClient7.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str15 = facultyClient14.getType();
        facultyClient14.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.type;
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        facultyClient3.type = "Faculty";
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.lang.String str9 = facultyClient3.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str11 = facultyClient10.getRole();
        java.util.Set<login.Course> courseSet12 = facultyClient10.getCourses();
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        java.lang.Class<?> wildcardClass15 = facultyClient10.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.String str14 = facultyClient1.getType();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getRole();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str11 = facultyClient1.getRole();
        java.lang.String str12 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        java.lang.String str6 = facultyClient1.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.getType();
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course14 = null;
        facultyClient13.assignCourse(course14);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        login.Course course6 = null;
        facultyClient4.assignCourse(course6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str11 = facultyClient10.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str19 = facultyClient1.getRole();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet21 = facultyClient20.getCourses();
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient20);
        login.FacultyClient facultyClient23 = new login.FacultyClient((login.Client) facultyClient20);
        items.Textbook textbook24 = null;
        facultyClient20.update(textbook24);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient20.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        facultyClient5.type = "Faculty";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str13 = facultyClient12.type;
        login.Course course14 = null;
        facultyClient12.assignCourse(course14);
        items.Textbook textbook16 = null;
        facultyClient12.update(textbook16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient12);
        facultyClient12.type = "hi!";
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str17 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.lang.String str17 = facultyClient1.type;
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient1.getType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        java.util.Set<login.Course> courseSet12 = facultyClient3.getCourses();
        login.Course course13 = null;
        facultyClient3.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str16 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet17 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet18 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        java.lang.Class<?> wildcardClass12 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.type;
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        facultyClient1.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient14.type;
        java.lang.String str16 = facultyClient14.type;
        facultyClient14.type = "";
        login.Course course19 = null;
        facultyClient14.assignCourse(course19);
        java.lang.String str21 = facultyClient14.getType();
        java.lang.String str22 = facultyClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient5.getType();
        java.util.Set<login.Course> courseSet7 = facultyClient5.getCourses();
        java.lang.String str8 = facultyClient5.getType();
        java.lang.String str9 = facultyClient5.type;
        java.lang.String str10 = facultyClient5.getType();
        java.lang.String str11 = facultyClient5.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("hi!", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient13.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient13);
        java.lang.String str16 = facultyClient13.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient10.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.Class<?> wildcardClass16 = facultyClient10.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        java.lang.String str13 = facultyClient4.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        facultyClient4.type = "";
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str12 = facultyClient11.getType();
        java.lang.String str13 = facultyClient11.type;
        login.Course course14 = null;
        facultyClient11.assignCourse(course14);
        java.lang.String str16 = facultyClient11.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient7);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getType();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        java.lang.String str21 = facultyClient1.getRole();
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course23 = null;
        facultyClient22.assignCourse(course23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.type;
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass12 = courseSet11.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.getType();
        java.lang.String str17 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.String str13 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet14 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        java.lang.String str16 = facultyClient4.getType();
        java.lang.String str17 = facultyClient4.type;
        java.lang.String str18 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient9);
        java.util.Set<login.Course> courseSet12 = facultyClient9.getCourses();
        java.lang.String str13 = facultyClient9.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        login.Course course15 = null;
        facultyClient9.assignCourse(course15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient9);
        login.Course course18 = null;
        facultyClient9.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str13 = facultyClient12.getRole();
        java.lang.String str14 = facultyClient12.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str16 = facultyClient12.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.getType();
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "Faculty";
        java.lang.String str15 = facultyClient1.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient12.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient12);
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        java.lang.String str16 = facultyClient14.getRole();
        java.lang.String str17 = facultyClient14.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet10 = facultyClient9.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient9);
        facultyClient9.type = "";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.String str15 = facultyClient14.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook13 = null;
        facultyClient12.update(textbook13);
        java.lang.String str15 = facultyClient12.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet10 = facultyClient9.getCourses();
        java.lang.String str11 = facultyClient9.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient9);
        facultyClient12.type = "hi!";
        items.Textbook textbook15 = null;
        facultyClient12.update(textbook15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook13 = null;
        facultyClient12.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient12);
        facultyClient12.type = "";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str11 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.getRole();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.type;
        java.lang.String str8 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.type;
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient8.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.getType();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet6 = facultyClient1.getCourses();
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient9.type = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getType();
        facultyClient1.type = "";
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.String str13 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet14 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        facultyClient4.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str10 = facultyClient9.getRole();
        login.Course course11 = null;
        facultyClient9.assignCourse(course11);
        java.lang.String str13 = facultyClient9.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient1.update(textbook5);
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass12 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient12.type = "Faculty";
        java.lang.String str15 = facultyClient12.getType();
        login.Course course16 = null;
        facultyClient12.assignCourse(course16);
        java.lang.String str18 = facultyClient12.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        facultyClient11.type = "";
        java.lang.String str15 = facultyClient11.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        java.lang.String str8 = facultyClient4.getType();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        java.lang.String str13 = facultyClient4.getRole();
        java.lang.String str14 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        java.lang.String str17 = facultyClient4.getType();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook13 = null;
        facultyClient12.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient12);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("Faculty", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        facultyClient4.type = "";
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        java.lang.String str11 = facultyClient4.getRole();
        java.lang.String str12 = facultyClient4.type;
        java.lang.String str13 = facultyClient4.getRole();
        java.lang.String str14 = facultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        facultyClient3.type = "hi!";
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str12 = facultyClient4.type;
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course14 = null;
        facultyClient4.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course8 = null;
        facultyClient7.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient7);
        items.Textbook textbook11 = null;
        facultyClient7.update(textbook11);
        login.Course course13 = null;
        facultyClient7.assignCourse(course13);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getType();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet21 = facultyClient20.getCourses();
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient20);
        java.util.Set<login.Course> courseSet23 = facultyClient22.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertNotNull(courseSet23);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str8 = facultyClient4.getRole();
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        facultyClient4.type = "";
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient4.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        java.util.Set<login.Course> courseSet13 = facultyClient10.getCourses();
        items.Textbook textbook14 = null;
        facultyClient10.update(textbook14);
        java.lang.String str16 = facultyClient10.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient10);
        items.Textbook textbook18 = null;
        facultyClient17.update(textbook18);
        java.util.Set<login.Course> courseSet20 = facultyClient17.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.lang.String str9 = facultyClient3.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str12 = facultyClient10.type;
        facultyClient10.type = "Faculty";
        java.lang.String str15 = facultyClient10.getType();
        facultyClient10.type = "Faculty";
        java.lang.String str18 = facultyClient10.getRole();
        java.lang.String str19 = facultyClient10.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.getRole();
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getType();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course19 = null;
        facultyClient18.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str12 = facultyClient3.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        java.lang.String str19 = facultyClient1.type;
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet21 = facultyClient20.getCourses();
        facultyClient20.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.getType();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course12 = null;
        facultyClient11.assignCourse(course12);
        items.Textbook textbook14 = null;
        facultyClient11.update(textbook14);
        items.Textbook textbook16 = null;
        facultyClient11.update(textbook16);
        java.lang.String str18 = facultyClient11.type;
        java.util.Set<login.Course> courseSet19 = facultyClient11.getCourses();
        items.Textbook textbook20 = null;
        facultyClient11.update(textbook20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.lang.String str9 = facultyClient3.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str11 = facultyClient10.getRole();
        java.util.Set<login.Course> courseSet12 = facultyClient10.getCourses();
        java.lang.String str13 = facultyClient10.type;
        java.lang.String str14 = facultyClient10.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getType();
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str18 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.getType();
        java.lang.String str13 = facultyClient1.getRole();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str19 = facultyClient1.getRole();
        java.lang.String str20 = facultyClient1.type;
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient15.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.String str6 = facultyClient1.getRole();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.lang.String str11 = facultyClient1.getType();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.type;
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        facultyClient1.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.lang.String str12 = facultyClient1.getRole();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        java.lang.String str8 = facultyClient4.getType();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        java.lang.String str13 = facultyClient4.getRole();
        login.Course course14 = null;
        facultyClient4.assignCourse(course14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet17 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet18 = facultyClient4.getCourses();
        java.lang.String str19 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.lang.Class<?> wildcardClass22 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        java.lang.String str14 = facultyClient3.getType();
        items.Textbook textbook15 = null;
        facultyClient3.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet18 = facultyClient3.getCourses();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet20 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet21 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        items.Textbook textbook21 = null;
        facultyClient1.update(textbook21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient7.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str10 = facultyClient7.getRole();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str12 = facultyClient11.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str14 = facultyClient13.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.getRole();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.type;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getType();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        java.lang.String str21 = facultyClient1.getRole();
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet23 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertNotNull(courseSet23);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getType();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.lang.String str17 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        login.Course course9 = null;
        facultyClient7.assignCourse(course9);
        java.lang.String str11 = facultyClient7.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient7);
        facultyClient7.type = "Faculty";
        java.lang.String str15 = facultyClient7.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet14 = facultyClient4.getCourses();
        java.lang.String str15 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.lang.Class<?> wildcardClass20 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient15.type = "Faculty";
        items.Textbook textbook18 = null;
        facultyClient15.update(textbook18);
        java.util.Set<login.Course> courseSet20 = facultyClient15.getCourses();
        java.util.Set<login.Course> courseSet21 = facultyClient15.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str11 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient12.getRole();
        java.util.Set<login.Course> courseSet14 = facultyClient12.getCourses();
        java.lang.String str15 = facultyClient12.type;
        java.lang.String str16 = facultyClient12.getRole();
        java.lang.String str17 = facultyClient12.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.String str13 = facultyClient4.getType();
        java.lang.String str14 = facultyClient4.getType();
        java.lang.String str15 = facultyClient4.getType();
        java.lang.String str16 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.lang.String str19 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.String str6 = facultyClient1.getRole();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook8 = null;
        facultyClient7.update(textbook8);
        login.Course course10 = null;
        facultyClient7.assignCourse(course10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient15.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        login.Course course21 = null;
        facultyClient1.assignCourse(course21);
        java.util.Set<login.Course> courseSet23 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet23);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        java.lang.String str9 = facultyClient7.type;
        java.lang.String str10 = facultyClient7.type;
        java.lang.String str11 = facultyClient7.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient7);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet9 = facultyClient8.getCourses();
        login.Course course10 = null;
        facultyClient8.assignCourse(course10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient1.update(textbook5);
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient9);
        facultyClient10.type = "Faculty";
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str16 = facultyClient10.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.type;
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getType();
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient9);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient12.update(textbook15);
        java.lang.String str17 = facultyClient12.getType();
        facultyClient12.type = "";
        java.lang.String str20 = facultyClient12.type;
        login.Course course21 = null;
        facultyClient12.assignCourse(course21);
        login.Course course23 = null;
        facultyClient12.assignCourse(course23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getType();
        java.lang.String str12 = facultyClient1.type;
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        java.lang.String str15 = facultyClient1.type;
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str8 = facultyClient4.getRole();
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        facultyClient4.type = "";
        java.lang.String str15 = facultyClient4.type;
        java.lang.String str16 = facultyClient4.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient9);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        items.Textbook textbook14 = null;
        facultyClient13.update(textbook14);
        items.Textbook textbook16 = null;
        facultyClient13.update(textbook16);
        items.Textbook textbook18 = null;
        facultyClient13.update(textbook18);
        java.lang.String str20 = facultyClient13.getRole();
        java.lang.String str21 = facultyClient13.type;
        facultyClient13.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet13 = facultyClient12.getCourses();
        java.lang.String str14 = facultyClient12.type;
        java.util.Set<login.Course> courseSet15 = facultyClient12.getCourses();
        login.Course course16 = null;
        facultyClient12.assignCourse(course16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient12);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient12);
        login.Course course20 = null;
        facultyClient19.assignCourse(course20);
        items.Textbook textbook22 = null;
        facultyClient19.update(textbook22);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.lang.String str9 = facultyClient3.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str11 = facultyClient3.getRole();
        facultyClient3.type = "hi!";
        items.Textbook textbook14 = null;
        facultyClient3.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.lang.String str22 = facultyClient1.getType();
        login.Course course23 = null;
        facultyClient1.assignCourse(course23);
        java.lang.String str25 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        java.lang.String str11 = facultyClient4.type;
        java.lang.String str12 = facultyClient4.getType();
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        facultyClient4.type = "Faculty";
        items.Textbook textbook17 = null;
        facultyClient4.update(textbook17);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        facultyClient1.type = "";
        facultyClient1.type = "";
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient21);
        java.lang.String str23 = facultyClient22.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient22.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient12.type = "Faculty";
        java.lang.String str15 = facultyClient12.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getRole();
        java.lang.String str12 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.getRole();
        java.lang.String str16 = facultyClient1.getRole();
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str19 = facultyClient1.getRole();
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        login.Course course22 = null;
        facultyClient1.assignCourse(course22);
        java.util.Set<login.Course> courseSet24 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet24);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.type;
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.type;
        java.lang.Class<?> wildcardClass13 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.type;
        login.Course course13 = null;
        facultyClient11.assignCourse(course13);
        java.lang.String str15 = facultyClient11.type;
        facultyClient11.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        java.lang.String str14 = facultyClient4.getType();
        facultyClient4.type = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        items.Textbook textbook21 = null;
        facultyClient1.update(textbook21);
        java.util.Set<login.Course> courseSet23 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet24 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertNotNull(courseSet23);
        org.junit.Assert.assertNotNull(courseSet24);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        java.lang.String str18 = facultyClient1.getType();
        java.lang.Class<?> wildcardClass19 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet9 = facultyClient8.getCourses();
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient8.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getRole();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        facultyClient1.type = "Faculty";
        java.lang.String str24 = facultyClient1.getType();
        java.lang.String str25 = facultyClient1.getRole();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass11 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        facultyClient3.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.type;
        facultyClient4.type = "";
        java.lang.String str9 = facultyClient4.getType();
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        java.lang.String str12 = facultyClient4.type;
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        facultyClient1.type = "";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient1.getType();
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.lang.String str19 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.type;
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.getRole();
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.getRole();
        java.lang.String str19 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.lang.String str20 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.type;
        java.lang.String str11 = facultyClient1.getType();
        java.lang.String str12 = facultyClient1.type;
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.lang.String str11 = facultyClient1.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet13 = facultyClient12.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        java.lang.String str14 = facultyClient3.getType();
        items.Textbook textbook15 = null;
        facultyClient3.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str18 = facultyClient3.getType();
        facultyClient3.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str10 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet11 = facultyClient3.getCourses();
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course15 = null;
        facultyClient3.assignCourse(course15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        facultyClient1.type = "hi!";
        java.lang.String str14 = facultyClient1.type;
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.lang.String str12 = facultyClient1.type;
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.lang.String str9 = facultyClient3.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str12 = facultyClient10.type;
        java.lang.String str13 = facultyClient10.type;
        java.lang.String str14 = facultyClient10.type;
        java.util.Set<login.Course> courseSet15 = facultyClient10.getCourses();
        java.lang.String str16 = facultyClient10.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.type;
        java.lang.String str19 = facultyClient1.getRole();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet6 = facultyClient1.getCourses();
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient8);
        java.lang.String str10 = facultyClient9.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        facultyClient1.type = "";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        facultyClient1.type = "";
        facultyClient1.type = "hi!";
        java.lang.String str17 = facultyClient1.type;
        java.lang.String str18 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        facultyClient3.type = "Faculty";
        java.lang.Class<?> wildcardClass11 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getRole();
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.lang.String str18 = facultyClient1.type;
        java.lang.Class<?> wildcardClass19 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        facultyClient4.type = "hi!";
        java.lang.String str12 = facultyClient4.getRole();
        facultyClient4.type = "";
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        java.lang.String str12 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        login.Course course14 = null;
        facultyClient4.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        facultyClient10.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient10.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        java.lang.String str12 = facultyClient9.type;
        java.lang.String str13 = facultyClient9.type;
        items.Textbook textbook14 = null;
        facultyClient9.update(textbook14);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet6 = facultyClient5.getCourses();
        items.Textbook textbook7 = null;
        facultyClient5.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient5.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient5.getCourses();
        login.Course course11 = null;
        facultyClient5.assignCourse(course11);
        java.util.Set<login.Course> courseSet13 = facultyClient5.getCourses();
        java.lang.String str14 = facultyClient5.getRole();
        login.Course course15 = null;
        facultyClient5.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str15 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        facultyClient1.type = "hi!";
        java.lang.String str22 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str10 = facultyClient9.getRole();
        java.lang.String str11 = facultyClient9.type;
        java.lang.String str12 = facultyClient9.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient14);
        login.Course course16 = null;
        facultyClient14.assignCourse(course16);
        java.lang.String str18 = facultyClient14.getRole();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.String str20 = facultyClient19.getType();
        facultyClient19.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient5.update(textbook6);
        java.lang.String str8 = facultyClient5.type;
        items.Textbook textbook9 = null;
        facultyClient5.update(textbook9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.getRole();
        java.lang.String str8 = facultyClient6.type;
        java.util.Set<login.Course> courseSet9 = facultyClient6.getCourses();
        items.Textbook textbook10 = null;
        facultyClient6.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient6);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str14 = facultyClient12.getRole();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient12);
        java.util.Set<login.Course> courseSet16 = facultyClient12.getCourses();
        java.lang.Class<?> wildcardClass17 = facultyClient12.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.getType();
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.type;
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.lang.String str8 = facultyClient4.getRole();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        facultyClient4.type = "";
        java.lang.String str13 = facultyClient4.getType();
        java.lang.String str14 = facultyClient4.getRole();
        java.lang.String str15 = facultyClient4.getRole();
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        login.Course course18 = null;
        facultyClient4.assignCourse(course18);
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet22 = facultyClient4.getCourses();
        java.lang.String str23 = facultyClient4.getType();
        java.lang.String str24 = facultyClient4.getType();
        login.Course course25 = null;
        facultyClient4.assignCourse(course25);
        java.util.Set<login.Course> courseSet27 = facultyClient4.getCourses();
        items.Textbook textbook28 = null;
        facultyClient4.update(textbook28);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(courseSet27);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        java.lang.String str7 = facultyClient1.getRole();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        facultyClient12.type = "hi!";
        java.lang.String str16 = facultyClient12.type;
        java.lang.String str17 = facultyClient12.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        java.lang.String str12 = facultyClient4.getType();
        java.lang.String str13 = facultyClient4.type;
        java.lang.String str14 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getRole();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        java.lang.String str9 = facultyClient3.type;
        items.Textbook textbook10 = null;
        facultyClient3.update(textbook10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        java.lang.String str14 = facultyClient4.getRole();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.lang.String str9 = facultyClient3.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient3.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course15 = null;
        facultyClient3.assignCourse(course15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient11.type = "";
        java.lang.String str14 = facultyClient11.type;
        items.Textbook textbook15 = null;
        facultyClient11.update(textbook15);
        java.util.Set<login.Course> courseSet17 = facultyClient11.getCourses();
        facultyClient11.type = "Faculty";
        items.Textbook textbook20 = null;
        facultyClient11.update(textbook20);
        login.Course course22 = null;
        facultyClient11.assignCourse(course22);
        facultyClient11.type = "";
        login.FacultyClient facultyClient26 = new login.FacultyClient((login.Client) facultyClient11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.lang.String str9 = facultyClient1.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str17 = facultyClient16.getRole();
        items.Textbook textbook18 = null;
        facultyClient16.update(textbook18);
        java.lang.String str20 = facultyClient16.getRole();
        java.util.Set<login.Course> courseSet21 = facultyClient16.getCourses();
        java.lang.String str22 = facultyClient16.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        login.Course course16 = null;
        facultyClient14.assignCourse(course16);
        items.Textbook textbook18 = null;
        facultyClient14.update(textbook18);
        java.lang.String str20 = facultyClient14.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.getRole();
        java.lang.String str8 = facultyClient6.type;
        java.lang.String str9 = facultyClient6.type;
        java.util.Set<login.Course> courseSet10 = facultyClient6.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient6);
        java.lang.String str12 = facultyClient6.getRole();
        facultyClient6.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient18.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient19);
        java.lang.String str21 = facultyClient20.type;
        java.lang.String str22 = facultyClient20.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getRole();
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        facultyClient4.type = "";
        java.lang.String str14 = facultyClient4.getRole();
        java.lang.String str15 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet16 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        java.lang.String str10 = facultyClient5.getType();
        facultyClient5.type = "";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient5);
        facultyClient5.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.String str16 = facultyClient14.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient14);
        facultyClient14.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        java.lang.String str10 = facultyClient4.type;
        java.lang.String str11 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        facultyClient4.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        java.lang.String str3 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet4 = facultyClient1.getCourses();
        java.lang.String str5 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(courseSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.type;
        login.Course course13 = null;
        facultyClient11.assignCourse(course13);
        java.lang.String str15 = facultyClient11.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient11);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient16);
        facultyClient16.type = "hi!";
        java.lang.String str20 = facultyClient16.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient11);
        login.Course course14 = null;
        facultyClient11.assignCourse(course14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str17 = facultyClient11.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        java.lang.String str9 = facultyClient3.type;
        java.lang.String str10 = facultyClient3.getType();
        java.lang.String str11 = facultyClient3.getRole();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient12.update(textbook15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.lang.String str8 = facultyClient4.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str10 = facultyClient9.getRole();
        java.lang.Class<?> wildcardClass11 = facultyClient9.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        java.lang.String str10 = facultyClient4.type;
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        java.lang.Class<?> wildcardClass13 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        java.lang.String str14 = facultyClient3.getType();
        items.Textbook textbook15 = null;
        facultyClient3.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet18 = facultyClient3.getCourses();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.Class<?> wildcardClass20 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet8 = facultyClient3.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        facultyClient9.type = "hi!";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        java.lang.String str8 = facultyClient4.getType();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient4.type = "hi!";
        facultyClient4.type = "Faculty";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.type;
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.type;
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet6 = facultyClient1.getCourses();
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.getType();
        java.lang.String str9 = facultyClient1.type;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.lang.String str9 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getRole();
        java.lang.String str13 = facultyClient1.type;
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.type;
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient9.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.getRole();
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        items.Textbook textbook8 = null;
        facultyClient3.update(textbook8);
        java.lang.String str10 = facultyClient3.getType();
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("hi!", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.String str13 = facultyClient4.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.String str16 = facultyClient14.type;
        facultyClient14.type = "Faculty";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.String str20 = facultyClient14.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        login.Course course2 = null;
        facultyClient1.assignCourse(course2);
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.String str6 = facultyClient1.type;
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook10 = null;
        facultyClient9.update(textbook10);
        facultyClient9.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        facultyClient4.type = "";
        java.lang.String str9 = facultyClient4.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient9);
        java.util.Set<login.Course> courseSet12 = facultyClient9.getCourses();
        java.lang.String str13 = facultyClient9.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        java.lang.String str9 = facultyClient7.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getType();
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.getRole();
        items.Textbook textbook7 = null;
        facultyClient5.update(textbook7);
        java.lang.String str9 = facultyClient5.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient5.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        facultyClient4.type = "";
        java.util.Set<login.Course> courseSet9 = facultyClient4.getCourses();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str11 = facultyClient4.getRole();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str13 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str15 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        java.lang.String str18 = facultyClient1.type;
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course22 = null;
        facultyClient1.assignCourse(course22);
        java.lang.String str24 = facultyClient1.getRole();
        login.Course course25 = null;
        facultyClient1.assignCourse(course25);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        java.util.Set<login.Course> courseSet14 = facultyClient11.getCourses();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.type;
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.lang.String str17 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass19 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course11 = null;
        facultyClient10.assignCourse(course11);
        items.Textbook textbook13 = null;
        facultyClient10.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        login.Course course16 = null;
        facultyClient10.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient9);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str14 = facultyClient13.getRole();
        java.lang.String str15 = facultyClient13.type;
        items.Textbook textbook16 = null;
        facultyClient13.update(textbook16);
        java.util.Set<login.Course> courseSet18 = facultyClient13.getCourses();
        facultyClient13.type = "Faculty";
        facultyClient13.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        java.lang.String str11 = facultyClient1.type;
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.type;
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.String str14 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        facultyClient4.type = "";
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str13 = facultyClient4.getRole();
        java.lang.String str14 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        java.lang.String str9 = facultyClient4.type;
        java.lang.String str10 = facultyClient4.type;
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        facultyClient4.type = "hi!";
        java.lang.String str15 = facultyClient4.getType();
        java.lang.String str16 = facultyClient4.getRole();
        java.lang.String str17 = facultyClient4.type;
        java.lang.String str18 = facultyClient4.type;
        java.lang.String str19 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        items.Textbook textbook21 = null;
        facultyClient1.update(textbook21);
        java.util.Set<login.Course> courseSet23 = facultyClient1.getCourses();
        login.FacultyClient facultyClient24 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertNotNull(courseSet23);
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        java.lang.String str11 = facultyClient4.type;
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.type;
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        facultyClient1.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.type;
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        java.lang.String str15 = facultyClient12.type;
        java.lang.String str16 = facultyClient12.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getType();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        java.lang.String str19 = facultyClient1.getRole();
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient10.type = "";
        java.lang.String str13 = facultyClient10.type;
        items.Textbook textbook14 = null;
        facultyClient10.update(textbook14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str17 = facultyClient10.type;
        login.Course course18 = null;
        facultyClient10.assignCourse(course18);
        facultyClient10.type = "Faculty";
        java.util.Set<login.Course> courseSet22 = facultyClient10.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(courseSet22);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        java.lang.String str12 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient15.type = "Faculty";
        java.lang.String str18 = facultyClient15.getType();
        login.Course course19 = null;
        facultyClient15.assignCourse(course19);
        java.lang.String str21 = facultyClient15.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str13 = facultyClient10.getType();
        java.lang.String str14 = facultyClient10.type;
        facultyClient10.type = "hi!";
        login.Course course17 = null;
        facultyClient10.assignCourse(course17);
        java.lang.String str19 = facultyClient10.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        java.lang.String str10 = facultyClient5.getRole();
        java.lang.String str11 = facultyClient5.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str13 = facultyClient5.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str12 = facultyClient11.type;
        java.lang.String str13 = facultyClient11.type;
        items.Textbook textbook14 = null;
        facultyClient11.update(textbook14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient11.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getRole();
        java.lang.String str12 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook20 = null;
        facultyClient19.update(textbook20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str11 = facultyClient4.type;
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        java.lang.String str14 = facultyClient4.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        facultyClient1.type = "Faculty";
        java.lang.String str15 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.lang.String str11 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient9);
        java.util.Set<login.Course> courseSet12 = facultyClient9.getCourses();
        java.lang.String str13 = facultyClient9.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient9);
        items.Textbook textbook16 = null;
        facultyClient9.update(textbook16);
        java.lang.Class<?> wildcardClass18 = facultyClient9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getType();
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.type;
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient13.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient13);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.lang.String str13 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getType();
        facultyClient4.type = "Faculty";
        java.lang.String str10 = facultyClient4.getRole();
        facultyClient4.type = "";
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook16 = null;
        facultyClient4.update(textbook16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str19 = facultyClient18.getType();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        java.lang.String str14 = facultyClient3.getRole();
        java.lang.String str15 = facultyClient3.getRole();
        java.lang.String str16 = facultyClient3.getRole();
        java.lang.String str17 = facultyClient3.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        java.lang.String str8 = facultyClient4.getType();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient4.type = "hi!";
        java.lang.String str14 = facultyClient4.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet16 = facultyClient15.getCourses();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        java.lang.String str9 = facultyClient4.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str11 = facultyClient10.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getRole();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient8);
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }
}

