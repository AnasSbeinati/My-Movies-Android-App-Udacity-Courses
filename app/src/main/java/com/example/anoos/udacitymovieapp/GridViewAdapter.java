package com.example.anoos.udacitymovieapp;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Anoos on 10/21/2016.
 */
public class GridViewAdapter extends BaseAdapter {
    private ArrayList<Movie> movies;
    private Context contest;

    public GridViewAdapter(Context contest) {
        this.contest = contest;
        movies = new ArrayList<Movie>();
        Resources res = contest.getResources();
        String[] moviesName = res.getStringArray(R.array.images);
        
        int[] moviesPosters = {
                R.drawable.e1,
                R.drawable.e2,
                R.drawable.e3,
                R.drawable.e4,
                R.drawable.e5,
                R.drawable.e6,
                R.drawable.e7,
                R.drawable.e8,
                R.drawable.e9,
                R.drawable.e10
        };
        for (int i = 0; i < moviesPosters.length; i++) {
            movies.add(new Movie(moviesPosters[i], moviesName[i]));
        }
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int i) {
        return movies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = view;
        ViewHolder holder = null;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) contest.getSystemService(contest.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.postertemplate, viewGroup, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }
        Movie movie = movies.get(i);
        holder.movie.setImageResource(movie.getId());
        return row;
    }
}
