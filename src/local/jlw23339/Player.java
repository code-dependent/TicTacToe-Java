package local.jlw23339;

import java.util.Scanner;

public class Player
{
    private static int maxid;
    public int id;
    public String name;
    public char symbol;

    public Player()
    {
        maxid++;
        this.id = maxid;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Name for player " + maxid+": ");
        String res = s.next();
        if( this.id == 1){
            this.symbol = 'X';
        }else{
            this.symbol = 'O';
        }
        this.name = res;
    }

    public String getPlayer()
    {
        return "Player"+this.id;
    }

    public String getName()
    {
        return name;
    }

    public char getSymbol()
    {

        return symbol;
    }
}
