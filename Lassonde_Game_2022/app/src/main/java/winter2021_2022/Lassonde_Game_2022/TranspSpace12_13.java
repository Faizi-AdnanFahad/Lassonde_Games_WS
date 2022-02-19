package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TranspSpace12_13 extends AppCompatActivity {
    private Button flyingCars_12_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transp_space1213);

        // changing from Age Page 8 - 9 -> Transportation and Space tourism
        this.flyingCars_12_13 = findViewById(R.id.buttonTransp_12_13);
        this.flyingCars_12_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TranspSpace12_13.this, Trans3Cat_12_13.class);
                startActivity(intent);
            }
        });
    }
}