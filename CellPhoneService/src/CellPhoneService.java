import java.util.Scanner;
public class CellPhoneService {
    public static void main (String args[]) {
        int talk, sms, gig;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max amount of minutes per month: ");
        talk = scan.nextInt();
        System.out.println("Enter max amount of texts per month: ");
        sms = scan.nextInt();
        System.out.println("Enter max amount of data per month: ");
        gig = scan.nextInt();
        
        scan.close();
        
        servicePlan(talk, sms, gig);
    }
    public static void servicePlan(int min, int text, int data){
        if(min<500 && text==0 && data==0){
            System.out.println("It is reccomended that you select Plan A for $49 per month.");
        }
        else if(min<500 && text>0 && data==0){
            System.out.println("It is reccomended that you select Plan B for $55 per month.");
        }
        else if(min>500 && text<=100 && data==0){
            System.out.println("It is reccomended that you select Plan C for $61 per month.");
        }
        else if(min>500 && text>100 && data==0){
            System.out.println("It is reccomended that you select Plan D for $70 per month.");
        }
        else if(data<=3){
            System.out.println("It is reccomended that you select Plan E for $79 per month.");
        }
        else if(data>=3){
            System.out.println("It is reccomended that you select Plan F for $87 per month.");
        }
    }
}