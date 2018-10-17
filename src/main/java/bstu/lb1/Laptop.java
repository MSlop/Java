package bstu.lb1;

import java.util.Scanner;

public class Laptop extends Technology {
    private float Screen_resolution;

    public void setScreen_resolution(float screen_resolution) {
        Screen_resolution = screen_resolution;
    }

    public float getScreen_resolution() {
        return Screen_resolution;
    }

    @Override
    public void init(Scanner scanner) {
          setCost(scanner.nextInt());
          setScreen_resolution(scanner.nextFloat());
    }

}
