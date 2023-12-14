import java.io.*;
public class tictactoe
{
public static void main(String []args) throws Exception
{
char arr[]={'1','2' ,'3' ,'4','5','6','7','8','9'};
char player1='0' ,player2='X';
int player=0,playeraaa=0;
for(int i=0; i<3; i++)
{
System.out.print(arr[i]+"   " );

}
System.out.println();
System.out.println();

for(int j=0; j<3; j++)
{
System.out.print(arr[j+3] + "   ");

}
System.out.println();
System.out.println();

for(int k=0; k<3; k++)
{
System.out.print(arr[k+6]+ "   ");

}
System.out.println();
System.out.println();

System.out.println("///////////////     let's start the game  ////////////////");
System.out.println();
System.out.println();
System.out.println("player 1 = X , player 2 = 0\n");
while(((arr[4]!=arr[0]) || (arr[4]!=arr[8]) )&& ((arr[4]!=arr[2]) || (arr[4]!=arr[6]) )&& ((arr[0]!=arr[1]) ||(arr[1]!=arr[2])) && ((arr[3]!=arr[4]) || (arr[4]!=arr[5])) && ((arr[6]!=arr[7]) || (arr[7]!=arr[8]) ) && ((arr[0]!=arr[3]) || (arr[3]!=arr[6]) )  && ((arr[1]!=arr[4]) || (arr[4]!=arr[7]) ) && ((arr[2]!=arr[5]) || (arr[5]!=arr[8]) ))
{ 
playeraaa=(player%2);

System.out.println("player " + (playeraaa+1) +"'s turn");
System.out.println();
System.out.println();
System.out.println("enter a place at which you want to insert your character:");
InputStreamReader isr=new InputStreamReader(System.in);

BufferedReader br = new BufferedReader(isr);
char ch=(char)br.read();
System.out.println();
System.out.println();
if(playeraaa==1)
{
if(ch =='1')
{
arr[0]=player1;
}
else if(ch=='2')
{
arr[1]=player1;
}
else if(ch=='3')
{
arr[2]=player1;
}
else if(ch=='4')
{
arr[3]=player1;
}
else if(ch=='5')
arr[4]=player1;
else if(ch=='6')
arr[5]=player1;
else if(ch=='7')
arr[6]=player1;
else if(ch=='8')
arr[7]=player1;
else if(ch=='9')
arr[8]=player1;
if(playeraaa==0)
{
System.out.println("invalid input");
}



for(int i=0; i<3; i++)
{
System.out.print(arr[i]+"   " );

}
System.out.println();
System.out.println();
for(int j=0; j<3; j++)
{
System.out.print(arr[j+3] + "   ");
}
System.out.println();
System.out.println();
for(int k=0; k<3; k++)
{
System.out.print(arr[k+6]+ "   ");
}
System.out.println();
 System.out.println();
}

else
{ 
if(ch =='1')
{
arr[0]=player2;
}
else if(ch=='2')
{
arr[1]=player2;
}
else if(ch=='3')
{
arr[2]=player2;
}
else if(ch=='4')
{
arr[3]=player2;
}
else if(ch=='5')
arr[4]=player2;
else if(ch=='6')
arr[5]=player2;
else if(ch=='7')
arr[6]=player2;
else if(ch=='8')
arr[7]=player2;
else if(ch=='9')
arr[8]=player2;
else
{
System.out.println("invalid value");
}
for(int i=0; i<3; i++)
{
System.out.print(arr[i]+"   " );
}
System.out.println();
System.out.println();
for(int j=0; j<3; j++)
{
System.out.print(arr[j+3] + "   ");
}
System.out.println();
System.out.println();
for(int k=0; k<3; k++)
{
System.out.print(arr[k+6]+ "   ");
}
System.out.println();
System.out.println();
}
player++;


}
System.out.println("player " + (playeraaa+1)  + "won" );
}
}

















