package unican.es.grupo4_tus_santander.View.Tarifas;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import unican.es.grupo4_tus_santander.R;
import unican.es.grupo4_tus_santander.View.Activity;

public class TarifasActivity extends AppCompatActivity implements Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifas);

    }

    @Override
    public void showProgress(boolean b, int i) {

    }

    @Override
    public void showList() {

    }
}