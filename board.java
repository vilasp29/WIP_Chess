import java.*;
public class board {
        square s[][] = new square[8][8];;
        public board() {
                for (int i=0; i< 8; i++) {
                        for (int j=0; j< 8; j++) {
                                s[i][j] = new square();
                        }
                }
                return ;
        }

        public void colorBoard() {
                int clr = 0;
                for (int i=0; i< 8; i++) {
                        for (int j=0; j< 8; j++) {
                                (s[i][j]).setColor(clr);
                                if (clr == 0) { clr = 1; } else { clr = 0;}
                        }
                        if (clr == 0) { clr = 1; } else { clr = 0;}
                }
                return ;
        }

        public void printBoard() {
                for (int i=0; i< 8; i++) {
                        for (int j=0; j< 8; j++) {
                                 System.out.print(s[i][j].getColor());
                                // put code here to print big white or black squares based on colour
                        }
                        System.out.println();
                }
                return ;
        }

        public static void main(String[] args) {
                //board b = new board();

                //b.colorBoard();       
                //b.printBoard();
        }
}

