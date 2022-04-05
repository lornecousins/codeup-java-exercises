package shapes;

public class Square extends Rectangle{

    public  Square(){
    }

    public Square(int side) {
        super.length = side;
        super.width = side;
    }

        public int getArea(){
            return (super.length * super.length);
        }

        public int getPerimeter(){
            return 4 * super.length;
    }
}
