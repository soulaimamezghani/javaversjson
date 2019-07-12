package com.infotel.JavaVersJson.metier;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class ListCompte {
	private List<Compte> compte=new ArrayList<Compte>() ; //<Compte> on fait appel a la methode Compte
	 public void addCompte(Compte x) {//je mets la methode dajout ici
	  compte.add(x);
	 }
	 public List<Compte> getCompte() {
	  return compte;
	 }
	 public void setCompte(List<Compte> compte) {
	  this.compte = compte;
	 }

	 @Override
	 public String toString() {
	  return "ListCompte [compte=" + compte + "]";
	 }
	 
	}


