package co.com.etn.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bSum,bRes,bMul,bDiv,bIgu;
    float operador1,operador2,resultado;
    int operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        textView.setText("");
        b0 = (Button)findViewById(R.id.b0);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        bSum = (Button)findViewById(R.id.bSum);
        bRes = (Button)findViewById(R.id.bRes);
        bMul = (Button)findViewById(R.id.bMul);
        bDiv = (Button)findViewById(R.id.bDiv);
        bIgu = (Button)findViewById(R.id.bIgu);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bSum.setOnClickListener(this);
        bRes.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bDiv.setOnClickListener(this);
        bIgu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String s;
        switch (view.getId()){
            case R.id.b0:
                s = b0.getText().toString();
                textView.setText(textView.getText()+s);

                break;
            case R.id.b1:
                s = b1.getText().toString();
                textView.setText(textView.getText()+s);
                break;
            case R.id.b2:
                s = b2.getText().toString();
                textView.setText(textView.getText()+s);
                break;
            case R.id.b3:
                s = b3.getText().toString();
                textView.setText(textView.getText()+s);
                break;
            case R.id.b4:
                s = b4.getText().toString();
                textView.setText(textView.getText()+s);
                break;
            case R.id.b5:
                s = b5.getText().toString();
                textView.setText(textView.getText()+s);
                break;
            case R.id.b6:
                s = b6.getText().toString();
                textView.setText(textView.getText()+s);
                break;
            case R.id.b7:
                s = b7.getText().toString();
                textView.setText(textView.getText()+s);
                break;
            case R.id.b8:
                s = b8.getText().toString();
                textView.setText(textView.getText()+s);
                break;
            case R.id.b9:
                s = b9.getText().toString();
                textView.setText(textView.getText()+s);
                break;

            case R.id.bSum:
                if(textView.getText().length()>0) {
                    s = textView.getText().toString();
                    operador1=Float.parseFloat(s);
                    operador= R.id.bSum;
                    textView.setText("");
                }
                break;
            case R.id.bRes:
                if(textView.getText().length()>0) {
                    s = textView.getText().toString();
                    operador1=Float.parseFloat(s);
                    operador= R.id.bRes;
                    textView.setText("");
                }
                break;
            case R.id.bDiv:
                if(textView.getText().length()>0) {
                    s = textView.getText().toString();
                    operador1=Float.parseFloat(s);
                    operador= R.id.bDiv;
                    textView.setText("");
                }
                break;
            case R.id.bMul:
                if(textView.getText().length()>0) {
                    s = textView.getText().toString();
                    operador1=Float.parseFloat(s);
                    operador= R.id.bMul;
                    textView.setText("");
                }
                break;
            case R.id.bIgu:
                if(textView.getText().length()>0) {
                    s = textView.getText().toString();
                    operador2=Float.parseFloat(s);
                    if(operador==R.id.bDiv && operador2==0 ){
                        Toast.makeText(MainActivity.this, getResources().getString(R.string.division_cero) ,Toast.LENGTH_SHORT).show();
                    }else{
                        switch (operador){
                            case R.id.bSum:
                                resultado=operador1+operador2;
                                break;
                            case R.id.bRes:
                                resultado=operador1-operador2;
                                break;
                            case R.id.bMul:
                                resultado=operador1*operador2;
                                break;
                            case R.id.bDiv:
                                resultado=operador1/operador2;
                                break;
                        }
                        Toast.makeText(MainActivity.this, String.valueOf(resultado) ,Toast.LENGTH_LONG).show();

                    }
                    operador= R.id.bMul;
                    textView.setText("");
                }
                break;

        }
    }
}
