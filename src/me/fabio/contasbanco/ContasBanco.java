package me.fabio.contasbanco;

public class ContasBanco {
	
	public String numConta;
	protected String tipo;
	private String dono;
	private boolean status;
	private float saldo;
	
    public void ContasBanco() {
       this.saldo = 0;
       this.status = false;
    	
    }
    
    public void estadoAtual() {
    	System.out.println("--------------------");
    	System.out.println("Conta: " + this.getNumConta());
    	System.out.println("Tipo: " + this.getTipo());
    	System.out.println("Dono: " + this.getDono());
    	System.out.println("Saldo: " + this.getSaldo());
    	System.out.println("Status: " + this.getStatus());
    }
		
	public void abrirConta(String t) {
	    this.setTipo(t);
	    this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso.");
    }
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("A conta ainda tem dinheiro.");
		} else if (this.getSaldo() < 0) {
			System.out.println("A conta está em débito.");			
		}
	}
	
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
	    System.out.println("Depósito realizado com sucesso.");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
			} else {
				System.out.println("Saldo insuficiente.");
			}
		} else {
			System.out.println("Impossível, conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
			  this.setSaldo(this.getSaldo() - v);
			  System.out.println("Mensalidade paga com sucesso.");
		} else {
			System.out.println("Impossível! Conta fechada!");
		}
	  }		
			
		
	}
	
	public String getNumConta() {
        return numConta;
	}
	
	public void setNumConta(String n) {
		this.numConta = n;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public String getDono() {
        return dono;
	}	
	
	public void setDono(String d) {
		this.dono = d;						
	}
	
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean st) {
		this.status = st;
	}
	
	
	
	
	
	
	
	
	
	

}
