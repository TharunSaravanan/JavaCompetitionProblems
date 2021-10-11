/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosumhashtable;

import java.util.*;
import java.io.*;

/**
 *
 * @author Tharun Saravanan
 */
public class TwosumHashTable {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[])
    {
        int[] nums = new int[]{3, 10, 5, 12};
        int target = 15;
        int[] answer = twoSum(nums, target);
        for(int j: answer)
        {
            System.out.println(j);
        }
    }
    
    

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }

        }
        return null;
    }

}
