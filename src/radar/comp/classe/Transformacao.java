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

    public Stack<Aviao> translandarAviao(float transX, float transY,Stack<Aviao> tabela) {
        aviaoteste.setX(3);
        aviaoteste.setY(2);
        aviaoteste.setX(aviaoteste.getX() + transX);
        aviaoteste.setY(aviaoteste.getY() + transY);
        return tabela;
    }

    public Aviao escalonarAviao(float EscX, float EscY) {
        EscX = EscX / 100;
        EscY = EscY / 100;
        System.out.println(EscX + "////////" + EscY);
        aviaoteste.setX(3);
        aviaoteste.setY(2);
        aviaoteste.setX(aviaoteste.getX() * EscX);
        aviaoteste.setY(aviaoteste.getY() * EscY);
        return aviaoteste;
    }

    public Aviao rotacionarAviao(float x, float y, float angulo) {
        //Calculos de Rotacao 
        aviaoteste.setX(3);
        aviaoteste.setY(2);
        float radianoAngulo = (float) (Math.PI / 180 * angulo);
        aviaoteste.setX(aviaoteste.getX() - x);
        aviaoteste.setY(aviaoteste.getY() - y);
        float valorX= aviaoteste.getX();
        aviaoteste.setX((float) (aviaoteste.getX() * Math.cos(radianoAngulo) - aviaoteste.getY() * Math.sin(radianoAngulo)));
        aviaoteste.setY((float) (aviaoteste.getY() * Math.cos(radianoAngulo) + valorX * Math.sin(radianoAngulo)));
        return aviaoteste;
    }

    public Coordenadas rotaColisao(float x, float y, float angulo) {
        aviaoteste.setX(3);
        aviaoteste.setY(2);
        return null;
    }
    

}
