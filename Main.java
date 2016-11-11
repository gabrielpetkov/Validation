
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Client firstClient = new Client();
        Scanner sc = new Scanner(System.in);
        String choiceEgnEik;
        boolean isClient;
        
        
        System.out.println("Enter name in format Name Father's name Surname: ");
        firstClient.setName(sc.next());
        
        
        while(true){
            System.out.println("Enter EGN for private or EIK for bussines entity: ");
            choiceEgnEik = sc.next();
            if (choiceEgnEik.equalsIgnoreCase("EGN")){
                isClient = true;
                break;
            }
            else if (choiceEgnEik.equalsIgnoreCase("EIK")){
                isClient = false;
                break;
            }
            else{
                System.out.println("Try again!");
            }
        }
        
        
            if(isClient == true){
                System.out.println("Enter EGN: ");
                firstClient.setEgn(sc.next());
            }
            else {
                System.out.println("Enter EIK: ");
                firstClient.setEik(sc.next());
            }
        
        
        
            System.out.println("Enter email: ");
            firstClient.setEmail(sc.next());
        
        
        
            System.out.println("Enter facility key in format XX-XXX: ");
            firstClient.setFacilityKey(sc.next());
        
    printInformation(firstClient, choiceEgnEik);
    } 
    
     public static void printInformation(Client enterClient, String choiceEgnEik){
        System.out.println("Bank Clien Information");
        System.out.println("----------------------");
        if (enterClient.getName() != null){
            System.out.println("Name: valid");
        }
        else{
            System.out.println("Name: invalid");
        }

        if (choiceEgnEik.equalsIgnoreCase("EGN")){
            if (enterClient.getEgn() != null){
                System.out.println("EGN: valid");
            }
            else{
                System.out.println("EGN: invalid");
            }
        }
        else{
            if (enterClient.getEik() != null){
                System.out.println("EIK: valid");
        }
        else{
                System.out.println("EIK: invalid");
            }
        }
        
        if (enterClient.getEmail() != null){
                System.out.println("Email: valid");
        }
        else{
                System.out.println("Email: invalid");
        }
        
        if (enterClient.getFacilityKey() != null){
                System.out.println("Facility Key: valid");
        }
        else{
                System.out.println("Facility Key: invalid");
        }  
    }
        
}
    
