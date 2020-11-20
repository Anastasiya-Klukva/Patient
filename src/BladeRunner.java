import java.util.Scanner;
import java.util.Random;

public class BladeRunner {
    private static Scanner scn;
    private static int x;
    private static int y;
    private static String search, s;


    public static void main(String[] args) {
        int n;
        int action;

        String[] name_ = {"Olga", "Glafira", "Valentina", "Alena", "Svetlana", " Vera"};
        String name;
        String[] surname_ = {"Petrova", "Ivanova", "Smirnova", "Sidorova", "Lapenkova", "Grekova"};
        String surname;
        String[] middleName_ = {"Alekseevna", "Dmitrievna", "Aleksandrovna", "Makarovna", "Stanislavovna", "Branislavovna"};
        String middleName;
        String[] address_ = {"Centralnaya 3", "Lenina 7", "Kirova 25", "Solnechnaya 2", "Primorskaya 8", "Mira 7"};
        String address;
        int phoneNumber = 0;
        String[] diagnosis_ = {"Flu", "Pneumonia", "Chickenpox", "Coronavirus", "Gastritis", "Schizophrenia"};
        String diagnosis;
        scn = new Scanner(System.in);
        System.out.print("Patients quantity: ");
        n = scn.nextInt();
        Patient p[] = new Patient[n];
        Random r = new Random();

        for (int j = 0; j < n; j++) {
            name = name_[r.nextInt(name_.length)];

            surname = surname_[r.nextInt(surname_.length)];

            middleName = middleName_[r.nextInt(middleName_.length)];

            address = address_[r.nextInt(address_.length)];

            diagnosis = diagnosis_[r.nextInt(diagnosis_.length)];

            phoneNumber = 5005+r.nextInt(9999);

            p[j] = new Patient( );
        }

        for (int i = 0; i < n; i++) {
            p[i].showInfo();
        }
        System.out.println("Choose a filter for the list: ");
        System.out.println("1)Search by card number: ");
        System.out.println("2)Search by Diagnosis: ");
        action = scn.nextInt();
        switch (action) {
            case 1:
                /*Runtime.getRuntime().exec("cls");*/
                scn.nextLine();
                System.out.println("Specify the interval of card numbers: ");
                x = scn.nextInt();
                y = scn.nextInt();
                for (int l = 0; l < n; l++) {
                    if ((p[l].getMedCard() >= x) && (p[l].getMedCard() <= y)) {
                        p[l].showInfo();
                    }
                }
                break;
            case 2:
                /*Runtime.getRuntime().exec("cls");*/
                System.out.print("Enter the diagnosis for search: ");
                search = scn.nextLine();
                for (int k = 0; k < n; k++) {
                    s = p[k].getDiagnosis();
                    if (s.trim().equalsIgnoreCase(search.trim()) == true) {
                        p[k].showInfo();
                    }
                }
            default:
                System.out.println(" invalid patient ");
                break;
        }
    }
}