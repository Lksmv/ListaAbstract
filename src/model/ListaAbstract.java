/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lucas
 */
public abstract class ListaAbstract<T> {

    private T info[];
    private int tamanho;

    public ListaAbstract() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    protected void redimensionar() {

        T vetorNovo[];
        vetorNovo = (T[]) new Object[tamanho + 10];

        for (int i = 0; i < tamanho; i++) {
            vetorNovo[i] = info[i];
        }
        info = vetorNovo;

    }

    public int getLimite() {
        return info.length;
    }

    public abstract void inserir(T valor);

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public abstract int buscar(T valor);

    public void retirar(T valor) {
        int posicao = buscar(valor);
        if (posicao > -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            info[tamanho - 1] = null;
            tamanho--;

        }
    }

    public void liberar() {
        info = (T[]) new Object[tamanho];
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao < tamanho) {
            return info[posicao];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString() {
        String valores = ""; //variavel onde vai armazenar os dados em string

        if (tamanho > 0) {//verificar se tem valores no vetor
            valores += info[0];//armazena o primeiro valor do vetor
            for (int i = 1; i < tamanho; i++) {//for iniciando no segundo valor do vetor
                valores += "," + info[i];//coloca a , e dps o valor do vetor
            }
        }

        return valores;//retorna a string pronta
    }

    protected T[] getInfo() {
        return info;
    }

    protected void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
