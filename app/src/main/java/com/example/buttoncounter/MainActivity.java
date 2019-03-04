package com.example.buttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    private int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        textView.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener clickListener1 = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                clickCounter ++;
                String result = "Button has been clicked " + clickCounter + " time";
                if(clickCounter > 1)
                {
                    result +="s";
                }
                result += "\n";
                textView.append(result);
            }
        };
            button.setOnClickListener(clickListener1);
            textView.setText("");
    }
}
