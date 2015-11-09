
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PHInfoNote
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cidade c= new Cidade(1,"Tapejara", "RS");
        Pessoa p= new Pessoa(1,"Paulo Henrique", c);
        String saida=("Nome "+p.getNome()+" Cidade: "+p.getCidade().getNome());
        
        JOptionPane.showMessageDialog(null, saida);
        
        
    }
    
}
