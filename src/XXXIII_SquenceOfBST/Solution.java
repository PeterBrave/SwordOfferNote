package XXXIII_SquenceOfBST;

/**
 * @author kavin
 * @date 2019-10-24 14:43
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence==null || sequence.length<=0) {
            return false;
        }
        return VerifySequenceOfBST(sequence, 0, sequence.length-1);
    }

    private boolean VerifySequenceOfBST(int[] sequence, int start, int end) {
        if (start>=end) {
            return true;
        }

        int root = sequence[end];
        int i=start;

        while (sequence[i]<root){
            i++;
        }

        int j=i;
        while (j<end){
            if (sequence[j]<root){
                return false;
            }
            j++;
        }

        boolean left = VerifySequenceOfBST(sequence, start, i-1);
        boolean right = VerifySequenceOfBST(sequence, i, end-1);
        return left&&right;
    }
}
