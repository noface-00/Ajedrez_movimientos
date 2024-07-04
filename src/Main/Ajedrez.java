/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;


public class Ajedrez {
    public static void main(String[] args) throws Exception {
        int tamaño = 8;
        String[][] tablero;
        tablero = new String[tamaño][tamaño];
        int alfil_row = 3;
        int alfil_col = 2;

        tablero[alfil_row][alfil_col] = "T";
        int[][] movimientos_alfil = caballo_mov(tablero, alfil_row, alfil_col);

        for (int[] movimiento : movimientos_alfil) {
            int fila = movimiento[0];
            int columna = movimiento[1];
            tablero[fila][columna] = "X";
        }
        imprimirTablero(tablero);

    }

    public static int[][] alfil_mov(String[][] tablero, int row, int col) {
        int[][] direcciones = { { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } };
        int[][] movimientos = new int[64][2];
        int count = 0;

        for (int[] direccion : direcciones) {
            int fila = row;
            int columna = col;

            while (true) {
                fila += direccion[0];
                columna += direccion[1];
                if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
                    if (tablero[fila][columna] == null) {
                        movimientos[count][0] = fila;
                        movimientos[count][1] = columna;
                        count++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        int[][] movimientos_v = new int[count][2];
        for (int i = 0; i < count; i++) {
            movimientos_v[i][0] = movimientos[i][0];
            movimientos_v[i][1] = movimientos[i][1];
        }
        return movimientos_v;
    }

    public static int[][] caballo_mov(String[][] tablero, int row, int col) {
        int[][] direcciones_saltos = { { -2, -1 },
                { -2, 1 },
                { 1, -2 },
                { 1, 2 },
                { -1, -2 },
                { -1, 2 },
                { 2, -1 },
                { 2, 1 } };
        int[][] movimientos = new int[64][2];
        int count = 0;

        for (int[] direccion : direcciones_saltos) {
            int fila = row;
            int columna = col;

            while (true) {
                fila += direccion[0];
                columna += direccion[1];
                if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
                    if (tablero[fila][columna] == null) {
                        movimientos[count][0] = fila;
                        movimientos[count][1] = columna;
                        count++;
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }

        }

        int[][] movimientos_v = new int[count][2];
        for (int i = 0; i < count; i++) {
            movimientos_v[i][0] = movimientos[i][0];
            movimientos_v[i][1] = movimientos[i][1];
        }
        return movimientos_v;
    }

    public static int[][] torre_mov(String[][] tablero, int row, int col) {
        int[][] direcciones = { { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };
        int[][] movimientos = new int[64][2];
        int count = 0;

        for (int[] direccion : direcciones) {
            int fila = row;
            int columna = col;

            while (true) {
                fila += direccion[0];
                columna += direccion[1];
                if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
                    if (tablero[fila][columna] == null) {
                        movimientos[count][0] = fila;
                        movimientos[count][1] = columna;
                        count++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        int[][] movimientos_v = new int[count][2];
        for (int i = 0; i < count; i++) {
            movimientos_v[i][0] = movimientos[i][0];
            movimientos_v[i][1] = movimientos[i][1];
        }
        return movimientos_v;
    }

    public static int[][] dama_mov(String[][] tablero, int row, int col) {

        int[][] direcciones = { { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };
        int[][] movimientos = new int[64][2];
        int count = 0;

        for (int[] direccion : direcciones) {
            int fila = row;
            int columna = col;

            while (true) {
                fila += direccion[0];
                columna += direccion[1];
                if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
                    if (tablero[fila][columna] == null) {
                        movimientos[count][0] = fila;
                        movimientos[count][1] = columna;
                        count++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        int[][] movimientos_v = new int[count][2];
        for (int i = 0; i < count; i++) {
            movimientos_v[i][0] = movimientos[i][0];
            movimientos_v[i][1] = movimientos[i][1];
        }
        return movimientos_v;
    }

    public static int[][] rey_mov(String[][] tablero, int row, int col) {

        int[][] direcciones = { { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };
        int[][] movimientos = new int[64][2];
        int count = 0;

        for (int[] direccion : direcciones) {
            int fila = row;
            int columna = col;

            while (true) {
                fila += direccion[0];
                columna += direccion[1];
                if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
                    if (tablero[fila][columna] == null) {
                        movimientos[count][0] = fila;
                        movimientos[count][1] = columna;
                        count++;
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        int[][] movimientos_v = new int[count][2];
        for (int i = 0; i < count; i++) {
            movimientos_v[i][0] = movimientos[i][0];
            movimientos_v[i][1] = movimientos[i][1];
        }
        return movimientos_v;
    }

    public static int[][] peon_mov(String[][] tablero, int row, int col) {

        int[][] movimientos = new int[64][2];
        int count = 0;

        int fila = row;
        int columna = col;

        while (true) {
            fila += -1;
            columna += 0;
            if (fila >= 0 && fila < 8 && columna >= 0 && columna < 8) {
                if (tablero[fila][columna] == null) {
                    movimientos[count][0] = fila;
                    movimientos[count][1] = columna;
                    count++;
                    break;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        int[][] movimientos_v = new int[count][2];
        for (int i = 0; i < count; i++) {
            movimientos_v[i][0] = movimientos[i][0];
            movimientos_v[i][1] = movimientos[i][1];
        }
        return movimientos_v;
    }

    public static void imprimirTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
