package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void Next(View view) {
        Intent iten = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(iten);
    }
    public void Next1(View view) {
        Intent iten = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(iten);
    }
}
