class Box {
    double width;
    double height;
    double depth;
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
    double volum() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);

        vol = mybox2.volum();
        System.out.println("Volume is " + vol);
    }
}