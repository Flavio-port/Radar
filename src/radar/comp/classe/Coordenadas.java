/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radar.comp.classe;

/**
 *
 * @author lab102a
 */
public class Coordenadas {
    private float anguloX;
    private float anguloY;

    public Coordenadas(float anguloX, float anguloY) {
        this.anguloX = anguloX;
        this.anguloY = anguloY;
    }

    public float getAnguloX() {
        return anguloX;
    }

    public void setAnguloX(float anguloX) {
        this.anguloX = anguloX;
    }

    public float getAnguloY() {
        return anguloY;
    }

    public void setAnguloY(float anguloY) {
        this.anguloY = anguloY;
    }
    
    
}
