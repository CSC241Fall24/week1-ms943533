public class Ex1 {
    /**
     * Calculate the sum of an arithmetic progression.
     *
     * @param start The first term of the progression
     * @param step The common difference between consecutive terms
     * @param count The number of terms to sum
     * @return The sum of the arithmetic progression
     */
    public static long calculateGaussSum(long start, long step, int count) {
       long sum = 0;
        for(int i = 0; i < count; i++){
            sum += start;
            start += step;
        }
        return sum; // This is a placeholder return value. Replace it with your calculation.
    }

    public static void main(String[] args) {
        // TODO: Call the calculateGaussSum method with the correct parameters
        // and print the result
        // Parameters for the problem: start = 81297, step = 198, count = 100
        long start = 81297;
        long step = 198;
        int count = 100;
        System.out.println(calculateGaussSum(start, step, count));
    }
}
