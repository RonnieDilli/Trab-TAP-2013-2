public class EmpacotadorFactory implements IFactory {

	public IServidor criaServidor(Servidor sv) {
		return new EmpacotadorDecorator(sv);
	}

}
