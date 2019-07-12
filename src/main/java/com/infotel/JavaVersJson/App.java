package com.infotel.JavaVersJson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import org.json.JSONObject;

import com.infotel.JavaVersJson.metier.Compte;
import com.infotel.JavaVersJson.metier.ListCompte;




/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){
     Compte a = new Compte();
  a.setCode(1);
  a.setSolde(7000);
  a.setDateCreation(new Date());
  
  Compte b = new Compte();
  b.setCode(3);
  b.setSolde(12200);
  b.setDateCreation(new Date());
  
  Compte x = new Compte();
  x.setCode(3);
  x.setSolde(99900);
  x.setDateCreation(new Date());
  
  ListCompte listcompt = new ListCompte();
  listcompt.addCompte(a);
  listcompt.addCompte(b);
  listcompt.addCompte(x);
  System.out.println(a);
  System.out.println(b);
  System.out.println(x);
  
     
      JSONObject jsonobject=new  JSONObject(listcompt);
      System.out.println(jsonobject.toString());
     
      FileWriter fs = null;
      try {
          fs = new FileWriter("compte.json");
      } catch(IOException e) {
          System.err.println("Erreur lors de l'ouverture du fichier");
          System.err.println(e);
          System.exit(-1);
      }
     
      // Sauvegarde dans le fichier
      try {
       jsonobject.write(fs, 3, 0);
          fs.flush();
      } catch(IOException e) {
          System.err.println("Erreur lors de l'écriture dans le fichier.");
          System.err.println(e);
          System.exit(-1);
      }
      // Fermeture du fichier
      try {
          fs.close();
      } catch(IOException e) {
          System.err.println("Erreur lors de la fermeture du fichier.");
          System.err.println(e);
          System.exit(-1);
      }
      System.out.println("Le fichier a été généré.");
  }

}