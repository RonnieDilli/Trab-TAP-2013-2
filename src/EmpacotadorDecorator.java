public class EmpacotadorDecorator extends ServidorDecorator {

	public EmpacotadorDecorator(Servidor sv) {
		super (sv);
	}

	public void executa() {
		super.executa();
		System.out.println("Empacotando classes...");
		if (getNext() != null)
			getNext().executa();
	}

	
}
