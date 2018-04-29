package hanan.fenakhair;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class New_case_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_case_list);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        Intent intent = getIntent();
        ArrayList<Case> cases = new ArrayList<Case>();
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));//, "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));//, "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));//"Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG") );// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle,"10 / 100 SDG"));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));//, "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));//, "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));//"Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle,"10 / 100 SDG"));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle,"10 / 100 SDG") );// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle,"10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG" ));// "Golden Hall", "capacity 1500", "Khartoum North", "View All Details", "25000","SDG","Book Now"));
        cases.add(new Case(R.drawable.small_progress_circle, "10 / 100 SDG"));
        // create adapter
        GridView_adapter Adapter = new GridView_adapter(this, cases);
        GridView grid = (GridView) findViewById(R.id.gridview);
        grid.setAdapter(Adapter);
        // on item click listener
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent case_details_intent = new Intent(New_case_list.this, New_case_details.class);
                startActivity(case_details_intent);
            }
        });
    }
}
