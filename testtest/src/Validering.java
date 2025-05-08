
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rostykmalanchuk
 */
public class Validering {
    private InfDB db;
    public static boolean bokstavsKontroll(JTextField inmatning){
    boolean resultat = true;
    try{
        if(inmatning.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rutan är tom!");
        }else{
            String id = inmatning.getText();
            String sqlFraga = "slelct Namn from medlem where Medlemsnummer = "+id;
            String svar = db.fetchSingle(sqlFraga);
            
        }
    }catch(){
        
    }
    
    
    return resultat;
}
}
