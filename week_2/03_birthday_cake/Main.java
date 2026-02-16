import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hány éves vagy? (1 és 20 között): ");
        int age = Integer.parseInt(input.nextLine());

        while(age < 1 || age > 20){
            System.out.print("Hibás értéket adtál meg, kérlek adj meg egy másikat: ");
            age = Integer.parseInt(input.nextLine());
        }

        for(int i=0; i<age; i++){
            System.out.print("* ");
        }
        System.out.println();

        for(int i=0; i<age; i++){
            System.out.print("| ");
        }
        System.out.println();

        for(int i=0; i<age; i++){
            System.out.print("_ ");
        }
        System.out.println();
    }
}