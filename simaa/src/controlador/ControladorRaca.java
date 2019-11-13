/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoRaca;
import javax.swing.JOptionPane;
import modelo.Raca;
import tela.manutencao.ManutencaoRaca;
/**
 *
 * @author iago-
 */
public class ControladorRaca {
    public static void inserir(ManutencaoRaca man){
        Raca objeto = new Raca();
        objeto.setNome(man.jtfNome.getText());
        
        boolean resultado = DaoRaca.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
