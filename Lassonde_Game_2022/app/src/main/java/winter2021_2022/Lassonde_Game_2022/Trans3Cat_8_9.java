package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trans3Cat_8_9 extends AppCompatActivity {
    private Button buttonFlyingCars_8_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trans3_cat89);


        // changing from Flying Cars 8 - 9 -> Info Flying Cars
        this.buttonFlyingCars_8_9 = findViewById(R.id.buttonFlyingCars_8_9);
        this.buttonFlyingCars_8_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Trans3Cat_8_9.this, FlyinCars_info_8_9.class);
                startActivity(intent);
            }
        });
    }


}