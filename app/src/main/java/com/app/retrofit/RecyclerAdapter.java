package com.app.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Myviewholder> {


    private List<User> users;

    public RecyclerAdapter(List<User> users){

        this.users=users;
    }
    @Override
    public Myviewholder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);

        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(Myviewholder holder, int position) {
        holder.Id.setText(String.valueOf(users.get(position).getId()));
        //holder.Id.setText(users.get(position).getId());
        holder.Name.setText(users.get(position).getName());
        holder.Stdclass.setText(users.get(position).getStdclass());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

        TextView Id,Name,Stdclass;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);

            Id=(TextView)itemView.findViewById(R.id.id);
            Name=(TextView)itemView.findViewById(R.id.name);
            Stdclass=(TextView)itemView.findViewById(R.id.stdclass);
        }
    }
}
