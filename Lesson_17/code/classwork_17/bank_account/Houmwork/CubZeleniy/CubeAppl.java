package Houmwork.CubZeleniy;

import Houmwork.CubZeleniy.model.CubeInfo;

public class CubeAppl {
    public static void main(String[] args) {

        // Кубы
        CubeInfo cube1 = new CubeInfo(5.0);

        CubeInfo cube2 = new CubeInfo(7.5);

        CubeInfo cube3 = new CubeInfo(9.0);

        // cube1
        System.out.println("Cube 1:");
        System.out.println("Perimeter: " + cube1.sumPerimeter());
        System.out.println("Area: " + cube1.sumArea());
        System.out.println("Volume: " + cube1.sumVolume());

        // cube2
        System.out.println("Cube 2:");
        System.out.println("Perimeter: " + cube2.sumPerimeter());
        System.out.println("Area: " + cube2.sumPerimeter());
        System.out.println("Volume: " + cube2.sumVolume());

        // cube3
        System.out.println("Cube 3:");
        System.out.println("Perimeter: " + cube3.sumPerimeter());
        System.out.println("Area: " + cube3.sumPerimeter());
        System.out.println("Volume: " + cube3.sumVolume());
    }
}
