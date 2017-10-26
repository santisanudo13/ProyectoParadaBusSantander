package unican.es.grupo4_tus_santander.Presenter.Main;

import android.content.Context;

import unican.es.grupo4_tus_santander.Models.WebService.DataLoaders.RemoteFetch;
import unican.es.grupo4_tus_santander.View.Activity;
import unican.es.grupo4_tus_santander.View.Main.MainActivity;


public class MainPresenter {
    private Activity activity;
    private Context context;
    private  RemoteFetch remoteFetch = new RemoteFetch();


    public MainPresenter(Context context, Activity activity){
        this.activity = activity;
        this.context = context;

    }// MainPresenter

    public void start(){
        activity.showList();
    }// start


}