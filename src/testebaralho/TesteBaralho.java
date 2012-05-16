/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testebaralho;

import baralho.Baralho;
import baralho.Carta;
import baralho.Descarte;

/**
 *
 * @author Mateus
 */
public class TesteBaralho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        System.out.println("----Teste do baralho----");
        Baralho baralho = new Baralho();
        System.out.println("Teste para exibir o baralho:");
        System.out.println(baralho.toString());
        System.out.println("Teste para embaralhar o baralho: ");
        baralho.embaralhar();
        System.out.println(baralho.toString());        
        System.out.println("Teste para cortar o baralho:");
        int corte = 0 + (int)((51 - 0)*Math.random());  
        System.out.println("posição do corte(gerada por random): "+corte);
        baralho.cortar(corte);
        System.out.println("Teste para exibir as cartas depois do corte: ");
        System.out.println(baralho.toString());
        System.out.println("Teste para pescar uma carta do topo baralho");
        Carta carta = baralho.getPrimeiraCarta();
        System.out.println("Carta pescada: " +carta.toString());
        System.out.println("Teste para pescar a ultima carta do baralho");
        Carta carta2 = baralho.getUltimaCarta();
        System.out.println("Carta pescada: "+carta2.toString());
        System.out.println("Baralho sem as cartas pescadas: ");
        System.out.println(baralho.toString());
        System.out.println("Teste para pegar uma carta da última posição e passar para a primeira posição: ");
        baralho.passarPrimeiraCartaParaUltimaPosicao();
        System.out.println(baralho.toString());
        System.out.println("");
        System.out.println("----Teste do descarte----");
        Descarte descarte = new Descarte();
       
        System.out.println("Teste para verificar se uma carta é colocada no descarte: "+descarte.addCarta(carta));
        System.out.println("carta colocada no descarte: "+descarte.verCarta(0).toString());
        System.out.println("Teste para colocar a segunda carta no descarte: "+descarte.addCarta(carta2));
        System.out.println("Carta colocada no descarte: "+descarte.verCarta(1));
    }
}
