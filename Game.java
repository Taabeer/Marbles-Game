import java.util.Random;
public class Game
{
    
    private int marbles;
    private Human humanPlayer;
    private Computer computerPlayer;
    
    public Game(int difficulty)
    {
    		this.computerPlayer= new Computer (difficulty);
    		this.humanPlayer= new Human();
    }
     
    public void play()
    {
        Random random = new Random();
        // sets marbles to a set amount between 10-100, using a random number generator
        marbles=  random.nextInt(91) + 10;
        System.out.println("The initial amount of marbles is: "+marbles);
    	// decide whether computer or human is first (0= computer first turn, 1=human first turn), using a random number generator
        int iFirstmove = random.nextInt(2);
        if (iFirstmove==0) 
        {
        	System.out.println("The computer will be making the first move!");
        }
        else if (iFirstmove==1) 
        {
        	System.out.println("You will be making the first move!");
        }
        while (iFirstmove==0) 
        {
        	computerPlayer.move(marbles);
        	marbles= marbles-computerPlayer.getChoice();
        	System.out.println("There are "+marbles+" marbles left!");
        	if (marbles==0) 
        	{
        		System.out.println("Good job, you won!");
        		break;
        	}
        	if (marbles==1) 
        	{
        		System.out.println("Oh no, you lost, sorry!");
        		break;
        	}
        	humanPlayer.move();
        	while (humanPlayer.getChoice()>(marbles/2)||humanPlayer.getChoice()<1) 
        	{
        		System.out.println("Choose a different marbles amount, that amount was invalid");
        		humanPlayer.move();
        	}
            marbles=marbles-humanPlayer.getChoice();
        	System.out.println("There are "+marbles+" marbles left!");
        }
        while (iFirstmove==1) 
        {
        	humanPlayer.move();
        	while (humanPlayer.getChoice()>(marbles/2)||humanPlayer.getChoice()<1) 
        	{
        		System.out.println("Choose a different marbles amount, that amount was invalid");
        		humanPlayer.move();
        	}
            marbles=marbles-humanPlayer.getChoice();
        	System.out.println("There are "+marbles+" marbles left!");
            if (marbles==0) 
            {
        		System.out.println("Oh no, you lost, sorry!");
        		break;
        	}
            computerPlayer.move(marbles);
        	marbles= marbles-computerPlayer.getChoice();
        	System.out.println("There are "+marbles+" marbles left!");
        	if (marbles==0) 
            {
          		System.out.println("Good job, you won!");
          		break;
          	}
        	if (marbles==1) 
        	{
        		System.out.println("Oh no, you lost, sorry!");
        		break;
        	}
        }
       
    }
    // you may wish to add more methods here
    


}