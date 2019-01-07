/**
 * You have to make N electrons to 1 electron as a single electron atom or even
 * number of electrons can pass through the warp gate, if its even number of
 * electron you can remove half and if its odd you can either remove 1 or add 1
 * electron.
 *
 * Define a method so that it takes number of electron as input and produces the
 * lest number of step as output.
 *
 * Test Case 1 :
 * N = 1
 * Step = 1  Output = 0
 *
 * Test Case 2 :
 * N = 10
 * Step = 10->5->4->2->1 Output = 4
 */
package helper;

/**
 *
 * @author Yash Nainsukha
 */
public class Atoms {

    /**
     *
     * @param N the number of electrons
     * @return the number of steps needed
     */
    public static int getOperationCount(int N) {
        int steps = 0;
        while (N != 1) {
            if ((N % 2) == 0) {
                if (isPowOfTwo(N) && N != 2) {
                    steps += Math.log10(N) / Math.log10(2);
                    return steps;
                } else {
                    N /= 2;
                    steps++;
                }
            } else if (N == 3 || ((N - 1) % 4) == 0) {
                /*
                we will subtract 1 if  the number turn out to be 3 or it turns
                out to be divisible by 4. As it is divisble by 4 it gives us
                two times divison by 2. if we add one in this case we have to divide and
                subtract and again divide to reach the same number which increases one step.
                Example [9,11] 
                subtarct 1 from 9->8->4 to reach 4 we took 2 steps
                add 1 to 9->10->5->4 to reach 4 we took 3 steps
                 */
                N -= 1;
                steps++;
            } else {
                N += 1;
                steps++;
            }
        }
        return steps;
    }

    public static boolean isPowOfTwo(int num) {
        return (num ^ (num - 1)) == 0;
    }

}
