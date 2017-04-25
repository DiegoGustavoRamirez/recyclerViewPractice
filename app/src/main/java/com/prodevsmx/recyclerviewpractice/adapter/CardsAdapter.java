package com.prodevsmx.recyclerviewpractice.adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.prodevsmx.recyclerviewpractice.R;
import com.prodevsmx.recyclerviewpractice.model.CardsData;
import com.prodevsmx.recyclerviewpractice.model.ListItem;

import java.util.List;

/**
 * Created by diego on 4/19/2017.
 */

public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.CardHolder>{

    private List<ListItem> listData;
    private LayoutInflater inflater;

    public CardsAdapter(List<ListItem> listData, Context c){
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public CardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_view_cards, parent, false);
        return new CardHolder(view);
    }

    @Override
    public void onBindViewHolder(CardHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.nameCard.setText(item.getName());
        holder.imageCard.setImageResource(item.getImageId());
        holder.descriptionCard.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class CardHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView nameCard;
        private TextView descriptionCard;
        private ImageView imageCard;
        private Button buyCard;
        private View container;

        public CardHolder(View itemView){
            super(itemView);

            nameCard = (TextView) itemView.findViewById(R.id.tvCard);
            descriptionCard = (TextView) itemView.findViewById(R.id.tvDescription);
            imageCard = (ImageView) itemView.findViewById(R.id.ivCard);
            container = itemView.findViewById(R.id.recList);
            buyCard = (Button) itemView.findViewById(R.id.btnBuy);

     //       container.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
