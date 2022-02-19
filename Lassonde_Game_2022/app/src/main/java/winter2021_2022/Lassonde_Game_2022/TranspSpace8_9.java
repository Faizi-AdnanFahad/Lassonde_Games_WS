package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TranspSpace8_9 extends AppCompatActivity {
    private Button flyingCars_8_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transp_space89);

        // changing from Age Page 8 - 9 -> Transportation and Space tourism
        this.flyingCars_8_9 = findViewById(R.id.buttonTrans_8_9);
        this.flyingCars_8_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TranspSpace8_9.this, Trans3Cat_8_9.class);
                startActivity(intent);
            }
        });
    }



}