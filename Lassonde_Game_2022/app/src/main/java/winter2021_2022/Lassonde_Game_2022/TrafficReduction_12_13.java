package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TrafficReduction_12_13 extends AppCompatActivity {
    private TextView textGoBackToC1_C2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_reduction1213);

        // changing from Space Tourism 12 - 13 -> 3 Categories of Space Tourism
        this.textGoBackToC1_C2 = findViewById(R.id.textGoBackToC1_C2);
        this.textGoBackToC1_C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrafficReduction_12_13.this, Trans3Cat_12_13.class);
                startActivity(intent);
            }
        });
    }
}