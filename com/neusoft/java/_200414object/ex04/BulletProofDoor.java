package com.neusoft.java._200414object.ex04;

public class BulletProofDoor extends com.neusoft.java._200414object.ex04.Door implements com.neusoft.java._200414object.ex04.BulletSafe {

    @Override
    void open() {
        System.out.println("BulletProofDoor can open!");
    }

    @Override
    void close() {
        System.out.println("BulletProofDoor can close!");
    }

    @Override
    public void bulletProof() {
        System.out.println("BulletProofDoor can bullet_proof!");
    }
}
