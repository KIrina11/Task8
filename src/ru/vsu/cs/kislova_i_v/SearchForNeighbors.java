package ru.vsu.cs.kislova_i_v;


public class SearchForNeighbors {
    public static int[][] searchForNeighborsAndFormModifiedArray(double[][] arr) {
        int[][] modifiedArray = new int[arr.length][arr[0].length];

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (r == 0) {
                    if (c == 0) {
                        modifiedArray[r][c] = searchForNeighborsInUpperLeftCorner(0, r, c, arr);
                    }

                    if (c == arr[0].length - 1) {
                        modifiedArray[r][c] = searchForNeighborsInUpperRightCorner(0, r, c, arr);
                    }

                    if ((c != 0) && (c != arr[0].length - 1)) {
                        modifiedArray[r][c] = searchForNeighborsInUpperBorder(0, r, c, arr);
                    }
                }

                if ((c == 0) && (r != 0) && (r != arr.length - 1)) {
                    modifiedArray[r][c] = searchForNeighborsInLeftBorder(0, r, c, arr);
                }

                if ((c == arr[0].length - 1) && (r != 0) && (r != arr.length - 1)) {
                    modifiedArray[r][c] = searchForNeighborsInRightBorder(0, r, c, arr);
                }

                if (r == arr.length - 1) {
                    if (c == 0) {
                        modifiedArray[r][c] = searchForNeighborsInLowerLeftCorner(0, r, c, arr);
                    }

                    if (c == arr[0].length - 1) {
                        modifiedArray[r][c] = searchForNeighborsInLowerRightCorner(0, r, c, arr);
                    }

                    if ((c != 0) && (c != arr[0].length - 1)) {
                        modifiedArray[r][c] = searchForNeighborsInLowerBorder(0, r, c, arr);
                    }
                }

                if ((r != 0) && (r != arr.length - 1) && (c != 0) && (c != arr[0].length - 1)) {
                    modifiedArray[r][c] = searchForNeighborsInMiddle(0, r, c, arr);
                }
            }
        }
        return modifiedArray;
    }

    public static int searchForNeighborsInUpperLeftCorner(int k, int r, int c, double[][] arr) { //верхний левый угол
        if (arr[r][c] == arr[r][c + 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c + 1]) {
            k += 1;
        }

        return k;
    }

    public static int searchForNeighborsInUpperRightCorner(int k, int r, int c, double[][] arr) { //верхний правый угол
        if (arr[r][c] == arr[r][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c]) {
            k += 1;
        }

        return k;
    }

    public static int searchForNeighborsInLowerLeftCorner(int k, int r, int c, double[][] arr) { //нижний левый угол
        if (arr[r][c] == arr[r - 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c + 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r][c + 1]) {
            k += 1;
        }

        return k;
    }

    public static int searchForNeighborsInLowerRightCorner(int k, int r, int c, double[][] arr) { //нижний правый угол
        if (arr[r][c] == arr[r - 1][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r][c - 1]) {
            k += 1;
        }

        return k;
    }

    public static int searchForNeighborsInMiddle(int k, int r, int c, double[][] arr) {
        if (arr[r][c] == arr[r - 1][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c + 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r][c + 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c + 1]) {
            k += 1;
        }

        return k;
    }

    public static int searchForNeighborsInLeftBorder(int k, int r, int c, double[][] arr) { //левая грань
        if (arr[r][c] == arr[r - 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c + 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r][c + 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c + 1]) {
            k += 1;
        }

        return k;
    }

    public static int searchForNeighborsInRightBorder(int k, int r, int c, double[][] arr) { //правая грань
        if (arr[r][c] == arr[r - 1][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c]) {
            k += 1;
        }

        return k;
    }

    public static int searchForNeighborsInUpperBorder(int k, int r, int c, double[][] arr) { //верхняя грань
        if (arr[r][c] == arr[r][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r + 1][c + 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r][c + 1]) {
            k += 1;
        }

        return k;
    }

    public static int searchForNeighborsInLowerBorder(int k, int r, int c, double[][] arr) { //нижняя грань
        if (arr[r][c] == arr[r][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c - 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c]) {
            k += 1;
        }
        if (arr[r][c] == arr[r - 1][c + 1]) {
            k += 1;
        }
        if (arr[r][c] == arr[r][c + 1]) {
            k += 1;
        }

        return k;
    }
}
