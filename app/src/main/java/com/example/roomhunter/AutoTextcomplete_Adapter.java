/*package com.example.roomhunter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.location.places.AutocompletePredictionBuffer;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;
//import com.razor.googleplacesautocompletesample.R;
//import com.google.android.libraries.places.api.Places;
//import com.google.android.libraries.places.api.net.PlacesClient;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.concurrent.TimeUnit;

/**
 * Note that this adapter requires a valid {@link GoogleApiClient}.
 * The API client must be maintained in the encapsulating Activity, including all lifecycle and
 * connection states. The API client must be connected with the {@link Places#GEO_DATA_API} API.
 */

/*public class AutoTextcomplete_Adapter extends RecyclerView.Adapter<AutoTextcomplete_Adapter.PredictionHolder> implements Filterable {

    private static final String TAG = "AutoTextcomplete_Adapter";
    private ArrayList<AutoTextcomplete_Place> mResultList;
    private GoogleApiClient mGoogleApiClient;
    private LatLngBounds mBounds;
    private AutocompleteFilter mPlaceFilter;

    private Context mContext;
    private int layout;


    public AutoTextcomplete_Adapter(Context context, int resource, GoogleApiClient googleApiClient,
                                    LatLngBounds bounds, AutocompleteFilter filter) {
        mContext = context;
        layout = resource;
        mGoogleApiClient = googleApiClient;
        mBounds = bounds;
        mPlaceFilter = filter;
    }

    /**
     * Sets the bounds for all subsequent queries.
     */
    /*public void setBounds(LatLngBounds bounds) {
        mBounds = bounds;
    }

    /**
     * Returns the filter for the current set of autocomplete results.
     */
    /*@Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                // Skip the autocomplete query if no constraints are given.
                if (constraint != null) {
                    // Query the autocomplete API for the (constraint) search string.
                    mResultList = getAutocomplete(constraint);
                    if (mResultList != null) {
                        // The API successfully returned results.
                        results.values = mResultList;
                        results.count = mResultList.size();
                    }
                }
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                if (results != null && results.count > 0) {
                    notifyDataSetChanged();
                } else {

                }

            }
        };
        return filter;
    }

    private ArrayList<AutoTextcomplete_Place> getAutocomplete(CharSequence constraint) {
        if (mGoogleApiClient.isConnected()) {
            PendingResult<AutocompletePredictionBuffer> results = Places.GeoDataApi.getAutocompletePredictions(mGoogleApiClient, constraint.toString(), mBounds, mPlaceFilter);

            AutocompletePredictionBuffer autocompletePredictions = results.await(60, TimeUnit.SECONDS);

            final Status status = autocompletePredictions.getStatus();
            if (!status.isSuccess()) {
                Toast.makeText(mContext, "Error Contacting API" + status.toString(), Toast.LENGTH_SHORT).show();
                Log.e(" ", "Error getting autocomplete predection API call" + status.toString());
                autocompletePredictions.release();
                return null;

            }

            Log.i(" ", "Query Completed.Received" + autocompletePredictions.getCount() + "predictions.");

            Iterator<AutocompletePrediction> iterator = autocompletePredictions.iterator();
            ArrayList resultList = new ArrayList<>(autocompletePredictions.getCount());
            while (iterator.hasNext()) {
                AutocompletePrediction prediction = iterator.next();
                resultList.add(new AutoTextcomplete_Place(prediction.getPlaceId(), prediction.getFullText(null)));
            }

            autocompletePredictions.release();

            return resultList;
        }

        Log.e(" ", "Google API client is not connected for autocomplete query");
        return null;
    }

    @Override
    public PredictionHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View convertview = layoutInflater.inflate(layout, viewGroup, false);
        PredictionHolder mPredictionHolder = new PredictionHolder(convertview);
        return mPredictionHolder;

    }

    @Override
    public void onBindViewHolder(PredictionHolder mPredictionHolder, final int i) {
        mPredictionHolder.myPrediction.setText(mResultList.get(i).description);
    }

    @Override
    public int getItemCount() {
        if (mResultList != null) {
            return mResultList.size();

        } else
            return 0;
    }

    public AutoTextcomplete_Place getItem(int position) {
        return mResultList.get(position);
    }

    public class PredictionHolder extends RecyclerView.ViewHolder {
        private TextView myPrediction;
        private RelativeLayout myRow;

        public PredictionHolder(View itemView) {
            super(itemView);
            myPrediction = (TextView) itemView.findViewById(R.id.address);
            myRow = (RelativeLayout) itemView.findViewById(R.id.predictedRow);
        }

    }


    public class AutoTextcomplete_Place {
        public CharSequence placeId;
        public CharSequence description;

        AutoTextcomplete_Place(CharSequence placeId, CharSequence description) {
            this.placeId = placeId;
            this.description = description;
        }

        @Override
        public String toString() {
            return description.toString();
        }
    }

}*/


