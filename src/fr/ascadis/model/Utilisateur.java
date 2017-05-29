package fr.ascadis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur implements Serializable
{

	/**
	 * Default Serial Version UID
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UTIL_ID")
	int id;
	
	@Column(name="UTIL_NAME")
	String nom;
	
	@Column(name="UTIL_PASSWORD")
	String password;
	
	public Utilisateur(String nom, String password)
	{
		this.nom = nom;
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @return the nom
	 */
	public String getNom()
	{
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
}
