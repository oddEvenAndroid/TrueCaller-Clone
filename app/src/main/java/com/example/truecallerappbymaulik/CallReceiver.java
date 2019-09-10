package com.example.truecallerappbymaulik;

import android.content.Context;
import android.widget.Toast;

import java.util.Date;

public class CallReceiver extends PhonecallReceiver {


	@Override
	protected void onIncomingCallStarted(final Context ctx, String number, Date start) {


		Toast.makeText(ctx, "" + number, Toast.LENGTH_LONG).show();

	}

	@Override
	protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
/*
		final Dialog dialog = new Dialog(ctx);
		dialog.setContentView(R.layout.custom_dialog);
		TextView text = (TextView) dialog.findViewById(R.id.myText);
		text.setText("Android custom dialog example!");
		ImageView image = (ImageView) dialog.findViewById(R.id.myImg);
		image.setImageResource(R.mipmap.ic_launcher);

		dialog.show();*/

		Toast.makeText(ctx, "" + number, Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {

		/*final Dialog dialog = new Dialog(ctx);
		dialog.setContentView(R.layout.custom_dialog);
		TextView text = (TextView) dialog.findViewById(R.id.myText);
		text.setText("Android custom dialog example!");
		ImageView image = (ImageView) dialog.findViewById(R.id.myImg);
		image.setImageResource(R.mipmap.ic_launcher);

		dialog.show();*/

		Toast.makeText(ctx, "" + number, Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {

		/*final Dialog dialog = new Dialog(ctx);
		dialog.setContentView(R.layout.custom_dialog);
		TextView text = (TextView) dialog.findViewById(R.id.myText);
		text.setText("Android custom dialog example!");
		ImageView image = (ImageView) dialog.findViewById(R.id.myImg);
		image.setImageResource(R.mipmap.ic_launcher);

		dialog.show();*/

		Toast.makeText(ctx, "" + number, Toast.LENGTH_LONG).show();
	}

	@Override
	protected void onMissedCall(Context ctx, String number, Date start) {
/*
		final Dialog dialog = new Dialog(ctx);
		dialog.setContentView(R.layout.custom_dialog);
		TextView text = (TextView) dialog.findViewById(R.id.myText);
		text.setText("Android custom dialog example!");
		ImageView image = (ImageView) dialog.findViewById(R.id.myImg);
		image.setImageResource(R.mipmap.ic_launcher);

		dialog.show();*/

		Toast.makeText(ctx, "" + number, Toast.LENGTH_LONG).show();
	}

}
