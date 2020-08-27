package com.dongli.tank;

/**
 * @author xiong
 */
public class Main {

    public static void main(String[] args) throws Exception{
        TankFrame tankFrame = new TankFrame();

        while (true){
            Thread.sleep(50);
            tankFrame.repaint();
        }
    }
}
