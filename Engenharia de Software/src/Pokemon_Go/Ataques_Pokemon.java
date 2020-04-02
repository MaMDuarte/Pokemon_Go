package Pokemon_Go;

import javax.swing.JOptionPane;

public class Ataques_Pokemon 
{
    // ===================== ATRIBUTOS =======================
	private String ataque1;
	private String ataque2;
	private int dano1;
	private int dano2;
	private int barrasAtaque2;
	
    // ============ ACESSORES e MODIFICADORES ===============
	public String getAtaque1() 
	{
		ataque1 = JOptionPane.showInputDialog("Nome do Fast Attack: ");
		return ataque1;
	}
	
	public void setAtaque1(String ataque1) 
	{
		this.ataque1 = ataque1;
	}
	
	public int getDano1() 
	{
		do {
			dano1 = Integer.parseInt(JOptionPane.showInputDialog("Dano do Fast Attack: "));
		} while(dano1 < 0 || dano1 >= 12.1);
		return dano1;
	}
	
	public void setDano1(int dano1) 
	{
		this.dano1 = dano1;
	}
	
	public String getAtaque2() 
	{
		ataque2 = JOptionPane.showInputDialog("Nome do Charge Attack: ");
		return ataque2;
	}
	
	public void setAtaque2(String ataque2)
	{
		this.ataque2 = ataque2;
	}
	
	public int getDano2() 
	{
		do {
			dano2 = Integer.parseInt(JOptionPane.showInputDialog("Dano do Fast Attack: "));
		} while(dano2 < 50 || dano2 >= 160.1);
		return dano2;
	}
	
	public void setDano2(int dano2) 
	{
		this.dano2 = dano2;
	}

	public int getBarrasAtaque2() 
	{
		do {
			barrasAtaque2 = Integer.parseInt(JOptionPane.showInputDialog("Barras do Charged Attack: "));
		} while(barrasAtaque2 < 0 || barrasAtaque2 > 3);
		return barrasAtaque2;
	}

	public void setBarrasAtaque2(int barrasAtaque2) 
	{
		this.barrasAtaque2 = barrasAtaque2;
	}
    // =================== CONSTRUTORES =====================

    // CONSTRUTOR DEFAULT
	public Ataques_Pokemon() {}
	
    // CONSTRUTOR COM PARÂMETROS
	public Ataques_Pokemon(String ataque1, String ataque2, int dano1, int dano2, int barrasAtaque2) 
	{
		super();
		this.ataque1 = ataque1;
		this.ataque2 = ataque2;
		this.dano1 = dano1;
		this.dano2 = dano2;
		this.barrasAtaque2 = barrasAtaque2;
	}
	
    // ----> toString()

	@Override
	public String toString() {
		return "Fast Attack: " + ataque1 + "\nDano do Fast Attack: " + dano1 + 
				"\nCharged Attack: " + ataque2 + "\nBarras do Charged Attack: " + barrasAtaque2 +
				"\nDano do Charged Attack: " + dano2;
	}


}