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
public class ListaEstatica<T> extends ListaAbstract<T> {
//
//    public void inserir(T valor) {
//        if (tamanho == info.length) {
//            redimensionar();
//            info[tamanho] = valor;
//            tamanho += 1;
//        } else {
//            info[tamanho] = valor;
//            tamanho += 1;
//        }
//    }

    public int buscar(T valor) {
        T[] info = getInfo();
        for (int i = 0; i < getTamanho(); i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void inserir(T valor) {
        if (getTamanho() == getLimite()) {
            redimensionar();
        }
        T[] info = getInfo();
        info[getTamanho()] = valor;
        setTamanho(getTamanho() + 1);
    }

}
