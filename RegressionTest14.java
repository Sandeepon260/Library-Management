import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
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
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.getType();
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.lang.String str6 = facultyClient4.getRole();
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str12 = facultyClient4.getType();
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient7.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
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
        java.lang.String str12 = facultyClient11.type;
        java.lang.String str13 = facultyClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
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
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
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
        java.lang.String str17 = facultyClient3.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
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
        login.Course course19 = null;
        facultyClient10.assignCourse(course19);
        java.lang.String str21 = facultyClient10.getType();
        facultyClient10.type = "hi!";
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
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
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
        java.lang.Class<?> wildcardClass21 = facultyClient20.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
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
        java.lang.String str13 = facultyClient9.type;
        items.Textbook textbook14 = null;
        facultyClient9.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass15 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
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
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
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
        java.util.Set<login.Course> courseSet19 = facultyClient4.getCourses();
        java.lang.Class<?> wildcardClass20 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
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
        java.lang.String str14 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient1.getPassword("Faculty");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
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
        java.lang.String str14 = facultyClient13.getRole();
        items.Textbook textbook15 = null;
        facultyClient13.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str6 = facultyClient5.getType();
        items.Textbook textbook7 = null;
        facultyClient5.update(textbook7);
        java.util.Set<login.Course> courseSet9 = facultyClient5.getCourses();
        login.Course course10 = null;
        facultyClient5.assignCourse(course10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
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
        java.lang.String str24 = facultyClient1.getType();
        java.lang.String str25 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        facultyClient4.type = "hi!";
        java.lang.String str8 = facultyClient4.getRole();
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        java.lang.String str11 = facultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
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
        login.Course course19 = null;
        facultyClient16.assignCourse(course19);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.getRole();
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        java.lang.String str10 = facultyClient4.getRole();
        java.lang.String str11 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
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
        java.lang.String str15 = facultyClient14.type;
        java.lang.String str16 = facultyClient14.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
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
        java.lang.String str20 = facultyClient19.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = facultyClient19.getPassword("");
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
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
        java.lang.String str15 = facultyClient1.type;
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
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
        facultyClient4.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet16 = facultyClient15.getCourses();
        facultyClient15.type = "";
        java.lang.String str19 = facultyClient15.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
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
        login.Course course16 = null;
        facultyClient3.assignCourse(course16);
        java.lang.String str18 = facultyClient3.type;
        items.Textbook textbook19 = null;
        facultyClient3.update(textbook19);
        java.lang.String str21 = facultyClient3.getRole();
        java.lang.String str22 = facultyClient3.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
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
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
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
        java.lang.String str14 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "hi!";
        java.lang.String str9 = facultyClient1.type;
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        java.lang.String str12 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        java.lang.String str19 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient11);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.type;
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
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
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.getRole();
        java.lang.String str13 = facultyClient1.getType();
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("hi!", "Faculty", "");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
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
        java.lang.String str20 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
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
        facultyClient1.type = "hi!";
        facultyClient1.type = "hi!";
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
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
        java.lang.String str11 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
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
        java.lang.String str15 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
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
        login.Course course18 = null;
        facultyClient16.assignCourse(course18);
        java.lang.String str20 = facultyClient16.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = facultyClient16.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.Class<?> wildcardClass18 = facultyClient17.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
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
        login.Course course21 = null;
        facultyClient1.assignCourse(course21);
        login.FacultyClient facultyClient23 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course24 = null;
        facultyClient1.assignCourse(course24);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
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
        java.lang.String str10 = facultyClient7.getRole();
        java.lang.String str11 = facultyClient7.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.getRole();
        java.lang.String str9 = facultyClient4.getType();
        java.lang.String str10 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
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
        java.lang.Class<?> wildcardClass14 = courseSet13.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("hi!", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.Class<?> wildcardClass20 = facultyClient5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
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
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
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
        login.Course course11 = null;
        facultyClient7.assignCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str19 = facultyClient18.getRole();
        java.lang.String str20 = facultyClient18.type;
        java.lang.String str21 = facultyClient18.getType();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
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
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        items.Textbook textbook14 = null;
        facultyClient13.update(textbook14);
        java.util.Set<login.Course> courseSet16 = facultyClient13.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
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
        facultyClient11.type = "hi!";
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str15 = facultyClient14.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
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
        java.lang.String str11 = facultyClient7.getType();
        java.lang.String str12 = facultyClient7.getType();
        java.lang.String str13 = facultyClient7.getRole();
        java.util.Set<login.Course> courseSet14 = facultyClient7.getCourses();
        java.lang.String str15 = facultyClient7.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str14 = facultyClient13.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
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
        java.lang.String str19 = facultyClient15.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient8);
        java.lang.String str10 = facultyClient9.getType();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient9);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.Class<?> wildcardClass13 = facultyClient12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
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
        java.util.Set<login.Course> courseSet17 = facultyClient16.getCourses();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient16);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient16);
        facultyClient19.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient14);
        java.lang.Class<?> wildcardClass16 = facultyClient15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
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
        items.Textbook textbook13 = null;
        facultyClient10.update(textbook13);
        items.Textbook textbook15 = null;
        facultyClient10.update(textbook15);
        java.lang.String str17 = facultyClient10.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
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
        java.lang.String str14 = facultyClient1.type;
        java.lang.String str15 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
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
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.type;
        java.lang.String str5 = facultyClient3.getRole();
        items.Textbook textbook6 = null;
        facultyClient3.update(textbook6);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient8);
        login.Course course10 = null;
        facultyClient9.assignCourse(course10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
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
        login.Course course18 = null;
        facultyClient17.assignCourse(course18);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient17.register("hi!", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
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
            java.lang.String str14 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
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
        java.lang.Class<?> wildcardClass14 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
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
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
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
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
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
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
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
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
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
        items.Textbook textbook15 = null;
        facultyClient12.update(textbook15);
        facultyClient12.type = "Faculty";
        java.util.Set<login.Course> courseSet19 = facultyClient12.getCourses();
        login.Course course20 = null;
        facultyClient12.assignCourse(course20);
        facultyClient12.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
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
        facultyClient11.type = "Faculty";
        java.util.Set<login.Course> courseSet16 = facultyClient11.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
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
        facultyClient1.type = "Faculty";
        java.lang.String str17 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        facultyClient1.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
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
        java.lang.String str17 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
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
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
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
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        items.Textbook textbook14 = null;
        facultyClient11.update(textbook14);
        login.Course course16 = null;
        facultyClient11.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
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
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
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
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient15.register("Faculty", "", "Faculty");
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
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
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
        java.lang.Class<?> wildcardClass13 = facultyClient7.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
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
        java.lang.String str17 = facultyClient3.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
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
        java.lang.String str22 = facultyClient11.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.getRole();
        java.lang.String str8 = facultyClient6.type;
        java.lang.String str9 = facultyClient6.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient6);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient6);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
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
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
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
        java.lang.String str14 = facultyClient10.type;
        java.lang.String str15 = facultyClient10.type;
        java.lang.String str16 = facultyClient10.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient10.getPassword("Faculty");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str14 = facultyClient13.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient13);
        items.Textbook textbook16 = null;
        facultyClient13.update(textbook16);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
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
        login.Course course17 = null;
        facultyClient5.assignCourse(course17);
        java.lang.String str19 = facultyClient5.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
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
        facultyClient10.type = "Faculty";
        java.lang.String str16 = facultyClient10.getRole();
        java.util.Set<login.Course> courseSet17 = facultyClient10.getCourses();
        facultyClient10.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
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
        facultyClient9.assignCourse(course10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        java.lang.String str11 = facultyClient1.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
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
        facultyClient9.type = "Faculty";
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
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.lang.String str11 = facultyClient4.getType();
        java.lang.String str12 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
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
        facultyClient16.type = "hi!";
        items.Textbook textbook19 = null;
        facultyClient16.update(textbook19);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient16.register("hi!", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
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
        java.lang.String str15 = facultyClient1.getType();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facultyClient7.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str20 = facultyClient1.getType();
        java.lang.String str21 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet22 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(courseSet22);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient7);
        facultyClient8.type = "";
        java.lang.String str11 = facultyClient8.getRole();
        java.util.Set<login.Course> courseSet12 = facultyClient8.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
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
        java.lang.String str14 = facultyClient10.type;
        java.lang.String str15 = facultyClient10.type;
        facultyClient10.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
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
        items.Textbook textbook13 = null;
        facultyClient3.update(textbook13);
        login.Course course15 = null;
        facultyClient3.assignCourse(course15);
        login.Course course17 = null;
        facultyClient3.assignCourse(course17);
        facultyClient3.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient1.getRole();
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
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
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
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
        java.lang.String str17 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.Class<?> wildcardClass20 = facultyClient1.getClass();
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
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("hi!", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
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
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
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
        facultyClient1.type = "hi!";
        java.lang.String str13 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
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
        items.Textbook textbook13 = null;
        facultyClient10.update(textbook13);
        java.lang.String str15 = facultyClient10.getRole();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient10);
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient10);
        items.Textbook textbook18 = null;
        facultyClient17.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
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
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str13 = facultyClient12.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
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
        java.lang.String str11 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        java.lang.String str13 = facultyClient4.type;
        java.lang.Class<?> wildcardClass14 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        java.lang.String str11 = facultyClient4.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
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
        facultyClient3.type = "";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
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
        java.lang.String str11 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        login.Course course2 = null;
        facultyClient1.assignCourse(course2);
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.String str6 = facultyClient1.type;
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
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
        java.util.Set<login.Course> courseSet17 = facultyClient10.getCourses();
        items.Textbook textbook18 = null;
        facultyClient10.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
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
        java.lang.String str13 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        login.Course course9 = null;
        facultyClient7.assignCourse(course9);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
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
        java.util.Set<login.Course> courseSet19 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facultyClient6.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
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
        java.lang.String str15 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
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
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient1);
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
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
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
        java.lang.String str16 = facultyClient5.type;
        java.lang.String str17 = facultyClient5.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
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
        java.lang.String str12 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook15 = null;
        facultyClient14.update(textbook15);
        facultyClient14.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
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
        java.lang.String str21 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
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
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        java.lang.String str14 = facultyClient4.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
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
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
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
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
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
        login.Course course12 = null;
        facultyClient6.assignCourse(course12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient6.getPassword("");
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
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
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
        java.lang.String str13 = facultyClient7.type;
        login.Course course14 = null;
        facultyClient7.assignCourse(course14);
        java.lang.String str16 = facultyClient7.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        facultyClient5.type = "Faculty";
        facultyClient5.type = "Faculty";
        java.lang.String str12 = facultyClient5.type;
        java.util.Set<login.Course> courseSet13 = facultyClient5.getCourses();
        login.Course course14 = null;
        facultyClient5.assignCourse(course14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass6 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
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
        java.util.Set<login.Course> courseSet17 = facultyClient14.getCourses();
        java.lang.String str18 = facultyClient14.type;
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient7);
        java.lang.String str9 = facultyClient8.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
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
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        facultyClient4.type = "hi!";
        java.lang.String str16 = facultyClient4.type;
        java.util.Set<login.Course> courseSet17 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient8.register("hi!", "", "Faculty");
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
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
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
        java.lang.String str13 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
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
        java.lang.String str12 = facultyClient4.getRole();
        java.lang.String str13 = facultyClient4.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
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
        java.lang.String str20 = facultyClient11.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
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
        java.lang.String str12 = facultyClient7.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
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
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook13 = null;
        facultyClient4.update(textbook13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
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
        java.lang.String str13 = facultyClient12.getRole();
        java.util.Set<login.Course> courseSet14 = facultyClient12.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
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
        java.lang.String str17 = facultyClient16.type;
        items.Textbook textbook18 = null;
        facultyClient16.update(textbook18);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient16);
        java.lang.Class<?> wildcardClass21 = facultyClient20.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = facultyClient1.getPassword("Faculty");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
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
        facultyClient1.type = "hi!";
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
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
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
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
        java.lang.String str17 = facultyClient10.getRole();
        java.lang.String str18 = facultyClient10.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = facultyClient10.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient5.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
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
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        java.lang.String str14 = facultyClient4.getType();
        java.lang.String str15 = facultyClient4.type;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
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
        java.util.Set<login.Course> courseSet14 = facultyClient10.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
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
        facultyClient1.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("");
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
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
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
        java.lang.String str19 = facultyClient1.getType();
        java.lang.String str20 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass21 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
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
        java.lang.String str14 = facultyClient12.getRole();
        java.lang.String str15 = facultyClient12.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
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
        java.util.Set<login.Course> courseSet20 = facultyClient15.getCourses();
        java.lang.String str21 = facultyClient15.getType();
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
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
        java.lang.String str13 = facultyClient1.getType();
        java.lang.String str14 = facultyClient1.type;
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient1.getType();
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        java.lang.String str9 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
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
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        java.lang.String str12 = facultyClient4.type;
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
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
        java.util.Set<login.Course> courseSet18 = facultyClient17.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
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
        java.lang.String str16 = facultyClient11.getType();
        facultyClient11.type = "Faculty";
        facultyClient11.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
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
        java.lang.String str11 = facultyClient4.getRole();
        java.lang.String str12 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        facultyClient1.type = "";
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
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
        facultyClient11.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient11.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
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
        java.lang.String str13 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
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
        java.lang.String str13 = facultyClient10.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.Class<?> wildcardClass18 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
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
        facultyClient3.type = "";
        java.lang.Class<?> wildcardClass17 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
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
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
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
        login.Course course18 = null;
        facultyClient17.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        java.lang.String str8 = facultyClient4.getRole();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook10 = null;
        facultyClient9.update(textbook10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
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
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
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
        java.lang.Class<?> wildcardClass21 = facultyClient20.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
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
        java.lang.String str18 = facultyClient15.getType();
        java.lang.String str19 = facultyClient15.getType();
        java.lang.String str20 = facultyClient15.getType();
        facultyClient15.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
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
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
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
        java.lang.String str17 = facultyClient16.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        java.lang.String str11 = facultyClient4.getRole();
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
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
        java.lang.String str13 = facultyClient1.getRole();
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
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
        facultyClient1.type = "";
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
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
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
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
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
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
        java.lang.String str14 = facultyClient1.getType();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getRole();
        java.lang.String str6 = facultyClient3.getRole();
        java.lang.String str7 = facultyClient3.getType();
        facultyClient3.type = "hi!";
        java.util.Set<login.Course> courseSet10 = facultyClient3.getCourses();
        java.lang.String str11 = facultyClient3.getType();
        java.util.Set<login.Course> courseSet12 = facultyClient3.getCourses();
        login.Course course13 = null;
        facultyClient3.assignCourse(course13);
        login.Course course15 = null;
        facultyClient3.assignCourse(course15);
        login.Course course17 = null;
        facultyClient3.assignCourse(course17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
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
        java.lang.String str18 = facultyClient15.getType();
        facultyClient15.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
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
        java.util.Set<login.Course> courseSet16 = facultyClient14.getCourses();
        java.lang.Class<?> wildcardClass17 = courseSet16.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
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
        items.Textbook textbook17 = null;
        facultyClient16.update(textbook17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
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
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.type;
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet21 = facultyClient20.getCourses();
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
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
        login.FacultyClient facultyClient25 = new login.FacultyClient((login.Client) facultyClient1);
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
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient5.assignCourse(course6);
        facultyClient5.type = "Faculty";
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet11 = facultyClient5.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
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
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        java.lang.String str14 = facultyClient3.type;
        java.lang.String str15 = facultyClient3.getRole();
        login.Course course16 = null;
        facultyClient3.assignCourse(course16);
        java.lang.String str18 = facultyClient3.getRole();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        facultyClient1.type = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
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
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
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
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        java.lang.String str16 = facultyClient1.type;
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        java.lang.String str19 = facultyClient1.type;
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
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
        java.lang.String str20 = facultyClient12.getType();
        java.lang.String str21 = facultyClient12.type;
        login.Course course22 = null;
        facultyClient12.assignCourse(course22);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
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
        java.lang.String str17 = facultyClient1.type;
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course20 = null;
        facultyClient19.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
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
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getRole();
        java.lang.String str15 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
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
            facultyClient16.register("Faculty", "Faculty", "Faculty");
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
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
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
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        java.lang.String str19 = facultyClient1.getType();
        java.lang.String str20 = facultyClient1.type;
        java.lang.String str21 = facultyClient1.getRole();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
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
        java.lang.String str19 = facultyClient1.type;
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
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
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str15 = facultyClient3.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
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
        java.lang.String str12 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
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
        java.lang.String str15 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet16 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
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
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
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
        java.lang.String str22 = facultyClient1.getRole();
        login.Course course23 = null;
        facultyClient1.assignCourse(course23);
        login.FacultyClient facultyClient25 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str26 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Faculty" + "'", str26, "Faculty");
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        java.lang.Class<?> wildcardClass15 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
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
        java.lang.String str20 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet21 = facultyClient1.getCourses();
        java.lang.String str22 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
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
            facultyClient15.register("", "hi!", "hi!");
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
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        java.lang.String str9 = facultyClient3.type;
        java.lang.String str10 = facultyClient3.getRole();
        login.Course course11 = null;
        facultyClient3.assignCourse(course11);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
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
        java.lang.String str11 = facultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
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
            facultyClient4.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
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
        login.Course course15 = null;
        facultyClient3.assignCourse(course15);
        facultyClient3.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
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
        java.lang.String str12 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        java.lang.String str14 = facultyClient4.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook16 = null;
        facultyClient15.update(textbook16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
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
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
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
        java.lang.String str10 = facultyClient4.type;
        java.lang.String str11 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient4.getPassword("hi!");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
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
        java.lang.String str13 = facultyClient12.getType();
        items.Textbook textbook14 = null;
        facultyClient12.update(textbook14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
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
        items.Textbook textbook18 = null;
        facultyClient11.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
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
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
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
        items.Textbook textbook13 = null;
        facultyClient12.update(textbook13);
        java.util.Set<login.Course> courseSet15 = facultyClient12.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getType();
        items.Textbook textbook6 = null;
        facultyClient3.update(textbook6);
        facultyClient3.type = "hi!";
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient3);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient10);
        facultyClient10.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
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
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
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
        java.lang.Class<?> wildcardClass14 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
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
        java.lang.String str14 = facultyClient1.getRole();
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient19.getPassword("Faculty");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
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
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.getRole();
        java.lang.String str14 = facultyClient1.getRole();
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient15.type = "Faculty";
        login.Course course18 = null;
        facultyClient15.assignCourse(course18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.getRole();
        java.lang.String str8 = facultyClient6.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient6);
        java.lang.String str10 = facultyClient6.getRole();
        java.lang.String str11 = facultyClient6.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
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
        login.Course course16 = null;
        facultyClient3.assignCourse(course16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
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
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        java.util.Set<login.Course> courseSet20 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
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
        items.Textbook textbook21 = null;
        facultyClient20.update(textbook21);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.getRole();
        java.lang.String str8 = facultyClient6.type;
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient6.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
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
        facultyClient9.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course6 = null;
        facultyClient5.assignCourse(course6);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        login.Course course6 = null;
        facultyClient3.assignCourse(course6);
        java.lang.String str8 = facultyClient3.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
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
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
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
        java.lang.String str10 = facultyClient1.type;
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
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
        java.lang.String str13 = facultyClient12.type;
        facultyClient12.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
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
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        java.lang.String str14 = facultyClient3.type;
        java.lang.String str15 = facultyClient3.getRole();
        java.lang.String str16 = facultyClient3.type;
        java.lang.String str17 = facultyClient3.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
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
        java.util.Set<login.Course> courseSet13 = facultyClient9.getCourses();
        facultyClient9.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
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
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
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
        java.lang.String str12 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
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
        java.lang.String str17 = facultyClient1.getType();
        java.lang.String str18 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.getRole();
        java.lang.String str7 = facultyClient5.getType();
        login.Course course8 = null;
        facultyClient5.assignCourse(course8);
        java.lang.String str10 = facultyClient5.getRole();
        java.lang.Class<?> wildcardClass11 = facultyClient5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet9 = facultyClient8.getCourses();
        java.lang.String str10 = facultyClient8.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass10 = facultyClient1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
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
        facultyClient1.type = "hi!";
        java.lang.String str13 = facultyClient1.getType();
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str14 = facultyClient13.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
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
        facultyClient12.type = "Faculty";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str16 = facultyClient12.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient12.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook9 = null;
        facultyClient8.update(textbook9);
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient8);
        java.util.Set<login.Course> courseSet12 = facultyClient8.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
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
        login.Course course18 = null;
        facultyClient11.assignCourse(course18);
        facultyClient11.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient18.register("hi!", "hi!", "");
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
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
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
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        java.util.Set<login.Course> courseSet14 = facultyClient11.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient18);
        java.lang.String str20 = facultyClient18.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
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
        java.lang.String str15 = facultyClient8.getRole();
        login.Course course16 = null;
        facultyClient8.assignCourse(course16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
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
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
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
        facultyClient7.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
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
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.getRole();
        java.lang.String str7 = facultyClient5.getType();
        facultyClient5.type = "hi!";
        items.Textbook textbook10 = null;
        facultyClient5.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient5);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
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
        facultyClient4.type = "";
        java.lang.String str12 = facultyClient4.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
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
        login.FacultyClient facultyClient21 = new login.FacultyClient((login.Client) facultyClient15);
        facultyClient21.type = "";
        login.Course course24 = null;
        facultyClient21.assignCourse(course24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        login.Course course6 = null;
        facultyClient4.assignCourse(course6);
        items.Textbook textbook8 = null;
        facultyClient4.update(textbook8);
        java.lang.String str10 = facultyClient4.getType();
        java.lang.Class<?> wildcardClass11 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
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
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        login.Course course14 = null;
        facultyClient11.assignCourse(course14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str17 = facultyClient16.type;
        java.util.Set<login.Course> courseSet18 = facultyClient16.getCourses();
        login.Course course19 = null;
        facultyClient16.assignCourse(course19);
        java.util.Set<login.Course> courseSet21 = facultyClient16.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = facultyClient16.getPassword("hi!");
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
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
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
        login.Course course15 = null;
        facultyClient13.assignCourse(course15);
        java.lang.String str17 = facultyClient13.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        facultyClient1.type = "Faculty";
        facultyClient1.type = "";
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.String str6 = facultyClient1.getRole();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getType();
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
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
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.lang.String str6 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
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
        login.Course course21 = null;
        facultyClient1.assignCourse(course21);
        login.FacultyClient facultyClient23 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook24 = null;
        facultyClient1.update(textbook24);
        login.FacultyClient facultyClient26 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str27 = facultyClient26.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Faculty" + "'", str27, "Faculty");
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient7.type = "";
        java.util.Set<login.Course> courseSet10 = facultyClient7.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
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
        java.lang.String str22 = facultyClient1.type;
        java.lang.String str23 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
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
        items.Textbook textbook22 = null;
        facultyClient19.update(textbook22);
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
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
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
        facultyClient7.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
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
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str15 = facultyClient14.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient18.type = "hi!";
        login.Course course21 = null;
        facultyClient18.assignCourse(course21);
        login.Course course23 = null;
        facultyClient18.assignCourse(course23);
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
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
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
        java.lang.Class<?> wildcardClass16 = facultyClient13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
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
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
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
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
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
        java.lang.String str16 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
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
        java.lang.String str19 = facultyClient16.getRole();
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient16);
        items.Textbook textbook21 = null;
        facultyClient20.update(textbook21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
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
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        java.lang.Class<?> wildcardClass12 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
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
        java.lang.String str17 = facultyClient8.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = facultyClient22.getPassword("hi!");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
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
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        java.lang.Class<?> wildcardClass15 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
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
        java.lang.String str17 = facultyClient15.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
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
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        java.lang.String str20 = facultyClient1.type;
        items.Textbook textbook21 = null;
        facultyClient1.update(textbook21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
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
        java.util.Set<login.Course> courseSet25 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(courseSet25);
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
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
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.String str16 = facultyClient1.getRole();
        facultyClient1.type = "";
        java.lang.String str19 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
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
        java.lang.String str15 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
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
        java.lang.String str12 = facultyClient11.type;
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient11);
        login.Course course14 = null;
        facultyClient13.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
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
        java.lang.Class<?> wildcardClass19 = facultyClient16.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        java.lang.String str8 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
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
        items.Textbook textbook16 = null;
        facultyClient14.update(textbook16);
        java.lang.String str18 = facultyClient14.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
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
        items.Textbook textbook14 = null;
        facultyClient5.update(textbook14);
        login.Course course16 = null;
        facultyClient5.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
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
        java.lang.String str17 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
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
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.type;
        facultyClient5.type = "hi!";
        facultyClient5.type = "";
        java.util.Set<login.Course> courseSet11 = facultyClient5.getCourses();
        java.lang.String str12 = facultyClient5.getType();
        login.Course course13 = null;
        facultyClient5.assignCourse(course13);
        java.util.Set<login.Course> courseSet15 = facultyClient5.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
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
        java.lang.String str13 = facultyClient7.type;
        login.Course course14 = null;
        facultyClient7.assignCourse(course14);
        login.Course course16 = null;
        facultyClient7.assignCourse(course16);
        facultyClient7.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass18 = facultyClient17.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
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
        java.lang.String str12 = facultyClient1.type;
        java.lang.String str13 = facultyClient1.getRole();
        java.lang.String str14 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient9.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
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
        java.lang.String str12 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
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
        java.lang.String str21 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
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
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        login.Course course14 = null;
        facultyClient11.assignCourse(course14);
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.String str17 = facultyClient16.type;
        java.util.Set<login.Course> courseSet18 = facultyClient16.getCourses();
        java.lang.String str19 = facultyClient16.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
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
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
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
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
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
        java.lang.Class<?> wildcardClass15 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.type;
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        facultyClient4.type = "";
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str12 = facultyClient11.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
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
        java.lang.Class<?> wildcardClass14 = facultyClient11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
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
        java.lang.String str17 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
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
        java.lang.String str12 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        java.lang.String str14 = facultyClient4.type;
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        facultyClient15.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient15.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "";
        java.lang.Class<?> wildcardClass11 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
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
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
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
        login.Course course10 = null;
        facultyClient3.assignCourse(course10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient8.type;
        facultyClient8.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
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
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        facultyClient1.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
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
        facultyClient1.type = "hi!";
        java.lang.String str14 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
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
        java.util.Set<login.Course> courseSet15 = facultyClient5.getCourses();
        java.lang.Class<?> wildcardClass16 = facultyClient5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
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
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        java.lang.String str14 = facultyClient11.type;
        login.Course course15 = null;
        facultyClient11.assignCourse(course15);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("hi!", "hi!", "");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook20 = null;
        facultyClient4.update(textbook20);
        java.lang.String str22 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
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
        java.lang.Class<?> wildcardClass14 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
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
        java.lang.String str16 = facultyClient15.getRole();
        java.lang.String str17 = facultyClient15.getType();
        login.Course course18 = null;
        facultyClient15.assignCourse(course18);
        facultyClient15.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
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
        java.lang.String str15 = facultyClient14.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
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
        facultyClient1.update(textbook13);
        java.lang.String str15 = facultyClient1.type;
        java.lang.String str16 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        java.lang.String str19 = facultyClient1.getRole();
        java.lang.String str20 = facultyClient1.getType();
        java.lang.String str21 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        java.lang.Class<?> wildcardClass13 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str7 = facultyClient6.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
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
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
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
            facultyClient4.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
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
        login.Course course20 = null;
        facultyClient19.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
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
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
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
        facultyClient4.type = "Faculty";
        facultyClient4.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
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
        java.lang.String str12 = facultyClient5.type;
        login.Course course13 = null;
        facultyClient5.assignCourse(course13);
        java.lang.String str15 = facultyClient5.type;
        java.lang.String str16 = facultyClient5.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
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
        facultyClient10.type = "Faculty";
        java.lang.String str13 = facultyClient10.getType();
        java.lang.String str14 = facultyClient10.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
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
        java.util.Set<login.Course> courseSet18 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        java.lang.String str6 = facultyClient1.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        java.lang.String str12 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient7.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
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
        facultyClient1.type = "hi!";
        java.lang.String str16 = facultyClient1.getRole();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient19.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = facultyClient19.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
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
        java.lang.String str18 = facultyClient1.type;
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient19.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
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
        java.lang.String str11 = facultyClient8.getRole();
        login.Course course12 = null;
        facultyClient8.assignCourse(course12);
        java.util.Set<login.Course> courseSet14 = facultyClient8.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
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
        java.lang.String str18 = facultyClient1.getType();
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        java.util.Set<login.Course> courseSet22 = facultyClient1.getCourses();
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet22);
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
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
        java.util.Set<login.Course> courseSet15 = facultyClient10.getCourses();
        items.Textbook textbook16 = null;
        facultyClient10.update(textbook16);
        java.lang.String str18 = facultyClient10.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
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
        java.lang.Class<?> wildcardClass20 = facultyClient11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str8 = facultyClient4.getRole();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
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
        java.lang.String str15 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.lang.String str17 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
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
        facultyClient1.type = "Faculty";
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
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
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        facultyClient4.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
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
        java.lang.String str13 = facultyClient1.type;
        java.lang.String str14 = facultyClient1.getRole();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
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
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
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
        java.lang.String str15 = facultyClient1.getType();
        java.lang.String str16 = facultyClient1.type;
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
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
        java.lang.String str14 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        login.Course course17 = null;
        facultyClient4.assignCourse(course17);
        java.util.Set<login.Course> courseSet19 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
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
        java.lang.String str15 = facultyClient14.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
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
        java.lang.String str20 = facultyClient17.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
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
        login.Course course17 = null;
        facultyClient12.assignCourse(course17);
        java.util.Set<login.Course> courseSet19 = facultyClient12.getCourses();
        facultyClient12.type = "Faculty";
        java.lang.String str22 = facultyClient12.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Faculty" + "'", str22, "Faculty");
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.getRole();
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
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = facultyClient15.getPassword("hi!");
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
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.lang.String str13 = facultyClient1.getRole();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
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
        facultyClient16.type = "hi!";
        java.lang.String str19 = facultyClient16.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
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
        java.util.Set<login.Course> courseSet10 = facultyClient6.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
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
        java.lang.String str12 = facultyClient9.getType();
        login.Course course13 = null;
        facultyClient9.assignCourse(course13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.lang.String str18 = facultyClient1.type;
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str20 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str7 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        login.Course course9 = null;
        facultyClient4.assignCourse(course9);
        java.lang.Class<?> wildcardClass11 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
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
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient19);
        login.Course course23 = null;
        facultyClient22.assignCourse(course23);
        items.Textbook textbook25 = null;
        facultyClient22.update(textbook25);
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
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
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
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.getType();
        java.lang.String str19 = facultyClient1.getType();
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
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.lang.String str9 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        java.lang.String str16 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
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
        java.lang.String str14 = facultyClient10.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
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
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
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
        java.lang.String str11 = facultyClient1.type;
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
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
        java.util.Set<login.Course> courseSet14 = facultyClient1.getCourses();
        java.lang.String str15 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
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
        java.lang.String str12 = facultyClient11.getType();
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
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
        java.lang.String str11 = facultyClient1.getRole();
        java.lang.String str12 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass14 = courseSet13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
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
        java.lang.String str12 = facultyClient11.getRole();
        java.util.Set<login.Course> courseSet13 = facultyClient11.getCourses();
        login.Course course14 = null;
        facultyClient11.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        facultyClient1.type = "hi!";
        java.util.Set<login.Course> courseSet6 = facultyClient1.getCourses();
        java.lang.String str7 = facultyClient1.getType();
        java.lang.Class<?> wildcardClass8 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getType();
        items.Textbook textbook11 = null;
        facultyClient9.update(textbook11);
        java.lang.Class<?> wildcardClass13 = facultyClient9.getClass();
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
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
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.String str17 = facultyClient16.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient16.getPassword("Faculty");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course20 = null;
        facultyClient19.assignCourse(course20);
        java.lang.Class<?> wildcardClass22 = facultyClient19.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
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
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet11 = facultyClient10.getCourses();
        java.lang.Class<?> wildcardClass12 = courseSet11.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
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
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        java.lang.String str14 = facultyClient4.getType();
        java.lang.String str15 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
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
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.String str14 = facultyClient1.type;
        java.lang.String str15 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
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
        java.lang.Class<?> wildcardClass18 = facultyClient17.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
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
        facultyClient1.type = "Faculty";
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
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        login.Course course6 = null;
        facultyClient3.assignCourse(course6);
        login.Course course8 = null;
        facultyClient3.assignCourse(course8);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
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
        java.lang.String str12 = facultyClient1.getRole();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
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
        java.util.Set<login.Course> courseSet16 = facultyClient12.getCourses();
        java.lang.String str17 = facultyClient12.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.getType();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        facultyClient1.type = "Faculty";
        java.lang.String str16 = facultyClient1.getType();
        java.lang.String str17 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient15.register("", "Faculty", "");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
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
        java.lang.String str16 = facultyClient14.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
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
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
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
        java.lang.String str17 = facultyClient13.type;
        java.lang.String str18 = facultyClient13.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
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
        java.lang.String str10 = facultyClient4.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str15 = facultyClient14.getRole();
        items.Textbook textbook16 = null;
        facultyClient14.update(textbook16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient16.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
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
        java.lang.String str12 = facultyClient5.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient8.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = facultyClient1.getPassword("Faculty");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
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
        java.lang.String str10 = facultyClient3.getRole();
        java.lang.String str11 = facultyClient3.getType();
        java.lang.String str12 = facultyClient3.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str20 = facultyClient1.getType();
        items.Textbook textbook21 = null;
        facultyClient1.update(textbook21);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
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
        java.lang.String str10 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
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
            facultyClient14.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
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
        items.Textbook textbook16 = null;
        facultyClient3.update(textbook16);
        login.Course course18 = null;
        facultyClient3.assignCourse(course18);
        facultyClient3.type = "Faculty";
        java.util.Set<login.Course> courseSet22 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet23 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet22);
        org.junit.Assert.assertNotNull(courseSet23);
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
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
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        java.lang.String str18 = facultyClient1.getType();
        facultyClient1.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
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
        java.lang.String str16 = facultyClient15.type;
        items.Textbook textbook17 = null;
        facultyClient15.update(textbook17);
        java.lang.String str19 = facultyClient15.type;
        java.lang.String str20 = facultyClient15.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
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
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        java.lang.String str17 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        login.Course course2 = null;
        facultyClient1.assignCourse(course2);
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.String str6 = facultyClient1.type;
        login.Course course7 = null;
        facultyClient1.assignCourse(course7);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
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
            facultyClient3.register("", "Faculty", "Faculty");
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
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
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
        java.lang.String str12 = facultyClient4.type;
        facultyClient4.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
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
        java.lang.String str13 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
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
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
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
        login.Course course18 = null;
        facultyClient1.assignCourse(course18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.type;
        items.Textbook textbook7 = null;
        facultyClient5.update(textbook7);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = facultyClient20.getPassword("");
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
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
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
        facultyClient20.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.getType();
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        facultyClient1.type = "Faculty";
        login.Course course16 = null;
        facultyClient1.assignCourse(course16);
        facultyClient1.type = "Faculty";
        java.lang.String str20 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient17.getPassword("");
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
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
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
        items.Textbook textbook10 = null;
        facultyClient9.update(textbook10);
        java.util.Set<login.Course> courseSet12 = facultyClient9.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.getRole();
        items.Textbook textbook7 = null;
        facultyClient5.update(textbook7);
        java.lang.String str9 = facultyClient5.getRole();
        java.lang.Class<?> wildcardClass10 = facultyClient5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str8 = facultyClient7.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
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
        java.lang.String str12 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
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
        java.util.Set<login.Course> courseSet15 = facultyClient3.getCourses();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.Class<?> wildcardClass17 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook9 = null;
        facultyClient8.update(textbook9);
        java.lang.String str11 = facultyClient8.getRole();
        items.Textbook textbook12 = null;
        facultyClient8.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
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
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass11 = facultyClient10.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.type;
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = facultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("hi!", "Faculty", "Faculty");
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
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
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
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
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
        java.lang.String str14 = facultyClient9.getRole();
        java.lang.String str15 = facultyClient9.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
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
        facultyClient3.type = "Faculty";
        java.lang.String str14 = facultyClient3.type;
        facultyClient3.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
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
        facultyClient15.type = "hi!";
        java.util.Set<login.Course> courseSet18 = facultyClient15.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
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
        java.lang.String str18 = facultyClient15.type;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
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
        java.util.Set<login.Course> courseSet11 = facultyClient9.getCourses();
        java.lang.String str12 = facultyClient9.getType();
        facultyClient9.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
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
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient19);
        java.util.Set<login.Course> courseSet21 = facultyClient19.getCourses();
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient19);
        java.util.Set<login.Course> courseSet23 = facultyClient19.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertNotNull(courseSet23);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
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
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        java.lang.String str13 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
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
        java.lang.Class<?> wildcardClass16 = courseSet15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient7);
        items.Textbook textbook9 = null;
        facultyClient8.update(textbook9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient8.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
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
        java.lang.String str14 = facultyClient11.getRole();
        java.lang.String str15 = facultyClient11.getRole();
        items.Textbook textbook16 = null;
        facultyClient11.update(textbook16);
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        facultyClient3.type = "hi!";
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        login.Course course8 = null;
        facultyClient3.assignCourse(course8);
        facultyClient3.type = "hi!";
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        login.Course course14 = null;
        facultyClient3.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
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
        facultyClient4.type = "hi!";
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        login.Course course13 = null;
        facultyClient12.assignCourse(course13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
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
        java.util.Set<login.Course> courseSet14 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
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
        java.lang.String str14 = facultyClient1.getRole();
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        java.lang.String str8 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        java.lang.Class<?> wildcardClass11 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
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
        items.Textbook textbook13 = null;
        facultyClient10.update(textbook13);
        java.lang.String str15 = facultyClient10.getRole();
        items.Textbook textbook16 = null;
        facultyClient10.update(textbook16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        java.lang.String str7 = facultyClient3.getRole();
        items.Textbook textbook8 = null;
        facultyClient3.update(textbook8);
        facultyClient3.type = "hi!";
        items.Textbook textbook12 = null;
        facultyClient3.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
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
        java.lang.String str12 = facultyClient11.getType();
        java.lang.String str13 = facultyClient11.type;
        java.lang.String str14 = facultyClient11.getType();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
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
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        facultyClient4.type = "";
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
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
        java.lang.String str13 = facultyClient1.getType();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient14);
        login.Course course19 = null;
        facultyClient18.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
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
        facultyClient10.type = "Faculty";
        java.lang.String str17 = facultyClient10.type;
        java.lang.String str18 = facultyClient10.getRole();
        java.lang.Class<?> wildcardClass19 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
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
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        java.lang.String str18 = facultyClient1.getRole();
        java.lang.String str19 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
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
        java.util.Set<login.Course> courseSet10 = facultyClient1.getCourses();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
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
        java.lang.String str15 = facultyClient14.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
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
        java.util.Set<login.Course> courseSet18 = facultyClient13.getCourses();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.getRole();
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str12 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
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
        java.lang.String str20 = facultyClient1.getRole();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
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
        java.lang.String str11 = facultyClient3.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.getRole();
        facultyClient4.type = "hi!";
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet14 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
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
        java.lang.String str12 = facultyClient11.getRole();
        java.lang.String str13 = facultyClient11.getRole();
        java.lang.String str14 = facultyClient11.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
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
        java.util.Set<login.Course> courseSet11 = facultyClient3.getCourses();
        facultyClient3.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
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
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        java.lang.String str15 = facultyClient1.type;
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
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
        java.lang.String str12 = facultyClient10.type;
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("Faculty", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
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
        java.lang.String str16 = facultyClient13.getRole();
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }
}

