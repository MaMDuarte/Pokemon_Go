package Pokemon_Go;

import javax.swing.JOptionPane;

public class Tipos_Pokemon 
{
    // ===================== ATRIBUTOS =======================
	private String tipo1;
	private String tipo2;
	
    // ============ ACESSORES e MODIFICADORES ===============
	public String getTipo1() 
	{
		tipo1 = JOptionPane.showInputDialog("Introduza o Tipo do Pokemon: ");
		return tipo1;
	}
	
	public void setTipo1(String tipo1) 
	{
		this.tipo1 = tipo1;
	}
	
	public String getTipo2() 
	{
		tipo2 = JOptionPane.showInputDialog("Introduza o Segundo tipo do Pokemon: ");
		return tipo2;
	}

	public void setTipo2(String tipo2) 
	{
		this.tipo2 = tipo2;
	}
    // =================== CONSTRUTORES =====================

    // CONSTRUTOR DEFAULT
	public Tipos_Pokemon() {}
	
    // CONSTRUTOR COM PARÂMETROS
	public Tipos_Pokemon(String tipo1, String tipo2) 
	{
		super();
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
	}

	// ----> toString()
	@Override
	public String toString() 
	{
		return "Primeiro Tipo: " + tipo1 + "\nSegundo Tipo: " + tipo2;
	}
}