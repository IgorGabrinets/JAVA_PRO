package Lesson_02032023;

public class SeaBattle {
    private static final int FIELD_SIZE = 10;

                                       //{countDeck - index 0, countShip - index 1}
    private static final int[][] SHIPS = {{4,1},{3,2},{2,3},{1,4}};
    public static void main(String[] args) {
        String playerOne = null;
        String playerTwo = null;;
        //Add input players name from scanner

        char[][] fieldOne = new char[FIELD_SIZE][FIELD_SIZE];
        char[][] fieldTwo = new char[FIELD_SIZE][FIELD_SIZE];


        //Add ships on field
        fillPlayerField(fieldOne);
        //Add ships on field
        fillPlayerField(fieldTwo);

        startGame(playerOne, playerTwo, fieldOne,fieldTwo);
    }

    private static void startGame(String playerOne, String playerTwo, char[][] fieldOne, char[][] fieldTwo) {
    }

    private static void fillPlayerField(char[][] fieldTwo) {
        for (int i=0; i < SHIPS.length; i++){
            int shipCount = SHIPS[i][1];
            for(int j = 0; j < shipCount; j++){
                int shipDeck = SHIPS[i][0];


             boolean resultChek = false;
             while (!resultChek){
                 int x = 0;
                 int y = 0;
                 //ask first (x,y)
                 int direction = 0;
                 //ask direction (1=horizontal, 2=vertical)
             }
            resultChek = validationCoorinate(field, x,y,direction);
            }
        }
    }
}
