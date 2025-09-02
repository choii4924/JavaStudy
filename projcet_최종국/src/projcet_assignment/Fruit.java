package projcet_assignment;

public class Fruit {

    private String color;
    private String size;
    private int sugarContent;

    public Fruit() {}

    public Fruit(String color, String size, int sugarContent) {
        this.color = color;
        this.size = size;
        this.sugarContent = sugarContent;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public int getSugarContent() {
        return sugarContent;
    }
    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return color + " 색, " + size + " 크기, 당도 " + sugarContent;
    }
    
    	@Override
    	public boolean equals(Object obj) {

    	    if (this == obj) return true;

    	    if (obj == null || getClass() != obj.getClass()) return false;

    	    Fruit other = (Fruit) obj;

    	    return this.color.equals(other.color)
    	            && this.size.equals(other.size)
    	            && this.sugarContent == other.sugarContent;
    	}
}