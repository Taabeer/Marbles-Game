
import java.util.Scanner;

public class Human
{
   
    private int choice;
    private Scanner input;
    
    public Human()
    {
        input=new Scanner(System.in);
        choice = -1;
    }
    
    public void move()
    {
        System.out.println("How many marbles would you like to remove?");
        choice= input.nextInt();
    }
    
    
    public int getChoice()
    {
        return choice;
    }
    
    
}