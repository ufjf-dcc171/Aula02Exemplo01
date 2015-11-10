package br.ufjf.lp3;

import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class Aula02Exemplo01 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      JanelaExemplo01 janela =  new JanelaExemplo01();
      janela.setVisible(true);
      janela.setSize(400, 300);
      janela.setLocationRelativeTo(null);
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }
   
}
