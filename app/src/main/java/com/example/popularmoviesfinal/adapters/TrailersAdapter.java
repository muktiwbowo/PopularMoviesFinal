package com.example.popularmoviesfinal.adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.popularmoviesfinal.fragments.MovieDetailsActivityFragment;
import com.example.popularmoviesfinal.R;

/**
 * Created by dabu-dabu on 07/05/16.
 */
public class TrailersAdapter extends
        CursorAdapter {

    public TrailersAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }


    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_trailers_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        view.setTag(viewHolder);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        ViewHolder viewHolder = (ViewHolder) view.getTag();
        String trailerName = cursor.getString(MovieDetailsActivityFragment.COL_NAME);
        viewHolder.trailerNameTextView.setText(trailerName);
    }

    public static class ViewHolder {
        public final TextView trailerNameTextView;

        public ViewHolder(View vi) {
            trailerNameTextView = (TextView)vi.findViewById(R.id.textview_trailer_name);
        }
    }
}


