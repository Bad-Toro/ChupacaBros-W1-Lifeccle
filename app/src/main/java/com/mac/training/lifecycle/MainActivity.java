package com.mac.training.lifecycle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView oT;
    String myState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oT = ((TextView) findViewById(R.id.oT));
        mR("A1 - onCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mR("A1 - onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mR("A1 - onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mR("A1 - onSaveInstanceState");
        outState.putString("lK", oT.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mR("A1 - onRestoreInstanceState");
        oT.setText(savedInstanceState.getString("lK"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        mR("A1 - onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mR("A1 - onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        mR("A1 - onStart");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        mR("A1 - onRestart");
    }

    public void onG2(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    void mR(String s){
        oT.setText(oT.getText().toString() + s + "\n");
    }

    public void onClear(View view) {
        oT.setText("");
    }
}
