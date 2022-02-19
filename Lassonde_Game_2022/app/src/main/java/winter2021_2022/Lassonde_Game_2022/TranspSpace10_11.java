package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TranspSpace10_11 extends AppCompatActivity {
    private Button flyingCars_10_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transp_space1011);

        // changing from Age Page 8 - 9 -> Transportation and Space tourism
        this.flyingCars_10_11 = findViewById(R.id.buttonTrans_10_11);
        this.flyingCars_10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TranspSpace10_11.this, Trans3Cat_10_11.class);
                startActivity(intent);
            }
        });
    }
}