package com.qiuzi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//在一个数组中，找到三个数，使其和为0
public class Solution {
    
    //将数组转为map的形式，key对应数组中的值，value对应该值出现的次数
    public Map<Integer, Integer> getHashmap(int[] nums){
        
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        return map;
    }
    
    public int getMinuszeroEndPosition(int[] nums){
        
        int i;
        for(i = 0; i< nums.length;i++){
            if(nums[i] >= 0){
                return i;
            }
        }
        return i;
    }
    
    public boolean contains(int[] nums, int value,int minus){
        int i = 0;
        while(i<=minus && nums[i]!= -value){
            i ++;
        }
        return i>minus?false:true;
    }
    
    public void getSolutions(List<List<Integer>> solutions, int[] nums, int minus, int plus, int position, boolean flag){
        
        if(flag){
            for(int i = position+plus-minus-1;i<nums.length;i++){
                if(contains(nums,nums[i],minus)){
                    List<Integer> solution = new ArrayList<Integer>();
                    solution.add(0);
                    solution.add(nums[i]);
                    solution.add(-nums[i]);
                    if(solutions.size() == 0)
                        solutions.add(solution);
                    else{
                        int m;
                        for(m = 0;m<solutions.size();m++){
                            if(compare(solutions.get(m),solution))
                                break;
                        }
                        if(m == solutions.size()){
                            solutions.add(solution);
                        }
                    }
                }
            }
        }
        else{
            //对于每一个正数，找到绝对值的和等于它的两个负数
            int i = position;
            while(i < nums.length && nums[i]==0){
                i ++;
            }
            for(;i<nums.length;i++){
                int j = position-1;
                while(j>=0 && -nums[j] <= nums[i]/2){
                    
                    for(int k = j-1;k >=0;k--){
                        int sum = nums[j]+nums[k];
                        if(sum + nums[i] == 0){
                            List<Integer> solution = new ArrayList<Integer>();
                            solution.add(nums[i]);
                            solution.add(nums[j]);
                            solution.add(nums[k]);

                            if(solutions.size() == 0)
                                solutions.add(solution);
                            else{
                                int m;
                                for(m = 0;m<solutions.size();m++){
                                    if(compare(solutions.get(m),solution))
                                        break;
                                }
                                if(m == solutions.size()){
                                    solutions.add(solution);
                                }
                            }
                        }
                        else if(sum + nums[i] < 0){
                            break;
                        }
                    }
                    j--;
                }
            }
            
            //对于每一个负数，找到和等于它的绝对值的两个数
            i = position-1;
            while(position < nums.length && nums[position]==0){
                position ++;
            }
            for(;i>=0;i--){
                int j = position;
                while(j<nums.length && nums[j] <= -nums[i]/2){
                    
                    for(int k = j+1;k <nums.length;k++){
                        int sum = nums[j]+nums[k];
                        if(sum + nums[i] == 0){
                            List<Integer> solution = new ArrayList<Integer>();
                            solution.add(nums[i]);
                            solution.add(nums[j]);
                            solution.add(nums[k]);

                            if(solutions.size() == 0)
                                solutions.add(solution);
                            else{
                                int m;
                                for(m = 0;m<solutions.size();m++){
                                    if(compare(solutions.get(m),solution))
                                        break;
                                }
                                if(m == solutions.size()){
                                    solutions.add(solution);
                                }
                            }
                        }
                        else if(sum + nums[i] > 0){
                            break;
                        }
                    }
                    j++;
                }
            }
        }
    }
    
    public <T extends Comparable<T>> boolean compare(List<T> a, List<T> b) {
        if(a.size() != b.size())
            return false;
        Collections.sort(a);
        Collections.sort(b);
        for(int i=0;i<a.size();i++){
            if(!a.get(i).equals(b.get(i)))
                return false;
        }
        return true;
    }
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> solutions = new ArrayList<List<Integer>>();
        if(nums.length != 0){
            //Map<Integer, Integer> map = this.getHashmap(nums);
            
            Arrays.sort(nums);
            int position = getMinuszeroEndPosition(nums);
            int minus = position-1;
            int plus = position;
            while(plus < nums.length && nums[plus]==0){
                plus ++;
            }
            
            if(plus-minus>3){
                List<Integer> solution = new ArrayList<Integer>();
                for(int i = 0;i<3;i++){
                    solution.add(0);
                }
                solutions.add(solution);
            }
            if(plus-minus>1){
                if(position >0 && position+plus-minus-2 < nums.length-1){
                    getSolutions(solutions, nums, minus, plus, position, true);
                }
            }
            getSolutions(solutions, nums, minus, plus, position, false);
        }
        return solutions;
    }
    
    public static void main(String[] args){
        Solution s = new Solution();
        int[] nums = {-15,10,0,-2,14,-1,-10,-14,10,12,6,-6,10,2,-11,-9,2,13,2,-9,-14,-12,-10,-12,13,13,-10,-3,2,-11,3,-6,6,10,7,5,-13,4,-2,12,1,-11,14,-4,6,-12,-6,-14,8,11,-8,1,7,-3,5,5,-13,10,9,-3,6,-10,6,-3,7,-9,-13,9,10,0,-1,-11,4,-10,-8,-13,-15,2,-12,8,-2,-12,-14,-10,-8,6,2,-5,-7,-11,7,14,-6,-10,-12,8,-4,-10,-5,14,-3,9,-12,8,14,-13};
        List<List<Integer>> list = s.threeSum(nums);
        System.out.print("[");
        for(int i = 0 ; i < list.size() ; i++)
        {
            System.out.print("[");
            List<Integer> listi = list.get(i);
            for(int j = 0; j < listi.size() ; j++)
            {
                System.out.print(listi.get(j) + ",");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}