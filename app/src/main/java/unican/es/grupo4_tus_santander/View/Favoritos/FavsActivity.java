package unican.es.grupo4_tus_santander.View.Favoritos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import unican.es.grupo4_tus_santander.R;
import unican.es.grupo4_tus_santander.View.Interfaz.ActivityInterface;

public class FavsActivity extends AppCompatActivity implements ActivityInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favs);



    }

    @Override
    public void showProgress(boolean b, int i) {

    }

    @Override
    public void showList() {

    }
}
