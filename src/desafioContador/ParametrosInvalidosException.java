package desafioContador;

public class ParametrosInvalidosException extends Exception {
	
	//serialVersionUID
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
}
