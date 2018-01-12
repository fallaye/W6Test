package mobileappscompany.w6test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by fallaye on 1/12/18.
 */

public class AdapterStem extends RecyclerView.Adapter<AdapterStem.MyViewHolder> {

    private Context context;
    List<Stem> data;

    public AdapterStem(Context context, List<Stem> data){
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.container_stem, parent,false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Stem currentStem =data.get(position);
        holder.tvId.setText("Id: " + currentStem.getId());
        holder.tvInvestmentName.setText("InvestmentName: " + currentStem.getInvestmentName());
        holder.tvId.setText("Agency: " + currentStem.getAgency());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvId;
        TextView tvInvestmentName;
        TextView tvAgency;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvId = (TextView) itemView.findViewById(R.id.tvId);
            tvInvestmentName = (TextView) itemView.findViewById(R.id.tvInvestmenName);
            tvAgency = (TextView) itemView.findViewById(R.id.tvAgency);
        }

    }


}

