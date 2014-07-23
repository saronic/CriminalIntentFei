package fei.exer.criminalintent;

import java.util.UUID;

import android.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		UUID crimeId = (UUID) getIntent().getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
		
		return CrimeFragment.newInstance(crimeId);
	}


}