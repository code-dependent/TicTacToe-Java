package local.jlw23339;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        char[][] board = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};


        Player p1 = new Player();
        Player CPU = new Player("CPU");
        boolean is_running = true;
        while (is_running)
        {
            printboard(board);
            Scanner s = new Scanner(System.in);

            System.out.println(p1.getPlayer() + " Choose a position: ");
            int position = s.nextInt();
            chooseposition(position,
                    board,
                    p1,CPU);
            printboard(board);
            if(p1.hasWon()){
                break;
            }
            if((p1.getMoves().size() + CPU.getMoves().size()) == 9){
                System.out.println("DRAW");
                break;
            }
            Random r = new Random();
            int randint = r.nextInt(9) + 1;

            chooseposition(randint,
                    board,
                    CPU,p1);
//            printboard(board);
            if(CPU.hasWon()){
                break;
            }
            System.out.println(p1.getMoves().size());
            if((p1.getMoves().size() + CPU.getMoves().size()) == 9){
                System.out.println("DRAW");
                break;
            }




        }


    }

    public static void printboard(char[][] board)
    {
        for (char[] row : board)
        {
            for (char ch : row)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void chooseposition(int position,
                                      char[][] board,
                                      Player player,Player player2)
    {
        Random r = new Random();
        char space = ' ';
        while(player.getMoves().contains(position) || player2.getMoves().contains(position)){
            if (player.getName().equals("CPU"))
            {
                position = r.nextInt(9)+1;
            }
            else{
                Scanner s = new Scanner(System.in);
                System.out.println(player.getPlayer() + " Position already Taken; Try again.: ");
                position = s.nextInt();
            }

        }
        switch (position)
        {
            case 1:

                board[0][0] = player.symbol;

                player.setMoves(position);
                break;

            case 2:

                board[0][2] = player.symbol;

                player.setMoves(position);
                break;
            case 3:

                board[0][4] = player.symbol;

                player.setMoves(position);
                break;
            case 4:

                    board[2][0] = player.symbol;

                player.setMoves(position);
                break;
            case 5:

                    board[2][2] = player.symbol;
                player.setMoves(position);
                break;
            case 6:

                    board[2][4] = player.symbol;


                player.setMoves(position);
                break;
            case 7:

                    board[4][0] = player.symbol;


                player.setMoves(position);
                break;
            case 8:

                    board[4][2] = player.symbol;


                player.setMoves(position);
                break;
            case 9:

                board[4][4] = player.symbol;

                player.setMoves(position);
                break;

        }
    }
}
