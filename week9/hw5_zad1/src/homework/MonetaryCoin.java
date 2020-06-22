package homework;

public class MonetaryCoin extends Coin {

    private int value;

    public MonetaryCoin(Face face, int value){
        super(face);
        setValue(value);
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        //those are the only acceptable values for a coin in BG
        if(value == 1 || value == 2 || value == 5 || value == 10 ||
            value == 20 || value ==  50 || value == 100 || value == 200){
            this.value = value;
        }else{
            this.value = 0;
        }
    }

    @Override
    public void flip(){
        super.flip();
    }
}
