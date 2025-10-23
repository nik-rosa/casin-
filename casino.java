package cainò;
import java.util.Random;
import java.util.Scanner;
public class casino {
    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int saldo = 500;

        //decide a cosa giocare tramite lo switch
        System.out.println("Benvenuto nel casino a cosa vuoi giocare?");
        int n;
        n = in.nextInt();
        switch (n) {
            case 1:
                
                System.out.println("Bevenuto nel Blakjack");
                System.out.println("saldo = "+saldo);

                //dichiaro variabili
                int cartaP;
                int cartaD;
                int t;
                int s;


                //prima carta del giocatore
                cartaP = r.nextInt(1, 11);
                System.out.println("tua carta" +cartaP);
                
                //prima carta del dealer
                cartaD = r.nextInt(1,11);
                System.out.println("carta dealer = " +cartaD);
                
                //seconda carta del giocatore, variabile t per salvare la carta e poter fare la somma;
                t = cartaP;
                s = t + cartaP;
                cartaP = r.nextInt(1,11);
                System.out.println("tue carte"+s);
                
                //condizione per capire se l'aversario può dividere
                if(t == cartaP){
                    System.out.println("1 = carta  2 = stai  3 = raddoppia  4 = dividi");
                    n = in.nextInt();
                }else{
                    System.out.println("1 = carta  2 = stai  3 = raddoppia");
                    n = in.nextInt();
                }

                //switch per capire che scelta fa l'avversario
                switch(n){
                    case 1:
                        break;
                    
                    case 2:
                        break;
                        
                    case 3:
                        break;
                        
                    case 4: 
                        break;    
                }

                break;
        }
    }

}