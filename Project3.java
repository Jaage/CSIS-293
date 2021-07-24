public class Project3 {
    
    public int calcQuotient(int a, int b) {
        return a / b;
    }

    public int calcRemainder(int a, int b) {
        return a % b;
    }

    public void displayDigits(int a) {
        int firstDigit = calcRemainder(a, 10);
        int secondDigit = calcRemainder(calcQuotient(a, 10), 10);
        int thirdDigit = calcRemainder(calcQuotient(1, 100), 10);

        System.out.printf("%d    %d    %d");

    }

    public void DisplayDigits2(int a) {
        int digits[] = new int[];
        while (a != 0) {

        }
    }

    public static void main(String args[]) {

    }
}
