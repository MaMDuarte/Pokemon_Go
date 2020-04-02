package Pokemon_Go;

import javax.swing.JOptionPane;

public class IV_Pokemon 
{
    // ===================== ATRIBUTOS =======================
	private double iv;
	private String descricao;

    // ============ ACESSORES e MODIFICADORES ===============
	public double getIv() 
	{
		do {
			iv = Double.parseDouble(JOptionPane.showInputDialog("IV: "));
	} while(iv < 0 || iv >= 100);
		return iv;
	}
	
	public void setIv(double iv) 
	{
		this.iv = iv;
	}
	
    // =================== CONSTRUTORES =====================

    // CONSTRUTOR DEFAULT
	public IV_Pokemon() {}
	
    // CONSTRUTOR COM PARÂMETROS
	public IV_Pokemon(double iv) 
	{
		super();
		this.iv = iv;
	}
    // =================== COMPORTAMENTOS ==================
	private String textoIV(double iv, String descricao)
	{
		if(iv == 0)
			descricao = "Não vale nada";
		else if (iv > 0.1 && iv <= 33.3)
			descricao = "Mau";
		else if (iv > 33.4 && iv <= 66.7)
			descricao = "Satisfatorio";
		else if (iv > 66.8 && iv <= 90)
			descricao = "Bom";
		else if (iv > 90.1 && iv <= 99.9)
			descricao = "Muito bom";
		else
			descricao = "Perfeito";
		return descricao;
	}

    // ----> toString()
	@Override
	public String toString() {
		return "IV: " + iv + "\nDescrição: " + textoIV(iv,descricao);
	}
}
