import org.testng.Assert;
import org.testng.annotations.*;


public class TestClass {

    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider() {
        return new Object[][] { {"Ajedre", "U$S 10", "Azul"}, {"", "U$S 100", "Blanco"}, {null, "U$S 500", "Negro"} };
    }

    @DataProvider(name = "dataProvider2")
    public Object[][] dataProvider2() {
        return new Object[][] { {"FIRST TEST STRING"}, {"SECOND TEST STRING"}};
    }

    @BeforeClass
    public void start() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test(dataProvider = "dataProvider")
    public void test1(String articulo, String precio, String color) {
        System.out.println("\n");
        System.out.println("BUSQUEDA MERCADO LIBRE: ");
        System.out.println("Articulo: " + articulo);
        System.out.println("Precio: " + precio);
        System.out.println("Color: " + color);
        System.out.println("\n");
        Assert.assertNotNull(articulo, "El articulo es null");
        Assert.assertTrue(!articulo.equals(""), "El articulo es vacío");
        Assert.assertEquals(articulo, "Ajedrez", "No es el articulo que esperamos");
    }
    
    @Test
    public void testValido() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void testInvalido() {
        Assert.assertEquals(1,2);
    }

    @Test(dataProvider = "dataProvider2")
    public void test2(String text) {
        System.out.println(text);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass
    public void quit() {
        System.out.println("After Class");
    }


}
