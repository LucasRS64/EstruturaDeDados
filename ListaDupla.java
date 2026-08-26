
public class ListaDupla<T> extends NoListaDupla<T> {
	
	public ListaDupla() {
		proximo = null;
		
	}
	
	public NoListaDupla<T> getPrimeiro() {
		return proximo;
		
	}
	
	public void inserir(T valor) {
		
	}
	
	public NoListaDupla<T> buscar(T valor) {
		
	}
	
	public void retirar(T valor) {
		
	}
	
	public void exibirOrdemInversa() {
		
	}
	
	public void liberar() {
		
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		NoListaDupla<T> atual = primeiro;

		while (atual != null) {

			if (sb.length() > 0) {
				sb.append(",");
			}

			sb.append(atual.getInfo());

			atual = atual.getProximo();
		}

		return sb.toString();
	}
}
