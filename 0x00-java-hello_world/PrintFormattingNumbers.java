public class PrintFormattingNumbers {
        public static void main(String[] args) {
            float tax = 0.2456f;
            float value = 7654.321f;
            System.out.println("Value: $%,.2f%n", value);
            System.out.println("Tax: %.2f%%%n", tax);
        }
    }
