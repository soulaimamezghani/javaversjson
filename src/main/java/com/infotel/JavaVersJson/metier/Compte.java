package com.infotel.JavaVersJson.metier;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.json.JSONPropertyIgnore;
public class Compte {
	private long code;
	private double solde;
	private Date dateCreation;
	public long getCode() {
	 return code;
	}
	public void setCode(long code) {
	 this.code = code;
	}
	public double getSolde() {
	 return solde;
	}
	public void setSolde(double solde) {
	 this.solde = solde;
	}
	@JSONPropertyIgnore
	public Date getDateCreation() {
	 return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
	 this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
	 return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + dateCreation + "]";
	}
	}

