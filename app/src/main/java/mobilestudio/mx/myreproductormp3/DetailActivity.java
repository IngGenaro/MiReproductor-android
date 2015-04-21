package mobilestudio.mx.myreproductormp3;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends ActionBarActivity implements View.OnClickListener {

    int cancionPosition;
    Cancion cancion;
    ImageButton actionPlay, actionRet, actionAde;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        cancionPosition = intent.getIntExtra("CANCION", 0);
        cancion = Cancion.getData(getApplicationContext()).get(cancionPosition);

        //RoundedImageView profileImage = (RoundedImageView) findViewById(R.id.profileImage);


        TextView textTitle = (TextView) findViewById(R.id.title1);
        //TextView textTime = (TextView) findViewById(R.id.time);
        TextView textActor = (TextView) findViewById(R.id.actor1);
        TextView textAlbum = (TextView) findViewById(R.id.album1);

        ImageView caratula = (ImageView) findViewById(R.id.image2);

        actionPlay = (ImageButton) findViewById(R.id.play);
        actionRet = (ImageButton) findViewById(R.id.retrocede);
        actionAde = (ImageButton) findViewById(R.id.avanza);

        actionPlay.setOnClickListener(this);
        actionRet.setOnClickListener(this);
        actionAde.setOnClickListener(this);

        caratula.setImageDrawable(cancion.getPicture());
        textTitle.setText(cancion.getTitle());
        //textTime.setText(cancion.getTime());
        textActor.setText(cancion.getActor());
        textAlbum.setText(cancion.getAlbum());

    }


    @Override
    public void onClick(View v) {


        switch(v.getId()){
            case R.id.play:

                player = MediaPlayer.create(DetailActivity.this,
                        getResources().getIdentifier("raw/","raw",getPackageName()));

                player.start();
                break;

            case R.id.avanza:


            case R.id.retrocede:



                break;
/*
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                String uri = "tel:" + contact.getPhone();

                callIntent.setData(Uri.parse(uri));
                if(isAvailable(getApplicationContext(),callIntent))
                    startActivity(callIntent);
                else
                    Toast.makeText(getApplicationContext(),"HARWARE NOT AVAILABLE", Toast.LENGTH_LONG).show();

                break;
            case R.id.actionEmail:

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", contact.getEmail(), null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "TITULO CONTACTO");


                if(isAvailable(getApplicationContext(),emailIntent))
                    startActivity(Intent.createChooser(emailIntent, "Send email..."));
                else
                    Toast.makeText(getApplicationContext(),"HARWARE NOT AVAILABLE", Toast.LENGTH_LONG).show();

                break;
*/
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        player.stop();
        super.onDestroy();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

}
