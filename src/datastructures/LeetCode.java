/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

import java.util.ArrayList;

/**
 *
 * @author james
 */
public class LeetCode {
    
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int[] lista = new int[n * 2];
        
        
        for (int i = 0; i < n; i++) {
            
            lista[i] = nums[i];
            lista[i + n] = nums[i];
            
        }
        return lista;
        
    }    
    
    public static void main(String[] args) {
        LeetCode exe = new LeetCode();
        int[] nums = {5,2,1};
                
        int[] result = exe.getConcatenation(nums);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
