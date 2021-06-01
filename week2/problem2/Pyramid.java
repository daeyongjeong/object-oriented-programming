import java.util.Scanner;

public class Pyramid {
	
    char character = '*';
    int numberOfLines = 5;
    Scanner sc = new Scanner(System.in);

    public void printStar() {
            for(int i = 0; i < numberOfLines; i++){
                for(int j = 1; j < numberOfLines - i; j++) {
                    System.out.print(" ");
                }
                for(int k = 0; k < i * 2 + 1; k++) {
                    System.out.print(character);
                }
                System.out.println();
            }
    }
    
    public void setInfo() {
        System.out.print("Input character: ");
        character = sc.nextLine().charAt(0);
        System.out.print("Input line number: ");
        numberOfLines = sc.nextInt(); 
    }
    
}
