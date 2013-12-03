public class CompiladorDecorator extends ServidorDecorator {
	
	public CompiladorDecorator(Servidor sv) {
		super (sv);
	}

	public void executa() {
		super.executa();
		System.out.println("Compilando codigo...");
		if (getNext() != null)
			getNext().executa();
	}


}
