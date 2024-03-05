package busres;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busno,boolean ac,int cap){
        this.busNo=busno;
        this.ac=ac;
        this.capacity=cap;
    }
    public int getBusNo(){
        return busNo;
    }
    public void setAc(boolean ac){
        this.ac=ac;
    }
    public boolean getAc(){
        return  ac;
    }
    public void setCapacity(int cap){
        this.capacity=cap;
    }
    public int getCapacity(){
        return capacity;
    }
    public void Display(){
        System.out.println("Bus no : "+busNo+" Ac : "+ac+" Total Capacity : "+capacity );
    }

}