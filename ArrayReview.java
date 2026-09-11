public class ArrayReview{
    public static void main(String[] args){
        int[] scores = {60,54,39,81};
        System.out.println(scores.length);
        System.out.println(scores[0]);
        scores[1] = 52;
        System.out.println(scores[1]);
        System.out.println(scores.toString());
        for(int i = 0; i < scores.length; i++){
            System.out.println(scores[i] + " ");
        }

        double[] grades = new double[5];
        for (double g : grades)
        {
            System.out.print(g);
        }
        //a 2D is actually an array of arrays
        // it is a collection of rows and columns

        int[][] values = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        double[][] nums = new double[3][5];

        for (int i = 0; i < values.length; i++){
            for (int j = 0; j < values[i].length; j++){
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
}