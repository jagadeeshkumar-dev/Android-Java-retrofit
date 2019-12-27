package com.app.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private  RecyclerAdapter adapter;
    private List<User> users;
    private ApiInterface apiInterface;
    public ProgressBar pro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          pro=(ProgressBar)findViewById(R.id.pro);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);



        apiInterface=ApiClient.getApiClient().create(ApiInterface.class);


        Call<List<User>> call= apiInterface.getUsers();



            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {

                    users= response.body();
                    adapter= new RecyclerAdapter(users);
                    recyclerView.setAdapter(adapter);


                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {

                }
            });


    }
}
