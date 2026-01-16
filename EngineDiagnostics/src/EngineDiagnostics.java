import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EngineDiagnostics {
    private int[] temperatures = new int[180];

    public void readFile() throws FileNotFoundException {
        File file = new File("TemperatureReadings.txt");
        Scanner scanner = new Scanner(file);

        for (int i = 0; i < 180; i++) {
            temperatures[i] = scanner.nextInt();
        }
        System.out.println("Reading finished");
    }

    public int calculateAverages() {
        int ans = 0;
        for (int i = 0; i + 59 < 180; i++) {
            double sum = 0.0;
            for (int j = i; j <= i + 59; j++) {
                sum += temperatures[j];
            }
            sum /= 60;
            if (sum < 1500 || sum > 1600) ans++;
        }
        return ans;
    }

    static void main() throws FileNotFoundException {
        EngineDiagnostics engineDiagnostics = new EngineDiagnostics();
        engineDiagnostics.readFile();
        System.out.println("The answer is: " + engineDiagnostics.calculateAverages());
    }
}
