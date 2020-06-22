package homework;

import java.util.Random;

public class Coin {
    private Random rand;
    private Face face;

    public Coin (Face face){
        setFace(face);
    }

    public Face getFace(){
        return face;
    }
    public void setFace(Face face){
        if(face != null)
            this.face = face;
    }

    public void flip(){
        int toss;
        rand = new Random();
        toss = 1 + rand.nextInt(2);

        if(toss == 1){
            setFace(Face.HEAD);
        }else{
            setFace(Face.TAIL);
        }
    }
    public boolean isHeads(){
        if(this.face == Face.HEAD){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n", "The face of the coin is", getFace());
    }
}
