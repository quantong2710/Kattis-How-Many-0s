/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm_howmanyos;

import java.util.Scanner;

/**
 *
 * @author tongd
 */
public class ACM_HowMany0s {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            long first = sc.nextLong();
            long second = sc.nextLong();
            if (first == -1) break;
            long count = 0;
            for(long i = first; i <= second; i++) {
                String s = Long.toString(i);
                for(int l = 0; l < s.length(); l++) {
                    if(s.charAt(l) == '0') count++;
                }
            }
            System.out.println(count);
        }
            
                   
    }
    
}
