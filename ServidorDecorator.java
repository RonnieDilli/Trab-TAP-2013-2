public abstract class ServidorDecorator implements IServidor {

	private ServidorDecorator next;

	private Servidor servidor;

	private IServidor iServidor;

	public ServidorDecorator(IServidor sv){
		iServidor = sv;
	}
	public void executa() {
		iServidor.executa();
	}

	public void setNext(IServidor servidor) {
		next = (ServidorDecorator) servidor;
	}
	
	public ServidorDecorator getNext() {
		return next;
	}

}
