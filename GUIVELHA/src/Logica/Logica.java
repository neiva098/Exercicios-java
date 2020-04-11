package Logica;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author neiva
 */
public class Logica {
    private int pts = 0;
    private Random RN = new Random();
    private int Al[] = new int [40];
    private int PosAl[] = new int [40];
    private int nClick=0;
    private boolean NJ=false;
    private int Click1 = 0; 
    private int Click2 = 0;
    private int cont =40;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    public int getPosi() {
        return posi;
    }

    public void setPosi(int posi) {
        this.posi = posi;
    }
    private int posi = 0;

    /**
     * @return the NJ
     */
    public boolean isNJ() {
        return NJ;
    }

    /**
     * @param NJ the NJ to set
     */
    public void setNJ(boolean NJ) {
        this.NJ = NJ;
    }

    /**
     * @return the pts
     */
    public int getPts() {
        return pts;
    }

    /**
     * @param pts the pts to set
     */
    public void setPts(int pts) {
        this.pts = pts;
    }

    /**
     * @return the nClick
     */
    public int getnClick() {
        return nClick;
    }

    /**
     * @param nClick the nClick to set
     */
    public void setnClick(int nClick) {
        this.nClick = nClick;
    }

    /**
     * @return the Click1
     */
    public int getPrimeiro_Click() {
        return Click1;
    }

    /**
     * @param Primeiro_Click the Click1 to set
     */
    public void setPrimeiro_Click(int Primeiro_Click) {
        this.Click1 = Primeiro_Click;
    }

    /**
     * @return the Click2
     */
    public int getSegundo_Click() {
        return Click2;
    }

    /**
     * @param Segundo_Click the Click2 to set
     */
    public void setSegundo_Click(int Segundo_Click) {
        this.Click2 = Segundo_Click;
    }

    /**
     * @return the PosAl
     */
    public int[] getPosAl() {
        return PosAl;
    }

    /**
     * @param PosAl the PosAl to set
     */
    public void setPosAl(int[] PosAl) {
        this.PosAl = PosAl;
    }

    /**
     * @return the RN
     */
    public Random getRN() {
        return RN;
    }

    /**
     * @param RN the RN to set
     */
    public void setRN(Random RN) {
        this.RN = RN;
    }

    /**
     * @return the Al
     */
    public int[] getAl() {
        return Al;
    }

    /**
     * @param Al the Al to set
     */
    public void setAl(int[] Al) {
        this.Al = Al;
    }
}
