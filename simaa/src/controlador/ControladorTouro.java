/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoRaca;
import dao.DaoTouro;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Raca;
import modelo.Touro;
import tela.manutencao.ManutencaoAnimal;
/**
 *
 * @author iago-
 */
public class ControladorTouro {
  public static void inserir(ManutencaoAnimal man){
        Touro objeto = new Touro();
        objeto.setNome(man.jtfNome.getText());
        objeto.setRaca((Raca)man.cmbbxRaca.getSelectedItem());
        
        boolean resultado = DaoTouro.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
public static void atualizaComboTipo(ManutencaoAnimal man) {
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(DaoRaca.consultar().toArray());
        man.cmbbxRaca.setModel(defaultComboBoxModel);
    }
}
