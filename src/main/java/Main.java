import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // File handling example
        Path source = Paths.get("source.txt");
        Path destination = Paths.get("destination.txt");

        try {
            java.nio.file.Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Creating a Covid19Data object
        Covid19Data data = new Covid19Data("Hovedstaden", "20-29", 194737, 9, 8, 1984, "27-10-2022");

        // Accessing and printing attributes
        System.out.println("Region: " + data.getRegion());
        System.out.println("Aldersgruppe: " + data.getAldersgruppe());
        System.out.println("Bekræftede Tilfælde: " + data.getBekræftedeTilfælde());
        System.out.println("Døde: " + data.getDøde());
        System.out.println("Indlagte på Intensiv Afdeling: " + data.getIndlagtePåIntensivAfdeling());
        System.out.println("Indlagte: " + data.getIndlagte());
        System.out.println("Dato: " + data.getDato());
    }
}

