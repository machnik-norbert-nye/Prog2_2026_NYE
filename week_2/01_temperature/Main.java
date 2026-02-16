import java.util.Scanner;
class Main{
    /// Actual temperature
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Mennyi a hőmérséklet?: ");
        int temperature = Integer.parseInt(input.nextLine());
        if(temperature < 0) {
            System.out.print("Nagyon hideg van.");
        }else if(temperature <= 30){
            System.out.print("A hőmérséklet átlagos.");
        }else{
            System.out.print("Nagyon meleg van.");
        }
    }
}