package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btn_restart_clicked(View view){
                setContentView(R.layout.activity_main);
    }
    public void btnClicked(View view){
        final Button b = (Button) view;
        int boxNumber = 0;
        switch (b.getId()){
            case R.id.btn1:
                boxNumber = 1;
                break;
            case R.id.btn2:
                boxNumber = 2;
                break;
            case R.id.btn3:
                boxNumber = 3;
                break;
            case R.id.btn4:
                boxNumber = 4;
                break;
            case R.id.btn5:
                boxNumber = 5;
                break;
            case R.id.btn6:
                boxNumber = 6;
                break;
            case R.id.btn7:
                boxNumber = 7;
                break;
            case R.id.btn8:
                boxNumber = 8;
                break;
            case R.id.btn9:
                boxNumber = 9;
                break;
        }
        playGame(boxNumber,b);
    }
    int playerChance = 1;
    ArrayList<Integer> player1_results = new ArrayList<>();
    ArrayList<Integer> player2_results = new ArrayList<>();
    void playGame(int BoxNumber,Button btn){
        if (playerChance == 1){
            player1_results.add(BoxNumber);
            btn.setText("X");
            playerChance = 0;
        }
        else{
            player2_results.add(BoxNumber);
            btn.setText("O");
            playerChance = 1;
        }
        btn.setEnabled(false);
        winner();
    }
    public void winner() {
        int winner = 0;
        if (player1_results.contains(1) && player1_results.contains(2) && player1_results.contains(3)) {
            winner = 1;
        }
        if (player1_results.contains(4) && player1_results.contains(5) && player1_results.contains(6)) {
            winner = 1;
        }
        if (player1_results.contains(7) && player1_results.contains(8) && player1_results.contains(9)) {
            winner = 1;
        }
        if (player1_results.contains(1) && player1_results.contains(5) && player1_results.contains(9)) {
            winner = 1;
        }
        if (player1_results.contains(3) && player1_results.contains(5) && player1_results.contains(7)) {
            winner = 1;
        }
        if (player1_results.contains(1) && player1_results.contains(4) && player1_results.contains(7)) {
            winner = 1;
        }
        if (player1_results.contains(2) && player1_results.contains(5) && player1_results.contains(8)) {
            winner = 1;
        }
        if (player1_results.contains(3) && player1_results.contains(6) && player1_results.contains(9)) {
            winner = 1;
        }
        if (player2_results.contains(1) && player2_results.contains(2) && player2_results.contains(3)) {
            winner = 2;
        }
        if (player2_results.contains(4) && player2_results.contains(5) && player2_results.contains(6)) {
            winner = 2;
        }
        if (player2_results.contains(7) && player2_results.contains(8) && player2_results.contains(9)) {
            winner = 2;
        }
        if (player2_results.contains(1) && player2_results.contains(5) && player2_results.contains(9)) {
            winner = 2;
        }
        if (player2_results.contains(3) && player2_results.contains(5) && player2_results.contains(7)) {
            winner = 2;
        }
        if (player2_results.contains(1) && player2_results.contains(4) && player2_results.contains(7)) {
            winner = 2;
        }
        if (player2_results.contains(2) && player2_results.contains(5) && player2_results.contains(8)) {
            winner = 2;
        }
        if (player2_results.contains(3) && player2_results.contains(6) && player2_results.contains(9)) {
            winner = 2;
        }
        if (winner != 0) {
            if (winner == 1) {
                String text = "Player 1 has won";
                player1_results.clear();
                Toast.makeText(this, text, Toast.LENGTH_LONG).show();

            } else if (winner == 2) {
                String text = "Player 2 has won";
                player2_results.clear();
                Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Match tied", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void btnStartGame(View view){
                setContentView(R.layout.activity_game);
    }

}