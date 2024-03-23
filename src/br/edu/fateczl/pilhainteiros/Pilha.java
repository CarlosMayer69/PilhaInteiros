package br.edu.fateczl.pilhainteiros;

public class Pilha {
	
	No topo;

	public Pilha() {
		topo = null;//Come�o a pilha sem nada! Estr. vazia!
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	
	}	
	//push
	public void push(int e) {
		No elemento = new No();
		elemento.dado = e;
		if (isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	//pop
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("N�o h� elementos para desempilhar!");	
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	//top
	public int top() throws Exception {
		if(isEmpty()) {
			throw new Exception("N�o h� elemento na pilha!");
		}
		int valor = topo.dado;
		return valor;
	}
	
	//size
	public int size() {
		int cont = 0;
		//Aqui podemos ter 3 "if's" que podem fazer o teste!
//		if(isEmpty == false) {//Posso considerar!
//		if(isEmpty != true){//Tamb�m posso considerar!
		//Ou
		if (!isEmpty()) {//Com "!" no in�cio, ele verifica se � falso.
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		
		return cont;
	}
}


