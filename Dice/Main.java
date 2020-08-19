package Dice;

public class Main {

    public static void main(String[] args) {
        //creating some dice
        System.out.println(Dice.sidesOfDice);
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        //rolling two 6 six sided dice
        System.out.println();
        System.out.println("Six Sides");
        System.out.println();
        for(int i=0; i<10; i++){
            System.out.println("First Die: "+d1.roll());
            System.out.println("Second Die: "+d2.roll());
        }

        //Retrieving Face Values
        System.out.println();
        System.out.println("Face Value: "+d1.getFaceValue());
        System.out.println("Face Value: "+d2.getFaceValue());
        System.out.println();

        //Changing number sides of dice from 6 to 8
        Dice.changeNumSidesOfDice(8);
        System.out.println(Dice.sidesOfDice);
        System.out.println();
        System.out.println("Eight sides");
        System.out.println();
        for(int i=0; i<10; i++){
            System.out.println("First Die: "+d1.roll());
            System.out.println("Second Die: "+d2.roll());
        }

        //Retrieving Face Values
        System.out.println();
        System.out.println("Face Value: "+d1.getFaceValue());
        System.out.println("Face Value: "+d2.getFaceValue());

        //Things that will not work

        //d1.sidesOfDice; --> Since sidesOfDice is a static variable, cannot use Instance d1 to access it.
        //d1.changeNumSidesOfDice(8); --> changeNumSidesOfDice is a static function
        //Dice.roll(); --> Roll is an instance method, so an instance can call it, not a class
        //Dice.faceValue; -->faceValue is an instance variable and cannot be accessed by dice class, must create an object to access it

    }
}
