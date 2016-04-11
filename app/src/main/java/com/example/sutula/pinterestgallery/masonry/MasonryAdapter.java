package com.example.sutula.pinterestgallery.masonry;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.sutula.pinterestgallery.R;

import java.util.List;

/**
 * Created by Sutula on 11.04.16
 */
public class MasonryAdapter extends RecyclerView.Adapter<MasonryView> {

    private Context context;

    private List<String> urls;


    public MasonryAdapter(Context context, List<String> urls) {
        this.context = context;
        this.urls = urls;
    }

    @Override
    public MasonryView onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        MasonryView masonryView = new MasonryView(layoutView, context);
        return masonryView;
    }

    @Override
    public void onBindViewHolder(MasonryView holder, int position) {
        holder.setItem(urls.get(position));
    }


    @Override
    public int getItemCount() {
        return urls.size();
    }

}
