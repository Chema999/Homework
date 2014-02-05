package ensayos.example.llamadadirecta;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	private TextView tvNumTel;
	private Button btnLlamar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tvNumTel=(TextView)findViewById(R.id.editText1);
		btnLlamar=(Button)findViewById(R.id.button1);
		
		btnLlamar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=new Intent();
				i.setAction(Intent.ACTION_DIAL);
				i.setData(Uri.parse("tel:+"+tvNumTel.getText().toString()));
				
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
