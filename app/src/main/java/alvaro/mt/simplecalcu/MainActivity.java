package alvaro.mt.simplecalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Fnum, Snum;

    Button BtnAdd, BtnSub, BtnMul, BtnDiv;

    TextView Result;

    int n1, n2, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fnum = (EditText) findViewById(R.id.txtFnum);
        Snum = (EditText) findViewById(R.id.txtSnum);
        BtnAdd = (Button) findViewById(R.id.BtnAdd);
        BtnSub = (Button) findViewById(R.id.BtnSub);
        BtnMul = (Button) findViewById(R.id.BtnMul);
        BtnDiv = (Button) findViewById(R.id.BtnDiv);
        Result = (TextView) findViewById(R.id.txtResult);
        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Addition", Toast.LENGTH_SHORT).show();

                if(Fnum.getText().toString().equals("")) {
                    Fnum.setError("Need Number");
                    Fnum.requestFocus();
                    return;
                }

                if(Snum.getText().toString().equals("")) {
                    Snum.setError("Need Number");
                    Snum.requestFocus();
                    return;
                }

                n1 = Integer.valueOf(Fnum.getText().toString());
                n2 = Integer.valueOf(Snum.getText().toString());
                ans = n1 + n2;
                Result.setText(String.valueOf(ans));

            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Subtraction", Toast.LENGTH_SHORT).show();

                if(Fnum.getText().toString().equals("")) {
                    Fnum.setError("Need Number");
                    Fnum.requestFocus();
                    return;
                }

                if(Snum.getText().toString().equals("")) {
                    Snum.setError("Need Number");
                    Snum.requestFocus();
                    return;
                }

                n1 = Integer.valueOf(Fnum.getText().toString());
                n2 = Integer.valueOf(Snum.getText().toString());
                ans = n1 - n2;
                Result.setText(String.valueOf(ans));

            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Multiplication", Toast.LENGTH_SHORT).show();

                if(Fnum.getText().toString().equals("")) {
                    Fnum.setError("Need Number");
                    Fnum.requestFocus();
                    return;
                }

                if(Snum.getText().toString().equals("")) {
                    Snum.setError("Need Number");
                    Snum.requestFocus();
                    return;
                }

                n1 = Integer.valueOf(Fnum.getText().toString());
                n2 = Integer.valueOf(Snum.getText().toString());
                ans = n1 * n2;
                Result.setText(String.valueOf(ans));

            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Division", Toast.LENGTH_SHORT).show();

                if(Fnum.getText().toString().equals("")) {
                    Fnum.setError("Need Number");
                    Fnum.requestFocus();
                    return;
                }

                if(Snum.getText().toString().equals("")) {
                    Snum.setError("Need Number");
                    Snum.requestFocus();
                    return;
                }

                n1 = Integer.valueOf(Fnum.getText().toString());
                n2 = Integer.valueOf(Snum.getText().toString());
                ans = n1 / n2;
                Result.setText(String.valueOf(ans));

            }
        });
    }
}