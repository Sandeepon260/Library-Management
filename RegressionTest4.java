import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        login.Course course2 = null;
        facultyClient1.assignCourse(course2);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        org.junit.Assert.assertNotNull(courseSet5);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
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
        facultyClient1.type = "hi!";
        login.Course course14 = null;
        facultyClient1.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
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
        java.lang.Class<?> wildcardClass15 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
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
        java.lang.Class<?> wildcardClass10 = facultyClient9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        facultyClient4.type = "";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str10 = facultyClient4.getRole();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        java.lang.String str3 = facultyClient1.getRole();
        login.Course course4 = null;
        facultyClient1.assignCourse(course4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
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
        java.lang.Class<?> wildcardClass12 = facultyClient9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
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
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
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
        login.FacultyClient facultyClient17 = new login.FacultyClient((login.Client) facultyClient12);
        java.lang.String str18 = facultyClient17.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
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
        facultyClient1.type = "hi!";
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
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
        java.lang.String str16 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
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
        java.lang.Class<?> wildcardClass11 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
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
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient15);
        java.lang.Class<?> wildcardClass21 = facultyClient15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
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
        java.lang.Class<?> wildcardClass20 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient15.getPassword("");
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
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
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
        java.lang.Class<?> wildcardClass13 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
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
        java.lang.Class<?> wildcardClass15 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
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
        java.lang.String str16 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
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
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        java.lang.String str15 = facultyClient1.getRole();
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.Class<?> wildcardClass15 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
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
        items.Textbook textbook14 = null;
        facultyClient9.update(textbook14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient9.getPassword("");
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
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str11 = facultyClient1.getRole();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.lang.String str11 = facultyClient1.type;
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
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
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
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
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
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
        facultyClient1.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "Faculty", "Faculty");
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
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient9.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        items.Textbook textbook7 = null;
        facultyClient3.update(textbook7);
        login.Course course9 = null;
        facultyClient3.assignCourse(course9);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("hi!", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.getType();
        java.lang.Class<?> wildcardClass9 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
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
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient3.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
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
        java.lang.String str18 = facultyClient3.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
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
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
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
        java.lang.String str15 = facultyClient4.type;
        java.lang.Class<?> wildcardClass16 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
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
        java.lang.Class<?> wildcardClass13 = facultyClient8.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
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
        items.Textbook textbook11 = null;
        facultyClient3.update(textbook11);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
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
        java.lang.String str12 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
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
        java.lang.String str16 = facultyClient10.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
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
        java.lang.Class<?> wildcardClass12 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        login.Course course2 = null;
        facultyClient1.assignCourse(course2);
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass6 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
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
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        java.util.Set<login.Course> courseSet7 = facultyClient1.getCourses();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient6.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
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
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient15);
        items.Textbook textbook21 = null;
        facultyClient20.update(textbook21);
        java.lang.String str23 = facultyClient20.getType();
        items.Textbook textbook24 = null;
        facultyClient20.update(textbook24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
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
        java.lang.Class<?> wildcardClass18 = courseSet17.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
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
        java.lang.String str21 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertNotNull(courseSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
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
        login.Course course19 = null;
        facultyClient1.assignCourse(course19);
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
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.String str10 = facultyClient9.getType();
        facultyClient9.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("hi!", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
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
        java.lang.String str16 = facultyClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient15.getPassword("Faculty");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("", "", "hi!");
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
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet5);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
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
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient12);
        java.util.Set<login.Course> courseSet17 = facultyClient16.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass15 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
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
        java.lang.String str10 = facultyClient1.getRole();
        java.lang.String str11 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
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
        java.lang.Class<?> wildcardClass12 = facultyClient9.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
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
        facultyClient1.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
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
        items.Textbook textbook10 = null;
        facultyClient4.update(textbook10);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
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
        java.util.Set<login.Course> courseSet12 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        login.Course course8 = null;
        facultyClient1.assignCourse(course8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
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
        facultyClient18.update(textbook19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = facultyClient18.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
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
        facultyClient11.type = "hi!";
        java.lang.String str20 = facultyClient11.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course19 = null;
        facultyClient18.assignCourse(course19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
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
        java.lang.String str19 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
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
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient13.getPassword("");
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
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
        java.lang.Class<?> wildcardClass13 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.lang.String str13 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
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
        java.lang.String str21 = facultyClient1.getRole();
        items.Textbook textbook22 = null;
        facultyClient1.update(textbook22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.type;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Faculty" + "'", str2, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
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
        java.lang.String str17 = facultyClient1.type;
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient18.register("hi!", "", "hi!");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
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
        java.lang.Class<?> wildcardClass12 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
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
        java.lang.String str11 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient1.getPassword("hi!");
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
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
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
        java.lang.String str19 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        login.Course course7 = null;
        facultyClient4.assignCourse(course7);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
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
        login.Course course13 = null;
        facultyClient4.assignCourse(course13);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient9.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
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
        java.util.Set<login.Course> courseSet12 = facultyClient11.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass10 = facultyClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
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
        java.lang.Class<?> wildcardClass12 = facultyClient10.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        login.Course course2 = null;
        facultyClient1.assignCourse(course2);
        java.lang.String str4 = facultyClient1.type;
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass8 = facultyClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        facultyClient1.type = "hi!";
        java.lang.String str11 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        java.lang.String str11 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient19.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        items.Textbook textbook6 = null;
        facultyClient4.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient4.getCourses();
        items.Textbook textbook9 = null;
        facultyClient4.update(textbook9);
        java.lang.String str11 = facultyClient4.getRole();
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
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
        login.Course course14 = null;
        facultyClient10.assignCourse(course14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "hi!", "hi!");
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
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
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
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("hi!", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
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
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
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
        java.lang.Class<?> wildcardClass12 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
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
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
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
        facultyClient1.type = "Faculty";
        java.lang.String str17 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
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
        java.lang.String str20 = facultyClient1.getRole();
        java.lang.String str21 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
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
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.getType();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
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
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
        facultyClient1.type = "Faculty";
        java.lang.String str24 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getRole();
        java.lang.String str7 = facultyClient1.type;
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.type;
        java.lang.String str10 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
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
        java.lang.String str15 = facultyClient8.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
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
        java.lang.String str11 = facultyClient4.getRole();
        login.Course course12 = null;
        facultyClient4.assignCourse(course12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient4.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
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
        java.lang.String str13 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
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
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        items.Textbook textbook17 = null;
        facultyClient1.update(textbook17);
        java.lang.Class<?> wildcardClass19 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient6.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient6.getCourses();
        java.lang.Class<?> wildcardClass9 = courseSet8.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        facultyClient3.type = "hi!";
        java.lang.String str9 = facultyClient3.type;
        login.Course course10 = null;
        facultyClient3.assignCourse(course10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        items.Textbook textbook7 = null;
        facultyClient1.update(textbook7);
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        java.lang.String str11 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
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
        java.lang.Class<?> wildcardClass21 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
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
            java.lang.String str12 = facultyClient1.getPassword("hi!");
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
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient15.getPassword("Faculty");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("", "hi!", "");
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
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
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
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
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
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str12 = facultyClient4.getType();
        java.lang.String str13 = facultyClient4.getRole();
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        items.Textbook textbook16 = null;
        facultyClient4.update(textbook16);
        java.util.Set<login.Course> courseSet18 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
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
        java.lang.Class<?> wildcardClass19 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
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
        java.lang.String str18 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
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
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        login.Course course17 = null;
        facultyClient14.assignCourse(course17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
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
        java.lang.String str11 = facultyClient7.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient7.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
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
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
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
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        java.lang.String str14 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
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
        java.lang.Class<?> wildcardClass19 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient11.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
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
        java.lang.String str11 = facultyClient3.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient18.register("hi!", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
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
        java.util.Set<login.Course> courseSet13 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        facultyClient1.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
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
        java.lang.Class<?> wildcardClass11 = facultyClient9.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
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
        java.util.Set<login.Course> courseSet12 = facultyClient5.getCourses();
        java.lang.String str13 = facultyClient5.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
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
        java.lang.Class<?> wildcardClass23 = facultyClient22.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
        org.junit.Assert.assertNotNull(courseSet21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "Faculty", "");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
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
        java.lang.String str15 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
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
        java.lang.Class<?> wildcardClass11 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.getRole();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        login.Course course10 = null;
        facultyClient1.assignCourse(course10);
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
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
        java.lang.Class<?> wildcardClass16 = facultyClient15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient7.getCourses();
        java.lang.String str9 = facultyClient7.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
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
        java.lang.Class<?> wildcardClass16 = facultyClient12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
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
        java.lang.String str11 = facultyClient1.getType();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
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
        java.lang.Class<?> wildcardClass11 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        facultyClient4.type = "hi!";
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        login.Course course10 = null;
        facultyClient4.assignCourse(course10);
        java.lang.String str12 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
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
        java.lang.Class<?> wildcardClass15 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        java.lang.String str6 = facultyClient1.getType();
        facultyClient1.type = "Faculty";
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
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
        java.lang.String str18 = facultyClient4.getRole();
        login.Course course19 = null;
        facultyClient4.assignCourse(course19);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
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
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        login.Course course3 = null;
        facultyClient1.assignCourse(course3);
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        items.Textbook textbook8 = null;
        facultyClient1.update(textbook8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
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
        java.lang.String str12 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str8 = facultyClient1.getType();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient9.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
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
        java.lang.String str12 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
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
        java.lang.String str16 = facultyClient13.getRole();
        java.lang.Class<?> wildcardClass17 = facultyClient13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
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
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
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
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
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
        java.lang.String str13 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
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
        login.FacultyClient facultyClient15 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass16 = facultyClient15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
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
        java.lang.String str15 = facultyClient1.getType();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
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
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        java.lang.String str6 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
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
        java.lang.String str17 = facultyClient1.getType();
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass19 = facultyClient18.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
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
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient12.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient12.getPassword("hi!");
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
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
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
        login.FacultyClient facultyClient18 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient18.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
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
            java.lang.String str16 = facultyClient5.getPassword("hi!");
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
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
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
        java.lang.Class<?> wildcardClass18 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
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
        java.lang.String str16 = facultyClient1.getRole();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
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
        java.util.Set<login.Course> courseSet10 = facultyClient9.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        java.util.Set<login.Course> courseSet6 = facultyClient5.getCourses();
        java.lang.Class<?> wildcardClass7 = courseSet6.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
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
        items.Textbook textbook11 = null;
        facultyClient10.update(textbook11);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient10.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
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
        java.lang.String str19 = facultyClient18.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str8 = facultyClient1.type;
        items.Textbook textbook9 = null;
        facultyClient1.update(textbook9);
        login.Course course11 = null;
        facultyClient1.assignCourse(course11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
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
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
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
        java.lang.String str17 = facultyClient16.getType();
        java.lang.String str18 = facultyClient16.getRole();
        items.Textbook textbook19 = null;
        facultyClient16.update(textbook19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
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
        java.lang.String str19 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient4);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str7 = facultyClient4.getType();
        login.Course course8 = null;
        facultyClient4.assignCourse(course8);
        facultyClient4.type = "hi!";
        java.lang.Class<?> wildcardClass12 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient8.type = "Faculty";
        login.Course course11 = null;
        facultyClient8.assignCourse(course11);
        java.util.Set<login.Course> courseSet13 = facultyClient8.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.type;
        java.lang.String str9 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
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
        login.Course course15 = null;
        facultyClient1.assignCourse(course15);
        login.Course course17 = null;
        facultyClient1.assignCourse(course17);
        items.Textbook textbook19 = null;
        facultyClient1.update(textbook19);
        login.Course course21 = null;
        facultyClient1.assignCourse(course21);
        java.lang.String str23 = facultyClient1.getRole();
        java.lang.Class<?> wildcardClass24 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Faculty" + "'", str23, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient9.getPassword("hi!");
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
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient3.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
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
        java.lang.String str18 = facultyClient15.getType();
        java.lang.String str19 = facultyClient15.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient15.register("", "", "Faculty");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
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
        java.lang.String str15 = facultyClient14.getType();
        login.FacultyClient facultyClient16 = new login.FacultyClient((login.Client) facultyClient14);
        facultyClient16.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
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
        facultyClient1.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
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
        java.lang.String str12 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
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
        java.lang.String str13 = facultyClient9.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.lang.String str6 = facultyClient4.getRole();
        java.lang.String str7 = facultyClient4.type;
        facultyClient4.type = "Faculty";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
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
        java.lang.String str16 = facultyClient14.type;
        items.Textbook textbook17 = null;
        facultyClient14.update(textbook17);
        java.lang.Class<?> wildcardClass19 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
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
        facultyClient4.type = "";
        java.lang.String str14 = facultyClient4.getType();
        login.Course course15 = null;
        facultyClient4.assignCourse(course15);
        java.lang.String str17 = facultyClient4.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
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
        items.Textbook textbook10 = null;
        facultyClient3.update(textbook10);
        facultyClient3.type = "";
        login.Course course14 = null;
        facultyClient3.assignCourse(course14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("", "", "Faculty");
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
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.String str9 = facultyClient1.type;
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
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
        items.Textbook textbook12 = null;
        facultyClient9.update(textbook12);
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient9);
        items.Textbook textbook15 = null;
        facultyClient9.update(textbook15);
        facultyClient9.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient4.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
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
        facultyClient12.type = "Faculty";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient12);
        login.Course course15 = null;
        facultyClient14.assignCourse(course15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
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
        java.lang.String str12 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
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
        login.Course course21 = null;
        facultyClient3.assignCourse(course21);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(courseSet20);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
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
        java.lang.String str15 = facultyClient11.getType();
        java.lang.String str16 = facultyClient11.getRole();
        items.Textbook textbook17 = null;
        facultyClient11.update(textbook17);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
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
        java.lang.String str16 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
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
        java.lang.Class<?> wildcardClass13 = facultyClient11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
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
        items.Textbook textbook15 = null;
        facultyClient12.update(textbook15);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
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
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
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
        java.lang.Class<?> wildcardClass13 = facultyClient8.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
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
        items.Textbook textbook12 = null;
        facultyClient11.update(textbook12);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("", "Faculty", "Faculty");
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
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
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
        java.lang.Class<?> wildcardClass15 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
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
        login.Course course13 = null;
        facultyClient10.assignCourse(course13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient5);
        java.lang.Class<?> wildcardClass7 = facultyClient6.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        login.Course course7 = null;
        facultyClient3.assignCourse(course7);
        java.lang.String str9 = facultyClient3.type;
        facultyClient3.type = "Faculty";
        java.lang.Class<?> wildcardClass12 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
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
        java.lang.Class<?> wildcardClass13 = facultyClient9.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient5.register("Faculty", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        facultyClient1.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
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
        java.lang.Class<?> wildcardClass11 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient15.getPassword("");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
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
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
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
        java.util.Set<login.Course> courseSet17 = facultyClient12.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
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
        java.lang.String str11 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
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
        login.FacultyClient facultyClient14 = new login.FacultyClient((login.Client) facultyClient11);
        java.lang.Class<?> wildcardClass15 = facultyClient11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
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
        java.lang.String str18 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
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
        java.lang.String str10 = facultyClient4.getRole();
        login.FacultyClient facultyClient11 = new login.FacultyClient((login.Client) facultyClient4);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient7.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
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
        java.lang.Class<?> wildcardClass14 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient1.type = "Faculty";
        java.lang.String str7 = facultyClient1.getRole();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient9);
        java.lang.String str11 = facultyClient9.type;
        java.lang.String str12 = facultyClient9.type;
        java.lang.String str13 = facultyClient9.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
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
        java.lang.String str19 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
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
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
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
        facultyClient13.type = "";
        java.lang.Class<?> wildcardClass16 = facultyClient13.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
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
        login.FacultyClient facultyClient12 = new login.FacultyClient((login.Client) facultyClient11);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
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
        java.lang.Class<?> wildcardClass21 = facultyClient20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient4.type = "Faculty";
        facultyClient4.type = "";
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
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
        java.lang.String str15 = facultyClient1.getType();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "hi!";
        java.lang.String str8 = facultyClient5.getType();
        items.Textbook textbook9 = null;
        facultyClient5.update(textbook9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
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
        items.Textbook textbook13 = null;
        facultyClient7.update(textbook13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
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
        java.util.Set<login.Course> courseSet16 = facultyClient10.getCourses();
        java.lang.String str17 = facultyClient10.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
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
        facultyClient16.type = "Faculty";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
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
        login.Course course12 = null;
        facultyClient9.assignCourse(course12);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
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
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
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
        java.util.Set<login.Course> courseSet18 = facultyClient15.getCourses();
        facultyClient15.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
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
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient8.register("hi!", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
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
        java.lang.Class<?> wildcardClass16 = facultyClient15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = facultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
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
        java.lang.String str17 = facultyClient16.getType();
        java.lang.String str18 = facultyClient16.getRole();
        java.lang.String str19 = facultyClient16.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
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
        java.util.Set<login.Course> courseSet13 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
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
        java.lang.Class<?> wildcardClass12 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
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
            facultyClient1.register("Faculty", "", "");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getRole();
        java.lang.String str6 = facultyClient3.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("Faculty", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
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
        java.lang.String str11 = facultyClient4.getType();
        java.lang.String str12 = facultyClient4.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
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
        java.util.Set<login.Course> courseSet15 = facultyClient14.getCourses();
        java.lang.Class<?> wildcardClass16 = facultyClient14.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
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
        java.lang.Class<?> wildcardClass17 = facultyClient16.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
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
        java.lang.Class<?> wildcardClass13 = facultyClient9.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
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
        java.lang.String str11 = facultyClient7.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient7.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        login.Course course2 = null;
        facultyClient1.assignCourse(course2);
        java.lang.String str4 = facultyClient1.type;
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass6 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
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
        items.Textbook textbook18 = null;
        facultyClient12.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
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
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
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
        facultyClient14.update(textbook15);
        java.util.Set<login.Course> courseSet17 = facultyClient14.getCourses();
        items.Textbook textbook18 = null;
        facultyClient14.update(textbook18);
        java.lang.String str20 = facultyClient14.type;
        java.lang.String str21 = facultyClient14.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Faculty" + "'", str21, "Faculty");
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
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
        facultyClient7.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
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
        java.lang.Class<?> wildcardClass14 = facultyClient12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        java.lang.String str7 = facultyClient1.getRole();
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        login.FacultyClient facultyClient9 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str10 = facultyClient9.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient9.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
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
        java.util.Set<login.Course> courseSet13 = facultyClient5.getCourses();
        login.Course course14 = null;
        facultyClient5.assignCourse(course14);
        facultyClient5.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient4.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
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
        java.lang.String str12 = facultyClient9.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.getType();
        items.Textbook textbook3 = null;
        facultyClient1.update(textbook3);
        items.Textbook textbook5 = null;
        facultyClient1.update(textbook5);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
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
        java.lang.Class<?> wildcardClass17 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
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
        java.util.Set<login.Course> courseSet11 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass12 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient3.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient5.update(textbook6);
        facultyClient5.type = "hi!";
        facultyClient5.type = "Faculty";
        facultyClient5.type = "";
        java.lang.String str14 = facultyClient5.getType();
        java.lang.Class<?> wildcardClass15 = facultyClient5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        java.lang.String str14 = facultyClient1.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
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
        facultyClient1.type = "Faculty";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
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
        java.lang.String str13 = facultyClient12.getRole();
        facultyClient12.type = "";
        login.Course course16 = null;
        facultyClient12.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
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
        java.util.Set<login.Course> courseSet18 = facultyClient4.getCourses();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
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
        java.lang.Class<?> wildcardClass20 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
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
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        java.util.Set<login.Course> courseSet15 = facultyClient1.getCourses();
        java.util.Set<login.Course> courseSet16 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
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
        items.Textbook textbook18 = null;
        facultyClient13.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("Faculty", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
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
        items.Textbook textbook14 = null;
        facultyClient4.update(textbook14);
        java.lang.Class<?> wildcardClass16 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
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
        java.lang.String str16 = facultyClient11.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient11.getPassword("");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
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
        items.Textbook textbook11 = null;
        facultyClient1.update(textbook11);
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        items.Textbook textbook15 = null;
        facultyClient1.update(textbook15);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
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
        java.lang.Class<?> wildcardClass12 = facultyClient8.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
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
        java.lang.String str11 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
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
        java.lang.String str11 = facultyClient4.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
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
        java.lang.Class<?> wildcardClass12 = courseSet11.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.getType();
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.lang.String str8 = facultyClient1.getRole();
        java.lang.String str9 = facultyClient1.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
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
        java.lang.Class<?> wildcardClass25 = facultyClient19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.lang.String str5 = facultyClient3.getType();
        java.lang.String str6 = facultyClient3.type;
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        java.lang.Class<?> wildcardClass8 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
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
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
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
        java.lang.Class<?> wildcardClass18 = facultyClient17.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
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
        facultyClient3.type = "hi!";
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
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
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
        java.lang.String str13 = facultyClient10.getType();
        login.Course course14 = null;
        facultyClient10.assignCourse(course14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient3);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = facultyClient5.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
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
        java.lang.Class<?> wildcardClass15 = facultyClient10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
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
        java.lang.String str15 = facultyClient14.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        items.Textbook textbook5 = null;
        facultyClient3.update(textbook5);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
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
        java.lang.String str15 = facultyClient11.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
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
        java.lang.String str12 = facultyClient8.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "", "Faculty");
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
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
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
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        java.lang.String str7 = facultyClient1.getType();
        java.lang.String str8 = facultyClient1.type;
        login.Course course9 = null;
        facultyClient1.assignCourse(course9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
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
        items.Textbook textbook13 = null;
        facultyClient12.update(textbook13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
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
        java.lang.String str15 = facultyClient14.getType();
        login.Course course16 = null;
        facultyClient14.assignCourse(course16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course6 = null;
        facultyClient5.assignCourse(course6);
        java.lang.String str8 = facultyClient5.getType();
        java.lang.String str9 = facultyClient5.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient4.getCourses();
        facultyClient4.type = "";
        java.util.Set<login.Course> courseSet9 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.util.Set<login.Course> courseSet11 = facultyClient4.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
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
        java.lang.Class<?> wildcardClass15 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
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
        login.Course course12 = null;
        facultyClient3.assignCourse(course12);
        java.lang.Class<?> wildcardClass14 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(courseSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
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
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
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
        items.Textbook textbook10 = null;
        facultyClient1.update(textbook10);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
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
        facultyClient3.type = "hi!";
        facultyClient3.type = "Faculty";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = facultyClient3.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
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
        facultyClient4.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
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
        facultyClient4.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        java.util.Set<login.Course> courseSet5 = facultyClient1.getCourses();
        java.lang.String str6 = facultyClient1.getRole();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass8 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        facultyClient4.type = "";
        java.lang.String str10 = facultyClient4.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient5.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = facultyClient13.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
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
        java.lang.String str10 = facultyClient9.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
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
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        java.lang.String str7 = facultyClient4.getType();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
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
        java.lang.String str15 = facultyClient1.type;
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
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
        java.lang.String str17 = facultyClient16.getType();
        java.lang.String str18 = facultyClient16.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient16.register("hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
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
        facultyClient14.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient14.register("Faculty", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getRole();
        facultyClient4.type = "Faculty";
        facultyClient4.type = "";
        login.FacultyClient facultyClient10 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.Class<?> wildcardClass11 = facultyClient10.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
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
        java.lang.String str20 = facultyClient19.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient1.assignCourse(course5);
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet5 = facultyClient4.getCourses();
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getRole();
        java.lang.String str8 = facultyClient4.type;
        java.lang.Class<?> wildcardClass9 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient18.register("hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getType();
        facultyClient1.type = "";
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str9 = facultyClient8.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
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
        java.lang.String str18 = facultyClient1.type;
        java.lang.String str19 = facultyClient1.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
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
        items.Textbook textbook20 = null;
        facultyClient1.update(textbook20);
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
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
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
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook5 = null;
        facultyClient4.update(textbook5);
        java.lang.String str7 = facultyClient4.type;
        java.lang.String str8 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
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
            java.lang.String str14 = facultyClient1.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
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
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.Class<?> wildcardClass14 = facultyClient13.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient10.register("hi!", "", "hi!");
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
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient10.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
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
        login.FacultyClient facultyClient20 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet21 = facultyClient1.getCourses();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(courseSet21);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = facultyClient3.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = facultyClient14.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Faculty" + "'", str20, "Faculty");
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
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
        java.lang.String str10 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "Faculty", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "");
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
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient21.register("Faculty", "Faculty", "hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
        org.junit.Assert.assertNotNull(courseSet22);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient7.type = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient7.getPassword("Faculty");
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
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
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
        facultyClient13.type = "";
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("Faculty", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient11.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
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
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
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
        java.lang.String str15 = facultyClient5.type;
        items.Textbook textbook16 = null;
        facultyClient5.update(textbook16);
        java.util.Set<login.Course> courseSet18 = facultyClient5.getCourses();
        java.lang.Class<?> wildcardClass19 = facultyClient5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
        org.junit.Assert.assertNotNull(courseSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
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
        java.util.Set<login.Course> courseSet13 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(courseSet13);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
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
        java.lang.String str22 = facultyClient1.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
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
        java.lang.String str11 = facultyClient3.type;
        java.lang.Class<?> wildcardClass12 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        facultyClient1.type = "Faculty";
        java.lang.String str8 = facultyClient1.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        facultyClient5.type = "hi!";
        java.lang.String str8 = facultyClient5.getType();
        java.lang.String str9 = facultyClient5.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = facultyClient5.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
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
        java.lang.String str11 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
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
        java.lang.String str17 = facultyClient1.type;
        java.lang.String str18 = facultyClient1.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Faculty" + "'", str18, "Faculty");
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient13.register("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
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
        java.lang.String str15 = facultyClient5.type;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = facultyClient5.getPassword("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Faculty" + "'", str15, "Faculty");
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient12.register("hi!", "hi!", "");
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
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
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
        login.FacultyClient facultyClient19 = new login.FacultyClient((login.Client) facultyClient1);
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
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient1.getRole();
        login.Course course6 = null;
        facultyClient1.assignCourse(course6);
        java.lang.String str8 = facultyClient1.type;
        java.util.Set<login.Course> courseSet9 = facultyClient1.getCourses();
        java.lang.String str10 = facultyClient1.getRole();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
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
        facultyClient1.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
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
        java.lang.Class<?> wildcardClass17 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
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
        facultyClient5.type = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        facultyClient7.type = "hi!";
        facultyClient7.type = "hi!";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient10.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
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
        java.lang.String str13 = facultyClient12.type;
        java.lang.String str14 = facultyClient12.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
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
        java.lang.String str12 = facultyClient4.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
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
        java.lang.String str16 = facultyClient3.getRole();
        java.lang.Class<?> wildcardClass17 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet6 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet7 = facultyClient3.getCourses();
        java.util.Set<login.Course> courseSet8 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertNotNull(courseSet6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient1.register("hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = facultyClient1.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
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
        login.Course course11 = null;
        facultyClient4.assignCourse(course11);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
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
        java.lang.String str12 = facultyClient11.getRole();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
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
        java.lang.String str18 = facultyClient15.getType();
        java.lang.String str19 = facultyClient15.getRole();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
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
        facultyClient3.type = "hi!";
        java.lang.Class<?> wildcardClass15 = facultyClient3.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        facultyClient1.type = "";
        facultyClient1.type = "";
        java.lang.Class<?> wildcardClass9 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
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
        org.junit.Assert.assertNotNull(courseSet16);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
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
        items.Textbook textbook12 = null;
        facultyClient9.update(textbook12);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient9.register("hi!", "", "hi!");
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
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        items.Textbook textbook6 = null;
        facultyClient5.update(textbook6);
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet9 = facultyClient5.getCourses();
        login.Course course10 = null;
        facultyClient5.assignCourse(course10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
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
        java.lang.String str16 = facultyClient11.type;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Faculty" + "'", str16, "Faculty");
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.getType();
        java.lang.String str7 = facultyClient4.getType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        items.Textbook textbook7 = null;
        facultyClient4.update(textbook7);
        java.lang.String str9 = facultyClient4.getType();
        java.lang.Class<?> wildcardClass10 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("", "Faculty", "Faculty");
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
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
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
        java.util.Set<login.Course> courseSet19 = facultyClient1.getCourses();
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
        org.junit.Assert.assertNotNull(courseSet16);
        org.junit.Assert.assertNotNull(courseSet19);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = facultyClient17.getPassword("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
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
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.type;
        java.lang.String str6 = facultyClient4.type;
        java.util.Set<login.Course> courseSet7 = facultyClient4.getCourses();
        facultyClient4.type = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
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
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("", "", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
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
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
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
        java.lang.String str18 = facultyClient12.type;
        java.lang.Class<?> wildcardClass19 = facultyClient12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient7.type;
        facultyClient7.type = "hi!";
        facultyClient7.type = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = facultyClient7.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
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
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        login.FacultyClient facultyClient13 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.Class<?> wildcardClass14 = facultyClient13.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        java.lang.String str4 = facultyClient1.type;
        java.lang.String str5 = facultyClient1.getType();
        login.FacultyClient facultyClient6 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str7 = facultyClient1.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facultyClient1.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
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
        items.Textbook textbook18 = null;
        facultyClient1.update(textbook18);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
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
        java.lang.String str12 = facultyClient11.getRole();
        java.lang.String str13 = facultyClient11.type;
        java.util.Set<login.Course> courseSet14 = facultyClient11.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(courseSet14);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
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
        items.Textbook textbook11 = null;
        facultyClient4.update(textbook11);
        java.lang.Class<?> wildcardClass13 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
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
        java.lang.Class<?> wildcardClass10 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
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
        org.junit.Assert.assertNotNull(courseSet12);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
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
        java.lang.String str11 = facultyClient1.type;
        java.util.Set<login.Course> courseSet12 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass13 = facultyClient1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Faculty" + "'", str8, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(courseSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
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
        items.Textbook textbook13 = null;
        facultyClient1.update(textbook13);
        facultyClient1.type = "";
        java.util.Set<login.Course> courseSet17 = facultyClient1.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet17);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
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
        java.lang.String str14 = facultyClient4.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient4.register("Faculty", "Faculty", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Faculty" + "'", str14, "Faculty");
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.Course course5 = null;
        facultyClient4.assignCourse(course5);
        java.lang.String str7 = facultyClient4.getRole();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str5 = facultyClient3.getRole();
        java.lang.String str6 = facultyClient3.getRole();
        java.lang.String str7 = facultyClient3.getType();
        items.Textbook textbook8 = null;
        facultyClient3.update(textbook8);
        java.lang.String str10 = facultyClient3.type;
        java.util.Set<login.Course> courseSet11 = facultyClient3.getCourses();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Faculty" + "'", str5, "Faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet11);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
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
        java.lang.String str11 = facultyClient4.getRole();
        items.Textbook textbook12 = null;
        facultyClient4.update(textbook12);
        java.lang.String str14 = facultyClient4.type;
        java.lang.Class<?> wildcardClass15 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str5 = facultyClient4.getType();
        java.lang.String str6 = facultyClient4.type;
        java.lang.String str7 = facultyClient4.getType();
        login.FacultyClient facultyClient8 = new login.FacultyClient((login.Client) facultyClient4);
        java.lang.String str9 = facultyClient4.getRole();
        java.util.Set<login.Course> courseSet10 = facultyClient4.getCourses();
        java.lang.Class<?> wildcardClass11 = facultyClient4.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
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
        facultyClient4.type = "hi!";
        java.util.Set<login.Course> courseSet14 = facultyClient4.getCourses();
        java.lang.Class<?> wildcardClass15 = courseSet14.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Faculty" + "'", str6, "Faculty");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(courseSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
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
        login.FacultyClient facultyClient22 = new login.FacultyClient((login.Client) facultyClient21);
        // The following exception was thrown during execution in test generation
        try {
            facultyClient21.register("hi!", "Faculty", "");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient4 = new login.FacultyClient((login.Client) facultyClient1);
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.util.Set<login.Course> courseSet6 = facultyClient5.getCourses();
        facultyClient5.type = "";
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
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
        login.Course course13 = null;
        facultyClient1.assignCourse(course13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = facultyClient4.getPassword("Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.getPassword(String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
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
        facultyClient10.type = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(courseSet18);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
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
        // The following exception was thrown during execution in test generation
        try {
            facultyClient11.register("hi!", "Faculty", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        java.lang.String str6 = facultyClient1.type;
        java.lang.String str7 = facultyClient1.getRole();
        java.lang.String str8 = facultyClient1.type;
        facultyClient1.type = "";
        java.lang.String str11 = facultyClient1.getRole();
        login.Course course12 = null;
        facultyClient1.assignCourse(course12);
        java.lang.Class<?> wildcardClass14 = facultyClient1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.lang.String str2 = facultyClient1.type;
        java.lang.String str3 = facultyClient1.getRole();
        java.lang.String str4 = facultyClient1.getType();
        login.FacultyClient facultyClient5 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str6 = facultyClient5.type;
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient5);
        java.util.Set<login.Course> courseSet8 = facultyClient5.getCourses();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet8);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
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
        java.lang.Class<?> wildcardClass16 = courseSet15.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(courseSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
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
        facultyClient1.update(textbook13);
        facultyClient1.type = "";
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Faculty" + "'", str11, "Faculty");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
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
        login.Course course14 = null;
        facultyClient13.assignCourse(course14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
        org.junit.Assert.assertNotNull(courseSet10);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
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
        items.Textbook textbook12 = null;
        facultyClient1.update(textbook12);
        items.Textbook textbook14 = null;
        facultyClient1.update(textbook14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Faculty" + "'", str3, "Faculty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Faculty" + "'", str7, "Faculty");
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        facultyClient1.type = "hi!";
        facultyClient1.type = "";
        items.Textbook textbook6 = null;
        facultyClient1.update(textbook6);
        java.util.Set<login.Course> courseSet8 = facultyClient1.getCourses();
        java.lang.Class<?> wildcardClass9 = facultyClient1.getClass();
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
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
        java.lang.String str18 = facultyClient15.getType();
        // The following exception was thrown during execution in test generation
        try {
            facultyClient15.register("", "hi!", "Faculty");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Faculty" + "'", str17, "Faculty");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
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
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
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
        login.Course course20 = null;
        facultyClient1.assignCourse(course20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Faculty" + "'", str9, "Faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Faculty" + "'", str10, "Faculty");
        org.junit.Assert.assertNotNull(courseSet13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Faculty" + "'", str19, "Faculty");
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
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
        java.lang.Class<?> wildcardClass16 = facultyClient1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
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
        java.lang.Class<?> wildcardClass10 = facultyClient4.getClass();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
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
        java.lang.String str13 = facultyClient1.getType();
        java.lang.String str14 = facultyClient1.getType();
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        login.Client client0 = null;
        login.FacultyClient facultyClient1 = new login.FacultyClient(client0);
        java.util.Set<login.Course> courseSet2 = facultyClient1.getCourses();
        login.FacultyClient facultyClient3 = new login.FacultyClient((login.Client) facultyClient1);
        java.lang.String str4 = facultyClient3.getRole();
        java.util.Set<login.Course> courseSet5 = facultyClient3.getCourses();
        java.lang.String str6 = facultyClient3.getType();
        login.FacultyClient facultyClient7 = new login.FacultyClient((login.Client) facultyClient3);
        java.lang.String str8 = facultyClient3.type;
        // The following exception was thrown during execution in test generation
        try {
            facultyClient3.register("hi!", "hi!", "Faculty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"login.Client.register(String, String, String)\" because \"this.decoratedClient\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Faculty" + "'", str4, "Faculty");
        org.junit.Assert.assertNotNull(courseSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
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
        items.Textbook textbook16 = null;
        facultyClient1.update(textbook16);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(courseSet8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Faculty" + "'", str12, "Faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Faculty" + "'", str13, "Faculty");
        org.junit.Assert.assertNotNull(courseSet15);
    }
}

