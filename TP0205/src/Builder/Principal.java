package Builder;

public class Principal {

	public static void main(String[] args) {
		
		MensagemBuilder mensagem = MensagemBuilder
										.build().setTitulo("Mensagem Builder")
										.setMensagem("Oi isso é uma mensagem teste de Builder");
		
		System.out.println("Titulo da Mensagem " + mensagem.getTitulo());
		System.out.println("Mensagem " + mensagem.getMensagem());
										
	}

}
