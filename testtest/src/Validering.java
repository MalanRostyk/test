
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rostykmalanchuk
 */

public class Validering {
    private static InfDB db;
    
    public static boolean bokstavsKontroll(JTextField inmatning){
        boolean resultat = true;
        if(inmatning.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rutan är tom!");
            resultat = false;
            inmatning.requestFocus();
        }
        return resultat;
    }
    public static boolean isHeltal(JTextField ruta){
        boolean kontroll = true;
        try{
            String inString = ruta.getText();
            Integer.parseInt(inString);
            ruta.requestFocus();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Du matade in bokstäver, testa ange ett helttal!");
            kontroll = false;
            ruta.requestFocus();
        }
        return kontroll;
    }
}
