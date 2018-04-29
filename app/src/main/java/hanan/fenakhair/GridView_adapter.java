package hanan.fenakhair;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by hanan on 4/7/2018.
 */

public class GridView_adapter extends ArrayAdapter<Case> {
    public GridView_adapter(Context context, ArrayList<Case> cases) {
        super(context, 0, cases);
    }
    //getview
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Case currentCase = getItem(position);
        View gridItem = convertView;
        if (gridItem == null){
            gridItem = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent,false);
        }
        /*MainActivity main_object = new MainActivity();
        Resources res1 = main_object.getRes();
        Drawable small_progress_drawable = res1.getDrawable(currentCase.getProgress());*/
        ProgressBar oldProgress = (ProgressBar) gridItem.findViewById(R.id.caseList_progressBar);
        //oldProgress.setProgressDrawable(currentCase.getProgress());
        oldProgress.setProgress(65);

        TextView money_status = (TextView) gridItem.findViewById(R.id.status);
        money_status.setText(currentCase.getStatus());

        /*TextView capacity = (TextView) listItem.findViewById(R.id.capacity);
        capacity.setText(currentDataSet.getHallCapacity());

        TextView location = (TextView) listItem.findViewById(R.id.location);
        location.setText(currentDataSet.getHallLocation());

        Button details = (Button) listItem.findViewById(R.id.details);
        details.setText(currentDataSet.getHallDetails());

        TextView price = (TextView) listItem.findViewById(R.id.price);
        price.setText(currentDataSet.getHallPrice());

        TextView currency = (TextView) listItem.findViewById(R.id.currency);
        currency.setText(currentDataSet.getCurrency());

        Button book_button = (Button) listItem.findViewById(R.id.book_botton);
        book_button.setText(currentDataSet.getBook());*/
        return gridItem;
    }
}

