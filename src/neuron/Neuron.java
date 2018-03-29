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
public class Neuron {
    
    private double threashhold;
    private int n_inputs,output;
    private int [] inputs;
    private double [] weights;
    
    public Neuron(int n_inputs){
        this.n_inputs=n_inputs;
        this.threashhold=threashhold;
        inputs=new int[n_inputs];
        weights = new double[n_inputs];
    }

    public void setThreashhold(double threashhold) {
        this.threashhold = threashhold;
    }
    
    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public void setInputs(int[] inputs) {
        this.inputs = inputs;
    }
    
    
     public int calculate(){
        int i;
        double sum=0;
        for(i=0;i<n_inputs;i++){
            sum+=inputs[i]*weights[i];
        }
        if(threashhold > sum){
            output=0;
        }
        else{
            output=1;
        }
        return output;
     }
    
}
