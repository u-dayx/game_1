import java.util.Scanner;
public class rps1 {
    
    public static void main (String[]args){
        Scanner si = new Scanner(System.in);
        System.out.println("======");
        System.out.println("Rock , Paper , scissor - Game ");
        System.out.println("======");
        System.out.println("Choose your move : ");
        System.out.println(" 1-> Rock ");
        System.out.println("2-> Paper ");
        System.out.println("3-> Scissor ");
        System.out.println("Enter your choice :");
        int Player_choice = si.nextInt();

        if (Player_choice<1 || Player_choice>3){
            System.out.println("Invalid input please enter a valid number between 1 to 3 :");
            
            return;
        }
        int Computer_choice = (int)(Math.random()*3)+1;

        String Computer_move ="";
        String Player_move = "";
        switch(Player_choice){
            case 1:
                Player_move = "Rock";
                break;
            case 2: 
                Player_move = "Paper ";
                break;
            case 3 :
                Player_move = "Scissor";
                break;        
        }
        switch(Computer_choice){
            case 1:
                 Computer_move = "Rock";
                 break;
            case 2:
                Computer_move = "Paper";
                break;
            case 3 :
                Computer_move = "Scissor";
                break;  
        }
        System.out.println("Your choice " + Player_move);
        
        System.out.println("Computer choice " + Computer_move);
        

        if (Player_choice==Computer_choice){
            System.out.println(" Draw ");


        }
        else if ( (Player_choice==1 && Computer_choice==3) ||
                (Player_choice==3 && Computer_choice==2) ||
                (Player_choice==2 && Computer_choice==1)){

                    System.out.println("You won ");
            }
        else {
            System.out.println("Computer won");

        }

        

        

                      
    }
}
