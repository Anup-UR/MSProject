//For a given array of positive integers, find the last element remaining by removing elements using below criteria.
//        Add the first and last number in an array and remove the element at position
//        equal to last digit of sum. If last digit is greater than no.
//        of elements in an array, re-iterate the array and remove element.
//        Ex: array = [1,3,2,4,6]
//        Sum of first and last number = 7, as seven is exceeding length of array we have to remove
//        3 which will lie at 7th position if we
//        re-iterate.
//        [1,2,4,6] sum = 7
//        [1,2,6] sum = 7
//        [2,6] sum = 8
//        [2] – required result


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class New {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(list);
        int newlen=0;
        int i;
        int j=1;
        for(i=0;i<= list.size()-1;i++) {
            newlen = list.get(i) + list.get(list.size()-j);
            j++;
            int newlen1 = 0;
            if(newlen>list.size()){
                newlen1=newlen-(list.size());
                newlen1=newlen1-1;
                if(newlen1==0){
                    break;
                }
                System.out.println("New length: "+newlen1);
            }
            list.remove(newlen1);
            System.out.println("New List: "+list);
        }
        System.out.println(list);
    }

}
