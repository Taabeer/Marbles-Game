import java.util.Random;
public class Computer
{
    
    private int mode;
    private int choice;
    
    public Computer(int m)
    {
        mode = m;
        choice = -1;
    }
    
    public void move(int marblesLeft)
    {
    	Random random= new Random();
    	if (mode==1) //stupid mode
    	{
    		// generates a random integer value between 1 and n/2 and modifies the variable choice to reflect this
    		if (marblesLeft==1) 
    		{
    			choice=1;
    		}
    		else 
    		{
                choice = random.nextInt(marblesLeft / 2) + 1;
    		}
    	}
    	else if (mode==2)//smart mode
    	{
    		if (marblesLeft==3||marblesLeft==7||marblesLeft==15||marblesLeft==31||marblesLeft==63) 
    		{
                choice = random.nextInt(marblesLeft / 2) + 1;
    		}
    		else 
    		{
    			if (marblesLeft>63) 
    			{
    				choice=marblesLeft-63;
    			}
    			else if (marblesLeft>31) 
    			{
    				choice=marblesLeft-31;
    			}
    			else if (marblesLeft>15) 
    			{
    				choice=marblesLeft-15;
    			}
    			else if (marblesLeft>7) 
    			{
    				choice=marblesLeft-7;
    			}
    			else if (marblesLeft>3) 
    			{
    				choice=marblesLeft-3;
    			}
    			else if (marblesLeft==2) 
    			{
    				choice= 1;
    			}
    		}
    	}
    }
    
    
    public int getChoice()
    {
        return choice;
    }
    
}