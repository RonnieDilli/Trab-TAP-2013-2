public class Programa {
	public static void main(String[] args) {
    // Instancia o Servidor a ser decorado.
		Servidor sv = new Servidor();
		
    // Instancia as Fabricas.
		CompiladorFactory cfactory = new CompiladorFactory();
		EmpacotadorFactory efactory = new EmpacotadorFactory();
		PublicadorFactory pfactory = new PublicadorFactory();
		
    // Gera as instancias dos Decoradores e Decora o Servidor 'sv'.
		CompiladorDecorator compilador = (CompiladorDecorator) cfactory.criaServidor(sv);
		EmpacotadorDecorator empacotador = (EmpacotadorDecorator) efactory.criaServidor(sv);
		PublicadorDecorator publicador = (PublicadorDecorator) pfactory.criaServidor(sv);
		
    // Atribui a Cadeia de Responsabilidade.
		compilador.setNext(empacotador);
		empacotador.setNext(publicador);
		
    // Inicia a execucao.
		compilador.executa();
	}
}