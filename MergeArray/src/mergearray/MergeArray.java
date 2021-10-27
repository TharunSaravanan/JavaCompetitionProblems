/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergearray;

/**
 *
 * @author Tharun Saravanan
 */
public class MergeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[] = new int[]{2, 4, 6, 8};
        int numbers[] = new int[]{1, 3, 5, 7};
        int answers[] = new int[8];
        
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < numbers.length; j++)
            {
                if(numbers[j] < nums[i])
                {
                    answers[i] = numbers[j];
                    answers[i + 1] = nums[i];
                }
                else if(numbers[j] == nums[i])
                {
                    answers[i] = numbers[j];
                    answers[i + 1] = numbers[j];
                    i++;
                }
            }
            for(int k = 0; k < answers.length; k++)
            {
                System.out.print(answers[i]);
            }
        }
        
    }
    
}
