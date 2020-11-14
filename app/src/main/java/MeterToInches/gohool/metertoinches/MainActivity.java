package MeterToInches.gohool.metertoinches;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.plainId);
        button = (Button) findViewById(R.id.btnId);
        textView = (TextView) findViewById(R.id.textId);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double gram = 1000.00;
                double result = 0.0;

                if (editText.getText().toString().equals("")) {

                    textView.setText(R.string.valid_error);
                    textView.setTextColor(Color.RED);
                }else {
                    double number = Double.parseDouble(editText.getText().toString());
                    result = number*gram;

                    textView.setTextColor(Color.GRAY);
                    textView.setText(Double.toString(result) + "g");
                }



            }
        });

    }
}
