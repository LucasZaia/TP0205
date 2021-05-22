package Builder;

public class MensagemBuilder {
	
	private String titulo;
	private String mensagem;
	
	
	private MensagemBuilder() {}
	
	public static MensagemBuilder build() {
		return new MensagemBuilder();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public MensagemBuilder setTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}
	public String getMensagem() {
		return mensagem;
	}
	public MensagemBuilder setMensagem(String mensagem) {
		this.mensagem = mensagem;
		return this;
	}
	
}
