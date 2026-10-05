package Project;
import java.util.*;
public class Hospital {
     Scanner sc = new Scanner(System.in);
        int []patientId = new int[100];
        String []patientName = new String[100];
        int []patientage = new int[100];
         String []patientGender = new String[100];
         String[]patientDisease = new String[100];
         String[]patientDoctorName = new String[100];
         int []priority = new int[100];
         int count;
         void viewpatients() {
            if (count==0) {
                System.out.println("No patients in the queue.");
            }else{ for (int i=0;i<count;i++) {
                System.out.println("Enter patient ID: " + patientId[i]);
                System.out.println("Enter patient name: " + patientName[i]);
                System.out.println("Enter patient age: " + patientage[i]);
                System.out.println("Enter patient gender: " + patientGender[i]);
                System.out.println("Enter patient disease: " + patientDisease[i]);
                System.out.println("Enter patient doctor name: " + patientDoctorName[i]);
                System.out.println("Enter patient priority: " + priority[i]);
                if (priority[i] == 1) {
                    System.out.println("This is an emergency patient.");
                }else
                    System.out.println("This is a normal patient.");
            }
        }
    }
    void addPatient() {
        System.out.println("Enter patient ID: ");
        patientId[count] = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter patient name: ");
        patientName[count] = sc.nextLine();
        System.out.println("Enter patient age: ");
        patientage[count] = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter patient gender: ");
        patientGender[count] = sc.nextLine();
        System.out.println("Enter patient disease: ");
        patientDisease[count] = sc.nextLine();
        System.out.println("Enter patient doctor name: ");
        patientDoctorName[count] = sc.nextLine();
        System.out.println("Enter patient priority (1 for emergency, 2 for normal): ");
        priority[count] = sc.nextInt();
        sc.nextLine();
        count++;
    }
    void menu() {
System.out.println("========== HOSPITAL QUEUE MANAGEMENT SYSTEM =========="  );
System.out.println("1. Add Patient");
System.out.println("2. View All Patients  ");
System.out.println("3. Search Patient");
System.out.println("4. Call Next Patient");
System.out.println("5. View Waiting Queue");
System.out.println("6. Sort Patients");
System.out.println("7. Update Patient");
System.out.println("8. Remove Patient");
System.out.println("9. Hospital Report");
System.out.println("10. Exit");
    }
    public static void main(String[] args) {
        int choice;
        Hospital obj=new Hospital();
        do {
                 obj.menu();
            System.out.println("Enter ypour choice:");
            choice=obj.sc.nextInt();
            switch(choice) {
                case 1:
                    obj.addPatient();
                    break;
                case 2:
                    obj.viewpatients();
                    break;
                case 10:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        while(choice!=10);

    }
    }

