package local.jlw23339;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here
        char[][] board = {{' ',' ', '|', ' ',' ', '|',' ', ' '},
                {'-','-', '+', '-','-', '+', '-','-'},
                {' ',' ', '|', ' ',' ', '|',' ', ' '},
                {'-','-', '+', '-','-', '+', '-','-'},
                {' ',' ', '|', ' ',' ', '|',' ', ' '}};

        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println(p1.getPlayer());
        System.out.println(p2.getPlayer());
        printboard(board);
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a position: ");
        int position = s.nextInt();
        chooseposition(position, board);
        printboard(board);

    }
    public static void printboard(char[][] board){
        for(char[] row : board)
        {
            for (char ch : row)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void chooseposition(int position, char[][] board/**, User user**/){
        switch(position){
            case 1:
                board[0][0] = 'X';
                break;
            case 2:
                board[0][3] = 'X';
                break;
            case 3:
                board[0][6] = 'X';
                break;
            case 4:
                board[2][0] = 'X';
                break;
            case 5:
                board[2][3] = 'X';
                break;
            case 6:
                board[2][6] = 'X';
                break;
            case 7:
                board[4][0] = 'X';
                break;
            case 8:
                board[4][3] = 'X';
                break;
            case 9:
                board[4][6] = 'X';
                break;

        }
    }
}
