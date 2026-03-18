package com.example.lab10_simplecounter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvCounter;
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tvCounter);
        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener(v -> startCounting());
    }

    private void startCounting() {
        btnStart.setEnabled(false); // Disable button during counting
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                int count = i;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                runOnUiThread(() -> tvCounter.setText(String.valueOf(count)));
            }

            runOnUiThread(() -> {
                Toast.makeText(MainActivity.this, "Đã đếm xong!", Toast.LENGTH_SHORT).show();
                btnStart.setEnabled(true);
            });
        }).start();
    }
}