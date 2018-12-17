package com.mobileapps.a2darraycodingchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int k,m,l,n,i;

    public void printThing() {

        int row = 4;
        int col = 4;
        int array[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        while (k < m && l < n) {

            for (i = l; i < n; ++i) {
                System.out.print(array[k][i] + " ");
            }k++;


            for (i = k; i < m; ++i) {
                System.out.print(array[i][n - 1] + " ");
            }n--;


            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(array[m - 1][i] + " ");
                }m--;
            }


            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(array[i][l] + " ");
                }l++;
            }
        }
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
