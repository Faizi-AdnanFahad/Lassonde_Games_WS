package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Space3Cat_12_13 extends AppCompatActivity {
    private Button buttonSpaceVenus_12_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space3_cat1213);

        // changing from Space Tourism 12 - 13 -> 3 Categories of Space Tourism
        this.buttonSpaceVenus_12_13 = findViewById(R.id.buttonSpaceVenus_12_13);
        this.buttonSpaceVenus_12_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Space3Cat_12_13.this, Venus_12_13.class);
                startActivity(intent);
            }
        });
    }
}