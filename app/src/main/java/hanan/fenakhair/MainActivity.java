package hanan.fenakhair;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView background_image = (ImageView) findViewById(R.id.background_image);
        Glide.with(this).load(R.drawable.bachground1).into(background_image);
        //progress bar
        Resources res = getResources();
        Drawable progress_drawable = res.getDrawable(R.drawable.progress_circle);
        ProgressBar newProgress = (ProgressBar) findViewById(R.id.new_cases_progress);
        newProgress.setProgressDrawable(progress_drawable);
        newProgress.setProgress(65);
        //newProgress.setSecondaryProgress(100);
        newProgress.setMax(100);
        //old progress bar
        Drawable small_progress_drawable = res.getDrawable(R.drawable.small_progress_circle);
        ProgressBar oldProgress = (ProgressBar) findViewById(R.id.old_cases_progress);
        oldProgress.setProgressDrawable(small_progress_drawable);
        oldProgress.setProgress(65);
        //oldProgress.setSecondaryProgress(100);
        oldProgress.setMax(100);
        //closed bar
        ProgressBar closedProgress = (ProgressBar) findViewById(R.id.closed_cases_progress);
        closedProgress.setProgressDrawable(small_progress_drawable);
        closedProgress.setProgress(65);
        //closedProgress.setSecondaryProgress(100);
        closedProgress.setMax(100);
    }

    public void closed_click(View view) {
        Intent i = new Intent(this,CaseList.class);
        startActivity(i);
    }

    public void new_click(View view) {
        Intent i2 = new Intent(this, New_case_list.class);
        startActivity(i2);
    }

    public void old_click(View view) {
        Intent i3 = new Intent(this, Old_case_list.class);
        startActivity(i3);
    }
}
