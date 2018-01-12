package mobileappscompany.w6test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private AdapterStem adapterStem;
    private List<Stem> stemsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        stemsList = new ArrayList<Stem>();

        loadRecyclerViewData();

    }

    private void loadRecyclerViewData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<Stem>> call = api.getStems();

        //Log.d(TAG, "Number of Stems received: " + stemsList.size());


        call.enqueue(new Callback<List<Stem>>() {
            @Override
            public void onResponse(Call<List<Stem>> call, Response<List<Stem>> response) {
                stemsList = response.body();

               // Log.d(TAG, "Number of Stems received: " + stemsList.size());

                adapterStem = new AdapterStem(getApplicationContext(), stemsList);
                recyclerView.setAdapter(adapterStem);
            }

            @Override
            public void onFailure(Call<List<Stem>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
