package local.jlw23339;

import java.util.*;

public class Player
{
    private static int[][] wins = {{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};


    private static int maxid;
    public int id;
    public String name;
    public char symbol;
    public ArrayList<Integer> moves = new ArrayList<>();
    public Player(String name)
    {
        this.name = name;
        maxid++;
        this.id = maxid;
        this.symbol = 'O';

    }

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

    public ArrayList<Integer> getMoves()
    {
        return moves;
    }

    public void setMoves(int move)
    {
        this.moves.add(move);
    }

    public char getSymbol()
    {

        return symbol;
    }
    public boolean hasWon(){
        for(int[] ar : wins){
            int count = 0;

            for( int i = 0;i<ar.length;i++){
                if(moves.contains(ar[i])){
                    count++;
                }

            }
            if(count == 3){
                System.out.println(this.name+" wins🎉");
                return true;

            }

        }
        return false;
    }
}

