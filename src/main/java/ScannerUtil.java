import java.util.Scanner;

public class ScannerUtil {
    private final Scanner scanner;

    public ScannerUtil(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getIntFromScanner() {
        int answer = this.scanner.nextInt();
        return answer;
    }

    public void close() {
        this.scanner.close();
    }
}
