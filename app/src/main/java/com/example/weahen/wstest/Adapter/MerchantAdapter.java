package com.example.weahen.wstest.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.weahen.wstest.Model.Merchant;
import com.example.weahen.wstest.R;

import java.util.List;

public class MerchantAdapter extends RecyclerView.Adapter<MerchantAdapter.ViewHolder> {

    private Context mContext;

    private List<Merchant> merchantList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView merchantImg;
        TextView merchantName;

        public ViewHolder(@NonNull View view) {
            super(view);
            cardView = (CardView) view;
            merchantImg = view.findViewById(R.id.merchant_image);
            merchantName = view.findViewById(R.id.merchant_name);

        }
    }

    public MerchantAdapter(List<Merchant> merchantList) {
        this.merchantList = merchantList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        if (mContext == null) {
            mContext = viewGroup.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.merchant_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Merchant merchant = merchantList.get(i);
        viewHolder.merchantName.setText(merchant.getTitle());
        Glide.with(mContext).load(merchant.getPath()).into(viewHolder.merchantImg); //TODO

    }

    @Override
    public int getItemCount() {
        return merchantList.size();
    }


}
