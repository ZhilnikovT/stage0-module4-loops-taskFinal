package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int center = (cathetusLength - 1)/2 +1;
        for(int y = 1; y <= cathetusLength; y++){
            for(int x = -cathetusLength; x <= cathetusLength; x++){
                if(x == 0) {continue;}
                if(x > 0) {
                    if(y >= x) {     
                        System.out.print(x);
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(-y < x) {     
                        System.out.print(-x+1);
                    }else{
                        System.out.print(" ");
                    }
                }                                
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
