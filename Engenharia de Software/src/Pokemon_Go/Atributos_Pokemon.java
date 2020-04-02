package Pokemon_Go;

import javax.swing.JOptionPane;

public class Atributos_Pokemon 
{
    // ===================== ATRIBUTOS =======================
	private String nome;
	private String shiny;
	private double peso;
	private double altura;
	
    // ============ ACESSORES e MODIFICADORES ===============
	public String getNome()
	{
		nome = JOptionPane.showInputDialog("Nome do Pokemon: ");
		return nome;
	}
	
	public void setNomePokemon(String nome) 
	{
		this.nome = nome;
	}
	
	public String getShiny()
	{
		do {
			shiny = JOptionPane.showInputDialog("Shiny? ").toLowerCase();
		} while(shiny.contains("sim") && shiny.contains("nao") && shiny.contains("não") 
				&& shiny.contains("s") && shiny.contains("n"));
		
		return shiny;
	}
	
	public void setShiny(String shiny) 
	{
		this.shiny = shiny;
	}
	
	public double getPeso() {
		do {
			peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		} while(peso < 0 || peso >= 10000);
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		do {
			altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		} while(altura < 0 || altura >= 100);
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	// =================== CONSTRUTORES =====================

    // CONSTRUTOR DEFAULT
	public Atributos_Pokemon() 
	{}
	

	public Atributos_Pokemon(String nomePokemon, String shiny, double peso, double altura) {
		super();
		this.nome = nomePokemon;
		this.shiny = shiny;
		this.peso = peso;
		this.altura = altura;
	}
	
    // =================== COMPORTAMENTOS ==================
	private String validacaoShiny(String shiny) 
	{
		if(shiny.contains("s") || shiny.contains("sim"))
			shiny = "Sim";
		else
			shiny = "Não";
		return shiny;
	}
	
    // ----> toString()
	@Override
	public String toString() {
		return "Pokemon: \nNome: " + nome + "\nShiny: " + validacaoShiny(shiny) +
				"\nPeso: " + peso + 
				"\nAltura: " + altura;
	}
}