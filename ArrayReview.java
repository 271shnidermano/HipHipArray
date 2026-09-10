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
    }
}