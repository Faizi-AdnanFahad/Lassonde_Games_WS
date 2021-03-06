package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trans3Cat_12_13 extends AppCompatActivity {
    private Button button_traffic_reduction_12_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans3_cat1213);

        // changing from Space Tourism 12 - 13 -> 3 Categories of Space Tourism
        this.button_traffic_reduction_12_13 = findViewById(R.id.button_traffic_reduction_12_13);
        this.button_traffic_reduction_12_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Trans3Cat_12_13.this, TrafficReduction_12_13.class);
                startActivity(intent);
            }
        });

    }
}