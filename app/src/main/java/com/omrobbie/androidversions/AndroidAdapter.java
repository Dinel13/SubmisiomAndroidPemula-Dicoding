package com.omrobbie.androidversions;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by omrobbie on 29/12/2017.
 */

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.ViewHolder> {

    private List<AndroidPojo> list;

    public AndroidAdapter(List<AndroidPojo> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_android, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView picture;
        TextView codename;
        TextView initialRelease;
        TextView version;

        public ViewHolder(View itemView) {
            super(itemView);
            picture = (ImageView) itemView.findViewById(R.id.iv_picture);
            codename = (TextView) itemView.findViewById(R.id.tv_codename);
            initialRelease = (TextView) itemView.findViewById(R.id.tv_initial_release);


    }

        public void bind(final AndroidPojo item) {
            picture.setImageResource(item.getPicture());
            codename.setText(item.getCodename() + " (" + item.getVersion() + ")");
            initialRelease.setText(item.getInitialRelease());



            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra(DetailActivity.SCREENSHOT, item.getScreenshot());
                    intent.putExtra(DetailActivity.DESCRIPTION, item.getDescription());
                    intent.putExtra(DetailActivity.RILIS,item.getInitialRelease());
                    intent.putExtra(DetailActivity.PENGEMBANG, item.getVersion());



                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
