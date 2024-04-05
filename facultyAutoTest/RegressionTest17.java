package facultyAutoTest;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str18 = facultyClient17.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        java.lang.String str15 = facultyClient12.getType();
        items.Textbook textbook16 = null;
        facultyClient12.update(textbook16);
        java.lang.String str18 = facultyClient12.type;
        java.lang.String str19 = facultyClient12.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
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
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        facultyClient3.type = "Faculty";
        java.lang.String str13 = facultyClient3.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        facultyClient1.type = "";
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.lang.String str13 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
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
        java.lang.String str22 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        java.lang.String str9 = facultyClient4.getRole();
        java.lang.String str10 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        facultyClient4.type = "";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
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
        java.lang.String str17 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient17.getPassword("hi!");
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getRole();
        java.lang.String str11 = facultyClient9.getRole();
        java.lang.String str12 = facultyClient9.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.lang.String str11 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
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
        java.lang.String str14 = facultyClient3.getType();
        items.Textbook textbook15 = null;
        facultyClient3.update(textbook15);
        java.lang.String str17 = facultyClient3.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
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
        facultyClient1.type = "Faculty";
        java.lang.String str20 = facultyClient1.getRole();
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
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
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        java.lang.String str20 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        facultyClient1.type = "hi!";
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getType();
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient8.getType();
        java.lang.String str10 = facultyClient8.type;
        java.lang.String str11 = facultyClient8.type;
        facultyClient8.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str14 = facultyClient1.type;
        java.lang.Class<?> wildcardClass15 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        java.lang.String str9 = facultyClient4.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str11 = facultyClient10.getType();
        java.lang.String str12 = facultyClient10.getType();
        java.lang.String str13 = facultyClient10.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
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
        java.lang.String str24 = facultyClient21.getType();
        java.lang.String str25 = facultyClient21.getType();
        login.FacultyClient facultyClient26 = new login.FacultyClient((login.Client) facultyClient21);
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
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
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        java.lang.String str16 = facultyClient4.type;
        facultyClient4.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
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
        facultyClient12.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
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
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
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
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
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
        java.lang.String str13 = facultyClient7.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        login.Course course15 = null;
        facultyClient13.assignCourse(course15);
        facultyClient13.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course19 = null;
        facultyClient3.assignCourse(course19);
        java.lang.Class<?> wildcardClass21 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
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
        java.lang.String str21 = facultyClient20.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
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
        items.Textbook textbook19 = null;
        facultyClient18.update(textbook19);
        java.lang.String str21 = facultyClient18.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getType();
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        facultyClient4.type = "Faculty";
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        java.lang.String str9 = facultyClient3.type;
        java.lang.String str10 = facultyClient3.type;
        java.lang.String str11 = facultyClient3.type;
        java.lang.String str12 = facultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient3.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.getRole();
        java.lang.String str8 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
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
        java.lang.String str18 = facultyClient1.type;
        java.lang.String str19 = facultyClient1.getType();
        java.lang.String str20 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
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
        java.lang.String str13 = facultyClient6.getRole();
        java.lang.String str14 = facultyClient6.type;
        login.Course course15 = null;
        facultyClient6.assignCourse(course15);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient6);
        login.Course course18 = null;
        facultyClient17.assignCourse(course18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        facultyClient13.type = "hi!";
        java.lang.String str17 = facultyClient13.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
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
        java.lang.String str14 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
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
        java.util.Set<login.Course> courseSet11 = facultyClient3.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
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
        java.lang.String str12 = facultyClient5.type;
        login.Course course13 = null;
        facultyClient5.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str16 = facultyClient15.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str18 = facultyClient15.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient12.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
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
        login.Course course13 = null;
        facultyClient3.assignCourse(course13);
        facultyClient3.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        login.Course course6 = null;
        facultyClient3.assignCourse(course6);
        java.util.Set<login.Course> courseSet8 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
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
        java.lang.String str11 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        facultyClient5.type = "Faculty";
        facultyClient5.type = "";
        java.lang.String str14 = facultyClient5.type;
        facultyClient5.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
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
        java.lang.String str12 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.lang.String str15 = facultyClient4.getType();
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.getRole();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str10 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course18 = null;
        facultyClient17.assignCourse(course18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient8);
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        java.lang.String str12 = facultyClient8.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getRole();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        facultyClient4.type = "";
        java.lang.String str17 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
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
        facultyClient9.update(textbook10);
        java.lang.String str12 = facultyClient9.type;
        java.lang.String str13 = facultyClient9.type;
        login.Course course14 = null;
        facultyClient9.assignCourse(course14);
        java.lang.String str16 = facultyClient9.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        java.lang.String str6 = facultyClient1.type;
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        facultyClient4.type = "hi!";
        java.lang.String str8 = facultyClient4.getRole();
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        java.lang.String str11 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
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
        login.Course course12 = null;
        facultyClient10.assignCourse(course12);
        facultyClient10.type = "";
        items.Textbook textbook16 = null;
        facultyClient10.update(textbook16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str19 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
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
        java.lang.String str16 = facultyClient4.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
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
        facultyClient16.type = "Faculty";
        facultyClient16.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
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
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook20 = null;
        facultyClient19.update(textbook20);
        java.util.Set<login.Course> courseSet22 = facultyClient19.getCourses();
        login.Course course23 = null;
        facultyClient19.assignCourse(course23);
        login.Course course25 = null;
        facultyClient19.assignCourse(course25);
        java.lang.String str27 = facultyClient19.getType();
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient15.getCourses();
        java.util.Set<login.Course> courseSet17 = facultyClient15.getCourses();
        java.lang.String str18 = facultyClient15.getRole();
        java.lang.String str19 = facultyClient15.type;
        java.lang.String str20 = facultyClient15.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
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
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course16 = null;
        facultyClient15.assignCourse(course16);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient15.register("", "hi!", "");
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
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.type;
        java.lang.String str11 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
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
            facultyClient1.register("", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
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
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook9 = null;
        facultyClient8.update(textbook9);
        java.lang.String str11 = facultyClient8.getRole();
        java.lang.String str12 = facultyClient8.getRole();
        facultyClient8.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.lang.String str13 = facultyClient1.getType();
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str14 = facultyClient13.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient13);
        login.Course course16 = null;
        facultyClient13.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str10 = facultyClient9.getType();
        items.Textbook textbook11 = null;
        facultyClient9.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient9.update(textbook13);
        java.lang.String str15 = facultyClient9.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
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
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        java.lang.String str7 = facultyClient3.getType();
        login.Course course8 = null;
        facultyClient3.assignCourse(course8);
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("Faculty", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
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
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
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
        facultyClient15.type = "";
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        java.lang.String str8 = facultyClient4.getType();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str10 = facultyClient9.type;
        login.Course course11 = null;
        facultyClient9.assignCourse(course11);
        java.lang.String str13 = facultyClient9.type;
        java.util.Set<login.Course> courseSet14 = facultyClient9.getCourses();
        java.lang.String str15 = facultyClient9.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.lang.String str17 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
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
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        java.util.Set<login.Course> courseSet17 = facultyClient14.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
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
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        facultyClient4.type = "hi!";
        java.lang.Class<?> wildcardClass14 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
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
        java.lang.String str13 = facultyClient10.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.String str16 = facultyClient14.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
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
        java.lang.String str13 = facultyClient4.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str15 = facultyClient4.getType();
        items.Textbook textbook16 = null;
        facultyClient4.update(textbook16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.Class<?> wildcardClass19 = facultyClient18.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient17.getType();
        java.util.Set<login.Course> courseSet19 = facultyClient17.getCourses();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
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
        java.lang.String str17 = facultyClient16.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook18 = null;
        facultyClient17.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass8 = facultyClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.type;
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        java.lang.String str10 = facultyClient5.getType();
        items.Textbook textbook11 = null;
        facultyClient5.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient5.update(textbook13);
        items.Textbook textbook15 = null;
        facultyClient5.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        login.Course course9 = null;
        facultyClient3.assignCourse(course9);
        login.Course course11 = null;
        facultyClient3.assignCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.type;
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient6);
        login.Course course9 = null;
        facultyClient6.assignCourse(course9);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
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
        login.Course course14 = null;
        facultyClient11.assignCourse(course14);
        java.lang.String str16 = facultyClient11.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient11);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str19 = facultyClient11.getType();
        java.lang.String str20 = facultyClient11.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.getRole();
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        java.lang.String str11 = facultyClient1.getType();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
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
        java.util.Set<login.Course> courseSet17 = facultyClient8.getCourses();
        items.Textbook textbook18 = null;
        facultyClient8.update(textbook18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
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
        items.Textbook textbook17 = null;
        facultyClient15.update(textbook17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
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
        login.Course course15 = null;
        facultyClient10.assignCourse(course15);
        java.lang.String str17 = facultyClient10.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.type;
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
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
        java.lang.String str13 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
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
        facultyClient1.type = "Faculty";
        java.lang.String str16 = facultyClient1.type;
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
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
        java.lang.String str18 = facultyClient1.getType();
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        java.lang.String str21 = facultyClient1.type;
        java.lang.Class<?> wildcardClass22 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
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
        java.lang.String str21 = facultyClient20.getType();
        java.lang.String str22 = facultyClient20.getType();
        java.util.Set<login.Course> courseSet23 = facultyClient20.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(courseSet23);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
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
        java.lang.String str15 = facultyClient1.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
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
        java.lang.String str14 = facultyClient13.getRole();
        items.Textbook textbook15 = null;
        facultyClient13.update(textbook15);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient5.getType();
        java.lang.String str7 = facultyClient5.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
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
        facultyClient1.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        items.Textbook textbook9 = null;
        facultyClient7.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str12 = facultyClient7.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getType();
        items.Textbook textbook3 = null;
        facultyClient1.update(textbook3);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str9 = facultyClient7.type;
        java.lang.String str10 = facultyClient7.getRole();
        java.lang.Class<?> wildcardClass11 = facultyClient7.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str10 = facultyClient9.getType();
        java.lang.String str11 = facultyClient9.getType();
        facultyClient9.type = "";
        java.lang.String str14 = facultyClient9.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
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
        java.lang.Class<?> wildcardClass20 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
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
        java.lang.String str17 = facultyClient11.getRole();
        facultyClient11.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient8.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient9.getPassword("Faculty");
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
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
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
        java.lang.String str17 = facultyClient16.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
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
        java.lang.String str14 = facultyClient5.type;
        java.lang.String str15 = facultyClient5.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
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
        java.lang.String str15 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str18 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
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
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet6 = facultyClient1.getCourses();
        java.lang.String str7 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet9 = facultyClient8.getCourses();
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
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
        java.lang.String str12 = facultyClient4.getRole();
        java.lang.String str13 = facultyClient4.getRole();
        java.lang.String str14 = facultyClient4.getRole();
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        java.lang.String str17 = facultyClient4.getType();
        java.lang.String str18 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet19 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
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
        items.Textbook textbook11 = null;
        facultyClient9.update(textbook11);
        login.Course course13 = null;
        facultyClient9.assignCourse(course13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
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
        java.lang.String str11 = facultyClient7.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient7);
        java.util.Set<login.Course> courseSet13 = facultyClient12.getCourses();
        java.lang.String str14 = facultyClient12.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
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
        items.Textbook textbook19 = null;
        facultyClient18.update(textbook19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = facultyClient18.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
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
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        java.lang.String str22 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet7 = facultyClient6.getCourses();
        java.util.Set<login.Course> courseSet8 = facultyClient6.getCourses();
        java.lang.String str9 = facultyClient6.type;
        login.Course course10 = null;
        facultyClient6.assignCourse(course10);
        java.lang.Class<?> wildcardClass12 = facultyClient6.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        java.lang.String str15 = facultyClient14.getRole();
        java.lang.String str16 = facultyClient14.getType();
        facultyClient14.type = "hi!";
        java.lang.String str19 = facultyClient14.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.getType();
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
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
        java.lang.String str17 = facultyClient1.type;
        java.lang.String str18 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
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
        facultyClient5.type = "Faculty";
        facultyClient5.type = "";
        facultyClient5.type = "";
        java.lang.String str18 = facultyClient5.getRole();
        java.lang.String str19 = facultyClient5.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
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
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        java.lang.String str18 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str21 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
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
        java.util.Set<login.Course> courseSet14 = facultyClient7.getCourses();
        facultyClient7.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
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
        java.lang.String str14 = facultyClient13.type;
        java.lang.String str15 = facultyClient13.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
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
        java.util.Set<login.Course> courseSet14 = facultyClient12.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        java.lang.String str16 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass10 = courseSet9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient1.type;
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
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
        java.lang.String str17 = facultyClient16.type;
        java.lang.String str18 = facultyClient16.type;
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient16);
        java.lang.String str20 = facultyClient16.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
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
        facultyClient14.update(textbook15);
        java.lang.String str17 = facultyClient14.getType();
        facultyClient14.type = "hi!";
        java.lang.Class<?> wildcardClass20 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        java.lang.String str3 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient5);
        items.Textbook textbook14 = null;
        facultyClient5.update(textbook14);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("hi!", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
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
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient3);
        login.Course course9 = null;
        facultyClient3.assignCourse(course9);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
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
        facultyClient1.type = "Faculty";
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient10.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        java.lang.String str9 = facultyClient7.getType();
        login.Course course10 = null;
        facultyClient7.assignCourse(course10);
        login.Course course12 = null;
        facultyClient7.assignCourse(course12);
        facultyClient7.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.getRole();
        java.lang.String str19 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str11 = facultyClient10.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
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
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        java.lang.String str15 = facultyClient1.type;
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        java.lang.String str11 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
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
        items.Textbook textbook17 = null;
        facultyClient16.update(textbook17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        java.lang.String str7 = facultyClient4.type;
        java.lang.String str8 = facultyClient4.getType();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient9.type = "";
        items.Textbook textbook12 = null;
        facultyClient9.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
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
        java.lang.String str21 = facultyClient1.type;
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient24 = new login.FacultyClient((login.Client) facultyClient1);
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
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
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
        facultyClient13.type = "hi!";
        login.Course course17 = null;
        facultyClient13.assignCourse(course17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.getRole();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
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
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
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
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.String str11 = facultyClient9.type;
        login.Course course12 = null;
        facultyClient9.assignCourse(course12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.getType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        java.lang.String str13 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
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
        java.lang.String str13 = facultyClient1.getRole();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getRole();
        java.lang.String str17 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
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
        items.Textbook textbook15 = null;
        facultyClient10.update(textbook15);
        items.Textbook textbook17 = null;
        facultyClient10.update(textbook17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient10.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
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
        java.lang.String str12 = facultyClient4.getRole();
        java.lang.String str13 = facultyClient4.type;
        java.lang.String str14 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
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
        java.lang.String str18 = facultyClient1.getRole();
        java.lang.String str19 = facultyClient1.type;
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
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
        java.lang.String str17 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
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
        java.lang.String str17 = facultyClient15.type;
        login.Course course18 = null;
        facultyClient15.assignCourse(course18);
        java.util.Set<login.Course> courseSet20 = facultyClient15.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient1.type;
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
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
        java.lang.String str16 = facultyClient1.type;
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.lang.String str19 = facultyClient1.getType();
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        items.Textbook textbook22 = null;
        facultyClient1.update(textbook22);
        java.lang.Class<?> wildcardClass24 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
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
        facultyClient11.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        facultyClient4.type = "";
        java.lang.String str9 = facultyClient4.type;
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient4.getRole();
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        facultyClient4.type = "Faculty";
        java.lang.String str11 = facultyClient4.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
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
        java.lang.String str12 = facultyClient1.type;
        facultyClient1.type = "";
        facultyClient1.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
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
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient4.getPassword("hi!");
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
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
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
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        login.Course course14 = null;
        facultyClient4.assignCourse(course14);
        java.util.Set<login.Course> courseSet16 = facultyClient4.getCourses();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
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
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        login.Course course17 = null;
        facultyClient14.assignCourse(course17);
        items.Textbook textbook19 = null;
        facultyClient14.update(textbook19);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
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
        java.lang.String str18 = facultyClient17.getType();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient17);
        items.Textbook textbook20 = null;
        facultyClient17.update(textbook20);
        java.util.Set<login.Course> courseSet22 = facultyClient17.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet22);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
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
        java.lang.String str18 = facultyClient17.getRole();
        java.lang.String str19 = facultyClient17.getType();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = facultyClient20.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
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
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        facultyClient1.type = "hi!";
        java.lang.String str19 = facultyClient1.getType();
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        java.lang.String str22 = facultyClient1.getType();
        java.lang.String str23 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
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
        java.lang.String str12 = facultyClient1.getRole();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient15.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
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
        java.lang.Class<?> wildcardClass11 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
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
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.lang.String str17 = facultyClient1.getType();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str19 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
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
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.type;
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
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
        java.lang.String str12 = facultyClient5.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
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
        facultyClient3.type = "";
        java.lang.String str17 = facultyClient3.getRole();
        login.Course course18 = null;
        facultyClient3.assignCourse(course18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.lang.String str8 = facultyClient4.getType();
        java.lang.String str9 = facultyClient4.getRole();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        facultyClient4.type = "";
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str9 = facultyClient8.type;
        java.lang.String str10 = facultyClient8.type;
        login.Course course11 = null;
        facultyClient8.assignCourse(course11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
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
        java.lang.String str13 = facultyClient1.getType();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.type;
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        facultyClient4.type = "";
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course12 = null;
        facultyClient11.assignCourse(course12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.getRole();
        java.lang.String str8 = facultyClient6.type;
        login.Course course9 = null;
        facultyClient6.assignCourse(course9);
        java.util.Set<login.Course> courseSet11 = facultyClient6.getCourses();
        login.Course course12 = null;
        facultyClient6.assignCourse(course12);
        items.Textbook textbook14 = null;
        facultyClient6.update(textbook14);
        java.lang.String str16 = facultyClient6.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook20 = null;
        facultyClient19.update(textbook20);
        java.util.Set<login.Course> courseSet22 = facultyClient19.getCourses();
        login.Course course23 = null;
        facultyClient19.assignCourse(course23);
        items.Textbook textbook25 = null;
        facultyClient19.update(textbook25);
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
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        facultyClient4.type = "";
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        org.junit.Assert.assertNotNull(courseSet5);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
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
        java.lang.String str18 = facultyClient1.getRole();
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course23 = null;
        facultyClient1.assignCourse(course23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        facultyClient1.type = "Faculty";
        java.lang.String str20 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
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
        java.util.Set<login.Course> courseSet14 = facultyClient5.getCourses();
        java.lang.String str15 = facultyClient5.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
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
        java.util.Set<login.Course> courseSet16 = facultyClient4.getCourses();
        java.lang.String str17 = facultyClient4.getType();
        java.lang.String str18 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
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
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        java.lang.String str13 = facultyClient1.type;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
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
        facultyClient4.type = "Faculty";
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
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
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
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
        items.Textbook textbook16 = null;
        facultyClient15.update(textbook16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str19 = facultyClient15.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        facultyClient3.type = "hi!";
        java.lang.String str9 = facultyClient3.type;
        facultyClient3.type = "";
        java.lang.String str12 = facultyClient3.getType();
        login.Course course13 = null;
        facultyClient3.assignCourse(course13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getRole();
        login.Course course11 = null;
        facultyClient9.assignCourse(course11);
        java.lang.String str13 = facultyClient9.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.lang.String str9 = facultyClient1.type;
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.Course course9 = null;
        facultyClient3.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "hi!";
        java.lang.String str14 = facultyClient3.getType();
        facultyClient3.type = "";
        items.Textbook textbook17 = null;
        facultyClient3.update(textbook17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
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
        login.FacultyClient facultyClient24 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet25 = facultyClient24.getCourses();
        java.lang.String str26 = facultyClient24.getType();
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
        org.junit.Assert.assertNotNull(courseSet25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
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
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
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
        java.lang.String str20 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
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
        java.lang.String str16 = facultyClient4.getType();
        java.lang.String str17 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet18 = facultyClient4.getCourses();
        java.lang.String str19 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
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
        java.lang.String str15 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "";
        java.lang.String str10 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.util.Set<login.Course> courseSet9 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
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
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.String str13 = facultyClient9.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
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
        java.lang.String str13 = facultyClient6.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
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
        java.lang.Class<?> wildcardClass10 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        java.lang.String str8 = facultyClient4.type;
        java.lang.String str9 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
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
        items.Textbook textbook14 = null;
        facultyClient10.update(textbook14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        java.lang.String str9 = facultyClient4.type;
        java.lang.String str10 = facultyClient4.getType();
        java.lang.String str11 = facultyClient4.getRole();
        java.lang.String str12 = facultyClient4.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
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
        items.Textbook textbook12 = null;
        facultyClient10.update(textbook12);
        java.lang.String str14 = facultyClient10.getType();
        login.Course course15 = null;
        facultyClient10.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
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
        java.util.Set<login.Course> courseSet12 = facultyClient7.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("", "", "Faculty");
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
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
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
        java.lang.String str11 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("hi!", "Faculty", "hi!");
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
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
        facultyClient16.type = "Faculty";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient16);
        java.lang.String str20 = facultyClient16.getRole();
        login.Course course21 = null;
        facultyClient16.assignCourse(course21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
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
        java.lang.String str13 = facultyClient4.type;
        java.lang.String str14 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
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
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        java.lang.String str21 = facultyClient1.type;
        items.Textbook textbook22 = null;
        facultyClient1.update(textbook22);
        items.Textbook textbook24 = null;
        facultyClient1.update(textbook24);
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
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        items.Textbook textbook8 = null;
        facultyClient3.update(textbook8);
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        login.Course course11 = null;
        facultyClient3.assignCourse(course11);
        login.Course course13 = null;
        facultyClient3.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient3.update(textbook15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient1.type;
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
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
        java.lang.String str12 = facultyClient5.type;
        login.Course course13 = null;
        facultyClient5.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str16 = facultyClient15.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str18 = facultyClient17.type;
        login.Course course19 = null;
        facultyClient17.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.type;
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass9 = facultyClient8.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
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
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass19 = courseSet18.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient15.register("Faculty", "hi!", "");
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
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.type;
        facultyClient5.type = "";
        facultyClient5.type = "";
        java.lang.String str11 = facultyClient5.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
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
        java.util.Set<login.Course> courseSet21 = facultyClient14.getCourses();
        java.util.Set<login.Course> courseSet22 = facultyClient14.getCourses();
        java.lang.String str23 = facultyClient14.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
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
        java.lang.String str14 = facultyClient10.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
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
        login.FacultyClient facultyClient24 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str25 = facultyClient24.type;
        login.Course course26 = null;
        facultyClient24.assignCourse(course26);
        login.Course course28 = null;
        facultyClient24.assignCourse(course28);
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
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getType();
        java.lang.String str5 = facultyClient3.getRole();
        items.Textbook textbook6 = null;
        facultyClient3.update(textbook6);
        java.lang.String str8 = facultyClient3.getRole();
        facultyClient3.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        java.lang.String str16 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
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
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
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
        facultyClient7.type = "";
        facultyClient7.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getType();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
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
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        java.lang.String str16 = facultyClient4.type;
        java.lang.String str17 = facultyClient4.getRole();
        login.Course course18 = null;
        facultyClient4.assignCourse(course18);
        java.lang.String str20 = facultyClient4.getRole();
        java.lang.String str21 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient3.type;
        java.util.Set<login.Course> courseSet9 = facultyClient3.getCourses();
        facultyClient3.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.type;
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
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
        java.lang.String str12 = facultyClient1.getType();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
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
        java.lang.String str12 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        login.Course course14 = null;
        facultyClient4.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
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
        login.Course course19 = null;
        facultyClient4.assignCourse(course19);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
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
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass12 = courseSet11.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
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
        java.lang.String str13 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.Class<?> wildcardClass18 = facultyClient17.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
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
        java.lang.String str12 = facultyClient1.getRole();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
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
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
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
        java.lang.String str12 = facultyClient5.type;
        login.Course course13 = null;
        facultyClient5.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str16 = facultyClient15.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
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
        java.lang.String str13 = facultyClient3.type;
        items.Textbook textbook14 = null;
        facultyClient3.update(textbook14);
        java.lang.String str16 = facultyClient3.getType();
        login.Course course17 = null;
        facultyClient3.assignCourse(course17);
        java.lang.String str19 = facultyClient3.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        java.lang.String str8 = facultyClient4.type;
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course14 = null;
        facultyClient4.assignCourse(course14);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
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
        java.lang.String str15 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str18 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        java.lang.String str20 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        java.lang.String str7 = facultyClient3.type;
        java.lang.String str8 = facultyClient3.getRole();
        facultyClient3.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
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
        java.lang.String str17 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
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
        items.Textbook textbook14 = null;
        facultyClient13.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
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
        java.lang.String str14 = facultyClient3.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient16.type = "hi!";
        login.Course course19 = null;
        facultyClient16.assignCourse(course19);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient16);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient21.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
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
        java.lang.String str15 = facultyClient3.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
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
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
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
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
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
        java.lang.String str15 = facultyClient1.getType();
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.getType();
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
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
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "");
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
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
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
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient13);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
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
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        java.lang.String str15 = facultyClient10.type;
        java.lang.String str16 = facultyClient10.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
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
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        java.lang.String str20 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = facultyClient1.getPassword("Faculty");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
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
        java.lang.String str18 = facultyClient1.type;
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient1.type;
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
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
        java.lang.String str10 = facultyClient7.getRole();
        facultyClient7.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
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
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
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
        java.lang.String str15 = facultyClient10.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
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
        items.Textbook textbook11 = null;
        facultyClient9.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient9.update(textbook13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        java.lang.String str8 = facultyClient4.type;
        java.lang.String str9 = facultyClient4.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
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
        facultyClient17.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.type;
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient7.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.lang.String str6 = facultyClient4.type;
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        facultyClient4.type = "Faculty";
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        java.lang.Class<?> wildcardClass12 = courseSet11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        facultyClient4.type = "";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        java.lang.String str7 = facultyClient3.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
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
        facultyClient1.type = "Faculty";
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        facultyClient4.type = "";
        facultyClient4.type = "Faculty";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str12 = facultyClient4.getRole();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        java.lang.String str7 = facultyClient3.getType();
        java.lang.String str8 = facultyClient3.getType();
        items.Textbook textbook9 = null;
        facultyClient3.update(textbook9);
        java.lang.String str11 = facultyClient3.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
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
        login.Course course11 = null;
        facultyClient10.assignCourse(course11);
        java.lang.String str13 = facultyClient10.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient10);
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        facultyClient1.type = "";
        java.lang.String str11 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass12 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.getRole();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass11 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
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
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass19 = courseSet18.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getRole();
        java.lang.String str10 = facultyClient1.type;
        java.lang.String str11 = facultyClient1.getRole();
        java.lang.String str12 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
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
        java.lang.String str14 = facultyClient12.getRole();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.Class<?> wildcardClass16 = facultyClient15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
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
        java.lang.String str14 = facultyClient1.type;
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
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
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass21 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
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
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient8.type = "";
        java.lang.String str11 = facultyClient8.type;
        facultyClient8.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
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
        java.lang.String str13 = facultyClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
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
        java.lang.String str10 = facultyClient1.getType();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
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
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str11 = facultyClient10.getRole();
        java.util.Set<login.Course> courseSet12 = facultyClient10.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
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
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient8);
        java.lang.String str10 = facultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
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
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient19);
        facultyClient22.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        login.Course course12 = null;
        facultyClient11.assignCourse(course12);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
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
        java.lang.String str15 = facultyClient11.getRole();
        java.lang.String str16 = facultyClient11.getRole();
        java.lang.Class<?> wildcardClass17 = facultyClient11.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        java.lang.String str16 = facultyClient14.type;
        java.lang.String str17 = facultyClient14.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient14.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
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
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient10.register("", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
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
        java.lang.String str17 = facultyClient16.type;
        java.util.Set<login.Course> courseSet18 = facultyClient16.getCourses();
        items.Textbook textbook19 = null;
        facultyClient16.update(textbook19);
        login.Course course21 = null;
        facultyClient16.assignCourse(course21);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        java.lang.String str6 = facultyClient1.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient1.getRole();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        java.lang.String str10 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        java.lang.String str12 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
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
        java.util.Set<login.Course> courseSet14 = facultyClient3.getCourses();
        java.lang.Class<?> wildcardClass15 = courseSet14.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
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
        java.lang.Class<?> wildcardClass16 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
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
        java.lang.String str16 = facultyClient14.getType();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.String str18 = facultyClient14.getRole();
        facultyClient14.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
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
        java.lang.String str22 = facultyClient21.getRole();
        login.Course course23 = null;
        facultyClient21.assignCourse(course23);
        login.Course course25 = null;
        facultyClient21.assignCourse(course25);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
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
        java.lang.String str13 = facultyClient12.type;
        items.Textbook textbook14 = null;
        facultyClient12.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
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
        java.lang.String str25 = facultyClient24.type;
        java.lang.String str26 = facultyClient24.type;
        items.Textbook textbook27 = null;
        facultyClient24.update(textbook27);
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient12.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
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
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        java.lang.String str7 = facultyClient3.getType();
        java.lang.String str8 = facultyClient3.getRole();
        java.lang.String str9 = facultyClient3.getRole();
        java.lang.String str10 = facultyClient3.getRole();
        login.Course course11 = null;
        facultyClient3.assignCourse(course11);
        java.lang.Class<?> wildcardClass13 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.type;
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient11.getRole();
        java.lang.String str13 = facultyClient11.type;
        java.lang.String str14 = facultyClient11.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str9 = facultyClient4.type;
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        items.Textbook textbook8 = null;
        facultyClient3.update(textbook8);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
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
        java.util.Set<login.Course> courseSet17 = facultyClient8.getCourses();
        java.lang.String str18 = facultyClient8.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
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
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
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
        java.lang.String str16 = facultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
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
        java.lang.String str11 = facultyClient1.type;
        java.lang.String str12 = facultyClient1.getRole();
        java.lang.String str13 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet18 = facultyClient17.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
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
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet11 = facultyClient3.getCourses();
        java.lang.String str12 = facultyClient3.getType();
        java.lang.String str13 = facultyClient3.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
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
        facultyClient14.update(textbook15);
        java.lang.String str17 = facultyClient14.getType();
        java.lang.String str18 = facultyClient14.getRole();
        java.util.Set<login.Course> courseSet19 = facultyClient14.getCourses();
        java.lang.Class<?> wildcardClass20 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "Faculty");
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
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient3.type = "hi!";
        login.Course course6 = null;
        facultyClient3.assignCourse(course6);
        login.Course course8 = null;
        facultyClient3.assignCourse(course8);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
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
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.type;
        java.lang.String str11 = facultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
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
        facultyClient1.type = "Faculty";
        login.Course course23 = null;
        facultyClient1.assignCourse(course23);
        items.Textbook textbook25 = null;
        facultyClient1.update(textbook25);
        items.Textbook textbook27 = null;
        facultyClient1.update(textbook27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = facultyClient1.getPassword("");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient6.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str9 = facultyClient8.getRole();
        items.Textbook textbook10 = null;
        facultyClient8.update(textbook10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
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
        facultyClient4.type = "";
        java.lang.String str13 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
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
        java.lang.String str12 = facultyClient1.getRole();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient10.type = "hi!";
        java.util.Set<login.Course> courseSet13 = facultyClient10.getCourses();
        login.Course course14 = null;
        facultyClient10.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient13);
        facultyClient13.type = "";
        facultyClient13.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        java.lang.String str6 = facultyClient1.type;
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
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
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
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
        java.lang.String str16 = facultyClient1.type;
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        java.lang.String str21 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
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
        java.lang.String str13 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.getRole();
        java.util.Set<login.Course> courseSet7 = facultyClient5.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        java.lang.String str8 = facultyClient1.getType();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
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
        items.Textbook textbook14 = null;
        facultyClient7.update(textbook14);
        facultyClient7.type = "hi!";
        java.lang.Class<?> wildcardClass18 = facultyClient7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
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
        java.lang.String str12 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.lang.String str15 = facultyClient4.getType();
        login.Course course16 = null;
        facultyClient4.assignCourse(course16);
        java.lang.Class<?> wildcardClass18 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.getRole();
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        java.util.Set<login.Course> courseSet14 = facultyClient12.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
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
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.type;
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
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
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course16 = null;
        facultyClient15.assignCourse(course16);
        java.util.Set<login.Course> courseSet18 = facultyClient15.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
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
        items.Textbook textbook17 = null;
        facultyClient5.update(textbook17);
        facultyClient5.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = facultyClient5.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "hi!");
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
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass6 = facultyClient5.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        login.Course course5 = null;
        facultyClient3.assignCourse(course5);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str10 = facultyClient3.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
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
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass18 = courseSet17.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
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
        login.Course course14 = null;
        facultyClient13.assignCourse(course14);
        java.lang.String str16 = facultyClient13.getType();
        java.util.Set<login.Course> courseSet17 = facultyClient13.getCourses();
        java.lang.String str18 = facultyClient13.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
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
        facultyClient4.type = "";
        java.lang.String str13 = facultyClient4.type;
        login.Course course14 = null;
        facultyClient4.assignCourse(course14);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
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
        java.lang.String str20 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient17.getType();
        java.util.Set<login.Course> courseSet19 = facultyClient17.getCourses();
        java.lang.String str20 = facultyClient17.getType();
        login.Course course21 = null;
        facultyClient17.assignCourse(course21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
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
        facultyClient4.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
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
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
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
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet17 = facultyClient16.getCourses();
        login.Course course18 = null;
        facultyClient16.assignCourse(course18);
        java.lang.String str20 = facultyClient16.getType();
        java.util.Set<login.Course> courseSet21 = facultyClient16.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        java.util.Set<login.Course> courseSet9 = facultyClient4.getCourses();
        java.lang.Class<?> wildcardClass10 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
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
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.type;
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
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
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
        facultyClient5.type = "Faculty";
        java.util.Set<login.Course> courseSet14 = facultyClient5.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        java.lang.String str7 = facultyClient3.getType();
        login.Course course8 = null;
        facultyClient3.assignCourse(course8);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
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
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.lang.String str19 = facultyClient1.type;
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient10.register("", "", "hi!");
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
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
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
        java.lang.String str17 = facultyClient3.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
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
        java.lang.String str14 = facultyClient1.getType();
        java.lang.String str15 = facultyClient1.type;
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str17 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
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
        items.Textbook textbook22 = null;
        facultyClient21.update(textbook22);
        java.lang.String str24 = facultyClient21.getRole();
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
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
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
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        java.lang.String str12 = facultyClient4.type;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        java.lang.String str9 = facultyClient4.type;
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient10.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
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
        java.lang.String str14 = facultyClient13.getType();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient13);
        items.Textbook textbook16 = null;
        facultyClient15.update(textbook16);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient15.register("hi!", "", "");
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
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
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
        java.lang.String str14 = facultyClient1.type;
        java.lang.String str15 = facultyClient1.type;
        facultyClient1.type = "";
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        java.lang.String str9 = facultyClient4.getType();
        java.lang.String str10 = facultyClient4.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
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
        facultyClient3.type = "";
        java.lang.String str17 = facultyClient3.getRole();
        java.lang.Class<?> wildcardClass18 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
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
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
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
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
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
        login.Course course18 = null;
        facultyClient17.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
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
        login.Course course17 = null;
        facultyClient16.assignCourse(course17);
        items.Textbook textbook19 = null;
        facultyClient16.update(textbook19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
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
        java.lang.String str13 = facultyClient1.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
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
        java.lang.String str13 = facultyClient4.type;
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
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
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.getRole();
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
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
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.lang.String str17 = facultyClient1.getType();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
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
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        login.Course course17 = null;
        facultyClient14.assignCourse(course17);
        java.lang.Class<?> wildcardClass19 = facultyClient14.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
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
        java.lang.String str13 = facultyClient12.getType();
        java.lang.String str14 = facultyClient12.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.getType();
        java.lang.String str9 = facultyClient1.getType();
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.type;
        java.lang.String str7 = facultyClient5.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient5.getCourses();
        java.lang.String str9 = facultyClient5.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
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
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.getType();
        java.lang.String str17 = facultyClient1.type;
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
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
        java.lang.String str19 = facultyClient18.type;
        java.lang.String str20 = facultyClient18.getType();
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient18);
        login.Course course22 = null;
        facultyClient21.assignCourse(course22);
        java.lang.String str24 = facultyClient21.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
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
        login.Course course12 = null;
        facultyClient11.assignCourse(course12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.Class<?> wildcardClass9 = facultyClient8.getClass();
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
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
        facultyClient1.type = "";
        java.lang.String str18 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        facultyClient1.type = "Faculty";
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
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
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet23 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass24 = courseSet23.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(courseSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
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
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient9.type = "";
        java.lang.String str12 = facultyClient9.getRole();
        java.lang.String str13 = facultyClient9.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        java.lang.String str16 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
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
        login.Course course10 = null;
        facultyClient7.assignCourse(course10);
        java.util.Set<login.Course> courseSet12 = facultyClient7.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("hi!", "hi!", "");
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
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass13 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
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
        java.lang.Class<?> wildcardClass11 = facultyClient5.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
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
        java.util.Set<login.Course> courseSet12 = facultyClient9.getCourses();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.Class<?> wildcardClass14 = facultyClient9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient14.type = "Faculty";
        java.lang.Class<?> wildcardClass17 = facultyClient14.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        facultyClient1.type = "";
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
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
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
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
        java.util.Set<login.Course> courseSet20 = facultyClient19.getCourses();
        facultyClient19.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient19.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
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
        java.lang.String str10 = facultyClient4.getType();
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.String str13 = facultyClient4.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str15 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
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
        facultyClient9.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        facultyClient1.type = "";
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
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
        java.lang.String str12 = facultyClient11.getRole();
        login.Course course13 = null;
        facultyClient11.assignCourse(course13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
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
        java.lang.String str16 = facultyClient11.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
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
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
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
        facultyClient14.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("Faculty", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
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
        java.lang.String str10 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        java.lang.String str12 = facultyClient1.getRole();
        facultyClient1.type = "";
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.type;
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
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
        facultyClient3.type = "";
        facultyClient3.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str9 = facultyClient4.type;
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient10);
        java.lang.String str15 = facultyClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient14.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient17.getPassword("");
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
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course14 = null;
        facultyClient13.assignCourse(course14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass14 = facultyClient13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
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
        facultyClient17.type = "hi!";
        login.Course course20 = null;
        facultyClient17.assignCourse(course20);
        java.lang.String str22 = facultyClient17.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
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
        facultyClient4.type = "hi!";
        items.Textbook textbook16 = null;
        facultyClient4.update(textbook16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient18.type = "hi!";
        java.lang.String str21 = facultyClient18.type;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
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
        java.lang.String str17 = facultyClient4.type;
        java.lang.String str18 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getRole();
        java.lang.String str11 = facultyClient9.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
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
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.getRole();
        facultyClient1.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient1.getRole();
        java.lang.String str10 = facultyClient1.getRole();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
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
        facultyClient4.type = "hi!";
        java.lang.String str14 = facultyClient4.type;
        items.Textbook textbook15 = null;
        facultyClient4.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient5.update(textbook6);
        facultyClient5.type = "hi!";
        java.util.Set<login.Course> courseSet10 = facultyClient5.getCourses();
        java.util.Set<login.Course> courseSet11 = facultyClient5.getCourses();
        java.lang.String str12 = facultyClient5.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
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
        facultyClient11.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
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
        facultyClient5.type = "Faculty";
        java.lang.String str14 = facultyClient5.getRole();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient5);
        login.Course course16 = null;
        facultyClient15.assignCourse(course16);
        java.lang.String str18 = facultyClient15.getType();
        login.Course course19 = null;
        facultyClient15.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
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
        items.Textbook textbook14 = null;
        facultyClient13.update(textbook14);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
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
        items.Textbook textbook16 = null;
        facultyClient15.update(textbook16);
        java.lang.String str18 = facultyClient15.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
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
        facultyClient15.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
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
        facultyClient6.type = "Faculty";
        java.util.Set<login.Course> courseSet14 = facultyClient6.getCourses();
        login.Course course15 = null;
        facultyClient6.assignCourse(course15);
        java.util.Set<login.Course> courseSet17 = facultyClient6.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
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
        java.lang.String str18 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        java.lang.String str20 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
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
        facultyClient4.type = "";
        java.lang.String str13 = facultyClient4.type;
        java.util.Set<login.Course> courseSet14 = facultyClient4.getCourses();
        java.lang.Class<?> wildcardClass15 = courseSet14.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
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
        java.util.Set<login.Course> courseSet13 = facultyClient12.getCourses();
        java.lang.String str14 = facultyClient12.getRole();
        java.lang.String str15 = facultyClient12.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
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
        java.lang.String str12 = facultyClient8.getRole();
        facultyClient8.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient8.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.type;
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient5);
        items.Textbook textbook8 = null;
        facultyClient5.update(textbook8);
        java.lang.Class<?> wildcardClass10 = facultyClient5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
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
        facultyClient15.type = "hi!";
        java.util.Set<login.Course> courseSet18 = facultyClient15.getCourses();
        java.lang.String str19 = facultyClient15.getRole();
        java.util.Set<login.Course> courseSet20 = facultyClient15.getCourses();
        java.util.Set<login.Course> courseSet21 = facultyClient15.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
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
        login.Course course14 = null;
        facultyClient10.assignCourse(course14);
        login.Course course16 = null;
        facultyClient10.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
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
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str15 = facultyClient1.type;
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet16 = facultyClient15.getCourses();
        login.Course course17 = null;
        facultyClient15.assignCourse(course17);
        login.Course course19 = null;
        facultyClient15.assignCourse(course19);
        java.lang.String str21 = facultyClient15.getType();
        java.lang.String str22 = facultyClient15.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
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
        java.lang.Class<?> wildcardClass17 = facultyClient16.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
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
        java.lang.String str14 = facultyClient1.getRole();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
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
        login.Course course20 = null;
        facultyClient15.assignCourse(course20);
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.Class<?> wildcardClass23 = facultyClient15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
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
        java.lang.String str10 = facultyClient1.type;
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.lang.String str13 = facultyClient1.getRole();
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
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
        java.lang.String str10 = facultyClient4.getType();
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
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
        facultyClient14.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient7.type = "";
        java.lang.String str10 = facultyClient7.getRole();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient7);
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
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
        facultyClient4.type = "";
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        java.util.Set<login.Course> courseSet15 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
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
        java.lang.String str15 = facultyClient5.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str17 = facultyClient5.getRole();
        java.lang.String str18 = facultyClient5.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
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
        java.lang.String str11 = facultyClient4.getType();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        java.lang.String str14 = facultyClient4.getRole();
        java.lang.String str15 = facultyClient4.type;
        java.lang.String str16 = facultyClient4.getType();
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
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
        java.lang.String str10 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
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
        java.lang.String str18 = facultyClient17.getType();
        java.lang.String str19 = facultyClient17.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient17.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
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
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
    }
}

