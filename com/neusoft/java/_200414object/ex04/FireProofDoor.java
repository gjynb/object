package com.neusoft.java._200414object.ex04;

public class FireProofDoor extends Door implements com.neusoft.java._200414object.ex04.FireSafe {

    @Override
    void open() {
        System.out.println("FireProofDoor can open!");
    }

    @Override
    void close() {
        System.out.println("FireProofDoor can close!");
    }

    @Override
    public void fireProof() {
        System.out.println("FireProofDoor can fire_proof!");
    }

}
