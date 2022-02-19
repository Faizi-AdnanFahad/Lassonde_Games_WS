package winter2021_2022.Lassonde_Game_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TranspSpace10_11 extends AppCompatActivity {
    private Button buttonTrans_10_11;
    private Button buttonSpace_10_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transp_space1011);

        // changing from Transportation 10 - 11 -> 3 Categories of Transportation
        this.buttonTrans_10_11 = findViewById(R.id.buttonTrans_10_11);
        this.buttonTrans_10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TranspSpace10_11.this, Trans3Cat_10_11.class);
                startActivity(intent);
            }
        });

        // changing from Space Tourism 10 - 11 -> 3 Categories of Space Tourism
        this.buttonSpace_10_11 = findViewById(R.id.buttonSpace_10_11);
        this.buttonSpace_10_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TranspSpace10_11.this, Space3Cat_10_11.class);
                startActivity(intent);
            }
        });
    }
}