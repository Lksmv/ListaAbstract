package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Lucas
 */
public class ListaOrdenadaTest {

    @Test
    public void testCaso1_inserirDadosOrdenados() {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.inserir(100);
        lista.inserir(20);
        lista.inserir(70);
        lista.inserir(1);
        System.out.println(lista.toString());
        assertEquals("1,20,70,100", lista.toString());
    }
    
    @Test
    public void testCaso2_buscarDado20() {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.inserir(0);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);
        lista.inserir(90);
        lista.inserir(100);
        assertEquals(2, lista.buscar(20));
    }
    
    @Test
    public void testCaso3_buscarDado40() {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.inserir(0);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);
        lista.inserir(90);
        lista.inserir(100);
        assertEquals(4, lista.buscar(40));
    }

    @Test
    public void testCaso4_buscarDado70() {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.inserir(0);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);
        lista.inserir(90);
        lista.inserir(100);
        assertEquals(7, lista.buscar(70));
    }
    
    @Test
    public void testCaso5_buscarDado100() {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.inserir(0);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);
        lista.inserir(90);
        lista.inserir(100);
        assertEquals(10, lista.buscar(100));
    }
    
    @Test
    public void testCaso6_buscarDado85() {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.inserir(0);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.inserir(50);
        lista.inserir(60);
        lista.inserir(70);
        lista.inserir(80);
        lista.inserir(90);
        lista.inserir(100);
        assertEquals(-1, lista.buscar(85));
    }
}