package Object;

import java.util.UUID;

public class Tetrimino
{
	
	private String id;
	private String name;
	private String color;
		
	public Tetrimino(String nom, String couleur)
	{
		this.id = UUID.randomUUID().toString();
		this.name = nom;
		this.color = couleur;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param nom the name to set
	 */
	public void setName(String nom)
	{
		this.name = nom;
	}

	/**
	 * @return the color
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * @param couleur the color to set
	 */
	public void setColor(String couleur)
	{
		this.color = couleur;
	}
	
	/**
	 * @return the id
	 */
	public String getId()
	{
		return this.id;
	}
	

}
