/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoVaca;
import javax.swing.JOptionPane;
import modelo.Vaca;
import tela.manutencao.ManutencaoAnimal;
/**
 *
 * @author iago-
 */
public class ControladorVaca {
    public static void inserir(ManutencaoAnimal man){
        Vaca objeto = new Vaca();
        objeto.setBrinco(man.jtfBrinco.getText());
        
        boolean resultado = DaoVaca.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
