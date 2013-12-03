public class PublicadorFactory implements IFactory {

	public IServidor criaServidor(Servidor sv) {
		return new PublicadorDecorator(sv);
	}

}
