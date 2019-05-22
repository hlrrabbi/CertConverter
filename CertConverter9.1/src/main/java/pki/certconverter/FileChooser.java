package pki.certconverter;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author hlrrabbi
 */
public interface FileChooser {

    /**
     *
     * @param champ
     * @param filter
     * default dans les fonctions permettent definir les interfaces sans méthodes abstraites
     */
    default void CertChooser(JTextField champ, FileFilter filter){
        //Pour selectionner un certificat
    	JFileChooser choisirFichier = new JFileChooser();
        choisirFichier.setFileFilter(filter);
        choisirFichier.setDialogTitle("Selectionnez un certificat");
        if (choisirFichier.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
        File f=choisirFichier.getSelectedFile();
        String chemin= f.getAbsolutePath();
        champ.setText(chemin);
        } else {
        champ.setText("Aucun fichier selectionné");
        }
    }
    
    default void SaveCert(JTextField champ1, String ext1, String ext2){
    	
    	//Pour enregistrer un certificat
        JFileChooser choisirDossier = new JFileChooser();
        choisirDossier.setDialogTitle("Selectionnez un fichier ou entrez un nom");
        choisirDossier.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (choisirDossier.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
        	String filename = choisirDossier.getSelectedFile().toString();
        	   if (!filename .endsWith(ext1) &&  !filename .endsWith(ext2))
        	        filename += ext1;
                         champ1.setText(filename);
    } 
        
    }
   
}