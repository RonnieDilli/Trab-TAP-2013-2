public class CompiladorFactory implements IFactory { 

	public IServidor criaServidor(Servidor sv) {
		return new CompiladorDecorator(sv);
	}

}
