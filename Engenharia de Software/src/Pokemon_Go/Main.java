package Pokemon_Go;

public class Main {

	public static void main(String[] args) {
		Atributos_Pokemon atributo = new Atributos_Pokemon();
		atributo.getNome();
		atributo.getShiny();
		atributo.getPeso();
		atributo.getAltura();
		
		Tipos_Pokemon tipo = new Tipos_Pokemon();
		tipo.getTipo1();
		tipo.getTipo2();
		
		IV_Pokemon iv = new IV_Pokemon();
		iv.getIv();
		
		Ataques_Pokemon attack = new Ataques_Pokemon();
		attack.getAtaque1();
		attack.getDano1();
		attack.getAtaque2();
		attack.getDano2();
		attack.getBarrasAtaque2();
		
		System.out.println(atributo);
		System.out.println(tipo);
		System.out.println(iv);
		System.out.println(attack);
	}}