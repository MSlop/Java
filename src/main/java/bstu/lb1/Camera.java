package bstu.lb1;

import java.util.Scanner;

public class Camera extends Technology {
    private float Camera_resolution;

    public void setCamera_resolution(float camera_resolution) {
        Camera_resolution = camera_resolution;
    }

    public float getCamera_resolution() {
        return Camera_resolution;
    }

    @Override
    public void init(Scanner scanner) {
        setCost(scanner.nextInt());
        setCamera_resolution(scanner.nextFloat());
    }

}
