import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int speed = 300;
        System.out.print("A villámlás után hány másodperccel dörgött?: ");
        int second = Integer.parseInt(input.nextLine());
        while(second < 0){
            System.out.print("Nem lehet negatív!: ");
            second = Integer.parseInt(input.nextLine());
        }
        int distance = speed*second;
        System.out.print("A villámlás " + distance + " m/s távol van tőled.");
    }
}