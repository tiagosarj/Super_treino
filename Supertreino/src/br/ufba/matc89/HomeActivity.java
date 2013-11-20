package br.ufba.matc89;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		Button btAlimentacao = (Button) findViewById(R.id.bt_alimentacao);
		btAlimentacao.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {						
						openAlimentacao();					
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	public void openAlimentacao(){
		Intent intent = new Intent(this, AlimentacaoActivity.class);
		startActivity(intent);
	}
}
