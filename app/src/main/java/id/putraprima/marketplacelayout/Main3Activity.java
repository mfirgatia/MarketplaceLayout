package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void Next(View view) {
        Intent iten = new Intent( Main3Activity.this, Main2Activity.class);
        startActivity(iten);
    }
    public void Next2(View view){
        Intent iten1 = new Intent(Main3Activity.this, Main2Activity.class);
        startActivity(iten1);
    }



}

