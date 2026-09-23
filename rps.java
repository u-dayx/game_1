import java.util.Scanner;
public class rps {
    public static void main(String[]args){
        Scanner g = new Scanner(System.in);
        System.out.println("Enter your choice ' 1=  rock ', ' 2= paper', ' 3= scissor' : ");
        int player_choice = g.nextInt();
        int computer_choice = (int)(Math.random()*3)+1;
         
        if (player_choice==computer_choice){
            System.out.println(" 'draw ' computer choice : " + computer_choice);
        }
        else if (player_choice==1 && computer_choice==2){
            System.out.println(" 'lost' computer choice : " + computer_choice);
        }
        else if (player_choice==2 && computer_choice==1){
            System.out.println(" 'won ' computer choice : " + computer_choice );
        }
        else if ( player_choice==2 && computer_choice==3){
            System.out.println(" 'lost' computer choice : " + computer_choice);
        }
        else if (player_choice==3 && computer_choice==2){
            System.out.println("  'won' computer choice : " + computer_choice);
        }
        else if (player_choice==1 && computer_choice==3){
            System.out.println(" 'won' computer choice :" +computer_choice );

        }
        else if (player_choice==3 && computer_choice==1){
            System.out.println(" 'lost' computer choice : " + computer_choice);
        }


    }
    
}
