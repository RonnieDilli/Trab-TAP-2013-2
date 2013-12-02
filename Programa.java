public class Programa {
	public static void main(String[] args) {
		Servidor sv = new Servidor();
		
		CompiladorFactory cf = new CompiladorFactory();
		EmpacotadorFactory ef = new EmpacotadorFactory();
		PublicadorFactory pf = new PublicadorFactory();
		
		CompiladorDecorator compilador = (CompiladorDecorator) cf.criaServidor(sv);
		EmpacotadorDecorator empacotador = (EmpacotadorDecorator) ef.criaServidor(sv);
		PublicadorDecorator publicador = (PublicadorDecorator) pf.criaServidor(sv);
		
		compilador.setNext(empacotador);
		empacotador.setNext(publicador);
		
		compilador.executa();
	}
}