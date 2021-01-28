import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] companyYearlyIncomes = new int[size];
        int[] companyYearlyTaxes = new int[size];

        for (int i = 0; i < size; ++i) {
            companyYearlyIncomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; ++i) {
            companyYearlyTaxes[i] = scanner.nextInt();
        }

        int companyThatPaysMostTaxes = 1;
        double maxTaxPayed = Double.MIN_VALUE;

        for (int i = 0; i < size; ++i) {
            double taxPayed = companyYearlyIncomes[i] * companyYearlyTaxes[i];
            if (taxPayed > maxTaxPayed) {
                maxTaxPayed = taxPayed;
                companyThatPaysMostTaxes = i + 1;
            }
        }

        System.out.println(companyThatPaysMostTaxes);
    }
}