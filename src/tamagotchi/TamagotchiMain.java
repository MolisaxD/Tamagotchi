/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamagotchi;

import dao.DBConnection;
import telas.TelaCadastro;
import telas.TelaListagem;

/**
 *
 * @author mborges
 */
public class TamagotchiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection db = new DBConnection();
        db.getConnection();
        
        TelaListagem telaInicial = new TelaListagem();
        telaInicial.setVisible(true);
    }
    
}
