package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Space3Cat_8_9 extends AppCompatActivity {
    private Button buttunSpaceMoon_8_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space3_cat89);

        // changing from Artemis 12 - 13 -> Info Artemis
        this.buttunSpaceMoon_8_9 = findViewById(R.id.buttunSpaceMoon_8_9);
        this.buttunSpaceMoon_8_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Space3Cat_8_9.this, ArtemisBaseCamp_8_9.class);
                startActivity(intent);
            }
        });
    }
}