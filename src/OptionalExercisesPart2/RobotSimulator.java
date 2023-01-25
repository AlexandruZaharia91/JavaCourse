package OptionalExercisesPart2;

public class RobotSimulator {
    public int[][] positions = new int[5][5];


    public static void main(String[] args) {

    }





    public void robotPosition(int x, int y) {
        boolean dimensionOk = false;

        for(int i = 0;i< positions.length;i++) {
            if(x <= positions.length && y <= positions[i].length) {
                dimensionOk = true;
            }
        }

        if(dimensionOk) {
            //apelare metoda position
        }else {
            int[][] newPosition = new int[x][y];
        }
    }



    public void position(int x, int y) {



    }




}



