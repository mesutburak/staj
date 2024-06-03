package Intern_Project_UITesting.src.test.java.Utilities;

public class Tools {
    public static void Bekle(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
