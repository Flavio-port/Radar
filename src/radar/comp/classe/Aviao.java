/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar.comp.classe;

import java.awt.Checkbox;
import java.util.Stack;

/**
 *
 * @author lab102a
 */
public class Aviao {

    private String statusNome;
    private int id;
    private float x;
    private float y;
    private float angulo;
    private float velocidade;
    private float direcao;
    private int status;

    public Object getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    private float raio;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getAngulo() {
        return angulo;
    }

    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getDirecao() {
        return direcao;
    }

    public void setDirecao(float direcao) {
        this.direcao = direcao;
    }

    public String getStatusNome() {
        return statusNome;
    }

    public void setStatusNome(String statusNome) {
        this.statusNome = statusNome;
    }

    public Stack novoAviao(Aviao aviao, float anguloX, float anguloY, float raio, float angulo, float velocidade, float direcao, Stack<Aviao> tabela, int id) {
        
        aviao.setStatus(1);
        aviao.setStatusNome("ATIVADO");
        aviao.setId(id);
        aviao.setAngulo(angulo);
        aviao.setDirecao(direcao);
        aviao.setVelocidade(velocidade);
        aviao.setX(anguloX);
        aviao.setY(anguloY);
        aviao.setRaio(raio);
        tabela.push(aviao);
        return tabela;
    }

    void getStatusNome(String ativado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
