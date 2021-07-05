package placementclasses;
import java.util.Scanner;
public class numRookCaptures {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	char[][] board=new char[8][8];
	for(int i=0;i<8;i++)
	{
		for(int j=0;j<8;j++)
		{
			board[i][j]=sc.next().charAt(0);
		}
	}
	for(int i=0;i<8;i++)
	{
		for(int j=0;j<8;j++)
		{
			System.out.println(board[i][j]);
		}
	}
	int r=0,c=0,flag=1;
	for(int i=0;i<8;i++)
    {
        for(int j=0;j<8;j++)
        {
            if(board[i][j]=='R')
            {
                r=i;
                c=j;
                flag=0;
                break;
            }
        }
        if(flag==0)
            break;
    }
    int count=0;
    for(int i=r;i<8;i++)
    {
        if(board[i][c]=='p')
        {
            count++;
            break;
        }
        else if(board[i][c]=='B')
            break;
    }
    for(int i=r;i>=0;i--)
    {
        if(board[i][c]=='p')
        {
            count++;
            break;
        }
        else if(board[i][c]=='B')
            break;
    }
    for(int i=c;i<8;i++)
    {
         if(board[r][i]=='p')
        {
            count++;
            break;
        }
        else if(board[r][i]=='B')
            break;
    }
     for(int i=c;i>=0;i--)
    {
         if(board[r][i]=='p')
        {
            count++;
            break;
        }
        else if(board[r][i]=='B')
            break;
    }
     System.out.println(count);
}
}
