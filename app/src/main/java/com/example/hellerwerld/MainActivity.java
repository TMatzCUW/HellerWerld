package com.example.hellerwerld;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View V){
        TextView textView=this.findViewById(R.id.textView);
        textView.setText("Billy");
    }

    public void onButtonClicked2(View V){
        TextView textView2=this.findViewById(R.id.textView2);
        textView2.setText("May");
    }
}