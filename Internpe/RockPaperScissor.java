import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
    	int i,j=0,cScore=0,yScore=0;;
    	Scanner sc = new Scanner(System.in);

    	String stores[] =new String[20];//0 to 8
    	System.out.println("Welcome to Rock, Paper, Scissor.");
    	System.out.print("Enter name:");
    	String name=sc.nextLine() ;
    	System.out.println("Good Morning.."+name);
    	Scanner sc1=new Scanner(System.in);
    	System.out.println("How many match do you want to play");
    	int c=sc1.nextInt();
    	for(i=1;i<=c;i++)
    	{
    		
    	System.out.println("\nRound: "+i+"\nEnter choice:\n1.Rock");
    	System.out.println("2.Paper");
    	System.out.println("3.Scissor");
    	int i1 = sc.nextInt();
    	Random rd = new Random();
    	int i2=rd.nextInt(1,4);
    	String s1,s2,s3;
    	
    	
    	if(i1==1)
    		s1="Rock";
    	else if(i1==2)
    		s1 = "Paper";
    	else
    		s1="Scissor";
    		
    	
    	
    	if(i2==1)
    		s2="Rock";
    	else if(i2==2)
    		s2 = "Paper";
    	else
    		s2="Scissor";
    	
    	System.out.println("You choose "+s1+". Computer choose "+s2+".");
    	stores[j]=s1;j++;
    	stores[j]=s2;j++;
    	if( (s1=="Rock" && s2 == "Scissor")||
        		(s1=="Paper" && s2 == "Rock")||
        		(s1=="Scissor" && s2 == "Paper")
        	  )
        		{System.out.println("You won.Hurray **");
        		yScore +=1;
        		stores[j]=name+" won";j++;
        		}
    	else if( (s1=="Rock" && s2 == "Rock")||
        		(s1=="Paper" && s2 == "Paper")||
        		(s1=="Scissor" && s2 == "Scissor")
        	  )
        		{System.out.println("Match draw.. **");
        		stores[j]="Match draw";j++;
        		}
    	else
     	{System.out.println("Computer won.");
    		cScore +=1;
    		stores[j]="Computer won";j++;
    	}

    	
    	
    	}
    	
    	int k=-1;
        //printing scoring table.
    	System.out.println("*********\nTable ");
    	System.out.println("----------------------------------------------------------");
    	System.out.printf("%-16s%-16s%-16s%-16s","slno",name,"Computer","Result");
    	System.out.println("\n----------------------------------------------------------\n");
    	
    	for(i=1;i<=c;i++)
    		
    			{
    		System.out.printf("%-16s%-16s%-16s%-16s",i,stores[k+=1],stores[k+=1],stores[k+=1]);
    		System.out.println();
    			
    			}
    	System.out.println("----------------------------------------------------------");
    	System.out.println("Final Result:");
    	System.out.println("Your score:"+yScore+"\nComputer Score:"+cScore);
    	if(yScore>cScore)
    	{
    		System.out.println(name+" Won the match..");
    	}
    	else if(yScore<cScore)
    	{
    		System.out.println("Computer won the match..");
    	}
    	else 
    	{
    		System.out.println("Match draw..");
    	}
    	
    	System.out.println("----------------------------------------------------------");
    	sc.close();
    }
}
