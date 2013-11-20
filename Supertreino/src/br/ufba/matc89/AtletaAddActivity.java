package br.ufba.matc89;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import br.ufba.matc89.util.Mascara;

public class AtletaAddActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_atleta_add);
		
		final TextWatcher nascimentoMask;
		final EditText dataNascimento = (EditText) findViewById(R.id.txtNascimento);
		nascimentoMask = Mascara.aplicarMascara("##/##/####", dataNascimento);
		dataNascimento.addTextChangedListener(nascimentoMask);
		
		findViewById(R.id.bt_save).setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View view) {						
						testeAddDieta();						
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.atleta_add, menu);
		return true;
	}
	
	public void testeAddDieta(){
		Intent it = new Intent(this, HomeActivity.class);
		startActivity(it);
	}

}
