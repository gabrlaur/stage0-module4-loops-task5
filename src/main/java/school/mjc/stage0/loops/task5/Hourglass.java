package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int middle = height / 2;
        int needToPrint;
        int pastMid = middle-1;
        boolean isEven = height % 2 == 0;
        if (height == 0) {
            return;
        }
        int evenHeight = height;
        if (isEven) {
            evenHeight = height + 1;
        }
        for (int i = 0; i < evenHeight; i++) {
            needToPrint = i <= middle ? height - i * 2 : height - pastMid * 2;
            if (needToPrint == 0) {
                continue;
            }
            if (needToPrint < height) {
                for (int j = 0; j < (height - needToPrint) / 2; j++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < needToPrint; j++) {
                System.out.print("8");
            }

            if (needToPrint < height) {
                for (int j = 0; j < (height - needToPrint) / 2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i > middle) {
                pastMid--;
            }
        }
    }
}
