/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar.comp.classe;

import java.util.Stack;

/**
 *
 * @author lab102a
 */
public class Transformacao {

    Aviao aviaoteste = new Aviao();
    Tratamentos trat = new Tratamentos();

    public Stack<Aviao> translandarAviao(float transX, float transY, Stack<Aviao> tabela) {
        //Calculos de Translandar
        transX = 2;
        transY = 2;
        for (int i = 0; i < tabela.size(); i++) {
            if (trat.verificaAtivados(tabela.get(i)) == true) {
                tabela.get(i).setX(tabela.get(i).getX() + transX);
                tabela.get(i).setY(tabela.get(i).getY() + transY);
            }
        }
        return tabela;
    }

    public Stack<Aviao> escalonarAviao(float EscX, float EscY, Stack<Aviao> tabela) {
        //Calculos de Escalonamento
        EscX = EscX / 100;
        EscY = EscY / 100;
        for (int i = 0; i < tabela.size(); i++) {
            if (trat.verificaAtivados(tabela.get(i)) == true) {
                tabela.get(i).setX(tabela.get(i).getX() * EscX);
                tabela.get(i).setY(tabela.get(i).getY() * EscY);
            }
        }
        
        return tabela;
    }

    public Stack<Aviao> rotacionarAviao(float RotacionarX, float RotacionarY, float angulo, Stack<Aviao> tabela) {
        //Calculos de Rotacao 
        float x;
        float y;
        float radianoAngulo = (float) (Math.PI / 180 * angulo);
        for (int i = 0; i < tabela.size(); i++) {
            if (trat.verificaAtivados(tabela.get(i)) == true) {
                x = tabela.get(i).getX();
                y = tabela.get(i).getY();
                tabela.get(i).setX(x - RotacionarX);
                tabela.get(i).setY(y - RotacionarY);
                float valorX = tabela.get(i).getX();
                tabela.get(i).setX(((float) (x * Math.cos(radianoAngulo) - y * Math.sin(radianoAngulo))));
                tabela.get(i).setY((float) (y * Math.cos(radianoAngulo) + x * Math.sin(radianoAngulo)));
            }
        }
     
        return tabela;
    }

    public Coordenadas rotaColisao(float x, float y, float angulo) {
        aviaoteste.setX(3);
        aviaoteste.setY(2);
        return null;
    }

}
