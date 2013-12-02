public class ServidorFactory implements IFactory {

	public IServidor criaServidor(Servidor sv) {
		return new Servidor(sv);
	}
}
