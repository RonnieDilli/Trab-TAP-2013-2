public class PublicadorDecorator extends ServidorDecorator {
	public PublicadorDecorator(IServidor sv) {
		super (sv);
	}

	public void executa() {
		super.executa();
		System.out.println("Publicando classes empacotadas...");
		if (getNext() != null)
			getNext().executa();
	}

}
