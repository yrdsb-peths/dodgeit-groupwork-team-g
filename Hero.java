import greenfoot.*; 

public class Hero extends Actor
{
    int where = 0;
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            where += 1;
            if(where == 3){
                where = 0;
            }
        }
        
        if(where == 0)
        {
            setLocation(100, 100);
        }
        else
        {
            if(where == 1){
                setLocation(100,200);
            }
            else{
                setLocation(100, 300);
            }
        }
    }
}
