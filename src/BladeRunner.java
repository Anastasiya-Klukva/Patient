import java.util.Scanner;

public class BladeRunner {
    private static int x;
    private static int y;
    private static String search, s;


    public static void main(String[] args) {
        int n;
        int action;

        Scanner scn = new Scanner(System.in);
        System.out.print("Patients quantity: ");
        n = scn.nextInt();
        Patient patients[] = new Patient[n];
        for (int i = 0; i < n; i++) {


            System.out.println("Patients surname: ");
            String surname = scn.nextLine();
            System.out.println("Patients name: ");
            String name = scn.nextLine();
            System.out.println("Patients middleName: ");
            String middleName = scn.nextLine();
            System.out.println("Patients address: ");
            String address = scn.nextLine();
            System.out.println("Patients phoneNumber: ");
            String phoneNumber = scn.nextLine();
            System.out.println("Patients medCard: ");
            long medCard = scn.nextLong();
            System.out.println("Patients diagnosis: ");
            String diagnosis = scn.nextLine();


            Patient p = new Patient(i, surname, name, middleName, address, phoneNumber, medCard, diagnosis);
            patients[i] = p;
        }

        for (int i = 0; i < n; i++) {
            //     patients[i].showInfo();
        }

        System.out.println("Choose a filter for the list: ");
        System.out.println("1)Search by card number: ");
        System.out.println("2)Search by Diagnosis: ");

        Scanner scanner = new Scanner(System.in);
        do {
            action = scn.nextInt();

            switch (action) {
                case 1:
                    /*Runtime.getRuntime().exec("cls");*/
                    scn.nextLine();
                    System.out.println("Specify the interval of card numbers: ");
                    x = scn.nextInt();
                    y = scn.nextInt();
                    for (int l = 0; l < n; l++) {
                        if ((patients[l].getMedCard() >= x) && (patients[l].getMedCard() <= y)) {
                            //                   patients[l].showInfo();
                        }
                    }
                    break;
                case 2:
                    /*Runtime.getRuntime().exec("cls");*/
                    System.out.print("Enter the diagnosis for search: ");
                    search = scn.nextLine();
                    break;
                // for (int k = 0; k < n; k++) {
                //     s = patients[k].getDiagnosis();
                //       if (s.trim().equalsIgnoreCase(search.trim())) {
                //             patients[k].showInfo();
                case 0:
                    System.out.println(" Good bye! ");
                    break;


                default:
                    System.out.println(" invalid choice ");

            }
        } while (action != 0);
    }
}