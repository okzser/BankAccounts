package me.fabio.contasbanco;

public class ContasObj {
    
	public static void main(String[] args) {
	
	  ContasBanco p1 = new ContasBanco();
	    
	   p1.setNumConta("1111");
	   p1.setDono("Maurinho");
	   p1.abrirConta("CC");
       
      ContasBanco p2 = new ContasBanco();
      
       p2.setNumConta("2158");
       p2.setDono("Marijuana");
       p2.abrirConta("CP");
       
       p1.depositar(145.50f);
       p2.depositar(21.45f);
	   p2.sacar(98.50f);
	   p1.fecharConta();
       
       p1.estadoAtual();
       p2.estadoAtual();
       
       
	
	
	
	
	
	}
}
