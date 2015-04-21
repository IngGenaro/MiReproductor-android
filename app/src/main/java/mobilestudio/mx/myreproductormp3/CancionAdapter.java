package mobilestudio.mx.myreproductormp3;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static mobilestudio.mx.myreproductormp3.R.id.time;

/**
 * Created by genaro on 20/04/2015.
 */
public class CancionAdapter extends ArrayAdapter {

    ArrayList<Cancion> cancions;
    Context context;

    public CancionAdapter(Context context, int resource, ArrayList<Cancion> cancions) {

        super(context, resource, cancions);
        this.cancions = cancions;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_list_mp3, parent, false);
        ViewHolder holder = new ViewHolder();

        holder.textName = (TextView) rowView.findViewById(R.id.title);
        holder.textTime = (TextView) rowView.findViewById(R.id.time);
        holder.textActor = (TextView) rowView.findViewById(R.id.actor);
        holder.textAlbum = (TextView) rowView.findViewById(R.id.album);

        holder.imgPic = (ImageView) rowView.findViewById(R.id.image1);

        Cancion cancion = cancions.get(position);

        holder.textName.setText(cancion.getTitle());
        holder.textTime.setText(cancion.getTime());
        holder.textActor.setText(cancion.getActor());
        holder.textAlbum.setText(cancion.getAlbum());
        holder.imgPic.setImageDrawable(cancion.getPicture());

        return rowView;
    }

    static class ViewHolder{
        TextView textName;
        TextView textTime;
        TextView textActor;
        TextView textAlbum;
        ImageView imgPic;
    }
}
