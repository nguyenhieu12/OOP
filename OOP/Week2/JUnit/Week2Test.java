import org.junit.*;

public class Week4Test {
    /**
     * Week4Test.
     */

    @Test
    public void testMax2Int1() {
        Week4 Test1 = new Week4();
        Assert.assertEquals(100, Test1.max2Int(2,100));
    }

    @Test
    public void testMax2Int2() {
        Week4 Test2 = new Week4();
        Assert.assertEquals(500, Test2.max2Int(3,500));
    }

    @Test
    public void testMax2Int3() {
        Week4 Test3 = new Week4();
        Assert.assertEquals(300, Test3.max2Int(0,300));
    }

    @Test
    public void testMax2Int4() {
        Week4 Test4 = new Week4();
        Assert.assertEquals(990, Test4.max2Int(100,990));
    }

    @Test
    public void testMax2Int5() {
        Week4 Test5 = new Week4();
        Assert.assertEquals(1000, Test5.max2Int(1000,3));
    }

    @Test
    public void testMinArray1() {
        Week4 Test1 = new Week4();
        int arr1[] = new int[]{1, 2, 3, 4, 5};
        Assert.assertEquals(1, Test1.minArray(arr1));
    }

    @Test
    public void testMinArray2() {
        Week4 Test2 = new Week4();
        int arr2[] = new int[]{14, 5, 16, 94, 69};
        Assert.assertEquals(5, Test2.minArray(arr2));
    }

    @Test
    public void testMinArray3() {
        Week4 Test3 = new Week4();
        int arr3[] = new int[]{60 ,70 ,80,99,100};
        Assert.assertEquals(60, Test3.minArray(arr3));
    }

    @Test
    public void testMinArray4() {
        Week4 Test4 = new Week4();
        int arr4[] = new int[]{90,100,110,250,450};
        Assert.assertEquals(90, Test4.minArray(arr4));
    }

    @Test
    public void testMinArray5() {
        Week4 Test5 = new Week4();
        int arr5[] = new int[]{100, 200, 300, 400, 500};
        Assert.assertEquals(100, Test5.minArray(arr5));
    }

    @Test
    public void testCalculateBMI1() {
        Week4 Test1 = new Week4();
        Assert.assertEquals("Bình thường", Test1.calculateBMI(69,1.8));
    }

    @Test
    public void testCalculateBMI2() {
        Week4 Test2 = new Week4();
        Assert.assertEquals("Thiếu cân", Test2.calculateBMI(50,1.75));
    }

    @Test
    public void testCalculateBMI3() {
        Week4 Test3 = new Week4();
        Assert.assertEquals("Bình thường", Test3.calculateBMI(80,1.9));
    }

    @Test
    public void testCalculateBMI4() {
        Week4 Test4 = new Week4();
        Assert.assertEquals("Bình thường", Test4.calculateBMI(70,1.8));
    }

    @Test
    public void testCalculateBMI5() {
        Week4 Test5 = new Week4();
        Assert.assertEquals("Béo phì", Test5.calculateBMI(75,1.5));
    }
}
