package AnalogQR;

public class AnalogQRCode {

    private int quantityEl;
    private int currentI = 0;
    private int currentJ = 0;
    private int n;
    private int[][] mass;
    private int contour = 0;
    private int number = 1;
    private int compass = 1;

    public AnalogQRCode(int n) {
        this.n = n;
        this.quantityEl = n * n;
        this.mass = new int[n][n];
    }

    private void toRight() {
        for (int j = currentJ; j < n-contour; j++) {
            mass[currentI][j] = number;
            currentJ = j;
            number++;
        }
        currentI++;
    }

    private void toLeft() {
        for (int j = currentJ; j > contour-1; j--) {
            mass[currentI][j] = number;
            currentJ = j;
            number++;
        }
        currentI--;
    }

    private void toTop() {
        for (int i = currentI; i > contour; i--) {
            mass[i][currentJ] = number;
            currentI = i;
            number++;
        }
        currentJ++;
    }

    private void toBottom() {
        for (int i = currentI; i < n-contour; i++) {
            mass[i][currentJ] = number;
            currentI = i;
            number++;
        }
        currentJ--;
    }

    public void createMass(){
        while (number < this.quantityEl+1) {
            switch (compass) {
                case 1: toRight(); compass = 2; break;
                case 2: toBottom(); compass = 3; break;
                case 3: toLeft(); compass = 4; break;
                case 4: toTop(); compass = 1; break;
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

}
