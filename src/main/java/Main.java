import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Specify the path to your CSV file
        String csvFilePath = "C:\\Users\\Aku-1\\IdeaProjects\\Oevelser\\Covid19 oevelse\\11_noegletal_pr_region_pr_aldersgruppe_rettet.csv";

        List<Covid19Data> covidDataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            boolean skipHeader = true; // Skip the header line

            while ((line = br.readLine()) != null) {
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                String[] values = line.split(";");

                if (values.length == 7) {
                    try {
                        String region = values[0];
                        String aldersgruppe = values[1];
                        int bekræftedeTilfælde = Integer.parseInt(values[2]);
                        int døde = Integer.parseInt(values[3]);
                        int indlagtePåIntensivAfdeling = Integer.parseInt(values[4]);
                        int indlagte = Integer.parseInt(values[5]);
                        String dato = values[6];

                        Covid19Data data = new Covid19Data(region, aldersgruppe, bekræftedeTilfælde, døde, indlagtePåIntensivAfdeling, indlagte, dato);

                        covidDataList.add(data);
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing numeric values: " + e.getMessage());
                    }
                }
            }

            for (Covid19Data data : covidDataList) {
                System.out.println("Region: " + data.getRegion());
                System.out.println("Aldersgruppe: " + data.getAldersgruppe());
                System.out.println("Bekræftede Tilfælde: " + data.getBekræftedeTilfælde());
                System.out.println("Døde: " + data.getDøde());
                System.out.println("Indlagte på Intensiv Afdeling: " + data.getIndlagtePåIntensivAfdeling());
                System.out.println("Indlagte: " + data.getIndlagte());
                System.out.println("Dato: " + data.getDato());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
