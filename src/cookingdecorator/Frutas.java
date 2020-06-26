/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CAROL
 */ package cookingdecorator;

    public abstract class Frutas extends Bolo {
    
    private Bolo bolo;

    public Frutas(Bolo b) {
        this.bolo = b;
        this.setNome(b.getNome());
    }

    public Bolo getBolo() {
        return this.bolo;
    }
    
    }

