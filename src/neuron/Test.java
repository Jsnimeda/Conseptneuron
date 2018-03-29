/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuron;

/**
 *
 * @author JSNimeda
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Neuron NE = new Neuron(4);
         
        double weights [] = {1,0.5,1,0.5};
        int inputs [][]={{0,0,0,0},
                            {0,0,0,1},
                            {0,0,1,0},
                            {0,0,1,1},
                            {0,1,0,0},
                            {0,1,0,1},
                            {0,1,1,0},
                            {0,1,1,1},
                            {1,0,0,0},
                            {1,0,0,1},
                            {1,0,1,0},
                            {1,0,1,1},
                            {1,1,0,0},
                            {1,1,0,1},
                            {1,1,1,0},
                            {1,1,1,1},
                            };
        
        
        NE.setThreashhold(2);
        NE.setWeights(weights);
        
        for(i=0;i<16;i++){
        NE.setInputs(inputs[i]);
        System.out.println(inputs[i][0]+","+inputs[i][1]+","+inputs[i][2]+","+inputs[i][3]+"==>"+NE.calculate());
        }
        
        
    }
    
}
