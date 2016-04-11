package com.example.sutula.pinterestgallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.sutula.pinterestgallery.masonry.EndlessRecyclerViewScrollListener;
import com.example.sutula.pinterestgallery.masonry.MasonryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "MainActivity";

    private List<String> urls = new ArrayList<String>(){{
            add("http://nakedbabes.pics/sad/thumbs/r/17919.jpg");
            add("http://s3.favim.com/mini/39/beautiful-black-and-white-bonita-converse-cute-323312.jpg");
            add("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSi_HrXgvoyHlOxz13GQU85IAeY9Ri_oS7DpFSxw6ftaxoUwHT9HQ");
            add("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTLF9DRkAVMNYZd1Yv0HNyr9vsQB9uprC-pB8x3650DWfdxXmsM");
            add("http://youqueen.com/wp-content/uploads/2014/02/Beautiful-and-attractive-sensuality-young-adult-female-brunette-woman-in-black-dress.jpg");
            add("https://pp.vk.me/c604318/v604318473/5b0/ltT6Hi5sH3o.jpg");
            add("https://pp.vk.me/c635103/v635103647/817/CgIN_MROh_0.jpg");
            add("https://pp.vk.me/c615828/v615828043/896/QXdsFs4Dvx4.jpg");
            add("https://pp.vk.me/c543108/v543108458/ead5/YG-XKPpkN5Y.jpg");
            add("https://pp.vk.me/c629420/v629420794/32555/tfbDLC4tiMg.jpg");
            add("https://pp.vk.me/c624020/v624020652/c44c/9CiqkzSTMq4.jpg");
            add("https://pp.vk.me/c621926/v621926652/1c0e/Ej7CSMHNjDM.jpg");
            add("https://pp.vk.me/c621926/v621926652/1e63/pZy0FGHBVe4.jpg");
            add("https://pp.vk.me/c621926/v621926652/1e9e/VlhQ3zbhkNA.jpg");
            add("https://pp.vk.me/c622926/v622926652/d3d5/uxvRbkerde8.jpg");
            add("https://pp.vk.me/c630924/v630924552/15c99/Ra-W1E2G6i4.jpg");
            add("https://pp.vk.me/c7007/v7007376/8f4ef/jsw4cPnDCLA.jpg");
            add("http://nakedbabes.pics/sad/thumbs/r/17919.jpg");
            add("http://s3.favim.com/mini/39/beautiful-black-and-white-bonita-converse-cute-323312.jpg");
            add("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSi_HrXgvoyHlOxz13GQU85IAeY9Ri_oS7DpFSxw6ftaxoUwHT9HQ");
            add("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTLF9DRkAVMNYZd1Yv0HNyr9vsQB9uprC-pB8x3650DWfdxXmsM");
            add("http://youqueen.com/wp-content/uploads/2014/02/Beautiful-and-attractive-sensuality-young-adult-female-brunette-woman-in-black-dress.jpg");
            add("https://pp.vk.me/c604318/v604318473/5b0/ltT6Hi5sH3o.jpg");
            add("https://pp.vk.me/c635103/v635103647/817/CgIN_MROh_0.jpg");
            add("https://pp.vk.me/c615828/v615828043/896/QXdsFs4Dvx4.jpg");
            add("https://pp.vk.me/c543108/v543108458/ead5/YG-XKPpkN5Y.jpg");
            add("https://pp.vk.me/c629420/v629420794/32555/tfbDLC4tiMg.jpg");
            add("https://pp.vk.me/c624020/v624020652/c44c/9CiqkzSTMq4.jpg");
            add("https://pp.vk.me/c621926/v621926652/1c0e/Ej7CSMHNjDM.jpg");
            add("https://pp.vk.me/c621926/v621926652/1e63/pZy0FGHBVe4.jpg");
            add("https://pp.vk.me/c621926/v621926652/1e9e/VlhQ3zbhkNA.jpg");
            add("https://pp.vk.me/c622926/v622926652/d3d5/uxvRbkerde8.jpg");
            add("https://pp.vk.me/c630924/v630924552/15c99/Ra-W1E2G6i4.jpg");
            add("https://pp.vk.me/c7007/v7007376/8f4ef/jsw4cPnDCLA.jpg");
    }};

    RecyclerView recyclerView;

    Button button;
    Button button2;
    Button button3;

    StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        final MasonryAdapter adapter = new MasonryAdapter(this, urls);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnScrollListener(new EndlessRecyclerViewScrollListener(staggeredGridLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount) {
                Log.d(TAG, "page: " + page + " total items: " + totalItemsCount);
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                urls.add("https://pp.vk.me/c543106/v543106101/fbcf/gECHlTI3G0o.jpg");
                int curSize = adapter.getItemCount();
                adapter.notifyItemRangeInserted(curSize, urls.size() - 1);

            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                staggeredGridLayoutManager.setSpanCount(1);
                break;
            case R.id.button2:
                staggeredGridLayoutManager.setSpanCount(2);
                break;
            case R.id.button3:
                staggeredGridLayoutManager.setSpanCount(3);
                break;
        }
    }
}
