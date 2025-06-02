package org.example.Demo1;

import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {



        int []num={12,3,4,5,6,7,8};
        int largest=num[0];
        int smallest=num[0];

        for(int i=1;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
            else if(num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(largest);
        System.out.println(smallest);


//        String manipulation

//        String str="the rains have started here selenumm";
//        String str="the rains have started here selenumm";
//        System.out.println(str.length());
//        System.out.println(str.charAt(5));
//        System.out.println(str.indexOf('s'));
//        int second=str.indexOf('s',str.indexOf('s')+1);
//        System.out.println(str.indexOf('s',second+1));
        String str="He_l_lo_w_o_r_d_m_o_h_a_n";
        String[] s = str.split("_",9);
        System.out.println(Arrays.toString(s));
        for(String s1:s){
            System.out.print(s1);
        }

    }
}
