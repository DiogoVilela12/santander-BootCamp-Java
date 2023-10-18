package orientaçãoAObjetoseUMLDiagramaçãodeClassesdoiPhone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDaInternet {
	private Integer id;
	
	public Iphone(Integer Id) {
		this.id = Id;
	}
	
	public Integer getId() {
		return id;
	}

	@Override
	public String selecionarMusica(String nomeMusica) {
		System.out.println(nomeMusica);
		return nomeMusica;
	}

	@Override
	public boolean tocarMusica(boolean status) {
		return status;
	}

	@Override
	public boolean pausarMusica(boolean status) {
		return status;
	}

	@Override
	public boolean ligar(String numero) {
		return numero.length() > 0;
	}

	@Override
	public boolean atender(boolean status) {
		return false;
	}

	@Override
	public String correioDeVoz(boolean status) {
		return status ? "Atendido" : "Não atendido";
	}

	@Override
	public boolean exibirPagina(String url) {
		return url.length() > 0;
	}

	@Override
	public void novaPagina(String url) {
		System.out.println(url);
	}

	@Override
	public boolean atualizarPagina() {
		return true;
	}
}
