/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilerepeticao;

import javax.swing.JOptionPane;
/**
 *
 * @author lucas.maia
 */
public class DoWhileRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int media, n, s = 0, totalValor = 0, par = 0, impar = 0, maiorCem = 0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "<html>Informe um número: <br><em>(Para interromper digite 0)</em></html>"));
            s += n;
            
            if (n % 2 == 0){
                par++;
            }
            else {
                impar++;
            }
            if (n > 100){
                maiorCem++;
            }
            if (n != 0){
                totalValor++;
            }
   
        } while (n != 0);
        
        media = s/totalValor;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final<hr> <br>Total de valores: " 
                + totalValor + "<br>Números Pares: " + par + "<br>Números Impares: " + impar +
                "<br>Números acima de cem: " + maiorCem + "<br>Média dos valores: " + media);
    }
    
}
