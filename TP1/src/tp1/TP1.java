/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author luisa
 */
public class TP1 {

        public static void main (String[] args) {
        
        //int estadoInicio[][] = {{3, 2, 8}, 
        //                        {1, 6, 0}, 
        //                        {4, 7, 5}}; 
        
        int estadoInicio[][] = {{4, 0, 2}, 
                                {7, 1, 3}, 
                                {8, 5, 6}}; 
        
               
        
        Estado e = new Estado(estadoInicio);
        No noPrimeiro = new No(e, 0, -1);
        BuscaProfundidade buscaProfundidade = new BuscaProfundidade();
        BuscaLargura buscaLargura = new BuscaLargura();

        //1 - Busca em Profundidade
        //2 - Busca Largura
        int escolherBusca = 2;
        boolean fim = false;

        if (escolherBusca == 1) {
            fim = buscaProfundidade.Busca(noPrimeiro);
            System.out.print("\n=> Busca em Profundidade Limitada");
        }else if (escolherBusca == 2) {
           fim = buscaLargura.Busca(noPrimeiro);
            System.out.print("\n=> Busca Largura");
        }
        
        if (fim) {
            System.out.println("\n=> Solucionado \n");
        }else{
            System.out.println("\n=> Não Solucionado \n");
        }
        
    }
          
}


