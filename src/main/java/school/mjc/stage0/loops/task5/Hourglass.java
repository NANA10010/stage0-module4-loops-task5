package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
       int middle = (height+1)/2;
        int index = height;
        for (int i=1; i<=height; i++){
            for (int j=1; j<=(height-index+1)/2; j++)
                System.out.print(" ");
            for (int j=1; j<=index; j++){
                 System.out.print(8);
            }
            for (int j=1; j<=(height-index+1)/2; j++)
                System.out.print(" ");

            if(middle>i) index-=2;
            else if(middle<=i) index+=2;
            System.out.println("");
        }

    }
}
