package u5pp;

public class Dice {

    private int numSides = 6;
    private int side = 1;
    private String color = "green";

    public Dice() {}


    public Dice(int numSides) 
    {
        this.changeNumSides(numSides);
    }

    public Dice(int numSides, int startingSide) 
    {
        this.changeNumSides(numSides);
        this.changeSide(startingSide);
    }

    public Dice(int numSides, int startingSide, String color) 
    {
        this.changeNumSides(numSides);
        this.changeSide(startingSide);
        this.changeColor(color);
    }

    public int getSides() {return numSides;}
    public int getCurrentSide() {return side;}
    public String getColor() {return color;}

    public String toString() 
    {
        return "The " + getColor() + " " + getSides() + 
            "-sided dice is showing " + getCurrentSide();
    }

    public boolean equals(Dice d) 
    {
        return this.side == d.side;
    }

    public int roll() 
    {
        changeSide((int)(Math.random() * numSides + 1));
        return getCurrentSide();
    }
    public void changeSide(int num) 
    {
        if (num > 0 && num <= numSides) 
        {
            this.side = num; 
        }
    }
    public void changeColor(String color) 
    {
        this.color = color;
    }
    public void changeNumSides(int num) 
    {
        this.numSides = num;
    }



}