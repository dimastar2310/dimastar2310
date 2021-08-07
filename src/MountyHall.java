import java.util.Random;

public class MountyHall {


    public static void main(String[] args) {
        int switchWins = 0; //we need both so that we know
        int stayWins = 0; //where do the other pracents go
        Random gen = new Random();
        int Raunds = 32768;
        for (int plays = 0; plays < Raunds; plays++) {
            int[] doors = {0, 0, 0};

            int randomDoor = gen.nextInt(3);
            //putting the price
            doors[randomDoor] = 1;  //randomly generate index from 0 to 3 [0,3)
            //pick door any door
            int choice = gen.nextInt(3); //the player choosing

            int shown = gen.nextInt(3); //the host showing door

            if (choice == shown) { //the host dont show the door the guest pick
                while (choice == shown) {
                    choice = gen.nextInt(3);
                }
            }
            if (shown == randomDoor) { //the host dont show the door with the car
                while (shown == randomDoor) {

                    shown = gen.nextInt(3);
                }

            }
            //now randomising staying or not 1 or 2
            //do the guess want to stay with hes chois?
            //in the other 2 door theres is price
            //1 is to stay 2 is to move to other door

            //no else here i do want its to happen
            int stayOrnot = gen.nextInt(2);
            if (stayOrnot == 0) { //he stays in hes door
                if (doors[choice] == 1) { //if the car is here we win
                    stayWins++;
                    //remaing doors he choosed to switch
                    //the 69 is if he choose to switch
                } else {
                    switchWins++; // the car was in other door
                }
            } else {//else he choose to go other door
                //and the price was there
                //other stayOrnot
                if (doors[2 - choice] == 1 || doors[2 - shown] == 1) { //if he switched and hes guess was right
                    switchWins++; //the price is the remanining 2 doors for sure
                } else {
                    stayWins++;
                }


            }


        }
        System.out.println("staying wins = " + (double) stayWins / Raunds);
        System.out.println("Switching wins =" + (double) switchWins / Raunds);
    }
}

