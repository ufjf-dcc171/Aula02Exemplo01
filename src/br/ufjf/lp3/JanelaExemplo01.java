package br.ufjf.lp3;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author ice
 */
public class JanelaExemplo01 extends JFrame{

   public JanelaExemplo01() throws HeadlessException {
      super("Janela Exemplo01");
      this.setLayout(new FlowLayout(FlowLayout.CENTER));
      Icon icoUFJF = new ImageIcon("resources/logo_ufjf.gif");
      JLabel lblInstituicao = new JLabel("Universidade Federal de Juiz de Fora", icoUFJF, SwingConstants.LEFT);
      lblInstituicao.setVerticalTextPosition(SwingConstants.BOTTOM);
      lblInstituicao.setHorizontalTextPosition(SwingConstants.CENTER);
      JLabel lblUnidade = new JLabel("Instituto de Ciências Exatas");
      JLabel lblDepartamento = new JLabel("Ciência da Computação");
      this.add(lblInstituicao);
      this.add(lblUnidade);
      this.add(lblDepartamento);
   }

   

}