package facultyAutoTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
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
        java.lang.String str11 = facultyClient4.getType();
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
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
        java.lang.String str14 = facultyClient9.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
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
        java.lang.String str13 = facultyClient1.getType();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.type;
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
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
        java.lang.String str13 = facultyClient1.getRole();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str17 = facultyClient1.type;
        facultyClient1.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
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
        java.lang.String str13 = facultyClient9.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
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
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.lang.String str18 = facultyClient1.getRole();
        java.lang.String str19 = facultyClient1.type;
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
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
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "";
        facultyClient1.type = "";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient12.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.lang.String str18 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        facultyClient1.type = "";
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
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
        java.lang.String str12 = facultyClient5.getType();
        items.Textbook textbook13 = null;
        facultyClient5.update(textbook13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
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
        java.lang.String str11 = facultyClient3.getRole();
        java.lang.String str12 = facultyClient3.getType();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient3);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
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
        items.Textbook textbook14 = null;
        facultyClient13.update(textbook14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient13);
        java.lang.String str17 = facultyClient13.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getRole();
        java.lang.String str18 = facultyClient1.getRole();
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        java.lang.String str21 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str12 = facultyClient11.getType();
        java.lang.String str13 = facultyClient11.getRole();
        java.lang.String str14 = facultyClient11.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
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
        java.lang.String str11 = facultyClient4.getRole();
        java.lang.String str12 = facultyClient4.getType();
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        java.lang.String str15 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
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
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
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
        java.lang.String str12 = facultyClient7.getType();
        java.lang.String str13 = facultyClient7.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("", "hi!", "Faculty");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
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
        items.Textbook textbook19 = null;
        facultyClient14.update(textbook19);
        facultyClient14.type = "";
        login.Course course23 = null;
        facultyClient14.assignCourse(course23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
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
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str21 = facultyClient1.type;
        java.lang.String str22 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        java.lang.String str10 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        java.lang.String str14 = facultyClient4.getType();
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
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
        java.lang.String str18 = facultyClient1.type;
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.type;
        facultyClient1.type = "";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.String str14 = facultyClient1.type;
        java.lang.String str15 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
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
        java.lang.String str13 = facultyClient5.getType();
        java.lang.String str14 = facultyClient5.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
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
        java.lang.String str11 = facultyClient1.getType();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
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
        login.Course course22 = null;
        facultyClient1.assignCourse(course22);
        facultyClient1.type = "";
        java.lang.String str26 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
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
        java.lang.String str13 = facultyClient1.getType();
        java.lang.String str14 = facultyClient1.type;
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
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
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        java.lang.Class<?> wildcardClass22 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.String str20 = facultyClient14.getType();
        facultyClient14.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
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
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.getType();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
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
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str19 = facultyClient18.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        facultyClient4.type = "";
        java.lang.String str10 = facultyClient4.type;
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str13 = facultyClient4.type;
        java.lang.Class<?> wildcardClass14 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
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
        java.lang.String str11 = facultyClient4.getRole();
        java.lang.String str12 = facultyClient4.getType();
        java.lang.String str13 = facultyClient4.type;
        java.lang.String str14 = facultyClient4.getType();
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
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
        java.lang.Class<?> wildcardClass12 = facultyClient9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient1.update(textbook5);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient9);
        items.Textbook textbook11 = null;
        facultyClient9.update(textbook11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        login.Course course2 = null;
        facultyClient1.assignCourse(course2);
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.type;
        java.lang.String str8 = facultyClient6.getType();
        login.Course course9 = null;
        facultyClient6.assignCourse(course9);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
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
        java.util.Set<login.Course> courseSet15 = facultyClient3.getCourses();
        java.lang.String str16 = facultyClient3.type;
        java.util.Set<login.Course> courseSet17 = facultyClient3.getCourses();
        items.Textbook textbook18 = null;
        facultyClient3.update(textbook18);
        java.lang.String str20 = facultyClient3.type;
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str22 = facultyClient21.getType();
        java.lang.String str23 = facultyClient21.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
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
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        java.util.Set<login.Course> courseSet16 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        java.util.Set<login.Course> courseSet9 = facultyClient7.getCourses();
        java.lang.String str10 = facultyClient7.type;
        java.lang.String str11 = facultyClient7.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.getRole();
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        facultyClient1.type = "Faculty";
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        facultyClient1.type = "";
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        java.util.Set<login.Course> courseSet22 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet22);
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
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
        java.lang.String str13 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
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
        facultyClient4.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        java.util.Set<login.Course> courseSet14 = facultyClient11.getCourses();
        java.lang.String str15 = facultyClient11.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
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
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        facultyClient11.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
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
        java.lang.String str13 = facultyClient3.getRole();
        login.Course course14 = null;
        facultyClient3.assignCourse(course14);
        items.Textbook textbook16 = null;
        facultyClient3.update(textbook16);
        java.lang.String str18 = facultyClient3.getType();
        items.Textbook textbook19 = null;
        facultyClient3.update(textbook19);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
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
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        java.lang.String str16 = facultyClient4.type;
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str18 = facultyClient4.type;
        items.Textbook textbook19 = null;
        facultyClient4.update(textbook19);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
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
        java.lang.String str11 = facultyClient1.getType();
        java.lang.String str12 = facultyClient1.type;
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
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
        java.lang.String str20 = facultyClient3.getRole();
        java.lang.String str21 = facultyClient3.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
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
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient10.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
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
        login.Course course22 = null;
        facultyClient20.assignCourse(course22);
        java.lang.String str24 = facultyClient20.type;
        java.lang.String str25 = facultyClient20.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = facultyClient20.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient9.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        facultyClient1.type = "hi!";
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.type;
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient17.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
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
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        facultyClient1.type = "hi!";
        login.Course course24 = null;
        facultyClient1.assignCourse(course24);
        login.Course course26 = null;
        facultyClient1.assignCourse(course26);
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        java.lang.String str14 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.type;
        java.lang.String str11 = facultyClient1.getRole();
        java.lang.String str12 = facultyClient1.getRole();
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
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getRole();
        facultyClient4.type = "";
        java.lang.String str12 = facultyClient4.type;
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
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
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        items.Textbook textbook22 = null;
        facultyClient1.update(textbook22);
        items.Textbook textbook24 = null;
        facultyClient1.update(textbook24);
        login.FacultyClient facultyClient26 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
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
        java.util.Set<login.Course> courseSet15 = facultyClient7.getCourses();
        java.util.Set<login.Course> courseSet16 = facultyClient7.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        login.Course course6 = null;
        facultyClient4.assignCourse(course6);
        java.lang.String str8 = facultyClient4.getRole();
        java.lang.String str9 = facultyClient4.getType();
        facultyClient4.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        java.lang.String str3 = facultyClient1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
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
        facultyClient5.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
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
        java.lang.String str19 = facultyClient1.getRole();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet21 = facultyClient20.getCourses();
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
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
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str14 = facultyClient10.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        facultyClient4.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
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
        java.lang.String str21 = facultyClient1.getType();
        java.lang.Class<?> wildcardClass22 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
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
        java.lang.String str15 = facultyClient1.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient19);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient19.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
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
        java.lang.String str11 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
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
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
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
        java.lang.String str15 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
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
        java.lang.String str13 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
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
        java.lang.String str13 = facultyClient1.type;
        java.lang.String str14 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
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
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
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
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
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
        java.lang.String str11 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getType();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
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
        java.lang.String str21 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
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
        facultyClient5.type = "hi!";
        java.lang.String str15 = facultyClient5.getType();
        java.util.Set<login.Course> courseSet16 = facultyClient5.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.getRole();
        java.lang.String str10 = facultyClient1.getType();
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.lang.String str13 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
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
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.getType();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        facultyClient1.type = "";
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient16.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "hi!");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        facultyClient3.type = "hi!";
        java.lang.String str9 = facultyClient3.getRole();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course11 = null;
        facultyClient10.assignCourse(course11);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
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
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        facultyClient1.type = "";
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        items.Textbook textbook22 = null;
        facultyClient1.update(textbook22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
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
        java.lang.String str11 = facultyClient1.getType();
        java.lang.String str12 = facultyClient1.getType();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
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
        java.lang.String str10 = facultyClient9.getType();
        facultyClient9.type = "Faculty";
        login.Course course13 = null;
        facultyClient9.assignCourse(course13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
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
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.lang.String str18 = facultyClient1.getRole();
        java.lang.String str19 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
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
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet9 = facultyClient3.getCourses();
        login.Course course10 = null;
        facultyClient3.assignCourse(course10);
        java.lang.String str12 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet13 = facultyClient3.getCourses();
        items.Textbook textbook14 = null;
        facultyClient3.update(textbook14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str17 = facultyClient3.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
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
        java.lang.String str12 = facultyClient10.getRole();
        java.lang.String str13 = facultyClient10.getRole();
        java.util.Set<login.Course> courseSet14 = facultyClient10.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
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
        java.util.Set<login.Course> courseSet21 = facultyClient1.getCourses();
        java.lang.String str22 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
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
        java.lang.String str13 = facultyClient1.type;
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course6 = null;
        facultyClient5.assignCourse(course6);
        java.lang.String str8 = facultyClient5.getType();
        java.util.Set<login.Course> courseSet9 = facultyClient5.getCourses();
        login.Course course10 = null;
        facultyClient5.assignCourse(course10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
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
        java.lang.String str13 = facultyClient10.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
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
        java.lang.String str16 = facultyClient1.getRole();
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
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
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        java.lang.Class<?> wildcardClass17 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet19 = facultyClient18.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
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
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getRole();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str21 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
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
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
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
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
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
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.getRole();
        java.lang.String str20 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        facultyClient4.type = "";
        java.lang.String str10 = facultyClient4.type;
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str13 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.util.Set<login.Course> courseSet9 = facultyClient3.getCourses();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course11 = null;
        facultyClient10.assignCourse(course11);
        java.lang.String str13 = facultyClient10.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
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
        java.lang.String str10 = facultyClient3.type;
        facultyClient3.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("Faculty", "", "hi!");
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
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet6 = facultyClient1.getCourses();
        java.lang.String str7 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
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
        java.lang.String str12 = facultyClient11.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.getRole();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet8 = facultyClient5.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
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
        java.lang.String str14 = facultyClient1.getRole();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient1.getRole();
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
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
        java.lang.String str11 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.type;
        java.lang.String str15 = facultyClient1.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
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
        java.lang.String str14 = facultyClient10.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str16 = facultyClient10.type;
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str18 = facultyClient10.getType();
        java.lang.Class<?> wildcardClass19 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
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
        facultyClient1.type = "";
        java.lang.String str17 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
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
        java.lang.String str10 = facultyClient4.getType();
        java.lang.String str11 = facultyClient4.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
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
            java.lang.String str14 = facultyClient3.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "hi!";
        java.lang.String str8 = facultyClient5.getType();
        java.util.Set<login.Course> courseSet9 = facultyClient5.getCourses();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str11 = facultyClient10.type;
        java.lang.String str12 = facultyClient10.getType();
        java.lang.String str13 = facultyClient10.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
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
        java.lang.String str15 = facultyClient10.type;
        facultyClient10.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
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
        java.lang.String str17 = facultyClient1.type;
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        java.lang.String str9 = facultyClient7.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
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
        java.lang.String str15 = facultyClient1.getRole();
        java.lang.String str16 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
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
        facultyClient4.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
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
        java.lang.String str11 = facultyClient1.getRole();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient12.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
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
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook18 = null;
        facultyClient4.update(textbook18);
        java.lang.String str20 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
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
        java.lang.String str11 = facultyClient10.getRole();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
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
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
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
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        java.util.Set<login.Course> courseSet18 = facultyClient4.getCourses();
        java.lang.Class<?> wildcardClass19 = courseSet18.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
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
        java.lang.String str13 = facultyClient1.getRole();
        java.lang.String str14 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "Faculty");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
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
        java.lang.String str16 = facultyClient4.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course18 = null;
        facultyClient17.assignCourse(course18);
        java.util.Set<login.Course> courseSet20 = facultyClient17.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
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
        java.lang.String str11 = facultyClient1.getType();
        java.lang.String str12 = facultyClient1.getType();
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass15 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
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
        java.lang.String str14 = facultyClient13.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient13);
        login.Course course16 = null;
        facultyClient13.assignCourse(course16);
        java.lang.String str18 = facultyClient13.type;
        facultyClient13.type = "hi!";
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient13);
        java.lang.String str22 = facultyClient13.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
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
        java.lang.String str13 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "hi!");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
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
        facultyClient1.type = "hi!";
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str17 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "hi!", "");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.lang.String str12 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.type;
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
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
        java.util.Set<login.Course> courseSet22 = facultyClient14.getCourses();
        java.lang.String str23 = facultyClient14.getRole();
        items.Textbook textbook24 = null;
        facultyClient14.update(textbook24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
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
        java.lang.String str12 = facultyClient1.getType();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
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
        java.lang.String str16 = facultyClient1.type;
        facultyClient1.type = "";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook20 = null;
        facultyClient19.update(textbook20);
        java.lang.String str22 = facultyClient19.type;
        login.Course course23 = null;
        facultyClient19.assignCourse(course23);
        java.lang.String str25 = facultyClient19.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Faculty" + "'", str25, "Faculty");
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
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
        java.lang.String str17 = facultyClient1.getRole();
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
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
        java.lang.String str13 = facultyClient4.type;
        java.lang.String str14 = facultyClient4.type;
        java.lang.String str15 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        java.lang.String str12 = facultyClient1.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
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
        java.util.Set<login.Course> courseSet22 = facultyClient21.getCourses();
        java.util.Set<login.Course> courseSet23 = facultyClient21.getCourses();
        login.FacultyClient facultyClient24 = new login.FacultyClient((login.Client) facultyClient21);
        java.util.Set<login.Course> courseSet25 = facultyClient24.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = facultyClient24.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertNotNull(courseSet23);
        org.junit.Assert.assertNotNull(courseSet25);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course8 = null;
        facultyClient7.assignCourse(course8);
        java.util.Set<login.Course> courseSet10 = facultyClient7.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient7);
        java.util.Set<login.Course> courseSet12 = facultyClient7.getCourses();
        facultyClient7.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
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
        login.Course course12 = null;
        facultyClient5.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient5.getCourses();
        facultyClient5.type = "";
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient5);
        items.Textbook textbook18 = null;
        facultyClient5.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
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
        java.lang.Class<?> wildcardClass19 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
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
        facultyClient10.type = "Faculty";
        java.lang.String str15 = facultyClient10.getType();
        login.Course course16 = null;
        facultyClient10.assignCourse(course16);
        java.util.Set<login.Course> courseSet18 = facultyClient10.getCourses();
        facultyClient10.type = "";
        java.lang.String str21 = facultyClient10.getType();
        login.Course course22 = null;
        facultyClient10.assignCourse(course22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        login.Course course6 = null;
        facultyClient4.assignCourse(course6);
        java.lang.Class<?> wildcardClass8 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
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
        items.Textbook textbook15 = null;
        facultyClient3.update(textbook15);
        java.lang.String str17 = facultyClient3.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
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
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        items.Textbook textbook12 = null;
        facultyClient10.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
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
        facultyClient10.type = "Faculty";
        java.lang.String str15 = facultyClient10.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
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
        java.util.Set<login.Course> courseSet16 = facultyClient12.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
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
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
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
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        java.lang.String str16 = facultyClient4.type;
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str18 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
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
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        java.lang.String str16 = facultyClient4.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook18 = null;
        facultyClient4.update(textbook18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
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
        facultyClient11.type = "Faculty";
        java.lang.String str16 = facultyClient11.getRole();
        items.Textbook textbook17 = null;
        facultyClient11.update(textbook17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str11 = facultyClient1.getRole();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
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
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.Class<?> wildcardClass17 = facultyClient16.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
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
        java.lang.String str11 = facultyClient4.getType();
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        java.lang.String str14 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
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
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        java.lang.String str16 = facultyClient4.getType();
        login.Course course17 = null;
        facultyClient4.assignCourse(course17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str20 = facultyClient19.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
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
        java.lang.String str15 = facultyClient1.getType();
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient5.getType();
        java.util.Set<login.Course> courseSet7 = facultyClient5.getCourses();
        java.lang.String str8 = facultyClient5.getType();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        items.Textbook textbook10 = null;
        facultyClient5.update(textbook10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
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
        java.lang.String str15 = facultyClient14.getType();
        java.lang.String str16 = facultyClient14.type;
        login.Course course17 = null;
        facultyClient14.assignCourse(course17);
        items.Textbook textbook19 = null;
        facultyClient14.update(textbook19);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient14);
        java.util.Set<login.Course> courseSet22 = facultyClient14.getCourses();
        java.lang.String str23 = facultyClient14.getRole();
        java.lang.String str24 = facultyClient14.getRole();
        java.util.Set<login.Course> courseSet25 = facultyClient14.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Faculty" + "'", str24, "Faculty");
        org.junit.Assert.assertNotNull(courseSet25);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
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
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        java.lang.String str15 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
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
        java.lang.String str15 = facultyClient14.getRole();
        java.util.Set<login.Course> courseSet16 = facultyClient14.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
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
        java.lang.String str17 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str20 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient15.getPassword("");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        java.util.Set<login.Course> courseSet6 = facultyClient1.getCourses();
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.type;
        java.lang.String str11 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
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
        java.util.Set<login.Course> courseSet13 = facultyClient5.getCourses();
        java.lang.String str14 = facultyClient5.type;
        login.Course course15 = null;
        facultyClient5.assignCourse(course15);
        java.lang.String str17 = facultyClient5.getType();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
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
        java.lang.String str10 = facultyClient8.type;
        java.util.Set<login.Course> courseSet11 = facultyClient8.getCourses();
        login.Course course12 = null;
        facultyClient8.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient8.getCourses();
        java.lang.String str15 = facultyClient8.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getType();
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        java.lang.Class<?> wildcardClass7 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
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
        facultyClient19.type = "hi!";
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
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
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
        facultyClient1.type = "hi!";
        java.lang.String str22 = facultyClient1.getRole();
        login.FacultyClient facultyClient23 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet24 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertNotNull(courseSet24);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
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
        java.util.Set<login.Course> courseSet13 = facultyClient12.getCourses();
        java.lang.String str14 = facultyClient12.getType();
        java.lang.String str15 = facultyClient12.type;
        java.lang.String str16 = facultyClient12.type;
        java.lang.String str17 = facultyClient12.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str14 = facultyClient4.type;
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str17 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
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
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        java.lang.String str14 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        java.lang.Class<?> wildcardClass18 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        java.lang.String str9 = facultyClient4.type;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
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
        facultyClient1.type = "";
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
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
        items.Textbook textbook15 = null;
        facultyClient14.update(textbook15);
        java.util.Set<login.Course> courseSet17 = facultyClient14.getCourses();
        items.Textbook textbook18 = null;
        facultyClient14.update(textbook18);
        java.util.Set<login.Course> courseSet20 = facultyClient14.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
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
        java.lang.String str11 = facultyClient10.getType();
        items.Textbook textbook12 = null;
        facultyClient10.update(textbook12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        java.lang.String str11 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.type;
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.type;
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
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
        java.lang.String str14 = facultyClient3.type;
        facultyClient3.type = "";
        java.lang.String str17 = facultyClient3.getType();
        items.Textbook textbook18 = null;
        facultyClient3.update(textbook18);
        java.util.Set<login.Course> courseSet20 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.String str13 = facultyClient4.getRole();
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str17 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
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
        java.lang.String str17 = facultyClient1.getRole();
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.lang.String str20 = facultyClient1.getRole();
        java.lang.String str21 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.type;
        java.lang.String str9 = facultyClient4.type;
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getType();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient9);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        facultyClient3.type = "";
        java.lang.String str11 = facultyClient3.getType();
        java.util.Set<login.Course> courseSet12 = facultyClient3.getCourses();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course14 = null;
        facultyClient13.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        java.util.Set<login.Course> courseSet8 = facultyClient5.getCourses();
        login.Course course9 = null;
        facultyClient5.assignCourse(course9);
        java.lang.Class<?> wildcardClass11 = facultyClient5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
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
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.lang.String str19 = facultyClient1.getType();
        java.lang.String str20 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
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
        facultyClient11.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient7.type = "";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
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
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
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
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.lang.String str12 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str15 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
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
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.getRole();
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        java.lang.String str7 = facultyClient3.getType();
        java.lang.String str8 = facultyClient3.getType();
        java.lang.String str9 = facultyClient3.getRole();
        java.lang.String str10 = facultyClient3.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        java.lang.Class<?> wildcardClass9 = facultyClient7.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient7.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        java.lang.String str10 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        java.lang.String str14 = facultyClient4.getType();
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        java.lang.String str17 = facultyClient4.getType();
        items.Textbook textbook18 = null;
        facultyClient4.update(textbook18);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
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
        java.lang.String str12 = facultyClient3.getType();
        java.lang.String str13 = facultyClient3.getRole();
        facultyClient3.type = "Faculty";
        login.Course course16 = null;
        facultyClient3.assignCourse(course16);
        login.Course course18 = null;
        facultyClient3.assignCourse(course18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str8 = facultyClient4.getRole();
        java.lang.String str9 = facultyClient4.getRole();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
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
        java.lang.Class<?> wildcardClass12 = facultyClient1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.getType();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.Class<?> wildcardClass14 = facultyClient12.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
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
        java.lang.String str15 = facultyClient1.type;
        java.lang.String str16 = facultyClient1.getType();
        java.lang.String str17 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        java.lang.String str9 = facultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
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
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        facultyClient4.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
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
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str23 = facultyClient1.type;
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
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
        facultyClient14.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
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
        java.lang.String str14 = facultyClient10.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str16 = facultyClient10.type;
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.Class<?> wildcardClass18 = facultyClient17.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
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
        java.lang.String str16 = facultyClient15.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient15);
        facultyClient15.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
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
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        facultyClient1.type = "hi!";
        java.lang.String str16 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str14 = facultyClient13.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
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
        items.Textbook textbook10 = null;
        facultyClient5.update(textbook10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
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
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        login.Course course8 = null;
        facultyClient3.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        java.lang.String str13 = facultyClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        facultyClient4.type = "";
        java.lang.String str10 = facultyClient4.type;
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str13 = facultyClient4.type;
        java.lang.String str14 = facultyClient4.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
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
        java.lang.String str14 = facultyClient1.type;
        facultyClient1.type = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        java.lang.String str13 = facultyClient11.getRole();
        java.lang.String str14 = facultyClient11.type;
        facultyClient11.type = "Faculty";
        java.lang.String str17 = facultyClient11.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
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
        java.lang.String str16 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient1.getPassword("");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient7.type = "hi!";
        items.Textbook textbook10 = null;
        facultyClient7.update(textbook10);
        java.lang.String str12 = facultyClient7.type;
        java.util.Set<login.Course> courseSet13 = facultyClient7.getCourses();
        java.lang.Class<?> wildcardClass14 = facultyClient7.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
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
        java.lang.String str13 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
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
        java.lang.String str17 = facultyClient1.type;
        java.lang.String str18 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
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
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
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
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        java.util.Set<login.Course> courseSet15 = facultyClient10.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient17.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        java.lang.String str13 = facultyClient11.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        java.lang.Class<?> wildcardClass16 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = facultyClient1.getPassword("Faculty");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
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
        java.lang.String str17 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
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
        facultyClient1.type = "hi!";
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.lang.String str20 = facultyClient1.type;
        java.lang.String str21 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass22 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str11 = facultyClient1.type;
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
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
        facultyClient17.type = "Faculty";
        java.util.Set<login.Course> courseSet24 = facultyClient17.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(courseSet24);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str9 = facultyClient8.getRole();
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
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
        java.lang.String str15 = facultyClient1.type;
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        facultyClient1.type = "hi!";
        facultyClient1.type = "Faculty";
        java.lang.String str19 = facultyClient1.getType();
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        facultyClient4.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
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
        java.util.Set<login.Course> courseSet17 = facultyClient15.getCourses();
        java.lang.String str18 = facultyClient15.getRole();
        items.Textbook textbook19 = null;
        facultyClient15.update(textbook19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        java.lang.String str11 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass15 = courseSet14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
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
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str23 = facultyClient1.getType();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
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
        facultyClient9.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
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
        java.lang.String str12 = facultyClient7.getType();
        java.lang.String str13 = facultyClient7.getRole();
        login.Course course14 = null;
        facultyClient7.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient8.type;
        java.util.Set<login.Course> courseSet10 = facultyClient8.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient8);
        java.lang.Class<?> wildcardClass12 = facultyClient11.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
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
        java.lang.String str11 = facultyClient4.getType();
        facultyClient4.type = "Faculty";
        java.lang.String str14 = facultyClient4.getRole();
        java.lang.String str15 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
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
        java.lang.String str12 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getRole();
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
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
        java.lang.String str14 = facultyClient13.type;
        java.lang.String str15 = facultyClient13.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient13);
        facultyClient13.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
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
        java.lang.String str11 = facultyClient1.getType();
        java.lang.String str12 = facultyClient1.getType();
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient15.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
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
        java.util.Set<login.Course> courseSet19 = facultyClient14.getCourses();
        java.lang.String str20 = facultyClient14.getRole();
        java.lang.Class<?> wildcardClass21 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
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
        java.lang.String str13 = facultyClient12.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient12.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.getType();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course14 = null;
        facultyClient13.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.lang.String str6 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
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
        java.lang.String str11 = facultyClient10.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        java.lang.String str3 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        java.lang.Class<?> wildcardClass6 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
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
        java.util.Set<login.Course> courseSet24 = facultyClient10.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertNotNull(courseSet24);
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        facultyClient1.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
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
        java.lang.String str11 = facultyClient10.getType();
        java.lang.String str12 = facultyClient10.type;
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
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
        facultyClient1.type = "Faculty";
        java.lang.String str17 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient7);
        facultyClient7.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
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
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        facultyClient4.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
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
        java.lang.String str15 = facultyClient1.type;
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
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
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str13 = facultyClient4.type;
        java.lang.String str14 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient9.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
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
        java.lang.String str15 = facultyClient11.getType();
        java.lang.String str16 = facultyClient11.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
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
        java.lang.Class<?> wildcardClass10 = facultyClient9.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
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
        facultyClient1.type = "Faculty";
        java.lang.String str14 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
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
        java.lang.String str12 = facultyClient1.type;
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.Class<?> wildcardClass9 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str11 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
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
        java.lang.String str15 = facultyClient1.getType();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook17 = null;
        facultyClient16.update(textbook17);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient16.register("hi!", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.lang.String str11 = facultyClient4.getType();
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass15 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
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
        facultyClient9.type = "Faculty";
        java.lang.String str14 = facultyClient9.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
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
        java.lang.String str20 = facultyClient16.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
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
        facultyClient17.type = "Faculty";
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient17);
        java.util.Set<login.Course> courseSet21 = facultyClient17.getCourses();
        facultyClient17.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
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
        facultyClient4.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course8 = null;
        facultyClient7.assignCourse(course8);
        login.Course course10 = null;
        facultyClient7.assignCourse(course10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
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
        java.util.Set<login.Course> courseSet22 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet23 = facultyClient1.getCourses();
        java.lang.String str24 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertNotNull(courseSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
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
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        items.Textbook textbook17 = null;
        facultyClient4.update(textbook17);
        java.lang.String str19 = facultyClient4.getRole();
        login.Course course20 = null;
        facultyClient4.assignCourse(course20);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
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
        items.Textbook textbook10 = null;
        facultyClient3.update(textbook10);
        java.lang.String str12 = facultyClient3.type;
        items.Textbook textbook13 = null;
        facultyClient3.update(textbook13);
        login.Course course15 = null;
        facultyClient3.assignCourse(course15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.type;
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
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
        items.Textbook textbook10 = null;
        facultyClient3.update(textbook10);
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        login.Course course14 = null;
        facultyClient3.assignCourse(course14);
        java.lang.Class<?> wildcardClass16 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
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
        login.Course course17 = null;
        facultyClient15.assignCourse(course17);
        java.lang.String str19 = facultyClient15.getRole();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str21 = facultyClient15.getType();
        java.lang.String str22 = facultyClient15.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
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
        java.lang.String str14 = facultyClient13.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient13);
        java.lang.String str16 = facultyClient13.type;
        java.lang.String str17 = facultyClient13.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
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
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        java.lang.String str14 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        java.lang.String str16 = facultyClient4.type;
        java.lang.String str17 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet4 = facultyClient3.getCourses();
        java.lang.String str5 = facultyClient3.getRole();
        items.Textbook textbook6 = null;
        facultyClient3.update(textbook6);
        java.lang.String str8 = facultyClient3.getRole();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
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
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        facultyClient1.type = "";
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
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
        facultyClient3.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        login.Course course15 = null;
        facultyClient12.assignCourse(course15);
        facultyClient12.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str9 = facultyClient5.getType();
        java.util.Set<login.Course> courseSet10 = facultyClient5.getCourses();
        java.util.Set<login.Course> courseSet11 = facultyClient5.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
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
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        facultyClient14.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient9);
        login.Course course11 = null;
        facultyClient10.assignCourse(course11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
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
        java.lang.String str26 = facultyClient19.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient19.register("hi!", "", "Faculty");
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
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
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
        java.lang.String str14 = facultyClient3.type;
        login.Course course15 = null;
        facultyClient3.assignCourse(course15);
        java.lang.String str17 = facultyClient3.type;
        items.Textbook textbook18 = null;
        facultyClient3.update(textbook18);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "hi!";
        java.util.Set<login.Course> courseSet23 = facultyClient3.getCourses();
        java.lang.String str24 = facultyClient3.type;
        java.lang.String str25 = facultyClient3.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNotNull(courseSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        java.util.Set<login.Course> courseSet14 = facultyClient10.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.getRole();
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.getRole();
        java.lang.String str16 = facultyClient1.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str16 = facultyClient15.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
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
        login.Course course12 = null;
        facultyClient11.assignCourse(course12);
        items.Textbook textbook14 = null;
        facultyClient11.update(textbook14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
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
        java.lang.String str14 = facultyClient10.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str16 = facultyClient10.type;
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient17);
        java.lang.String str19 = facultyClient18.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
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
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        facultyClient4.type = "";
        login.Course course17 = null;
        facultyClient4.assignCourse(course17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        login.Course course13 = null;
        facultyClient11.assignCourse(course13);
        java.lang.String str15 = facultyClient11.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet8 = facultyClient3.getCourses();
        facultyClient3.type = "hi!";
        java.lang.String str11 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet12 = facultyClient3.getCourses();
        java.lang.String str13 = facultyClient3.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
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
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        facultyClient10.type = "hi!";
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass12 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        java.lang.String str13 = facultyClient1.type;
        java.lang.String str14 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str12 = facultyClient11.type;
        facultyClient11.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("Faculty", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
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
        java.lang.String str11 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.type;
        java.lang.String str15 = facultyClient1.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
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
        facultyClient1.type = "";
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.getRole();
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
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
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        java.lang.String str7 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient3.getCourses();
        java.lang.String str9 = facultyClient3.getType();
        java.lang.String str10 = facultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient3.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.lang.String str11 = facultyClient1.getRole();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient4.type;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
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
        java.lang.String str12 = facultyClient1.getRole();
        java.lang.String str13 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getRole();
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
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
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        items.Textbook textbook21 = null;
        facultyClient1.update(textbook21);
        java.util.Set<login.Course> courseSet23 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertNotNull(courseSet23);
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
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
        java.lang.String str11 = facultyClient9.getType();
        items.Textbook textbook12 = null;
        facultyClient9.update(textbook12);
        java.lang.String str14 = facultyClient9.type;
        java.lang.String str15 = facultyClient9.getRole();
        items.Textbook textbook16 = null;
        facultyClient9.update(textbook16);
        facultyClient9.type = "";
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient9);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.Class<?> wildcardClass22 = facultyClient21.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
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
        java.lang.String str15 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient17.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient8.type;
        java.util.Set<login.Course> courseSet10 = facultyClient8.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient8);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str13 = facultyClient12.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
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
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.lang.String str8 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet9 = facultyClient4.getCourses();
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        java.lang.String str12 = facultyClient4.type;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
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
        facultyClient1.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass16 = facultyClient15.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
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
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        java.lang.String str12 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        facultyClient4.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient9.type = "";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.String str13 = facultyClient12.getRole();
        login.Course course14 = null;
        facultyClient12.assignCourse(course14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
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
        java.util.Set<login.Course> courseSet15 = facultyClient3.getCourses();
        login.Course course16 = null;
        facultyClient3.assignCourse(course16);
        items.Textbook textbook18 = null;
        facultyClient3.update(textbook18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient4.type = "Faculty";
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
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
        java.lang.String str18 = facultyClient17.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
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
        login.Course course11 = null;
        facultyClient3.assignCourse(course11);
        java.lang.String str13 = facultyClient3.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        facultyClient1.type = "Faculty";
        facultyClient1.type = "";
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet19 = facultyClient18.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
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
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient12);
        items.Textbook textbook18 = null;
        facultyClient17.update(textbook18);
        facultyClient17.type = "";
        java.util.Set<login.Course> courseSet22 = facultyClient17.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet22);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        items.Textbook textbook6 = null;
        facultyClient3.update(textbook6);
        login.Course course8 = null;
        facultyClient3.assignCourse(course8);
        facultyClient3.type = "Faculty";
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        java.lang.String str14 = facultyClient3.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
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
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
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
        facultyClient1.type = "";
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.lang.String str18 = facultyClient1.type;
        java.lang.String str19 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str22 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
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
        login.Course course11 = null;
        facultyClient10.assignCourse(course11);
        java.util.Set<login.Course> courseSet13 = facultyClient10.getCourses();
        java.lang.String str14 = facultyClient10.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str11 = facultyClient10.getRole();
        facultyClient10.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient10.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
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
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        java.lang.String str15 = facultyClient13.getRole();
        items.Textbook textbook16 = null;
        facultyClient13.update(textbook16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
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
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
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
        java.lang.String str10 = facultyClient4.getRole();
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        facultyClient4.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
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
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        login.FacultyClient facultyClient23 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass24 = facultyClient23.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
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
        java.lang.String str16 = facultyClient1.type;
        facultyClient1.type = "";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook20 = null;
        facultyClient19.update(textbook20);
        java.lang.String str22 = facultyClient19.getType();
        java.lang.String str23 = facultyClient19.getRole();
        items.Textbook textbook24 = null;
        facultyClient19.update(textbook24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getRole();
        java.lang.Class<?> wildcardClass8 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
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
        facultyClient1.type = "";
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.getType();
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
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
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
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
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
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
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        java.lang.String str15 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
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
        login.FacultyClient facultyClient23 = new login.FacultyClient((login.Client) facultyClient22);
        java.lang.String str24 = facultyClient23.getType();
        java.lang.String str25 = facultyClient23.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
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
        login.Course course12 = null;
        facultyClient10.assignCourse(course12);
        login.Course course14 = null;
        facultyClient10.assignCourse(course14);
        items.Textbook textbook16 = null;
        facultyClient10.update(textbook16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient10.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
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
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        java.lang.String str18 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
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
        java.util.Set<login.Course> courseSet12 = facultyClient5.getCourses();
        java.util.Set<login.Course> courseSet13 = facultyClient5.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        java.lang.String str7 = facultyClient3.getRole();
        java.lang.String str8 = facultyClient3.getType();
        java.util.Set<login.Course> courseSet9 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass14 = courseSet13.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
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
        facultyClient10.type = "Faculty";
        java.lang.String str15 = facultyClient10.getType();
        login.Course course16 = null;
        facultyClient10.assignCourse(course16);
        java.util.Set<login.Course> courseSet18 = facultyClient10.getCourses();
        facultyClient10.type = "";
        facultyClient10.type = "";
        facultyClient10.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
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
        java.lang.String str11 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
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
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.getRole();
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        java.lang.String str21 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
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
        java.lang.String str22 = facultyClient20.type;
        facultyClient20.type = "";
        java.lang.String str25 = facultyClient20.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
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
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.getRole();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient9.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.type;
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.lang.String str10 = facultyClient1.type;
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        facultyClient1.type = "";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
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
            facultyClient1.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
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
        facultyClient1.type = "";
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
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
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        facultyClient1.type = "";
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.type;
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        java.lang.String str8 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
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
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        java.util.Set<login.Course> courseSet16 = facultyClient10.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
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
        java.lang.String str13 = facultyClient1.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
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
        java.lang.String str13 = facultyClient12.getRole();
        java.lang.String str14 = facultyClient12.type;
        java.lang.String str15 = facultyClient12.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        facultyClient4.type = "";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        java.lang.String str12 = facultyClient4.getRole();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        java.util.Set<login.Course> courseSet8 = facultyClient5.getCourses();
        java.lang.String str9 = facultyClient5.getType();
        java.lang.String str10 = facultyClient5.getRole();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient5);
        login.Course course12 = null;
        facultyClient11.assignCourse(course12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
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
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
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
        java.lang.String str11 = facultyClient1.getRole();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.type;
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
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
        java.lang.String str11 = facultyClient10.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
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
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.type;
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook14 = null;
        facultyClient13.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("", "Faculty", "Faculty");
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
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet4 = facultyClient3.getCourses();
        java.lang.String str5 = facultyClient3.getRole();
        facultyClient3.type = "hi!";
        items.Textbook textbook8 = null;
        facultyClient3.update(textbook8);
        items.Textbook textbook10 = null;
        facultyClient3.update(textbook10);
        java.lang.Class<?> wildcardClass12 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        facultyClient3.type = "";
        java.lang.String str11 = facultyClient3.getType();
        java.util.Set<login.Course> courseSet12 = facultyClient3.getCourses();
        java.lang.String str13 = facultyClient3.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.getRole();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.type;
        facultyClient4.type = "";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.Class<?> wildcardClass11 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
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
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = facultyClient21.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient8.type;
        java.util.Set<login.Course> courseSet10 = facultyClient8.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient8);
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient11);
        login.Course course16 = null;
        facultyClient15.assignCourse(course16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        login.Course course13 = null;
        facultyClient11.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient11.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
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
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
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
        java.lang.String str16 = facultyClient1.type;
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        java.lang.String str9 = facultyClient7.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
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
        facultyClient4.type = "";
        java.lang.Class<?> wildcardClass17 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        facultyClient1.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
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
        facultyClient9.update(textbook10);
        items.Textbook textbook12 = null;
        facultyClient9.update(textbook12);
        facultyClient9.type = "";
        java.lang.Class<?> wildcardClass16 = facultyClient9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.Class<?> wildcardClass13 = facultyClient12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
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
        java.lang.String str13 = facultyClient1.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
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
        java.lang.String str12 = facultyClient9.getRole();
        java.lang.String str13 = facultyClient9.getRole();
        java.lang.String str14 = facultyClient9.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
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
        java.lang.String str22 = facultyClient20.getType();
        java.lang.String str23 = facultyClient20.getType();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet9 = facultyClient8.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient8.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
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
        facultyClient1.type = "hi!";
        java.lang.String str13 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.type;
        java.lang.String str16 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
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
        java.lang.String str13 = facultyClient1.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        java.lang.String str17 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
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
        facultyClient4.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
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
        java.lang.String str11 = facultyClient9.getType();
        facultyClient9.type = "hi!";
        java.lang.String str14 = facultyClient9.getType();
        java.util.Set<login.Course> courseSet15 = facultyClient9.getCourses();
        java.lang.String str16 = facultyClient9.getRole();
        login.Course course17 = null;
        facultyClient9.assignCourse(course17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
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
        java.lang.Class<?> wildcardClass11 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.type;
        items.Textbook textbook8 = null;
        facultyClient6.update(textbook8);
        java.lang.String str10 = facultyClient6.type;
        java.util.Set<login.Course> courseSet11 = facultyClient6.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.getRole();
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient14.type;
        java.lang.String str16 = facultyClient14.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
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
        java.util.Set<login.Course> courseSet19 = facultyClient14.getCourses();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient14);
        java.util.Set<login.Course> courseSet21 = facultyClient14.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
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
        java.lang.String str18 = facultyClient17.getRole();
        java.lang.Class<?> wildcardClass19 = facultyClient17.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        java.lang.String str7 = facultyClient4.type;
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        java.lang.String str9 = facultyClient4.getRole();
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
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
        items.Textbook textbook13 = null;
        facultyClient3.update(textbook13);
        java.util.Set<login.Course> courseSet15 = facultyClient3.getCourses();
        java.lang.String str16 = facultyClient3.getRole();
        java.lang.String str17 = facultyClient3.getRole();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient18);
        java.lang.String str20 = facultyClient19.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
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
        java.lang.String str15 = facultyClient1.getRole();
        java.lang.String str16 = facultyClient1.getRole();
        java.lang.String str17 = facultyClient1.getRole();
        java.lang.String str18 = facultyClient1.type;
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str7 = facultyClient6.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        java.lang.String str7 = facultyClient3.getType();
        java.lang.String str8 = facultyClient3.type;
        java.util.Set<login.Course> courseSet9 = facultyClient3.getCourses();
        java.lang.Class<?> wildcardClass10 = courseSet9.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient3.getType();
        java.lang.String str9 = facultyClient3.getRole();
        java.lang.String str10 = facultyClient3.getRole();
        java.lang.String str11 = facultyClient3.type;
        java.util.Set<login.Course> courseSet12 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
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
        facultyClient10.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        java.util.Set<login.Course> courseSet14 = facultyClient10.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient10.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
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
        java.lang.String str15 = facultyClient1.getType();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet17 = facultyClient16.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
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
        java.lang.String str19 = facultyClient17.type;
        java.lang.String str20 = facultyClient17.getRole();
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient17);
        java.lang.String str22 = facultyClient21.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
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
        facultyClient3.type = "Faculty";
        java.util.Set<login.Course> courseSet16 = facultyClient3.getCourses();
        login.Course course17 = null;
        facultyClient3.assignCourse(course17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str10 = facultyClient9.getRole();
        java.lang.String str11 = facultyClient9.getType();
        java.lang.String str12 = facultyClient9.type;
        facultyClient9.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
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
        java.lang.String str15 = facultyClient14.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.lang.String str11 = facultyClient4.getType();
        java.lang.String str12 = facultyClient4.type;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient1.getPassword("Faculty");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
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
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        facultyClient1.type = "Faculty";
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
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
        java.lang.String str12 = facultyClient11.getType();
        java.lang.String str13 = facultyClient11.type;
        facultyClient11.type = "hi!";
        facultyClient11.type = "Faculty";
        items.Textbook textbook18 = null;
        facultyClient11.update(textbook18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient11.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
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
        java.lang.String str13 = facultyClient1.getRole();
        java.lang.String str14 = facultyClient1.type;
        java.lang.Class<?> wildcardClass15 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
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
        java.lang.String str12 = facultyClient4.type;
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        java.lang.String str15 = facultyClient4.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str17 = facultyClient4.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.Class<?> wildcardClass8 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
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
        facultyClient5.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass16 = facultyClient15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
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
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        items.Textbook textbook14 = null;
        facultyClient11.update(textbook14);
        java.lang.String str16 = facultyClient11.getRole();
        login.Course course17 = null;
        facultyClient11.assignCourse(course17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
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
        java.lang.String str15 = facultyClient1.getType();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook17 = null;
        facultyClient16.update(textbook17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient19.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
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
        java.lang.String str13 = facultyClient1.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str18 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
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
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient1.update(textbook5);
        java.lang.String str7 = facultyClient1.type;
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.getType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
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
        java.lang.String str14 = facultyClient1.type;
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
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
        java.lang.String str18 = facultyClient10.getRole();
        facultyClient10.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
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
        java.lang.String str19 = facultyClient18.getRole();
        java.util.Set<login.Course> courseSet20 = facultyClient18.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient8.type;
        java.util.Set<login.Course> courseSet10 = facultyClient8.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient8);
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient11);
        facultyClient11.type = "hi!";
        login.Course course18 = null;
        facultyClient11.assignCourse(course18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
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
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.lang.String str20 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
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
            facultyClient4.register("", "", "Faculty");
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
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient17);
        login.Course course19 = null;
        facultyClient18.assignCourse(course19);
        java.lang.String str21 = facultyClient18.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getType();
        facultyClient4.type = "Faculty";
        java.lang.String str10 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        facultyClient4.type = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient1.type;
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass20 = courseSet19.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }
}

