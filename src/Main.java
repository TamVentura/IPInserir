/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Ventura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vetor v = new Vetor();
        v.insert(1);
        v.insert(2);

        v.insert(5);

        v.insert(10);
        v.insert(12);
        v.insert(15);
        v.insert(3);
        v.insert(4);
        
        Vetor v2 = new Vetor(1,5,3,6,7,8,2,9,5,100,20,55,3);
        
        for (int i = 0; i < v2.getSize(); i++) {
            System.out.println(v2.getValue(i));
        }
    }

}
