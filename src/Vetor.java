/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Ventura
 */
public class Vetor {

    public static final int DEFAULT_SIZE = 100;
    public static final int GROWTH = 2;

    private int[] vetor;
    private int counter;

    public Vetor() {
        vetor = new int[DEFAULT_SIZE];
        counter = 0;
    }

    public Vetor(int... vetor) {
        this();
        for (int value : vetor) {
            insert(value);
        }
    }

    public void insert(int value) {
        if (isFull()) {
            resize();
        }
        int i = getIndexGreater(value);
        if (i != -1) {
            pushRight(i);
            vetor[i] = value;
        } else {
            vetor[counter++] = value;
        }

    }

    public boolean isFull() {
        return counter >= vetor.length;
    }

    public void resize() {
        int[] temp = new int[vetor.length * GROWTH];
        for (int i = 0; i < vetor.length; i++) {
            temp[i] = vetor[i];
        }
        vetor = temp;
    }

    public int getValue(int i) {
        return vetor[i];
    }

    public int getSize() {
        return counter;
    }

    public int getIndexGreater(int value) {
        for (int i = 0; i < counter; i++) {
            if (vetor[i] > value) {
                return i;
            }
        }
        return -1;
    }

    public void pushRight(int index) {
        for (int i = counter; i >= index; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[index] = 0;
        counter++;
    }

}
