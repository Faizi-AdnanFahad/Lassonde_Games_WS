package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trans3Cat_10_11 extends AppCompatActivity {
    private Button buttonSelfDrivingCars_10_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans3_cat1011);

        // changing from Space Tourism 10 - 11 -> 3 Categories of Space Tourism
        this.buttonSelfDrivingCars_10_11 = findViewById(R.id.buttonSelfDrivingCars_10_11);
        this.buttonSelfDrivingCars_10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Trans3Cat_10_11.this, SelfDrivingCars_10_11.class);
                startActivity(intent);
            }
        });
    }
}